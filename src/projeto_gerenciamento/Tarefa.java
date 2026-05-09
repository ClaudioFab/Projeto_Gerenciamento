
package projeto_gerenciamento;

public class Tarefa {
        private String titulo;
        private String descricao;
        private boolean concluida;

        //Construtor------------------------------------------------------------
        public Tarefa(String titulo, String descricao, boolean concluida) {
            this.titulo = titulo;
            this.descricao = descricao;
            this.concluida = concluida;
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

        

        
    


    
    
    
}
