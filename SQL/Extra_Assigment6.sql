-- Tạo cơ sở dữ liệu
DROP DATABASE `extra_assigment6`;
CREATE DATABASE `extra_assigment6`;

-- Sử dụng cơ sở dữ liệu vừa tạo
USE `extra_assigment6`;

-- Tạo bảng Employee
CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY,
    EmployeeLastName VARCHAR(50),
    EmployeeFirstName VARCHAR(50),
    EmployeeHireDate DATE,
    EmployeeStatus VARCHAR(50),
    SupervisorID INT,
    SocialSecurityNumber VARCHAR(15)
);

-- Tạo bảng Projects
CREATE TABLE Projects (
    ProjectID INT PRIMARY KEY,
    ManagerID INT,
    ProjectName NVARCHAR(100),
    ProjectStartDate DATE,
    ProjectDescription TEXT,
    ProjectDetail TEXT,
    ProjectCompletedOn DATE
);

-- Tạo bảng Project_Modules
CREATE TABLE Project_Modules (
    ModuleID INT PRIMARY KEY,
    ProjectID INT,
    EmployeeID INT,
    ProjectModulesDate DATE,
    ProjectModulesCompletedOn DATE,
    ProjectModulesDescription TEXT,
    ModuleName VARCHAR(100),
    FOREIGN KEY (ProjectID) REFERENCES Projects(ProjectID),
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID)
);

-- Tạo bảng Work_Done
CREATE TABLE Work_Done (
    WorkID INT PRIMARY KEY,
    EmployeeID INT,
    ModuleID INT,
    WorkDoneDate DATE,
    WorkDoneDescription TEXT,
    WorkDoneStatus VARCHAR(20),
    FOREIGN KEY (EmployeeID) REFERENCES Employee(EmployeeID),
    FOREIGN KEY (ModuleID) REFERENCES Project_Modules(ModuleID)
);

-- Thêm 5 bản ghi vào bảng Employee
INSERT INTO Employee (EmployeeID, EmployeeLastName, EmployeeFirstName, EmployeeHireDate, EmployeeStatus, SupervisorID, SocialSecurityNumber)
VALUES
    (1, 'Smith', 'John', '2023-01-15', 'Active', NULL, '123-45-6789'),
    (2, 'Johnson', 'Emily', '2023-02-20', 'Active', 1, '987-65-4321'),
    (3, 'Williams', 'Michael', '2023-03-10', 'Active', 1, '456-78-9012'),
    (4, 'Brown', 'Jessica', '2023-04-05', 'Active', 2, '789-01-2345'),
    (5, 'Jones', 'David', '2023-05-12', 'Active', 3, '234-56-7890');

-- Thêm 5 bản ghi vào bảng Projects
INSERT INTO Projects (ProjectID, ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompletedOn)
VALUES
    (1, 1, 'Project A', '2023-02-01', 'Project A description', 'Project A details', NULL),
    (2, 2, 'Project B', '2023-03-15', 'Project B description', 'Project B details', NULL),
    (3, 3, 'Project C', '2023-04-10', 'Project C description', 'Project C details', NULL),
    (4, 4, 'Project D', '2023-05-20', 'Project D description', 'Project D details', NULL),
    (5, 5, 'Project E', '2023-06-05', 'Project E description', 'Project E details', NULL);

-- Thêm 5 bản ghi vào bảng Project_Modules
INSERT INTO Project_Modules (ModuleID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesCompletedOn, ProjectModulesDescription, ModuleName)
VALUES
    (1, 1, 1, '2023-02-10', NULL, 'Module A description', 'Module A'),
    (2, 2, 2, '2023-03-20', NULL, 'Module B description', 'Module B'),
    (3, 3, 3, '2023-04-15', NULL, 'Module C description', 'Module C'),
    (4, 4, 4, '2023-05-25', NULL, 'Module D description', 'Module D'),
    (5, 5, 5, '2023-06-10', NULL, 'Module E description', 'Module E');

-- Thêm 5 bản ghi vào bảng Work_Done
INSERT INTO Work_Done (WorkID, EmployeeID, ModuleID, WorkDoneDate, WorkDoneDescription, WorkDoneStatus)
VALUES
    (1, 1, 1, '2023-02-15', 'Work done details 1', 'Completed'),
    (2, 2, 2, '2023-03-25', 'Work done details 2', 'In Progress'),
    (3, 3, 3, '2023-04-20', 'Work done details 3', 'Not Started'),
    (4, 4, 4, '2023-05-30', 'Work done details 4', 'Completed'),
    (5, 5, 5, '2023-06-15', 'Work done details 5', 'In Progress');

/* b) Viết stored procedure (không có parameter) để Remove tất cả thông tin
project đã hoàn thành sau 3 tháng kể từ ngày hiện. In số lượng record đã
remove từ các table liên quan trong khi removing (dùng lệnh print) */

DELIMITER //
CREATE PROCEDURE RemoveCompletedProjects()
BEGIN
    DECLARE project_count INT; -- khai báo một biến và gán cho nó một giá trị ban đầu
    
    DELETE FROM Work_Done WHERE ModuleID IN (
		SELECT ModuleID 
        FROM Project_Modules 
        WHERE ProjectID IN (
			SELECT ProjectID 
            FROM Projects 
            WHERE ProjectCompletedOn IS NOT NULL AND ProjectCompletedOn <= DATE_SUB(NOW(), INTERVAL 3 MONTH))); -- interva: từ khóa dành cho tính toán time. date sub lấy thời gian 3 tháng trước time hiện tại
    DELETE FROM Project_Modules 
    WHERE ProjectID IN (
		SELECT ProjectID 
        FROM Projects 
        WHERE ProjectCompletedOn IS NOT NULL AND ProjectCompletedOn <= DATE_SUB(NOW(), INTERVAL 3 MONTH));
    
    DELETE FROM Projects WHERE ProjectCompletedOn IS NOT NULL AND ProjectCompletedOn <= DATE_SUB(NOW(), INTERVAL 3 MONTH);
    
    SET project_count = ROW_COUNT(); -- ROW_COUNT() là một hàm được sử dụng để trả về số lượng dòng ảnh hưởng bởi câu lệnh SQL thực thi gần nhất
    SELECT CONCAT(project_count, ' records removed.') AS Message;
END //
DELIMITER ;

/* c) Viết stored procedure (có parameter) để in ra các module đang được thực
hiện) */

DELIMITER //
CREATE PROCEDURE GetInProgressModules(IN project_name VARCHAR(100))
BEGIN
    SELECT p.ProjectName, pm.ModuleName, e.EmployeeFirstName, e.EmployeeLastName
    FROM Projects p
    INNER JOIN Project_Modules pm ON p.ProjectID = pm.ProjectID
    INNER JOIN Employee e ON pm.EmployeeID = e.EmployeeID
    WHERE p.ProjectName = project_name AND pm.ProjectModulesCompletedOn IS NULL;
END //
DELIMITER ;

/* d) Viết hàm (có parameter) trả về thông tin 1 nhân viên đã tham gia làm mặc
dù không ai giao việc cho nhân viên đó (trong bảng Works) */

DELIMITER //
CREATE FUNCTION GetUnassignedEmployee(IN Employee_id INT) RETURNS INT
BEGIN
    DECLARE unassigned_count INT;
    
    SELECT COUNT(*) INTO unassigned_count
    FROM Project_Modules pm
    WHERE pm.EmployeeID = employee_id AND pm.ModuleID NOT IN (SELECT ModuleID FROM Work_Done);
    
    RETURN unassigned_count;
END //
DELIMITER ;
