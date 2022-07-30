package cursojava.executavel;

import javax.swing.JOptionPane;

public class MeuCursoJDev {

	/* Main é um método auto executável em java */
	public static void main(String[] args) {

		/* Criando um programa de cálculo de média */

		String nota1 = JOptionPane.showInputDialog("informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("informe a nota 4");

		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

		JOptionPane.showMessageDialog(null, " A média é:" + media);

		/* Média para aprovação é 70 */

		if (media >= 50) {

			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado com média de:" + media);
			} else {
				JOptionPane.showMessageDialog(null, "O aluno está em recuperação com média de:" + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "O aluno está REPROVADO com média de:" + media);
		}

	}

}
