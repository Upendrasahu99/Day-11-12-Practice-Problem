package com.bridgelebz.Stock;

import java.util.Scanner;

public class StockAccountManagement {
    public static void stockAccountManagement() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Stock : ");
        int nOfStock = scanner.nextInt();
        scanner.nextLine();
        String[] stockName = new String[nOfStock];
        int nOfShare[] = new int[nOfStock];
        double sharePrice[] = new double[nOfStock];
        for (int i = 0; i < nOfStock; i++) {
            System.out.print("Enter Stock " + (i + 1) + " Name : ");
            stockName[i] = scanner.nextLine();
            System.out.print("Enter Number of Shares : ");
            nOfShare[i] = scanner.nextInt();
            System.out.print("Enter Share Price : ");
            sharePrice[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        double totalValue = 0.00;
        System.out.println("Stock Report");
        for (int i = 0; i < nOfStock; i++) {
            double stockValue = nOfShare[i] * sharePrice[i];
            System.out.println("Stock Name : " + stockName[i] + " | Number of Share : " + nOfShare[i] + " | Share Price : " + sharePrice[i] + " | value : " + stockValue);
            totalValue += stockValue;
        }
        System.out.println("Total value = " + totalValue);
    }
    public static void main(String[] args) {
        stockAccountManagement();
    }
}
