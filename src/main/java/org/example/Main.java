package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int range, type, age;
        double pricePerkm = 0.10;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi KM Türünden Giriniz : ");
        range = input.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        age = input.nextInt();

        System.out.println("Yolculuk Tipini Giriniz (1 => Tek Yön:, 2=> Gidiş Dönüş ");
        type = input.nextInt();

        double toplamFiyat = pricePerkm * range;

        if ((range < 0) || (age < 0) || (type < 1) || (type > 2)) {
            System.out.println("Hatalı Değer Girdiniz ");
        } else if (type == 1) {
            if (age < 12) {
                double cocukbilet = toplamFiyat - (toplamFiyat * 0.5);
                System.out.println(cocukbilet);
            } else if ((age >= 12) && (age < 24)) {
                double gencbilet = toplamFiyat - (toplamFiyat * 0.1);
                System.out.println(gencbilet);
            } else if (age > 65) {
                double yaslibilet = toplamFiyat - (toplamFiyat * 0.3);
                System.out.println(yaslibilet);
            } else {
                System.out.println(toplamFiyat);
            }
        } else {
            if (age < 12) {
                double cocukbilet = 2*((toplamFiyat - (toplamFiyat * 0.5)) - (toplamFiyat - (toplamFiyat * 0.5)) * 0.2);
                System.out.println(cocukbilet);
            } else if ((age >= 12) && (age < 24)) {
                double gencbilet = 2*((toplamFiyat - (toplamFiyat * 0.1)) - (toplamFiyat - (toplamFiyat * 0.1)) * 0.2);
                System.out.println(gencbilet);
            } else if (age > 65) {
                double yaslibilet = 2*((toplamFiyat - (toplamFiyat * 0.3)) - (toplamFiyat - (toplamFiyat * 0.3)) * 0.2);
                System.out.println(yaslibilet);
            } else {
                double normalGidisdonus = toplamFiyat * 0.20;
                System.out.println(normalGidisdonus);
            }
        }
    }
}
