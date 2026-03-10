package br.com.ProjetoCaneta.model;

public class Caneta {

    private String marca;
    private String cor;
    private double valor;
    private String material;
    private boolean estaTampada;
    public float quantidadeTinta = 100;


    public Caneta(String marca, String cor, Double valor, String material) {
        this.marca = marca;
        this.cor = cor;
        this.setValor(valor);
        this.material = material;
    }

    public String getEstaTampada() {
        if (this.estaTampada == true) return "tampada";
        else return "destampada";

    }
    public void setEstaTampada(boolean estaTampada){
            this.estaTampada = estaTampada;
    }



    public void destamparCaneta() {

        if (this.estaTampada == false) {
            System.out.println("Sua caneta já esta destampada");
            return;
        }
        this.estaTampada = false;

    }

    public void escrever(String texto) {

        if (this.estaTampada) {
            System.out.println("Não é possível escrever. A caneta está tampada.");
            return;
        }

        if (this.quantidadeTinta < 10) {
            System.out.println("Tinta insuficiente.");
            return;
        }

        System.out.println("Você escreveu: " + texto);
        this.quantidadeTinta -= 10; // altera o estado
    }

    public void setValor(double valor) {

       if (this.valor > 0){
           this.valor = valor;
       } else {
           System.out.println("Valor inválido");
       }

    }

    public double getValor(){

        return this.valor;
    }

    public String getMarca(){
        return this.marca;
    }


    public void setMarca (String marca){
        if (marca != "") {
            this.marca = marca;
        }else {
        System.out.println("Marca inválida!");
        }
    }
    public String getCor(){
        return this.cor;
    }


    public void setCor (String cor){
        if (cor != "") {
            this.cor = marca;
        }else {
            System.out.println("Marca inválida!");
        }
    }





}
