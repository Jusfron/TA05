import javax.swing.JOptionPane;

public class TA05_12App {

	public static void main(String[] args) {
		String contrasena = "1234";
		for(int i = 0; i < 3; i++) {
			String contrIntr = JOptionPane.showInputDialog("Introduce la contraseña");
			if(contrIntr.equals(contrasena)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Error. Te quedan "+(3-i-1)+" intentos");
			}
		}
	}

}
