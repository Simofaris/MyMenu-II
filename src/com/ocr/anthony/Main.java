package com.ocr.anthony;

import java.util.Scanner;

public class Main {
// Commentaire
    public static void main(String[] args) {
        Order order = new Order();
        order.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        order.displaySelectedMenu(nb);
    }
}
