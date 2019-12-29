package TechSpec;

import Categories.*;
import java.util.Scanner;

public interface Searching {
    Scanner scanner =new Scanner(System.in);
    String nm = scanner.nextLine();

    default void searching(Mobile[] arr){
        setScanner();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void searching(PC arr[]){
        setScanner();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void searching(Vegetable arr[]){
        setScanner();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void searching(Cookie arr[]){
        setScanner();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void searching(Water arr[]){
        setScanner();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void searching(Sweet arr[]){
        setScanner();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void searching(Clother arr[]){
        setScanner();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i].getName().contains(nm)) {
                System.out.println("Название " + arr[i].getName() + "\nID " + arr[i].getId() + "\nКоличество " + arr[i].getValue());
            }

        }
    }

    default void setScanner(){
        System.out.println("Введите название ");
        scanner.next();

    }
}
