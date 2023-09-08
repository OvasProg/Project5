package Part2;
//Decomposition of Project 4 Part 4
import java.util.Scanner;
/*
1. Print greeting message
2. Ask user's age
3. Ask user's favourite genre
4.Print user's recommendation
5. Ask user if he want to continue
If Y/y go to 2
 */
public class Main {

    //create a new scanner
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        greeting_message();
        while(true){
            int age = your_age();
            String genre = your_genre();
            recommendation(age, genre);
            boolean cont = go_on();
            if (!cont){
                break;
            }
        }
    }

    //Prints greeting message
    public static void greeting_message(){
        System.out.println("This program will recommend you a book based on your interests");
    }
    //Ask user's age
    public static int your_age(){
        System.out.println("How old are you?");
        int age = in.nextInt();
        in.nextLine();
        return age;
    }
    //Ask user's favourite genre
    public static String your_genre(){
        String genre;
        //While loop in case user's input is incorrect
        while(true) {
            System.out.println("Choose your favourite genre from the following:");
            System.out.println("\t * detective");
            System.out.println("\t * dystopia");
            genre = in.nextLine();
            if (!genre.equals("detective") && !genre.equals("dystopia")){
                System.out.println("You can only choose from these genres");
            }
            else{
                break;
            }
        }
        return genre.toLowerCase();
    }
    //Print's user's recommendation
    public static void recommendation(int age, String genre){
        System.out.print("I recommend you to read: ");
        if (age < 6) {
            System.out.println("Doctor Powderpill (Aibolit)");
        } else if (age <= 13) {
            System.out.println("Fedko-brigand");
        } else if (age <= 15 && genre.equals("detective")) {
            System.out.println("Mr Mercedes");
        } else if (age <= 15 && genre.equals("dystopia")) {
            System.out.println("Metro");
        } else if (age <= 18 && genre.equals("detective")) {
            System.out.println("Murder on the Orient Express");
        } else if (age <= 18 && genre.equals("dystopia")) {
            System.out.println("Animal farm");
        } else {
            System.out.println("Sorry, I'm too young to recommend you something");
        }
    }
    //Check if user want to continue
    public static boolean go_on(){
        System.out.println("Type Y/y to continue");
        System.out.println("Type any other character to quit");
        String answer = in.nextLine();
        if (answer.toLowerCase().equals("y")){
            return true;
        }
        return false;
    }
}
