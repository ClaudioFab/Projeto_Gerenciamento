
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
        lista.add(new Tarefa(titulo01,descri01,false));
    }
    
    public void listarTarefas(){
        
        for(int i = 0; i < lista.size(); i++){
            lista.get(i).impressao();
        }
        
    }
    
    public void concluirTarefa(int indice){
        Tarefa t1 = lista.get(indice);
        t1.setConcluida(true);
    }

}
