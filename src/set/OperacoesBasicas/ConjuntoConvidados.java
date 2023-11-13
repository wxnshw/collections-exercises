package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1233);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1111);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1111);

        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidado(s) dentro de Set Convidados");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidado(s) dentro de Set Convidados");
        conjuntoConvidados.exibirConvidados();
    }
}
