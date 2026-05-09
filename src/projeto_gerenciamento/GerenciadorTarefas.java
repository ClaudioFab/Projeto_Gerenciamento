/*
Classe GerenciadorTarefas
Atributos:
• lista de tarefas (ArrayList) 
Métodos:
• adicionarTarefa() 
• listarTarefas() 
• concluirTarefa(int indice) 
*/

package projeto_gerenciamento;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciadorTarefas {
    
    //Criando a lista de tarefas
    ArrayList<Tarefa> lista = new ArrayList<>();
    
    /*
    //Atributos da classe Tarefa.
    private String titulo;
    private String descricao;
    private boolean concluida;
    */
    
    public void listagem(){
        //criando um obj
        Tarefa t1 = new Tarefa("","",false);


    }
    
    public void adicionarTarefa(){
        //adicionando objeto a lista

        String tarefa = JOptionPane.showInputDialog(null,"Digite a Tarefa a ser feita: ");
        String go = JOptionPane.showInputDialog(null,"Digite a Tarefa a ser feita: ");
        lista.add(new Tarefa(go,"",false));

    }
    
    public void listarTarefas(){
        JOptionPane.showMessageDialog(null,"");
    }
    
    public void concluirTarefa(){
        Tarefa p1 = new Tarefa("","",false);
        p1.setConcluida(true); 
    }

}
