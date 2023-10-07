import java.util.*;

public class Main {
    public static Set<Student> map = new HashSet<>();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        addStudent();
    }
    public static void vivod() {
        for (Student a : map) {
            System.out.println(a);
        }
    }

    public static void addStudent() {

        while (true) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                vivod();
                return;
            }
            String[] output = input.split(" ");
            String name = output[0];
            String group = output[1];
            String studentId = output[2];

            map.add(new Student(name, group, studentId));


        }
    }
}