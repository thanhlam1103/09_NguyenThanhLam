DROP DATABASE IF EXISTS `Fresh_Training_Management`;
CREATE DATABASE `Fresh_Training_Management`;
USE `Fresh_Training_Management`;
/*Tạo bảng trainee*/
CREATE TABLE `Fresher_management` (
    `TraineeID` TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
    `Full_Name` NVARCHAR(50) NOT NULL,
    `Birth_Date` DATE NOT NULL,
    `Gender` ENUM('male', 'female', 'unknown') NOT NULL,
    `ET_IQ` TINYINT UNSIGNED CHECK (ET_IQ <= 20),
    `ET_Gmath` TINYINT UNSIGNED CHECK (ET_Gmath <= 20),
    `ET_English` TINYINT UNSIGNED CHECK (ET_English <= 50),
    `Training_Class` CHAR(10) NOT NULL,
    `Evaluation_Note` NVARCHAR(100)
); 
-- Add VTI_Account column
ALTER TABLE `Fresher_management` ADD COLUMN VTI_Account VARCHAR(100) NOT NULL UNIQUE;
-- QUERY LESSION 2 
SELECT GROUP_CONCAT(Full_Name), MONTH(Birth_Date)
FROM fresher_management AS F
WHERE	(F.ET_IQ + F.ET_Gmath) >= 20 AND 
		F.ET_IQ >= 8 AND 
        F.ET_Gmath >= 8 AND 
        F.ET_English >= 18
GROUP BY MONTH(Birth_Date);
 /* QUESTION 3 */
SELECT 	*
FROM fresher_management 
WHERE LENGTH(Full_Name) = (	SELECT MAX(LENGTH(Full_Name))
								FROM fresher_management )
;
 /* QUESTION 4 */
/* SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY','')); */

SELECT *
FROM fresher_management AS F
WHERE	(F.ET_IQ + F.ET_Gmath) >= 20 AND 
		F.ET_IQ >= 8 AND 
        F.ET_Gmath >= 8 AND 
        F.ET_English >= 18;
        
/* QUESTION 5 */

DELETE FROM Fresher_management WHERE TraineeID = 3;

