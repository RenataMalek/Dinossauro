
public class Dinossauro {
	int energia = 50;
	int velocidade = 50;
	int temperatura = 50;
	int humor = 50;

	public boolean pular() {
		energia -= 5;
		humor += 5;

		if (energia > 0) {
			return true;
		}
		return false;
	}

	public boolean correr() {
		energia -= 5;
		humor += 5;

		if (energia > 0) {
			return true;
		}
		return false;

	}

	public void comer() {
		energia += 5;
		humor += 5;
	}

	public boolean atirar() {
		energia -= 5;
		humor += 5;

		if (energia > 0) {
			return true;
		}
		return false;

	}

	public boolean tomarSol() {
		velocidade += 5;
		humor += 5;
		energia -= 5;

		if (energia > 0) {
			return true;
		}
		return false;
	}

	public boolean ficarNaSombra() {
		energia += 5;
		humor -= 5;

		if (humor > 0) {
			return true;
		}
		return false;

	}
}
