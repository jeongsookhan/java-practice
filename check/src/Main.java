import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1부터 100 사이의 숫자를 입력하세요: ");
            int N = sc.nextInt();
            if (1 <= N && N <= 100 ) {
                System.out.println("입력 완료! 프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("다시 입력해 주세요");
                continue;
            }
        }
    }
}