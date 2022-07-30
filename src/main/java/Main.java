import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите путь к файлу");
                String find = scanner.nextLine();
                if (find.equals("Yes")) {
                    break;
                }
            }
        }
    }
}
