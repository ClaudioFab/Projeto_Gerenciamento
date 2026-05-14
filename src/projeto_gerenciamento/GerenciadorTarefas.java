
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
            lista.get(i).impressao((i+1));  
        }
        
    }
        
    public void concluirTarefa(int indice){
        Tarefa t1 = lista.get(indice);
        t1.setConcluida(true);
    }
    
    public void editarTarefa(int edita){
        Tarefa t1 = lista.get(edita);
        String titulo01 = JOptionPane.showInputDialog(null,"Altere o título da Tarefa: ");
        String descri01 = JOptionPane.showInputDialog(null,"Altere a descrição da tarefa: ");
        t1.setTitulo(titulo01);
        t1.setDescricao(descri01);
    }
    
    public void listarConcluidas(){
        
        for(int i = 0; i < lista.size(); i++){
            lista.get(i).isConcluida();  
            if(lista.get(i).isConcluida() == true){
                lista.get(i).impressao(i+1);
            }else{
                //nada
            }
        }
        
    }
    
    public void finalizar(){
        System.exit(0);
    }

    void adicionarTarefas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
