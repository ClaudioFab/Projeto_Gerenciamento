
package projeto_gerenciamento;

public class Tarefa {
        private String gerenciador;
        private boolean concluida;
        private String descricao;

    public Tarefa(String gerenciador, boolean concluida, String descricao) {
        this.gerenciador = gerenciador;
        this.concluida = concluida;
        this.descricao = descricao;
    }

    public String getGerenciador() {
        return gerenciador;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setGerenciador(String gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void impressao (){
        System.out.println("gerenciador:" + getGerenciador ());
        System.out.println("concluida");
        System.out.println("descricao:" + getDescricao ());
    }
    
    
}
