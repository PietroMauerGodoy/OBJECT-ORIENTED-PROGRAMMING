

import br.com.ProjetoCaneta.model.Caneta;


public static void main(String[] args) {

	Caneta caneta1 = new Caneta("Bic", "Azul", 3.0, "plástico");
	Caneta caneta2 = new Caneta("CIS", "Preto", 5.0, "acrílico");

	System.out.println("A marca da caneta é: " + caneta1.getMarca());
	System.out.println("A cor da caneta é: " + caneta1.getCor());
	System.out.println("O valor da caneta foi: R$ " + caneta1.getValor());
	System.out.println("O material da caneta é: " + caneta1.getMaterial());

	System.out.println("Sua caneta está " + caneta1.getEstaTampada());


	caneta1.escrever("Olá mundo!");


	caneta1.destamparCaneta();
	System.out.println("Sua caneta está " + caneta1.getEstaTampada());


	caneta1.escrever("Olá mundo!");
	System.out.println("Tinta restante: " + caneta1.getQuantidadeTinta() + "%");
}
