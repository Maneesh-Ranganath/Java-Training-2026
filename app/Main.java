import university.models.Student;
import java.util.List;

void main() {
    var roster = List.of(
        new Student("Maneesh", 3.8),
        new Student("Ananya", 3.9),
        new Student("Rahul", 3.2)
    );

    System.out.println("--- Dean's List ---");

    for (var s : roster) {
        // FIX: Use the 'get' methods instead of direct variables
        if (s.getGpa() > 3.5) {
            System.out.println(s.getName() + " | GPA: " + s.getGpa());
        }
    }
}
