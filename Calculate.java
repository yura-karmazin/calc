import java.util.Locale;
import java.util.Scanner;

public class Calculate {
    public static void main (String[] args){
        System.out.println("Please input first number: ");
        double num1 = getDouble();
        System.out.println("Your input (" + num1 + ") as a first number");
        System.out.println("Pleas input second number: ");
        double num2 = getDouble();
        System.out.println("Your input ("+ num2 + ") as a second number");
        double sum = num1 + num2;
        System.out.println("*******************************************");
        System.out.println("Sum = " + sum + ";");
        double difference = num1 - num2;
        System.out.println("Difference = "+ difference + ";");
        double multiplication = num1 * num2;
        System.out.println("Multiplication = "+ multiplication + ";");
        double division;
        if (num2>0){
            division = num1 / num2;
            System.out.println("Division = "+ division + ";");
        }
        else{
            System.out.println("Division by 0 is not possible!");
        }
        System.out.println("*******************************************");
    }
    public static double getDouble() {
        Scanner scanner= new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Please enter number");
            scanner.next();//рекурсия
            num = getDouble();
        }
        return num;
    }
}
