import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student("2024001", "홍길동", "재학", "2005-01-01","010-1111-1111");

        student2.addCourse("java");
        student2.addCourse("python");

        System.out.println("===학생2의 정보===");
        student2.printInfo();

        Professor professor = new Professor("P001", "남교수", "재적", "2000-01-01", "010-1111-1111");
        professor.addLecture("java");
        professor.addLecture("Application Security");

        System.out.println("===교수의 정보===");
        professor.printInfo();
    }
}
