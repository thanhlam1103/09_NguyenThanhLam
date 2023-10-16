DROP DATABASE IF EXISTS TestingSystem;
CREATE DATABASE TestingSystem_java1;
USE TestingSystem_java1;

/*============================== TẠO BẢNG DỮ LIỆU (10 BẢNG) =============================*/
/*======================================================================================*/
-- Tao bang : `Group`
DROP TABLE IF EXISTS `Group`;
CREATE TABLE `Group`(
	 `id` 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `name`				NVARCHAR(50) NOT NULL,
    `create_date`			DATETIME DEFAULT NOW()
);
-- Thêm dữ liệu cho bảng `Group`
INSERT INTO `Group` (`name`, `create_date`)
VALUES
    ('Sale', '2023-10-16'),
    ('Marketing', '2023-10-16'),
    ('Engineering', '2023-10-16'),
    ('HR', '2023-10-16');