public abstract class Animal {
    private String nome;
    private String sexo;
    private int idade;
    private int numeropatas;

    public Animal(String nome, String sexo, int idade, int numeropatas) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.numeropatas = numeropatas;
    }

    public int getNumeropatas() {
        return numeropatas;
    }

    public void setNumeropatas(int numeropatas) {
        this.numeropatas = numeropatas;
    }

    public String fazerSom(){
        return "som";
    }
    public String mover(){
        return "move";
    }
    public void getInfo(){
        System.out.printf("Nome: %s\nSexo: %s\nIdade: %d\nSom: %s" +
                "\nMovimentação: %s\n", this.getNome(), this.getSexo(), this.getIdade(), fazerSom(), mover());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
