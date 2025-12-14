public class Mamifero extends Animal{

    public Mamifero(String nome, String sexo, int idade, int numeropatas) {
        super(nome, sexo, idade, numeropatas);
    }

    @Override
    public String fazerSom() {
        return "Rugido";
    }
    @Override
    public String mover() {
        return "Anda sobre " + getNumeropatas() + " patas";
    }
}
