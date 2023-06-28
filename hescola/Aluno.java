
package com.mycompany.hescola;


public class Aluno extends Pessoa {
    private int matr;
    private String curso;
    
    //Metodo Publico
    
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada");
                
    }
    
    //Metodos especiais

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
