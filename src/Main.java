package src;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        menu();
    }

    public static void menu() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                  Welcome to Currency Changer:");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("1) USD to TL");
        System.out.println("2) TL to USD");
        System.out.println("3) USD to EUR ");
        System.out.println("4) EUR to TL");
        System.out.println("5) TL to EUR ");
        System.out.println("0) Exit");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Please Choose an Option:");
        int exhcange = scan.nextInt();
        do {
            switch (exhcange) {
                case 1:
                    System.out.println("Please Choose an amount in $:");
                    double usd = scan.nextDouble();
                    System.out.println(usd + " $ equals to " + usd * 18.96 + " TL");
                    break;

                case 2:
                    System.out.println("Please Choose an amount in ₺: ");
                    double tl = scan.nextDouble();
                    System.out.println(tl + " ₺ equals to " + tl / 18.96 + " USD");
                    break;

                case 3:
                    System.out.println("Please Choose an amount in $: ");
                    usd = scan.nextDouble();
                    System.out.println(usd + " $ equals to " + usd * 0.94 + " USD");
                    break;

                case 4:
                    System.out.println("Please Choose an amount in €: ");
                    double eur = scan.nextDouble();
                    System.out.println(eur + " € equals to " + eur * 20.18 + " TL");

                case 5:
                    System.out.println("Please Choose an amount in ₺: ");
                    tl = scan.nextDouble();
                    System.out.println(tl + " ₺ equals to " + tl / 20.18 + " EUR");
                    break;

            }

        } while (exhcange != 0);
        System.out.println("Hava A Nice Day");
        System.out.println("See You Soon!!");

    }
}