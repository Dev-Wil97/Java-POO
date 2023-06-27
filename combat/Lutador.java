package com.mycompany.combat;

public class Lutador {
    //Atributos
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;
    
    
    
    //Métodos publicos
    public void apresentar(){
        System.out.println("-------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentando... O Lutador : " + this.getNome());
        System.out.println("Diretamente de : " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() +  " anos");
        System.out.println("Com " + this.getAltura() + " de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println("Com " + this.getVitoria() + " Vitórias");
        System.out.println("E  " + this.getDerrota() + " Derrotas");
        System.out.println(this.getEmpate() + " Empates");
    }
    
    public void status(){
        System.out.println("-------------------------------------------");
        System.out.println(this.getNome());
        System.out.println("é um peso " + this.getCategoria());
        System.out.println(this.getVitoria() + " vitorias");
        System.out.println(this.getDerrota() + " derrotas");
        System.out.println(this.getEmpate() + " empates");
    }
    
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
        
    }
    
    public void perderLuta(){
        this.setDerrota(this.getDerrota() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
        
    }
    
    // Construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em ) {
        nome = no;
        nacionalidade = na;
        idade = id;
        altura = al;
        this.setPeso(pe);
        vitoria = vi;
        derrota = de;
        empate = em;
                        
    }
    
    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso() < 52.2){
           this.categoria =  "Invalido";
        }else if (this.getPeso() <= 70.3){
           this.categoria = "Leve";
        }else if (this.getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else {
            this.categoria = "Inválido";
        }
    
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vi) {
        this.vitoria = vi;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int de) {
        this.derrota = de;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int em) {
        this.empate = em;
    }
    
    
}

