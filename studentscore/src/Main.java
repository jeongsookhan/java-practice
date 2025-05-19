import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 수를 입력하세요: ");
        int stu = sc.nextInt();
        System.out.println("과목 수를 입력하세요: ");
        int sub = sc.nextInt();

        int[][] scores = new int[stu][sub];
        for (int i = 0; i < stu; i++) {
            System.out.println("\n[" + (i + 1) + "번 학생의 성적 입력]");
            for (int j = 0; j < sub; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: ");
                scores[i][j] = sc.nextInt();
            }
        }


        System.out.println("--- 성적표 --- ");
        for (int i = 0; i < stu; i++) {
            System.out.print(i + 1 + "번 학생: ");
            for (int j = 0; j < sub; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
    }
}