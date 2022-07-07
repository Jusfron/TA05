import javax.swing.JOptionPane;

public class TA05_11App {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Introduce el dia de la semana");
		dia.toLowerCase();
		switch(dia) {
		case "lunes":
			JOptionPane.showMessageDialog(null, dia+" es laborable");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, dia+" es laborable");
			break;
		case "miercoles":
			JOptionPane.showMessageDialog(null, dia+" es laborable");
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, dia+" es laborable");
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, dia+" es laborable");
			break;
		case "sabado":
			JOptionPane.showMessageDialog(null, dia+" es festivo");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, dia+" es festivo");
			break;
		default:
			JOptionPane.showMessageDialog(null, dia+" no es un dia de la semana");
			break;
		}
	}

}
