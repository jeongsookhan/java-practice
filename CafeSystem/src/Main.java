import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = 0;
        int costa = 0;
        int costb = 0;
        int costc = 0;
        int menu = 0;
        int size = 0;
        int option = 0;

        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        menu = sc.nextInt();
        if(menu == 1) {
            costa = cost + 3000;
        } else if(menu == 2) {
            costa = cost + 4000;
        } else if (menu == 3) {
            costa = cost + 4500;
        } else {
            System.out.println("오류가 발생했습니다. 다시 선택해주세요.");
            System.exit(0);
        }
        System.out.println("크기를 선택하세요: 1-Small, 2-Medium, 3-Large");
        size = sc.nextInt();
        if(size == 1) {
            costb = costa;
        } else if(size == 2) {
            costb = costa + 500;
        } else if (size == 3) {
            costb =costa + 1000;
        } else {
            System.out.println("오류가 발생했습니다. 다시 선택해주세요.");
            System.exit(0);
        }
        System.out.println("옵션을 선택하세요: 1-기본, 2-샷추가, 3-시럽추가, 4-샷+시럽추가");
        option = sc.nextInt();
        if(option == 1) {
            costc = costb;
        } else if(option == 2) {
            costc = costb + 500;
        } else if (option == 3) {
            costc = costb + 300;
        } else if (option == 4) {
            costc = costb + 800;
        } else {
            System.out.println("오류가 발생했습니다. 다시 선택해주세요.");
            System.exit(0);
        }
        System.out.println("최종 가격은 "+ costc +"원입니다.");
    }
}