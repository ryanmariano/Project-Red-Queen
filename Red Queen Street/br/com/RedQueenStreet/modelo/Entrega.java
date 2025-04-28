package br.com.RedQueenStreet.modelo;

//nome da classe
public class Entrega {

    //atributos
    private String titulo;

    private Autor autor;

    private int ano;

    private int qntPagina;

    private String isbn;

    private String editora;

    private double preço;

    //métodos
    public String exibirTitulo() {
        return this.titulo;
    }

    public String exibirAutor() {
        return this.autor;
    }

    public double exibirPreco() {
        return this.preco;
    }

}
