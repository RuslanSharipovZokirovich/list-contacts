import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String name;
    private String group;
    private String studentId;

    public static Map<Object, Object> map = new HashMap<>();

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId= studentId;
    }

    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("для завершения работы программы введите end");
            String input = scanner.nextLine();
            if (input.equals("end")) {
//                vivod();
                return;
            }
        }
    }

    public static void vivod() {
        for (Map.Entry<Object, Object> a : map.entrySet()) {
            System.out.println(a);
        }
    }

    public static void start() {
        addStudent();
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public boolean equals(Object obj) {
        Student o = (Student) obj;
        return studentId.equals(o.studentId);
    }

    @Override
    public String toString() {
        return name + " -> " + group + " -> " + studentId;
    }
}
