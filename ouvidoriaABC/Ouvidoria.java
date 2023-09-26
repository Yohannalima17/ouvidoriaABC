package ouvidoriaABC;

import java.util.ArrayList;

public class Ouvidoria {

    ArrayList<Reclamacao> listaReclamacoes = new ArrayList<>();

    public String listarReclamacoes() {
        String reclamacao = "LISTA DE RECLAMAÇÕES";

        for (int i = 0; i < tamanhoLista(); i++) {
            reclamacao += "\n\nCódigo: " + (i + 1) + "\nReclamação: " + listaReclamacoes.get(i);
        }
        return reclamacao;
    }
    public void adicionarReclamacao(Reclamacao addReclamacao) {
        listaReclamacoes.add(addReclamacao);
    }

    public void pesquisarPorCodigo(int codigo){
        return listaReclamacoes.get(codigo);
    }
    public void deletarReclamacao(int codigoDeRemocao) {
        listaReclamacoes.remove(codigoDeRemocao);
    }

    public void alterarReclamacao(int codigoDeAlteracao, String novaReclamacao) {
        listaReclamacoes.set(codigoDeAlteracao - 1, novaReclamacao);
    }

    public int tamanhoLista() {
        return listaReclamacoes.size();
    }

}