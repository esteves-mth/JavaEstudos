public class Contact {
    private String nome;
    private int numero;
    private String ID;

    public Contact(int numero, String nome, String ID){
        this.numero = numero;
        this.nome = nome;
        this.ID = ID;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    } public int getNumero() {
        return numero;
    } public String getID() {
        return ID;
    }
}
