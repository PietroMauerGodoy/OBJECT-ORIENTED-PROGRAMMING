package br.com.ProjetoCaneta.model;

public class Caneta {

    private String marca;
    private String cor;
    private double valor;
    private String material;
    private boolean estaTampada;
    private float quantidadeTinta = 100;

    public Caneta(String marca, String cor, double valor, String material) {
        this.setMarca(marca);
        this.setCor(cor);
        this.setValor(valor);
        this.material = material;
        this.estaTampada = true;
    }

    public String getEstaTampada() {
        if (this.estaTampada) {
            return "tampada";
        } else {
            return "destampada";
        }
    }

    public void setEstaTampada(boolean estaTampada){
        this.estaTampada = estaTampada;
    }

    public void destamparCaneta() {
        if (!this.estaTampada) {
            System.out.println("Sua caneta já está destampada");
            return;
        }
        this.estaTampada = false;
        System.out.println("Caneta destampada.");
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
        this.quantidadeTinta -= 10;
    }

    public void setValor(double valor) {
        if (valor > 0){
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

    public void setMarca(String marca){
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida!");
        }
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        if (cor != null && !cor.isEmpty()) {
            this.cor = cor;
        } else {
            System.out.println("Cor inválida!");
        }
    }

    public float getQuantidadeTinta() {
        return quantidadeTinta;
    }

    public String getMaterial() {
        return this.material;
    }
}