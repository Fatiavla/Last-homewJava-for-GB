package lw;

import java.util.Random;
import java.util.Scanner;

public class Toys implements ToysShop {

    private int id;

    private String name;

    private int quantity;

    private int percent;

    public Toys() {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Введите данные");
        int id = rnd.nextInt(1000000);
        System.out.println("текстовое название: \n");
        String name = in.next();
        System.out.println("количество: \n");
        int quantity = in.nextInt();
        System.out.println("частота выпадения игрушки (вес в % от 100)");
        int percent = in.nextInt();
        for (int i = 0; i < quantity; i++) {
            id = rnd.nextInt(1000000);
            listToys.add(new Toys(id, name, percent));
        }
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public int getId() {
        return id;
    }

    public Toys(int id, String name, int percent) {
        this.id = id;
        this.name = name;
        this.percent = percent;
        for (int i = 0; i < quantity; i++) {
            listToys.add(new Toys(id, name, percent));
        }
    }

    @Override
    public String toString() {
        return "Toys [id игрушки = " + id + ", текстовое название = " + name
                + ", частота выпадения игрушки (вес в % от 100) = " + percent + "]\n";
    }

}