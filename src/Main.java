import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    static StringBuilder stringTepm = new StringBuilder();

    public static void main(String[] args) {
        List<String> dirList = Arrays.asList(
                "D:\\Games\\src",
                "D:\\Games\\res",
                "D:\\Games\\savegames",
                "D:\\Games\\temp",
                "D:\\Games\\src\\main",
                "D:\\Games\\src\\test",
                "D:\\Games\\res\\drawables",
                "D:\\Games\\res\\vectors",
                "D:\\Games\\res\\icons"
        );

        List<String> fileList = Arrays.asList(
                "D:\\Games\\src\\main\\Main.java",
                "D:\\Games\\src\\main\\Utils.java",
                "D:\\Games\\temp\\temp.txt"
        );

        createDir(dirList);
        createFile(fileList);

        try (FileWriter fileWriter = new FileWriter("D:\\Games\\temp\\temp.txt")) {
            fileWriter.write(String.valueOf(stringTepm));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void createDir(List<String> dirList) {
        for (String temp : dirList) {
            File file = new File(temp);
            if (file.mkdir()) {
                stringTepm.append("Создана директория: ").append(file.getName()).append("\n");
            }
        }
    }

    static void createFile(List<String> fileList) {
        for (String temp : fileList) {
            File file = new File(temp);
            try {
                if (file.createNewFile()) {
                    stringTepm.append("Создан файл: ").append(file.getName()).append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
