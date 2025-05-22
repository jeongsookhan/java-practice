import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("좌석의 행 수를 입력하시오: ");
        int row = sc.nextInt();
        System.out.println("좌석의 열 수를 입력하시오: ");
        int col = sc.nextInt();

        int[][] seats = new int[row][col];

        while (true) {
            System.out.println("좌석을 예약하세요, 종료하려면 0, 0 을 입력");
            System.out.println("행을 입력하세요: ");
            int r = sc.nextInt();
            System.out.println("열을 입력하세요: ");
            int c = sc.nextInt();

            if (r == 0 && c == 0) {
                break;
            }
            if (r < 1 || r > row) {
                System.out.println("잘못된 입력입니다 다시 입력해주세요");
                continue;
            }
            if (c < 1 || c > col) {
                System.out.println("잘못된 입력입니다 다시 입력해주세요");
                continue;
            }

            int rowIndex = r - 1;
            int colIndex = c - 1;

            if (seats[rowIndex][colIndex] == 1) {
                System.out.println("이미 예약된 좌석입니다.");
            } else {
                seats[rowIndex][colIndex] = 1;
                System.out.println("좌석 예약이 완료되었습니다.");
            }
        }

        System.out.println("--- 현재 좌석 배치도 (0:비어있음, 1:예약됨) ---");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}