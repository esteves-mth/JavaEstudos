import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contatos = new ArrayList<>();
    private List<Group> grupos = new ArrayList<>();

    public void addContato(String nome, int numero, String ID){
        for (Contact c : contatos){
            if (c.getID().equals(ID)){
                return;
            }
        }
        Contact contato = new Contact(numero, nome, ID);
        contatos.add(contato);
    }
    public void removeContato(String ID){
        int cont = -1;
        for (Contact contato: contatos){
            if (contato.getID().equals(ID)){
                cont = contatos.indexOf(contato);
            }
        }
        if (cont > -1){
            contatos.remove(cont);
        }
    }
    public void removeContato(int number){
        int cont = -1;
        for (Contact contato: contatos){
            if (contato.getNumero() == number){
                cont = contatos.indexOf(contato);
            }
        }
        if (cont > -1){
            contatos.remove(cont);
        }
    }
    public void addGrupo(String nome, String ID){
        for (Group g : grupos){
            if (g.getID().equals(ID)){
                return;
            }
        }
        Group grupo = new Group(nome, ID);
        grupos.add(grupo);
    }
    public void removeGrupo(String ID){
        int gr = -1;
        for (Group grupo: grupos){
            if (grupo.getID().equals(ID)){
                gr = grupos.indexOf(grupo);
            }
        }
        if (gr > -1){
            grupos.remove(gr);
        }
    }
    public void editContato(String nome, String ID){
        for (Contact contato: contatos){
            if (contato.getID().equals(ID)){
                contato.setNome(nome);
            }
        }
    }
    public void editContato(int numero, String ID){
        for (Contact contato: contatos){
            if (contato.getID().equals(ID)){
                contato.setNumero(numero);
            }
        }
    }

    public void editGrupo(String nome, String ID){
        for (Group grupo: grupos){
            if (grupo.getID().equals(ID)){
                grupo.alterarNome(nome);
            }
        }
    }
    public void listNumber(){
        System.out.printf("%d Contatos:", contatos.size());
        for (Contact contato: contatos){
            System.out.printf("%s - %d\n%s\n", contato.getNome(), contato.getNumero(), contato.getID());
        }
    }
    public void listGrupo(){
        System.out.printf("%d Grupos:", grupos.size());
        for (Group grupo: grupos){
            System.out.printf("%s - %s\n", grupo.getNome(), grupo.getID());
        }
    }
    public void searchContato(String nome){
        for (Contact contato: contatos){
            if (contato.getNome().equals(nome)){
                System.out.printf("%s - %d\n%s\n", contato.getNome(), contato.getNumero(), contato.getID());
            }
        }
    }
    public void searchContato(int numero){
        for (Contact contato: contatos){
            if (contato.getNumero() == numero){
                System.out.printf("%d - %s\n%s\n", contato.getNumero(), contato.getNome(), contato.getID());
            }
        }
    }
    public void searchGrupo(String nome){
        for (Group grupo: grupos){
            if (grupo.getNome().equals(nome)){
                System.out.printf("%s - %s\n", grupo.getNome(), grupo.getID());
            }
        }
    }
    public void addContatoGrupo(int numero, String ID){
        for (Group grupo : grupos){
            if (grupo.getID().equals(ID)) {
                for (Contact contato: contatos)  {
                    if (contato.getNumero() == numero){
                        grupo.addContatoG(contato);
                    }
                }
            }
        }
    }
    public void addContatoGrupo(String idNumero, String ID){
        for (Group grupo : grupos){
            if (grupo.getID().equals(ID)) {
                for (Contact contato: contatos)  {
                    if (contato.getID().equals(idNumero)){
                        grupo.addContatoG(contato);
                    }
                }
            }
        }
    }
    public void removeContatoGrupo(int numero, String ID){
        for (Group grupo : grupos){
            if (grupo.getID().equals(ID)) {
                for (Contact contato: contatos)  {
                    if (contato.getNumero() == numero){
                        grupo.removeContatoG(contato);
                    }
                }
            }
        }
    }
    public void removeContatoGrupo(String idNumero, String ID){
        for (Group grupo : grupos){
            if (grupo.getID().equals(ID)) {
                for (Contact contato: contatos)  {
                    if (contato.getID().equals(idNumero)){
                    grupo.removeContatoG(contato);
                    }
                }
            }
        }
    }
    public void listContatosGrupo(String ID){
        for (Group grupo: grupos){
            if(grupo.getID().equals(ID)){
                grupo.contatosGrupo();
            }
        }
    }
}
