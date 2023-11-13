package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoatualizado = null;
        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoatualizado = c;
                break;
            }
        }
        return contatoatualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 123123123);
        agendaContatos.adicionarContato("Camila", 123123);
        agendaContatos.adicionarContato("Camila Cavalcante", 12345);
        agendaContatos.adicionarContato("Camila DIO", 123);
        agendaContatos.adicionarContato("Maria Silva", 111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
        System.out.println(agendaContatos.atualizarNumeroContato("Maria Silva", 5555));
    }
}
