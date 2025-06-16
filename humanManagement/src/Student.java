import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<String> courses;

    public Student()
    {
//        this.id = id;
//        this.name = name;
//        this.status = status;
//        this.birthdate = birthdate;
//        this.contact = contact;
        super();
        this.courses = new ArrayList<>();
    }

    public Student(String id, String name, String status, String birthdate, String contact)
    {
        super(id, name, status, birthdate, contact);
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course)
    {
        courses.add(course);
    }

    public void printInfo()
    {
        super.printInfo();
        printCourse();
    }

    public void printCourse()
    {
        System.out.println("---수강 교과목 목록---");
        if (courses.isEmpty())
            System.out.println("없음");
        else
            for (String course : courses)
                System.out.println(course);
    }
//    private String id;
//    private String name;
//    private String status;
//    private String birthdate;
//    private String contact;
//    private ArrayList<String> courses;
//
//    public Student()
//    {
//        id = "";
//        name = "";
//        status = "";
//        birthdate = "";
//        contact = "";
//        courses = new ArrayList<>();
//    }
//
//    public Student(String id, String name, String status, String birthdate, String contact)
//    {
//        this.id = id;
//        this.name = name;
//        this.status = status;
//        this.birthdate = birthdate;
//        this.contact = contact;
//        this.courses = new ArrayList<>();
//    }
//
//    public void addCourse(String courseName)
//    {
//        courses.add(courseName);
//    }
//
//    public void setStudent(String id, String name, String status,String birthdate, String contact)
//    {
//        this.id = id;
//        this.name = name;
//        this.status = status;
//        this.birthdate = birthdate;
//        this.contact = contact;
//    }
//
//    public void printInfo()
//    {
//        System.out.println("ID: " + id);
//        System.out.println("Name: " + name);
//        System.out.println("Status: " + status);
//        System.out.println("Birthdate: " + birthdate);
//        System.out.println("Contact: " + contact);
//    }
//
//    public void printCourses()
//    {
//            if (courses.isEmpty())
//                System.out.print("없음");
//            else
//                for (String course : courses)
//                    System.out.println(course);
//    }
}

