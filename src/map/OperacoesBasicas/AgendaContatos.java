package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123);
        agendaContatos.adicionarContato("Camila", 1234);
        agendaContatos.adicionarContato("Camila Cavalcante", 12345);
        agendaContatos.adicionarContato("Camila DIO", 111);
        agendaContatos.adicionarContato("Maria Silva", 222);
        agendaContatos.adicionarContato("Maluco", 555);
        agendaContatos.exibirContato();
        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContato();

        System.out.println("O número é: "+ agendaContatos.pesquisarPorNome("Camila"));
    }
}
