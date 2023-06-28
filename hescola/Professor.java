
package com.mycompany.hescola;


public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    //Metodo Publico 
    
    public void receberAum(float aum){
        this.salario += aum;
    }
    
    //Metodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
