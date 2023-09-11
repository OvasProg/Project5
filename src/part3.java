import java.util.Scanner;

//Basic calculator
public class part3 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        //interface stuff
        System.out.println("This is a basic calculator");
        System.out.println("You can choose from the following operations: \"+, -, *, :\"");

        //input of operators
        System.out.println("Input the first operand");
        double op1 = in.nextDouble();
        in.nextLine();
        System.out.println("Input the operation");
        String oper = in.nextLine();
        System.out.println("Input the second operand");
        double op2 = in.nextDouble();
        in.nextLine();

        //Output of the result
        double result = operation(op1, oper, op2);
        System.out.printf("The result accurate to three digits is %.3f", result);

        //Continue doing operations, while user prints "yes"
        while (true){
            System.out.println("Do you want to continue doing some operations with your result");
            System.out.println("Type \"yes\" to continue");
            String answer = in.nextLine();
            if (!answer.equalsIgnoreCase("yes")){
                break;
            }
            System.out.println("Input the operation");
            oper = in.nextLine();
            System.out.println("Input the second operand");
            op2 = in.nextDouble();
            in.nextLine();
            result = operation(result, oper, op2);
            System.out.printf("The result accurate to three digits is %.3f", result);
            System.out.println();
        }
    }

    //1 method for doing all operations
    public static double operation(double op1, String oper, double op2){
        return switch (oper) {
            case "+" -> (double) op1 + op2;
            case "-" -> (double) op1 - op2;
            case "*" -> (double) op1 * op2;
            case ":" -> (double) op1 / op2;
            default -> 0;
        };
    }
}
