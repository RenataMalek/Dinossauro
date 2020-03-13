import java.util.Scanner;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		Dinossauro skeep = new Dinossauro();
		// Scanner scan = new Scanner(System.in);
		String opc = "Z"; // scan.nextLine().toUpperCase();

		while (opc != "E") {
			// while (scan.hasNext()) {
			opc = JOptionPane.showInputDialog(
					"JOGO DO DINOSSAURO \nEscolha a sua opção, e digite a letra para jogar \n (P)ular \n (C)orrer \n Co(M)er \n (A)tirar \n Tomar (S)ol \n Ficar na S(O)mbra \n\n\n Caso deseje encerrar, digite (E)");
			// }
			// char letra = opc.charAt(0);

			switch (opc) {
			case "P":
				if (skeep.pular() == false) {
					JOptionPane.showMessageDialog(null, "Seu dinossauro está sem energia, game over");
				}
				break;

			case "C":
				if (skeep.correr() == false) {
					JOptionPane.showMessageDialog(null, "Seu dinossauro está sem energia, game over");
				}
				break;

			case "M":
				skeep.comer();
				break;

			case "A":
				if (skeep.atirar() == false) {
					JOptionPane.showMessageDialog(null, "Seu dinossauro está sem energia, game over");
				}
				break;

			case "S":
				if (skeep.tomarSol() == false) {
					JOptionPane.showMessageDialog(null, "Seu dinossauro está sem energia, game over");
				}
				break;

			case "O":
				if (skeep.ficarNaSombra() == false) {
					JOptionPane.showMessageDialog(null, "Seu dinossauro está de péssimo humor, game over");
				}
				break;

			case "E":
				JOptionPane.showMessageDialog(null, "Obrigado por jogar!!");
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Comando não identificado, por favor jogue novamente");
			}

		}

	}

}
