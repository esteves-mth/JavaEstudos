import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String turma;
    private int ID;
    private List<Grade> grades = new ArrayList<>();

    public Student(String name, String turma, int ID) {
        this.name = name;
        this.turma = turma;
        this.ID = ID;
    }

    public void addGrade(double nota, Course materia){
        Grade grade = new Grade(nota, materia);
        grades.add(grade);
    }

    public List<Grade> getGrades() {
        return new ArrayList<>(grades);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", turma='" + turma + '\'' +
                ", ID=" + ID +
                ", grades=" + grades +
                '}';
    }
}
