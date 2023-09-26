import javax.swing.*;
import ouvidoriaABC.Ouvidoria;
import ouvidoriaABC.Reclamacao;

public class Menu2 {
    public static void main(String[] args) {
        Ouvidoria ouvidoria = new Ouvidoria();
        int opcao;

        do {
            String menu = "MENU OUVIDORIA\n" +
                    "1) Listar reclamações\n" +
                    "2) Adicionar reclamação\n" +
                    "3) Pesquisar reclamação por posição\n" +
                    "4) Remover reclamação\n" +
                    "5) Alterar reclamação\n" +
                    "6) Sair";

            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

                switch (opcao) {
                    case 1:
                        JOptionPane.showMessageDialog(null, ouvidoria.listarReclamacoes());
                        break;

                    case 2:
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da reclamação:"));
                        String descricao = JOptionPane.showInputDialog("Digite a descrição da reclamação:");
                        Reclamacao novaReclamacao = new Reclamacao(codigo, descricao);
                        ouvidoria.adicionarReclamacao(novaReclamacao);
                        JOptionPane.showMessageDialog(null, "Reclamação adicionada com sucesso!");
                        break;

                    case 3:
                        int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição da reclamação:"));
                        Reclamacao reclamacaoEncontrada = ouvidoria.pesquisarPorCodigo(posicao - 1);
                        JOptionPane.showMessageDialog(null, "Reclamação encontrada:\n" + reclamacaoEncontrada.getDescricao());
                        break;

                    case 4:
                        int codigoRemocao = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da reclamação a ser removida:"));
                        ouvidoria.deletarReclamacao(codigoRemocao - 1);
                        JOptionPane.showMessageDialog(null, "Reclamação removida com sucesso!");
                        break;

                    case 5:
                        int codigoAlteracao = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da reclamação a ser alterada:"));
                        String novaDescricao = JOptionPane.showInputDialog("Digite a nova descrição:");
                        ouvidoria.alterarReclamacao(codigoAlteracao, novaDescricao);
                        JOptionPane.showMessageDialog(null, "Reclamação alterada com sucesso!");
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(null, "Saindo do programa.");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido.");
                opcao = 0;
            }
        } while (opcao != 6);
    }
}
