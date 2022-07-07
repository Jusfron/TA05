import javax.swing.JOptionPane;

public class TA05_5App {

	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));
		if(num % 2 == 0) {
			JOptionPane.showMessageDialog(null, num+" es divisible entre 2");
		} else {
			JOptionPane.showMessageDialog(null, num+" no es divisible entre 2");
		}

	}

}
