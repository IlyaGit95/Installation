import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        File games = new File("D:\\Games");

        File src = new File(games, "src");
        File res = new File(games, "res");
        File savegames = new File(games, "savegames");
        File temp = new File(games, "temp");

        File main = new File(src, "main");
        File test = new File(src, "test");

        File fileMainJava = new File(main, "Main.java");
        File fileMainUtils = new File(main, "Utils.java");

        File drawables = new File(res, "drawables");
        File vectors = new File(res, "vectors");
        File icons = new File(res, "icons");

        File fileTemp = new File(temp, "temp.txt");

        StringBuilder stringTepm = new StringBuilder();

        List<File> dirList = new ArrayList<>();
        dirList.add(src);
        dirList.add(res);
        dirList.add(savegames);
        dirList.add(temp);
        dirList.add(main);
        dirList.add(test);
        dirList.add(drawables);
        dirList.add(vectors);
        dirList.add(icons);

        List<File> fileList = new ArrayList<>();
        fileList.add(fileMainJava);
        fileList.add(fileMainUtils);
        fileList.add(fileTemp);

        for (File file : dirList) {
            if (file.mkdir()) {
                stringTepm.append("Создана директория: ").append(file.getName()).append("\n");
            }
        }

        for (File file : fileList) {
            try {
                if (file.createNewFile()) {
                    stringTepm.append("Создан файл: ").append(file.getName()).append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (FileWriter fileWriter = new FileWriter(fileTemp)) {
            fileWriter.write(String.valueOf(stringTepm));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
