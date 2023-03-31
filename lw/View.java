package lw;

import java.util.Scanner;

public class View implements ToysShop {

    public void start() {
        ToysLottery lottery = new ToysLottery();
        boolean stop = true;
        while (stop == true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Контроллер\n"
                    + "1 - Добавить игрушку\n"
                    + "2 - Разыграть игрушку\n"
                    + "3 - Изменить частоту выпадения игрушки\n"
                    + "4 - Посмотреть список выйграшных игрушек\n"
                    + "5 - Забрать игрушки"
                    + "\n6 - завершить\n");
            System.out.print("Введите какую команду выполнить - ");
            String key = in.next();
            switch (key) {
                case "1":
                    new Toys();
                    break;
                case "2":
                    lottery.getWinToys();
                    break;
                case "3":
                    lottery.setFindPercent();
                    printList();
                    break;
                case "4":
                    lottery.getListWinToys();
                    break;
                case "5":
                    lottery.writeTxt();
                    break;
                case "6":
                    stop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
