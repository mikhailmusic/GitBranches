import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
}