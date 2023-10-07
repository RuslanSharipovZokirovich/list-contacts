import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Student {
    private String name;
    private String group;
    private String studentId;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId= studentId;
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
