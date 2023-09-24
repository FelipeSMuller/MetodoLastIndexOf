package MetodosDeString;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Encontrar a Última Ocorrência de um Caractere: Solicite ao usuário que insira
		 * uma string e um caractere. Use o método para encontrar a última ocorrência
		 * desse caractere na string e exibir a posição.
		 */

		String buscaCaractere;

		char caractere = 'a';

		do {

			buscaCaractere = JOptionPane.showInputDialog(null, "Digite uma frase para verificar o índice");

			if (buscaCaractere == null) {

				JOptionPane.showMessageDialog(null, "ERRO \nCampo Vazio!!");

				break;
			}

			else {

				buscaCaractere = buscaCaractere.toLowerCase();

				int indice = buscaCaractere.lastIndexOf(caractere);

				JOptionPane.showMessageDialog(null, "A última ocorrência do caractere : " + " " + caractere + " "
						+ "na frase = " + buscaCaractere + " foi encontrada \n" + "no índice " + indice);

			}

		} while (buscaCaractere != null);

	}

}
