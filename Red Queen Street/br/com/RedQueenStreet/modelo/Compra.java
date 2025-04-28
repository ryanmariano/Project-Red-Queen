package br.com.RedQueenStreet.modelo;

import java.util.Date;

public class Compra {
    //atributos
    private String IDCompra;

    private Double valor;

    private Date data;

    private int ;

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
