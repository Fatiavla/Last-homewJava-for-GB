package lw;

import java.util.ArrayList;

public interface ToysShop {
    // Список игрушек в автомате
    ArrayList<Toys> listToys = new ArrayList<>();

    default void printList() {
        for (Toys toys : listToys) {
            System.out.println(toys);
        }
    }

}
