package Scanner;
import java.util.Scanner;
public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기, 다음 입력 대비

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "입니다.");

        scanner.close(); // 자원 반납
    }
}
