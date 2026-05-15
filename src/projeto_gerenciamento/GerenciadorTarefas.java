
package projeto_gerenciamento;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciadorTarefas {

    ArrayList<Tarefa> lista = new ArrayList<>();

    public void adicionarTarefa() {
        String titulo01 = "", descri01 = "";
        int prior = 0;
        titulo01 = JOptionPane.showInputDialog(null, "Digite a Tarefa a ser feita: ", "Nome da Tarefa", JOptionPane.QUESTION_MESSAGE);
        if (titulo01 == null) {
            finalizar();
        } else if (titulo01.isEmpty()) {
            erro();
            return;
        }
        descri01 = JOptionPane.showInputDialog(null, "Descreva a tarefa: ", "Descreva a Tarefa", JOptionPane.QUESTION_MESSAGE);
        if (descri01 == null) {
            finalizar();
        } else if (descri01.isEmpty()) {
            erro();
            return;
        }
        String[] varia = {"Alta", "Média", "Baixa"};
        prior = JOptionPane.showOptionDialog(null, "Defina a prioridade dessa tarefa: ", "Prioridade", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, varia, varia[0]);
        if (prior == -1) {
            erro();
            return;
        }
        lista.add(new Tarefa(titulo01, descri01, false, prior));
    }

    public void listarTarefa() {
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).impressao((i + 1));
        }
    }

    public void concluirTarefa(int indice) {
        Tarefa t1 = lista.get(indice);
        t1.setConcluida(true);
    }

    public void editarTarefa(int edita) {
        Tarefa t1 = lista.get(edita);
        String titulo01 = JOptionPane.showInputDialog(null, "Altere o título da Tarefa: ", "Alterar Título", JOptionPane.QUESTION_MESSAGE);
        if (titulo01 == null) {
            finalizar();
        } else if (titulo01.isEmpty()) {
            erro();
            return;
        }
        String descri01 = JOptionPane.showInputDialog(null, "Altere a descrição da tarefa: ", "Alterar Descrição", JOptionPane.QUESTION_MESSAGE);
        if (descri01 == null) {
            finalizar();
        } else if (descri01.isEmpty()) {
            erro();
            return;
        }
        t1.setTitulo(titulo01);
        t1.setDescricao(descri01);
    }

    public void listarConcluidas() {

        boolean no1 = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).isConcluida()) {
                lista.get(i).impressao(i + 1);
                no1 = true;
            }
        }
        if (!no1) {
            JOptionPane.showMessageDialog(null,"Nenhuma tarefa foi concluída.","Tarefas Concluídas",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void finalizar() {
        JOptionPane.showMessageDialog(null, "Programa finalizado.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public static void erro() {
        JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
