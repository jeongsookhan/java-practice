import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("점수를 입력하세요 (종료하려면 음수를 입력): ");
            int num = sc.nextInt();

            if( num < 0 )
            {
                System.out.println("입력된 점수가 없습니다.");
                break;
            }
            else {
                sum += num;
            }
        }
        System.out.println("점수의 총합은: " + sum);
    }
}