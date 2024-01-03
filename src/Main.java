import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<studentRecord> students = List.of(
                new studentRecord(
                        "Mudia",
                        "Osagie",
                        123,
                        "Computer Science",
                        "CI554"),

                new studentRecord(
                        "Michael",
                        "Jackson",
                        1234,
                        "Engineering",
                        "E112"),

                new studentRecord(
                        "Crimson",
                        "Chin",
                        999,
                        "Sociology",
                        "S556")

        );
        Predicate<studentRecord> fNameSearch =
                student -> student.firstName() = "Mudia";
        students.stream()
                .filter(fNameSearch);
    }


}
