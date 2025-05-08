import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        switch (score/10){
            case 10:
                System.out.println("학점은 A입니다.");
                break;
            case 9:
                System.out.println("학점은 A입니다.");
                break;
            case 8:
                System.out.println("학점은 B입니다.");
                break;
            case 7:
                System.out.println("학점은 C입니다.");
                break;
            case 6:
                System.out.println("학점은 D입니다.");
                break;
            case 5:
                System.out.println("학점은 F입니다.");
                break;
            case 4:
                System.out.println("학점은 F입니다.");
                break;
            case 3:
                System.out.println("학점은 F입니다.");
                break;
            case 2:
                System.out.println("학점은 F입니다.");
                break;
            case 1:
                System.out.println("학점은 F입니다.");
                break;
            case 0:
                System.out.println("학점은 F입니다.");
                break;
            default:
                System.out.println("잘못된 점수 입력입니다.");
                break;
        }
    }
}