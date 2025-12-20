public class GradeReport {
    private Student estudante;

    public GradeReport(Student estudante){
        this.estudante = estudante;
    }

    public void listarNotas(){
        for(Grade g : estudante.getGrades()){
            double nota = g.getNota();
            String materia = g.getMateria();
            System.out.printf("%.1f/10 - %s\n", nota, materia);
        }
    }

    public void relatorioPorMateria(Course curso){
        double soma = 0;
        int contador = 0;
        String nome = curso.getName();
        for(Grade g: estudante.getGrades()){
            if (g.getMateria().equals(nome)){
                soma += g.getNota();
                contador++;
            }
        }
        if (contador != 0){
            double media = soma/contador;
            if (media >= 5) {
                System.out.printf("\n%s\n%.2f/10\nAprovado\n",nome, media);
            } else {
                System.out.printf("\n%s\n%.2f/10\nReprovado\n",nome, media);
            }
        }
    }

    public Student getEstudante() {
        return estudante;
    }

    @Override
    public String toString() {
        return "GradeReport{" +
                "estudante=" + estudante +
                '}';
    }
}
