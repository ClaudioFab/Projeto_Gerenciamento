package projeto_gerenciamento;


import javax.swing.JOptionPane;

public class Main_Gerenciamento {

    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        
        while (true) {
           
            String a0 = JOptionPane.showInputDialog(null, "1- Adicionar tarefas\n2- Listar tarefas\n3- Concluir tarefa\n4- Editar tarefa\n5- Listar tarefas concluidas\n6- Sair  ");
            int adicionar = Integer.parseInt(a0);
            
            switch (adicionar) {
                case 1:
                    gerenciador.adicionarTarefa();
                    break;

                case 2:
                    gerenciador.listarTarefas();
                    break;

                case 3:
                    String a1 = JOptionPane.showInputDialog(null,"Digite o numero da tarefa que foi concluida.");
                    int indice= Integer.parseInt(a1);
                    gerenciador.concluirTarefa(indice - 1);
                    break;

                case 4:
                    String a2 = JOptionPane.showInputDialog(null,"Digite o numero da tarefa que deseja editar.");
                    int edita= Integer.parseInt(a2);
                    gerenciador.editarTarefa(edita - 1);
                    break;

                case 5:
                    gerenciador.listarConcluidas();
                    break;

                case 6:
                    gerenciador.finalizar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcção invalida");
            }

        }
    }
}
