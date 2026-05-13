
package projeto_gerenciamento;

import javax.swing.JOptionPane;

public class Tarefa {
        private String titulo;
        private String descricao;
        private boolean concluida;

        //Construtor------------------------------------------------------------
        public Tarefa(String titulo, String descricao, boolean concluida) {
            this.titulo = titulo;
            this.descricao = descricao;
            this.concluida = false;
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
        
        public void impressao(int numero){
            JOptionPane.showMessageDialog(null,numero+"º Tarefa: "+getTitulo()+"\nDescrição: "+getDescricao()+"\nEstado da tarefa: "+(isConcluida()? "Finalizada" : "Não Concluída"),"Tarefa ("+numero+")",JOptionPane.INFORMATION_MESSAGE);
        }


}
