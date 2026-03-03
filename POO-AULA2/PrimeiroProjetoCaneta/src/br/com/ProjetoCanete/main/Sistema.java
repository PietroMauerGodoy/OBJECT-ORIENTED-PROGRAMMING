package br.com.ProjetoCanete.main;

import br.com.ProjetoCaneta.model.Caneta;

public class Sistema {

	public static void main(String[] args) {
			Caneta caneta1 = new Caneta("Bic" , "Azul" , 3.0, "plástico");
			Caneta caneta2 = new Caneta("CIS", "Preto", 5.0, "acrilico");


			System.out.println("A caneta é da cor : " + caneta1.cor );
			System.out.println("A caneta é desse : " + caneta1.marca );
			System.out.println("A caneta foi esse valor:" + caneta1.valor);
			System.out.println("A caneta é desse material" + caneta1.material);


		System.out.println("Sua caneta esta " + caneta1.estaTampada());

		}
	}



