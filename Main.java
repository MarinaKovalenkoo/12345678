package com.kovalenko;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter count potatos: ");
        int countPotatos=scanner.nextInt();
        System.out.print("Please enter count package: ");
        int countPackage=scanner.nextInt();
        int countPotatosInToPackage;
        countPotatosInToPackage=countPotatos/countPackage;
        System.out.println("Count  package: "+countPackage);
        System.out.println("Reminder potatos: "+(countPotatos-(countPotatosInToPackage*countPackage)));
    }
}



