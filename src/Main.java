import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tử 1: ");
        int a = scanner.nextInt();
        System.out.print("Mẫu 2: ");
        int b = scanner.nextInt();
        System.out.print("Tử 2: ");
        int c = scanner.nextInt();
        System.out.print("Mẫu 2: ");
        int d = scanner.nextInt();
        if (b == d) {
            int about = a + c;
            System.out.println("Kết Quả: " + about + "/" + b);
        } else {
            int about = a * d + b * c;
            int beyond = b * d;
            System.out.println("Kết Quả: " + about + "/" + beyond);
        }

    }
}