
package projeto_gerenciamento;

import javax.swing.JOptionPane;

public class Main_Gerenciamento {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        int adicionar = 0, indice = 0, edita = 0;
        String a0 = "", a1 = "", a2 = "";
        while (true) {
            a0 = JOptionPane.showInputDialog(null, "Escolha a opção desejada\n\n1- Adicionar tarefas\n2- Listar tarefas\n3- Concluir tarefa\n4- Editar tarefa\n5- Listar tarefas concluidas\n6- Sair ", "Menu de Gerenciamento", JOptionPane.INFORMATION_MESSAGE);
            if (a0 == null) {
                gerenciador.finalizar();
            } else if (a0.isEmpty()) {
                erro();
                continue;
            }
            if (a0.matches("\\d+")) {
                adicionar = Integer.parseInt(a0);
                switch (adicionar) {
                    case 1:
                        gerenciador.adicionarTarefa();
                        break;
                    case 2:
                        if (gerenciador.lista.isEmpty()) {
                            vazio();
                            continue;
                        }
                        gerenciador.listarTarefa();
                        break;
                    case 3:
                        if (gerenciador.lista.isEmpty()) {
                            vazio();
                            continue;
                        }
                        a1 = JOptionPane.showInputDialog(null, "Digite o numero da tarefa que foi concluida.", "Número da Tarefa concluída", JOptionPane.QUESTION_MESSAGE);
                        try {
                            indice = Integer.parseInt(a1);
                            gerenciador.concluirTarefa(indice - 1);
                            break;
                        } catch (Exception e) {
                            erro();
                            continue;
                        }
                    case 4:
                        if (gerenciador.lista.isEmpty()) {
                            vazio();
                            continue;
                        }
                        a2 = JOptionPane.showInputDialog(null, "Digite o numero da tarefa que deseja editar.", "Editar Tarefa", JOptionPane.QUESTION_MESSAGE);
                        try {
                            edita = Integer.parseInt(a2);
                            gerenciador.editarTarefa(edita - 1);
                            break;
                        } catch (Exception e) {
                            erro();
                            continue;
                        }
                    case 5:
                        if (gerenciador.lista.isEmpty()) {
                            vazio();
                            continue;
                        }
                        gerenciador.listarConcluidas();
                        break;
                    case 6:
                        gerenciador.finalizar();
                        break;
                    default:
                        erro();
                        continue;
                }
            } else {
                erro();
            }
        }
    }

    public static void erro() {
        JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static void vazio() {
        JOptionPane.showMessageDialog(null, "Lista Vazia!", "Erro!", JOptionPane.ERROR_MESSAGE);
    }
}
