package S1_08_N3_E1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crea una classe Alumne amb els atributs: Nom, edat, curs i nota.
        //
        //Omple una llista amb 10 alumnes
        //
        //a.
        //Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. Assigna a aquests alumnes
        // a una altra  llista i  mostra per pantalla la nova llista (tot  amb lambdes).
        //
        //
        //


        List<Student> students = new ArrayList<>();
        students = initStudents(students);

        System.out.println("Mostra per pantalla el nom i l’edat de cada alumne/");
        students.stream().forEach(student -> System.out.println(student.getName() + " " + student.getAge()));

        System.out.println("Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. Assigna a aquests alumnes a una altra  llista i  mostra per pantalla la nova llista");
        List<Student> studentList = new ArrayList<>();
        students.stream().
                filter(student -> student.getName().startsWith("A"))
                .forEach(student -> {
                    studentList.add(student);
                });
        studentList.stream().forEach(System.out::println);

        System.out.println("Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior");
        students.stream().filter(student -> student.getQualification() >= 5).forEach(System.out::println);

        System.out.println("Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que no són de PHP");
        students.stream().
                filter(student -> student.getQualification() >= 5 && !student.getCourse().equals("PHP")).
                forEach(System.out::println);

        System.out.println("Mostra tots els alumnes que fan JAVA i són majors d’edat..");
        students.stream().
                filter(student -> student.getAge() > 17 && student.getCourse().equals("JAVA")).
                forEach(System.out::println);
    }

    private static List<Student> initStudents(List<Student> students) {
        students.add(new Student("Luis Perez", 25, "JAVA", 6.0));
        students.add(new Student("Albert Sanchez", 20, "PHP", 8.0));
        students.add(new Student("Enric Gonzalez", 35, "JAVA", 5.5));
        students.add(new Student("Jan Esteve", 18, "Angular", 3.2));
        students.add(new Student("Oriol Gil", 20, "JAVA", 10.0));
        students.add(new Student("Andrea Masjoan", 40, "Big Data", 1.8));
        students.add(new Student("Marina Fontuberta", 50, "Angular", 5.0));
        students.add(new Student("Sandra Llovera", 17, "JAVA", 7.9));
        students.add(new Student("Paula Perez", 26, "Angular", 6.0));
        students.add(new Student("Sandra Perez", 37, "JAVA", 4.0));
        return students;
    }
}