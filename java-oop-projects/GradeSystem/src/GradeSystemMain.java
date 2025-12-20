public class GradeSystemMain {
    public static void main(String[] args) {
        Student s = new Student("Esteves", "2C", 26);
        Course c = new Course("Java");
        Course c2 = new Course("Python");
        s.addGrade(10, c);
        s.addGrade(6.5, c2);
        s.addGrade(7.5, c2);
        s.addGrade(8.5, c);
        s.addGrade(8, c);
        GradeReport gr = new GradeReport(s);
        gr.listarNotas();
        gr.relatorioPorMateria(c);
    }
}
