import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
        System.out.println("Это добавлено в ветке dev");
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = Integer.parseInt(sc.nextLine());
        System.out.print("Введите второе число: ");
        int second = Integer.parseInt(sc.nextLine());

        System.out.print("Введите знак операции (+, -, *, /): ");
        char operation = sc.nextLine().charAt(0);

        System.out.println("Выражение: " + first + " " + operation + " " + second);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a / b;
    }
}
