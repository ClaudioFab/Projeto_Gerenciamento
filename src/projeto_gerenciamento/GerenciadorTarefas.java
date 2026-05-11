
package projeto_gerenciamento;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciadorTarefas {
    
    //Criando a lista de tarefas
    ArrayList<Tarefa> lista = new ArrayList<>();

    //adicionando objeto a lista
    public void adicionarTarefa(){
        String titulo01 = JOptionPane.showInputDialog(null,"Digite a Tarefa a ser feita: ");
        String descri01 = JOptionPane.showInputDialog(null,"Descreva a tarefa: ");
        Tarefa t1 = new Tarefa(titulo01,descri01,false);
        lista.add(t1);
    }
    
    public void listarTarefas(){
        
        for(int i = 0; i < lista.size(); i++){
            lista.get(i).impressao();
        }
        
    }
    
    public void concluirTarefa(int indice){

    }

}
