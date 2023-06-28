
package com.mycompany.hescola;


public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalho;
    
    //Metodo Publico
    
    public void mudarTrablho(){
        this.trabalho =! this.trabalho;
    }
    
    //Metodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(boolean trabalho) {
        this.trabalho = trabalho;
    }
    
    
}
