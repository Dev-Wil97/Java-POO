
package com.mycompany.projetolivro1;


public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    

    public String detalhes() {
        System.out.println("--------------------------------");
         return "Livro " + "titulo = " + titulo + 
                "\n autor= " + autor + 
                "\n totPagina= " + totPagina + 
                "\n pagAtual= " + pagAtual + 
                "\n aberto= " + aberto + 
                "\n leitor= " + leitor.getNome() + 
                ", Idade= " + leitor.getIdade() +
                ", sexo= " + leitor.getSexo() ;
    }
    
   
    
    //Construto

    public Livro(String titulo, String autor, int totPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagina = totPagina;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
        
        
    }
    
    //Metodos Especiais
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPagina() {
        return totPagina;
    }

    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //Métodos Abstratos
    
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false; 
    }

    @Override
    public void folhear(int p) {
        if(p > this.totPagina){
            System.out.println("Passou do total de paginas do livro!");
        }else{
             this.pagAtual = p;
        }
    }

    @Override
    public void avançarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
 
}
