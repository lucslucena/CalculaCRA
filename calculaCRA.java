import javax.swing.JOptionPane;

public class calculaCRA {
	private static double total;
	private static double totalFinal;

	public static void main(String [] args) {
		int qtdNotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas"));
		for(int k=0; k < qtdNotas; k++) {
			int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas da disciplina: "));
			double notas = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua média da disciplina: "));
			total = notas * horas;
			totalFinal = totalFinal + total;
		}
		double qtdHoras = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas de todas as disciplinas somadas: "));
		double result = totalFinal / qtdHoras;
		
		System.out.println("Seu CRA é " + result);
		
	}
}
