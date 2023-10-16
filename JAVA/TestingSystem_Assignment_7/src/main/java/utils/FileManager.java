package utils;

import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class FileManager {
    // Các thông báo lỗi là constant
    private static final String ERROR_FILE_EXIST = "Error! File Exist.";
    private static final String ERROR_FILE_NOT_EXIST = "Error! File Not Exist.";
    private static final String ERROR_PATH_NOT_FOLDER = "Error! Path is not folder.";
    private static final String ERROR_NAME_EXIST = "Error! Name is Exist.";
    private static final String ERROR_FOLDER_EXIST = "Error! Folder Exist.";
    private static final String ERROR_NEW_PATH_EXIST = "Error! newPath has File same name.";

    // Question 1: Kiểm tra xem tệp có tồn tại hay không
    public static boolean isFileExists(String pathFile) {
        File file = new File(pathFile);
        return file.exists();
    }

    // Question 2:Tạo mới tệp
    public static void createNewFile(String pathFile) throws IOException {
        File file = new File(pathFile);
        if (file.exists()) {
            throw new IOException(ERROR_FILE_EXIST);
        } else {
            file.createNewFile();
        }
    }

    // Question 4:Xóa tệp
    public static void deleteFile(String pathFile) throws IOException {
        File file = new File(pathFile);
        if (!file.exists()) {
            throw new IOException(ERROR_FILE_NOT_EXIST);
        } else {
            file.delete();
        }
    }

    //Question 5:  Kiểm tra xem đường dẫn có phải là thư mục hay không
    public static boolean isFolder(String path) {
        File file = new File(path);
        return file.isDirectory();
    }

    // Question 6: Lấy danh sách tên tệp trong thư mục
    public static List<String> getAllFileName(String path) throws IOException {
        File folder = new File(path);
        if (!folder.isDirectory()) {
            throw new IOException(ERROR_PATH_NOT_FOLDER);
        }

        List<String> fileNames = new ArrayList<>();
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileNames.add(file.getName());
                }
            }
        }

        return fileNames;
    }


    //"mkdirs()" là một phương thức của lớp File, được sử dụng để tạo thư mục
    // hoặc thư mục con trong hệ thống tệp của máy tính.
    // Phương thức này tạo thư mục được chỉ định cùng với tất cả các thư mục cha cần thiết nếu
    // chúng không tồn tại. Nếu thư mục đã tồn tại, thì phương thức không làm gì cả và trả về true
    // để chỉ ra rằng thư mục đã được tạo hoặc tồn tại.
    //Question7: Sao chép tệp
    public static void copyFile(String sourceFile, String destinationPath, String newName) throws IOException {
        File source = new File(sourceFile);
        File destinationFolder = new File(destinationPath);

        if (!source.exists()) {
            throw new IOException(ERROR_FILE_NOT_EXIST);
        }

        if (destinationFolder.isFile()) {
            throw new IOException(ERROR_NEW_PATH_EXIST);
        }

        if (!destinationFolder.exists()) {
            destinationFolder.mkdirs();
        }

        File destinationFile = new File(destinationPath + File.separator + newName);

        if (destinationFile.exists()) {
            throw new IOException(ERROR_NAME_EXIST);
        }

        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destinationFile)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        }
    }

    // question 8:  chuyển tệp
    public static void moveFile(String sourceFile, String destinationPath) throws IOException {
        File source = new File(sourceFile);
        File destinationFolder = new File(destinationPath);

        if (!source.exists()) {
            throw new IOException(ERROR_FILE_NOT_EXIST);
        }

        if (destinationFolder.isFile()) {
            throw new IOException(ERROR_NEW_PATH_EXIST);
        }

        if (!destinationFolder.exists()) {
            destinationFolder.mkdirs();
        }

        File destinationFile = new File(destinationPath + File.separator + source.getName());

        if (destinationFile.exists()) {
            throw new IOException(ERROR_NAME_EXIST);
        }

        if (!source.renameTo(destinationFile)) {
            throw new IOException("Error! Moving file failed.");
        }
    }

    //Qestion9:  Đổi tên tệp
    public static void renameFile(String pathFile, String newName) throws IOException {
        File file = new File(pathFile);

        if (!file.exists()) {
            throw new IOException(ERROR_FILE_NOT_EXIST);
        }

        String parentPath = file.getParent();
        File newFile = new File(parentPath + File.separator + newName);

        if (newFile.exists()) {
            throw new IOException(ERROR_NAME_EXIST);
        }

        if (!file.renameTo(newFile)) {
            throw new IOException("Error! Renaming file failed.");
        }
    }

    //Question 10: Tạo mới thư mục
    public static void createNewFolder(String newPathFolder) throws IOException {
        File folder = new File(newPathFolder);
        if (folder.exists()) {
            throw new IOException(ERROR_FOLDER_EXIST);
        } else {
            folder.mkdirs();
        }
    }

}

