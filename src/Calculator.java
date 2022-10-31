public class Calculator {
    public static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int subtract(int numberOne , int numberTwo) {
        return numberOne - numberTwo;
    }

    public static int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public static int divide(int numberOne , int numberTwo) {
        return numberOne / numberTwo;
    }

    public static void main(String[] args) {
        int sum;
        int subtraction;
        int multiplication;
        int division;
        sum = add(10, 1);
        System.out.println("El resultado de la suma es: " + sum);
        subtraction = subtract(20, 5);
        System.out.println("El resultado de la resta es: " + subtraction);
        multiplication = multiply(30, 1);
        System.out.println("El resultado de la suma es: " + multiplication);
        division = divide(20, 5);
        System.out.println("El resultado de la resta es: " + division);
    }
}