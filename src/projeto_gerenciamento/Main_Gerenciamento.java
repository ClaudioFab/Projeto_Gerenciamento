package projeto_gerenciamento;

import java.util.Scanner;

public class Main_Gerenciamento {

    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1- Adicionar tarefas\n2- Listar tarefas\n3- Concluir tarefa\n4- Editar tarefa\n5- Listar tarefas concluidas\n6- Sair  ");
            int adicionar = scan.nextInt();
            switch (adicionar) {
                case 1:
                    gerenciador.adicionarTarefa();
                    break;

                case 2:
                    gerenciador.listarTarefas();
                    break;

                case 3:
                    System.out.println("Digite o numero da tarefa que foi concluida.");
                    int indice= scan.nextInt();
                    gerenciador.concluirTarefa(indice - 1);
                    break;

                case 4:
                    System.out.println("Digite o numero da tarefa que deseja editar.");
                    int edita= scan.nextInt();
                    gerenciador.editarTarefa(edita - 1);
                    break;

                case 5:
                    gerenciador.listarConcluidas();
                    break;

                case 6:
                    gerenciador.finalizar();
                    break;
                default:
                    System.out.println("Opcção invalida");
            }

        }
    }
}
