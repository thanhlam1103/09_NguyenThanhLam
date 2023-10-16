DROP DATABASE IF EXISTS `Extra_Assigment4`;
CREATE DATABASE `Extra_Assigment4`;
USE `Extra_Assigment4`;

CREATE TABLE Department (
    Department_Number INT PRIMARY KEY,
    Department_Name NVARCHAR(50)
);
CREATE TABLE Employee_Table (
    Employee_Number INT PRIMARY KEY,
    Employee_Name NVARCHAR(50),
    Department_Number INT,
    FOREIGN KEY (Department_Number)
        REFERENCES Department (Department_Number)
);
CREATE TABLE Employee_Skill_Table (
    Employee_Number INT,
    Skill_Code NVARCHAR(50),
    Date_Registered DATE,
    FOREIGN KEY (Employee_Number)
        REFERENCES Employee_Table (Employee_Number)
);
INSERT INTO Department (Department_Number, Department_Name)
VALUES (1,'Rocket 38 HCM'),
(2,'Rocket 37 HCM'),(3,'Rocket 36 HCM'),(4,'Rocket 35 HCM'),
(5,'Rocket 34 HCM'),(6,'Rocket 33 HCM'),(7,'Rocket 32 HCM'),
(8,'Rocket 31 HCM'),(9,'Rocket 30 HCM'),(10,'Rocket 29 HCM'),
(11,'Rocket 28 HCM'),(12,'Rocket 27 HCM'),(13,'Rocket 26 HCM');
INSERT INTO Employee_Table(Employee_Number,Employee_Name,Department_Number)
VALUES (1900001,'Nguyễn Thành Lâm ',1),(1900002,'Nguyễn Thị Kim Phụng',2),
		(1900003,'Nguyễn Văn A ',3),(1900004,'Huỳnh Lén',3),
        (1900005,'Trần Thanh Nhã',5),(1900006,'Lâm Trung Đức',6),
        (1900007,'Nguyễn Thị Bé',7),(1900008,'Trần Văn Lớn',1),
        (1900011,'Nguyễn Thị Khánh Vy',11),(1900012,'Trần Văn Hớn',3),
        (1900011,'Trần Khánh Vy',3),(1900012,'Trần L',3),
        (1900009,'Bành Kim Hiếu',1),(1900010,'Nguyễn Tất Thành',1);
INSERT INTO Employee_Skill_Table(Employee_Number,Skill_Code,Date_Registered)
VALUES(1900001,'Java','2023-08-09'),(1900003,'python','2023-08-06'),
		(1900002,'C#','2023-08-07'),(1900004,'C++','2023-08-08'),
        (1900002,'Java ','2023-08-11'),(1900004,'C+','2023-09-08'),
        (1900005,'PHP','2023-08-10'),(1900006,'C','2023-08-05');

-- Question 3 Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
SELECT E.Employee_Name, EST.Skill_Code
FROM Employee_Table AS E
JOIN Employee_Skill_Table EST ON E.Employee_Number = EST.Employee_Number
WHERE EST.Skill_Code = 'Java';

-- QUestion 4 Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT DPM.Department_Number, DPM.Department_Name, COUNT(ET.Employee_Number) AS Num_Employees /* Đếm số nhân viên trong mỗi phòng ban*/
FROM Department AS DPM
JOIN Employee_Table AS ET ON DPM.Department_Number = ET.Department_Number
GROUP BY DPM.Department_Number, DPM.Department_Name
HAVING  Num_Employees > 3;

-- Question 5 Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.
SELECT DPM.Department_Number, DPM.Department_Name, GROUP_CONCAT(ET.Employee_Name) AS Employee_List 
FROM Department DPM
JOIN Employee_Table ET ON DPM.department_Number = ET.Department_Number
GROUP BY DPM.Department_Number, DPM.Department_Name;

-- Question 6 Viết lệnh để lấy ra danh sách nhân viên có > 1 skills
SELECT ET.Employee_Number, ET.Employee_Name,  COUNT(DISTINCT EST.Skill_Code) AS Num_Skill /* Đếm số skill code của mỗi nhân viên*/
FROM Employee_Table ET
JOIN Employee_Skill_Table EST ON ET.Employee_Number = EST.Employee_Number
GROUP BY ET.Employee_Number, ET.Employee_Name
HAVING Num_Skill > 1;
