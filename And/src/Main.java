import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 1 && a <= 100) {
            System.out.println("1에서 100 사이의 값입니다.");
        }else {
            System.out.println("1에서 100 사이의 값이 아닙니다.");
        }
    }
}