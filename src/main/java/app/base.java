/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package app;

import java.util.Scanner;
import java.util.ArrayList;

public class base {

    static Scanner reader = new Scanner(System.in);

    }

    static void zad_3() {
        System.out.print("Оценка: ");
        char ch = reader.next().charAt(0);

        switch (Character.toUpperCase(ch)) {
            case 'A':
                System.out.println("Отлично!");
                break;
            case 'B':
                System.out.println("Много добре");
                break;
            case 'C':
                System.out.println("Добре");
                break;
            case 'D':
                System.out.println("Зле!");
                break;
            default:
                System.out.println("Провал!");
                break;
        }
    }

    public static void main(String[] args) {
        zad_3(); 
    }
}