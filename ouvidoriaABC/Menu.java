package ouvidoriaABC;

import javax.swing.*;
import java.util.ArrayList;
import ouvidoriaABC.Ouvidoria;
public class Menu {
    public static void main(String[] args) {

        Ouvidoria funcoesOuvidoria = new Ouvidoria();

        int opcao;
        do {
            JOptionPane.showMessageDialog(null, "Bem-vindo a ouvidoria de Timóteo");
            String opcaoStg = JOptionPane.showInputDialog("Escolha uma opção: \n 1) Listar reclamação \n 2) Adicionar reclamação \n 3) Pesquisar reclamação por posição" +
                    "\n 4) Remover reclamação \n 5) Alterar reclamação \n 6) Sair ");
            int opcao = Integer.parseInt(opcaoStg);

            switch (opcao) {
                case 1:
                    String reclamacao = JOptionPane.showInputDialog("Digite sua reclamação: ");

                    break;

                case 2:
                    // Remover reclamação

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:
                    System.out.println("Saindo do programa. Obrigado!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 6);

        scanner.close();
    }
}