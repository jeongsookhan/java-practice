import java.util.ArrayList;

public class Professor extends Person{
    private ArrayList<String> lectures;

    public Professor(String id, String name, String status, String birthdate, String contact)
    {
        super(id, name, status, birthdate, contact);
        this.lectures = new ArrayList<>();
    }

    public void addLecture(String lecture)
    {
        this.lectures.add(lecture);
    }

    public void printInfo()
    {
        super.printInfo();
        printLectures();
    }

    public void printLectures()
    {
        System.out.println("---담당 교과목 목록---");
        if (lectures.isEmpty())
            System.out.println("없음");
        else
            for (String course : lectures)
                System.out.println(course);
    }
}
