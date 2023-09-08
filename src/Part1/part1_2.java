package Part1;

import java.util.Scanner;
import java.lang.Thread;
public class part1_2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        your_number();
    }
    public static void your_number() throws InterruptedException {
        System.out.println("Input your number");
        double n = in.nextInt();
        in.nextLine();
        double size = your_shoe_size();
        int year = your_birth_year();
        long money = salary();
        System.out.println("Now multiply your number on your shoe size");
        Thread.sleep(4000);
        System.out.println("It's " + (double)(n * size));
        Thread.sleep(2000);
        System.out.println("Then divide it on your birth year");
        Thread.sleep(4000);
        System.out.println("It's " + (double)(n * size / year));
        Thread.sleep(2000);
        System.out.println("And finally add your dream salary to it");
        Thread.sleep(4000);
        System.out.println("It's " + (double)(n * size / year + money));
        Thread.sleep(2000);
        System.out.println(".\n.\n.\n.\n.\n");
        Thread.sleep(4000);
        System.out.println("Thank you for giving this program 2 minutes of your time...");
    }
    public static double your_shoe_size(){
        System.out.println("Input your shoe size");
        double size = in.nextDouble();
        in.nextLine();
        return size;
    }
    public static int your_birth_year(){
        System.out.println("Input your birth year");
        int year = in.nextInt();
        in.nextLine();
        return year;
    }
    public static long salary(){
        System.out.println("Input amount of money, you want to earn per year");
        long money = in.nextLong();
        in.nextLine();
        return money;
    }
}
