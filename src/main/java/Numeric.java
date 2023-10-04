public class Numeric {

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isOven(int number) {
        return number % 2 == 0;
    }

    public static int square(int number) {
        return number * number;
    }

    public static int cube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 10;

        System.out.println(num1 + " is odd: " + isOdd(num1));
        System.out.println(num2 + " is odd: " + isOdd(num2));

        System.out.println(num1 + " is oven: " + isOven(num1));
        System.out.println(num2 + " is oven: " + isOven(num2));

        System.out.println("Square of " + num1 + " is: " + square(num1));
        System.out.println("Square of " + num2 + " is: " + square(num2));

        System.out.println("Cube of " + num1 + " is: " + cube(num1));
        System.out.println("Cube of " + num2 + " is: " + cube(num2));

    }
}
