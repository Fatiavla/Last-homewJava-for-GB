package lw;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ToysLottery implements ToysShop {

    ArrayList<Toys> listWinToys = new ArrayList<>();

    public void getWinToys() {

        if (listToys.size() == 0) {
            System.out.println("Игрушки закончались , нужно добавить новых! \n");
        } else {
            Random rnd = new Random();
            for (int i = 0; i < listToys.size(); i++) {
                if (listToys.get(i).getPercent() >= rnd.nextInt(0, 100)) {
                    listWinToys.add(listToys.get(i));
                    System.out.println(listToys.remove(i));
                }
            }
        }
    }

    public void setFindPercent() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите id игрушки для изменения: \n");
        int id = in.nextInt();
        System.out.println("Новая частота выпадения игрушки: \n");
        int newPercent = in.nextInt();
        for (int i = 0; i < listToys.size(); i++) {
            if (listToys.get(i).getId() == id) {
                listToys.get(i).setPercent(newPercent);
                System.out.println(listToys.get(i));
            }
        }
    }

    public void getListWinToys() {
        for (Toys toys : listWinToys) {
            System.out.println(toys);
        }
    }

    public void writeTxt() {
        try (PrintStream printStream = new PrintStream("text.txt")) {
            for (Toys toys : listWinToys) {
                printStream.println(toys);
            }
            System.out.println("Запись в файл произведена");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}