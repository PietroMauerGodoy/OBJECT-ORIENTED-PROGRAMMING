package br.com.ProjetoCaneta.model;

public class Caneta{

    public String marca;
    public String cor;
    public double valor;
    public String material;
    public boolean estaTampada;
    public float quantidadeTinta = 100;



    public Caneta(String marca, String cor, Double valor, String material) {
        this.marca = marca ;
        this.cor = cor;
        this.valor  = valor;
        this.material = material;
    }

    public String estaTampada() {
        if (this.estaTampada == true) return "tampada";
        else return "destampada";

    }

    public void destamparCaneta() {

        if (this.estaTampada == false ) {
            System.out.println("Sua caneta já esta destampada");
            return;
        }
       this.estaTampada = false;

    }
    public void escrever(String escrever) {

        if (this.estaTampada == false
                && this.quantidadeTinta >= 10 ) {
            System.out.println("Voce escreveu: " + escrever);

        }
    }



}
