import java.util.Scanner;

public class bmicategories {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double bmi;

        System.out.print("Enter your BMI here: ");
        bmi = keyboard.nextDouble();

        System.out.println("Your BMI category: ");
        if (bmi < 15.0) {
            System.out.println("very severly underweight");
        }
        else if (bmi <= 16.0) {
            System.out.println("severly underweight");
        }
        else if (bmi < 18.5) {
            System.out.println("underweight");
        }
        else if (bmi < 25.0) {
            System.out.println("normal weight");
        }
        else if (bmi < 30.0) {
            System.out.println("overweight");
        }
        else if (bmi < 35.0) {
            System.out.println("moderately obese");
        }
        else if (bmi < 40.0) {
            System.out.println("severly obese");
        }
        else {
            System.out.println("very severly/\"morbidly\" obese");
        }
    }
}