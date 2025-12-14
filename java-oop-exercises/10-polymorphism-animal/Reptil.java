public class Reptil extends Animal{
    public Reptil(String nome, String sexo, int idade, int numeropatas) {
        super(nome, sexo, idade, numeropatas);
    }

    @Override
    public String fazerSom() {
        return "Sibilo";
    }

    @Override
    public String mover() {
        return "Rasteja";
    }
}
