
package projeto_gerenciamento;

import javax.swing.JOptionPane;

public class Tarefa {

    private String titulo;
    private String descricao;
    private boolean concluida;
    private int prioridade;

    //Construtor------------------------------------------------------------
    public Tarefa(String titulo, String descricao, boolean concluida, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
        this.prioridade = prioridade;
    }

    //GETTER----------------------------------------------------------------
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public int getPrioridade() {
        return prioridade;
    }

    //SETTER----------------------------------------------------------------
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void impressao(int numero) {
        String mensag = "", priori = "";
        mensag += numero + "º Tarefa: " + getTitulo() + "\n";
        mensag += "Descrição: " + getDescricao() + "\n";
        mensag += "Estado da tarefa: " + (isConcluida() ? "Finalizada" : "Não Concluída") + "\n";
        if (getPrioridade() == 0) {
            priori = "Alta";
        } else if (getPrioridade() == 1) {
            priori = "Média";
        } else if (getPrioridade() == 2) {
            priori = "Baixa";
        }
        mensag += "Prioridade da tarefa: " + priori;
        JOptionPane.showMessageDialog(null, mensag, "Tarefa (" + numero + ")", JOptionPane.INFORMATION_MESSAGE);
    }
}
