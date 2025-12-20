public class Grade {
    private Course materia;
    private double nota;
    private double totNota = 10;

    public Grade(double nota, Course materia) {
        setNota(nota);
        setMateria(materia);
    }

    public String getMateria() {
        return this.materia.getName();
    }

    private void setMateria(Course materia) {
        this.materia = materia;
    }

    public double getNota(){
        return nota;
    }

    private void setNota(double nota) {
        if (nota < 0 || nota > totNota){
            throw new IllegalArgumentException("Item inválido");
        } else {
            this.nota = nota;
        }
    }

    @Override
    public String toString() {
        return "Grade{" +
                "materia=" + materia +
                ", nota=" + nota +
                ", totNota=" + totNota +
                '}';
    }
}
