import java.util.ArrayList;
import java.util.List;

public class Group {
    private String nome;
    private String ID;
    private List<Contact> contatos = new ArrayList<>();

    public Group(String nome, String ID){
        this.nome = nome;
        this.ID = ID;
    }

    public void alterarNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void contatosGrupo(){
        System.out.println(getNome() + ":");
        for (Contact c : contatos){
            System.out.println(c.getNome());
            System.out.println(c.getNumero());
        }
    }

    public void addContatoG(Contact contato){
        for (Contact cont: contatos){
            if (cont.getID().equals(contato.getID())){
                return;
            }
        }
        contatos.add(contato);
    }
    public void removeContatoG(Contact contato){
        int con = -1;
        for (Contact cont: contatos){
            if (cont.getID().equals(contato.getID())){
                con = contatos.indexOf(cont);
            }
        }
        if (con > -1){
            contatos.remove(con);
        }
    }

    public String getID() {
        return ID;
    }
}
