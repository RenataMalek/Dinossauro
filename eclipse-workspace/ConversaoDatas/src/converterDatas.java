/*
 * Conversão de datas Gregorianas para datas Julianas
 * Author : Renata dos Santos Malek
 * Date : 07/03/2020
 * Version : 1.0
 */

import javax.swing.JOptionPane;

public class converterDatas {

	public static void main(String[] args) {

		int dia, mes, ano;
		String recebeDados = "";

		recebeDados = JOptionPane.showInputDialog("Informe a data desejada, seguindo o padrão -> 01/01/1900");

		dia = Integer.parseInt(recebeDados.substring(0, 2));
		mes = Integer.parseInt(recebeDados.substring(3, 5));
		ano = Integer.parseInt(recebeDados.substring(6, 10));

		JOptionPane.showMessageDialog(null,
				"Data gregoriana = " + dia + "/" + mes + "/" + ano + "\nData Juliana = " + converter(dia, mes, ano));
	}

	public static int converter(int dia, int mes, int ano) {

		int dataConvertida = (1461 * (ano + 4800 + (mes - 14) / 12)) / 4
				+ (367 * (mes - 2 - 12 * ((mes - 14) / 12))) / 12 - (3 * ((ano + 4900 + (mes - 14) / 12) / 100)) / 4
				+ dia - 32075;

		return dataConvertida;

	}

}
