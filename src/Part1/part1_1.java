package Part1;
import java.util.Scanner;
public class part1_1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input the string, you want to print");
        String s = in.nextLine();

        System.out.println("Input amount of times you want to print it");
        int n = in.nextInt();
        in.nextLine();

        printer(s, n);

        System.out.println("--------------");
        System.out.println("What's your name?");
        String name = in.nextLine();
        System.out.println("What's your phone number (digits only)");
        String pn = in.nextLine();

        String result = message(name, pn);
        System.out.println(result);
        System.out.println("--------------");

        System.out.println("Print the size of your int array");
        int size = in.nextInt();
        in.nextLine();

        int[] numbers = new int[size];
        System.out.println("Input your int array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
            in.nextLine();
        }
        System.out.println("Input an int element, which index you want to find ");
        int el = in.nextInt();
        in.nextLine();
        int index = Index(numbers, el);
        System.out.println("Your element index is " + index);
        System.out.println("If index is -1, there isn't such element in your array");
    }

    public static String message(String name, String phone){
        String hiden_phone = "";
        int len = phone.length();
        for (int i = 0; i < len - 2; i++) {
            hiden_phone += '*';
        }
        hiden_phone = hiden_phone + phone.charAt(len-2) + phone.charAt(len-1);
        return "Dear, " + name + "! We sent you a verifying message on this number: "
                + hiden_phone + "\nIf it isn't your number change it in settings";
    }

    public static int Index(int[] arr, int el){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el){
                return i;
            }
        }
        return -1;
    }


    //This method prints user's string given amount of times
    public static void printer(String str, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
}
