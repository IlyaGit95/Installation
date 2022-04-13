import java.io.*;

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

        if (src.mkdir()) {
            stringTepm.append("Создана директория: ").append(src.getName()).append("\n");
        }
        if (res.mkdir()) {
            stringTepm.append("Создана директория: ").append(res.getName()).append("\n");
        }
        if (savegames.mkdir()) {
            stringTepm.append("Создана директория: ").append(savegames.getName()).append("\n");
        }
        if (temp.mkdir()) {
            stringTepm.append("Создана директория: ").append(temp.getName()).append("\n");
        }

        if (main.mkdir()) {
            stringTepm.append("Создана директория: ").append(main.getName()).append("\n");
        }
        if (test.mkdir()) {
            stringTepm.append("Создана директория: ").append(test.getName()).append("\n");
        }

        if (drawables.mkdir()) {
            stringTepm.append("Создана директория: ").append(drawables.getName()).append("\n");
        }
        if (vectors.mkdir()) {
            stringTepm.append("Создана директория: ").append(vectors.getName()).append("\n");
        }
        if (icons.mkdir()) {
            stringTepm.append("Создана директория: ").append(icons.getName()).append("\n");
        }

        try {
            if (fileMainJava.createNewFile()) {
                stringTepm.append("Создан файл: ").append(fileMainJava.getName()).append("\n");
            }
            if (fileMainUtils.createNewFile()) {
                stringTepm.append("Создан файл: ").append(fileMainUtils.getName()).append("\n");
            }
            if (fileTemp.createNewFile()) {
                stringTepm.append("Создан файл: ").append(fileTemp.getName()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter(fileTemp)) {
            fileWriter.write(String.valueOf(stringTepm));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
