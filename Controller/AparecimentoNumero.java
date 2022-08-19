package Controller;

public class AparecimentoNumero {

	public AparecimentoNumero() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public int ConferirNumero(int numero, int numeroAparecendo) {
		if (numero == 0) {
			return 0;
		} else {
			int numeroDividido = numero % 10;
			
			if (numeroDividido == numeroAparecendo) {
				return 1 + ConferirNumero((numero / 10), numeroAparecendo);
			} else {
				return 0 + ConferirNumero((numero / 10), numeroAparecendo);
			}
		}
	}

}
