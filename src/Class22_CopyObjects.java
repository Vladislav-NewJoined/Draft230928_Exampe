import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
// local history vby 06 30 https://youtu.be/K0N-5qoh4p4

class Student
{
    private String name;
    private int age;
    private Set<String> subjects;

    public Student(String name, int age, Set<String> subjects)
    {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    // Конструктор копирования
    public Student(Student student)
    {
        this.name = student.name;
        this.age = student.age;

        // поверхностная копия
        // this.subjects = student.subjects;

        // глубокая копия — создать новый экземпляр `HashSet`
        this.subjects = new HashSet<>(student.subjects);
    }

    // Копируем фабрику
    public static Student newInstance(Student student) {
        return new Student(student);
    }

    @Override
    public String toString() {
        return Arrays.asList(name, String.valueOf(age),
                subjects.toString()).toString();
    }

    public Set<String> getSubjects() {
        return subjects;
    }
}

// Копируем объекты в Java — копируем конструктор и пример фабрики
class Class22_CopyObjects
{
    public static void compare(Object ob1, Object ob2)
    {
        if (ob1 == ob2) {
            System.out.println("Shallow Copy");
        }
        else {
            System.out.println("Deep Copy");
        }
    };

    public static void main(String[] args)
    {
        Student student = new Student("Jon Snow", 22, new HashSet<String>(
                Arrays.asList("Maths", "Science", "English"))
        );

        Student clone = new Student(student);
        System.out.println("Calling Copy Constructor : Clone is " + clone);

        compare(student.getSubjects(), clone.getSubjects());

        clone = Student.newInstance(student);
        System.out.println("\nCalling Copy Factory : Clone is " + clone);

        compare(student.getSubjects(), clone.getSubjects());
    }
}