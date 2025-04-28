package br.com.RedQueenStreet.modelo;

public class Produtos {
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
