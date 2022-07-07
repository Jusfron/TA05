import javax.swing.JOptionPane;

public class TA05_11App {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Introduce el dia de la semana");
		dia.toLowerCase();
		switch(dia) {
		case "lunes":
			JOptionPane.showMessageDialog(null, dia+" es laborable");
		case "martes":
			JOptionPane.showMessageDialog(null, dia+" es laborable");
		case "miercoles":
			JOptionPane.showMessageDialog(null, dia+" es laborable");
		case "jueves":
			JOptionPane.showMessageDialog(null, dia+" es laborable");
		case "viernes":
			JOptionPane.showMessageDialog(null, dia+" es laborable");
		case "sabado":
			JOptionPane.showMessageDialog(null, dia+" es festivo");
		case "domingo":
			JOptionPane.showMessageDialog(null, dia+" es festivo");
		default:
			JOptionPane.showMessageDialog(null, dia+" no es un dia de la semana");
		}
	}

}
