package View;

import Controller.AparecimentoNumero;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AparecimentoNumero aparecimento = new AparecimentoNumero();
		
		int numero = 523578;
		int numeroAparecendo = 5;
		
		int resultado = aparecimento.ConferirNumero(numero, numeroAparecendo);
		
		System.out.println(resultado);
	}

}