/* QUESTION 6 */
UPDATE Fresher_management AS F
SET F.Training_Class = 2
WHERE TraineeID = 5;
-- EXCERCISE2
-- Question 1
-- ADD DATA INTO Fresher_management
INSERT INTO Fresher_management(Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class, Evaluation_Note, VTI_Account)
VALUES (N'Nguyễn Thành Lâm', '2001-03-11', 'male', 15, 20, 10, 'Rocket38', 'Lớp học tốt', '101') ,
(N'Nguyễn Văn A', '2001-04-21', 'male', 15, 20, 10, 'Rocket38', 'Lớp học tốt', '102') ,
(N'Nguyễn Thanh Bình', '2001-07-11', 'male', 15, 20, 10, 'Rocket38', 'Lớp học tốt', '103') ,
(N'Hồ Thị Bé', '2001-06-30', 'female', 16, 20, 10, 'Rocket38', 'Lớp học tốt', '104') ,
(N'Trần Thiên Đạt', '2001-11-11', 'male', 10, 20, 10, 'Rocket38', 'Lớp học tốt', '105') ,
(N'Lê Văn An', '2001-12-11', 'male', 15, 18, 16, 'Rocket38', 'Lớp học tốt', '106') ,
(N'Huỳnh Thị Mỹ Anh', '2001-03-07', 'female', 15, 16, 10, 'Rocket38', 'Lớp học tốt', '107') ,
(N'Ngô Minh Bằng', '2001-09-17', 'male', 15, 20, 16, 'Rocket38', 'Lớp học tốt', '108') ,
(N'Lương Thành An', '2001-05-21', 'male', 15, 15, 15, 'Rocket38', 'Lớp học tốt', '109') ,
(N'Nguyễn Thành An', '2001-05-16', 'male', 20, 20, 10, 'Rocket38', 'Lớp học tốt', '200') ,
('Phung Bao Long', '2003-11-02', 'male', '18', '19', '47', '3', 'Good', 'long.phungbao@vtiacademy.edu.vn'),
	('Phung Bao Long1', '2003-12-04', 'female', '15', '19', '44', '2', 'Bad', 'long.phungbao1@vtiacademy.edu.vn'),
	('Phung Bao Long2', '2003-11-18', 'unknown', '16', '11', '42', '4', 'Normal', 'long.phungbao2@vtiacademy.edu.vn'),
	('Phung Bao Long3', '2003-11-19', 'female', '12', '13', '43', '4', 'Good', 'long.phungbao3@vtiacademy.edu.vn'),
	('Phung Bao Long4', '2003-11-25', 'male', '11', '16', '41', '7', 'Good', 'long.phungbao4@vtiacademy.edu.vn'),
	('Phung Bao Long5', '2003-03-10', 'female', '17', '14', '40', '1', 'Normal', 'long.phungbao5@vtiacademy.edu.vn'),
	('Phung Bao Long6', '2003-07-02', 'male', '19', '17', '39', '2', 'Good', 'long.phungbao6@vtiacademy.edu.vn'),
	('Phung Bao Long7', '2003-10-10', 'male', '13', '19', '38', '4', 'Normal', 'long.phungbao7@vtiacademy.edu.vn'),
	('Phung Bao Long8', '2003-10-31', 'male', '14', '16', '38', '5', 'Bad', 'long.phungbao8@vtiacademy.edu.vn'),
	('Phung Bao Long9', '2003-08-12', 'male', '20', '15', '37', '3', 'Good', 'long.phungbao9@vtiacademy.edu.vn'),
    ('Pham Minh Tuan', '1990-05-15', 'male', '10', '15', '16', '1', 'Normal', 'phamminhtuan@vtiacademy.edu.vn'),
    ('Tuan Pham Minh', '1992-03-25', 'female', '12', '15', '44', '1', 'Good', 'tuanphamminh@vtiacademy.edu.vn'),
    ('Minh Tuan Pham', '1991-03-10', 'male', '19', '17', '42', '2', 'Good', 'minhtuanpham@vtiacademy.edu.vn'),
    ('Pham Tuan Minh', '1993-11-05', 'male', '14', '13', '38', '2', 'Good', 'phamtuanminh@vtiacademy.edu.vn'),
    ('Minh Pham Tuan', '1994-07-20', 'unknown', '16', '12', '42', '1', 'Bad', 'minhphamtuan@vtiacademy.edu.vn'),
    ('Bui Quang Long', '1995-01-18', 'male', '10', '11', '17', '2', 'Good', 'buiquanglong@vtiacademy.edu.vn'),
    ('Pham Khiet Minh', '1992-09-08', 'female', '18', '19', '47', '2', 'Good', 'phamkhietminh@vtiacademy.edu.vn'),
    ('Vu Nhat Long', '1991-06-30', 'male', '17', '16', '32', '1', 'Good', 'vunhatlong@vtiacademy.edu.vn'),
    ('Nguyen Minh Nhat', '1993-04-12', 'male', '13', '14', '32', '1', 'Bad', 'nguyenminhnhat@vtiacademy.edu.vn'),
    ('Vo Hoai An', '1994-12-28', 'male', '11', '13', '8', '2', 'Bad', 'vohoaian@vtiacademy.edu.vn'),
    (N'Hồ Văn An', '1995-05-10', 'male', 18, 16, 45, 'C101', N'Có tiềm năng, cần cải thiện về tiếng Anh.', 'R001'),
    (N'Nguyễn Thị Bình', '1997-02-20', 'female', 20, 18, 50, 'C102', N'Thành tích xuất sắc ở tất cả các lĩnh vực.', 'R002'),
    (N'Trần Văn Cường', '1998-07-15', 'male', 19, 15, 48, 'C101', N'Có khả năng, cần làm việc trên kỹ năng Toán học.', 'R003'),
    (N'Phạm Thị Dung', '1996-09-28', 'female', 17, 19, 47, 'C103', N'Kỹ năng phân tích mạnh mẽ, cần cải thiện về tiếng Anh.', 'R004'),
    (N'Lê Văn Dũng', '1999-04-02', 'male', 16, 17, 40, 'C102', N'Thiếu tinh thần làm việc, cần tập trung vào cải thiện IQ.', 'R005'),
    (N'Nguyễn Thị Diệu', '1997-12-12', 'female', 18, 20, 50, 'C103', N'Thành tích xuất sắc, học viên đa năng.', 'R006'),
    (N'Lê Văn Dương', '1996-11-05', 'male', 20, 19, 45, 'C101', N'Tiềm năng xuất sắc, cần làm việc trên Tiếng Anh và Toán học.', 'R007'),
    (N'Trần Thị Hà', '1998-06-19', 'female', 17, 16, 43, 'C102', N'Kết quả khá, cần cải thiện về IQ.', 'R008'),
    (N'Lê Văn Hùng', '1999-03-25', 'male', 19, 20, 50, 'C101', N'Trình độ cao, xuất sắc trong tất cả các lĩnh vực.', 'R009'),
    (N'Lê Thị Hương', '1996-10-30', 'female', 15, 14, 38, 'C103', N'Trình độ dưới trung bình, cần tập trung vào tất cả các lĩnh vực.', 'R010');
-- QUESTION 2



-- EXCERCISE2 
CREATE TABLE `Data_Types` (
    `ID` TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `NAME` VARCHAR(50) NOT NULL,
    `CODE` CHAR(5) NOT NULL,
    `MODIFIEDDATE` DATETIME DEFAULT NOW() -- update datetime modifile hiện tại
);
/* EXCERCISE3 */
CREATE TABLE `Data_Types2` (
    `ID` TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `NAME` VARCHAR(50) NOT NULL,
    `BIRTHDATE` DATE NOT NULL,
    `GENDER` ENUM('0', '1', '2'), -- 0: Male, 1: Female, 2: Unknown
    `ISDELETEDFLAG` ENUM('0', '1') -- 0: Active, 1: Delete
);


