
package com.mycompany.projetolivro1;


public class Projetolivro1 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Java para web", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
        
        
        
        System.out.println(l[0].detalhes());
        
        System.out.println(l[1].detalhes());
    }
}
