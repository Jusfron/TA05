import javax.swing.JOptionPane;

public class TA05_4App {

	public static void main(String[] args) {
		String mensajeRadio;
		double radio, area;
		mensajeRadio = JOptionPane.showInputDialog("Introduce el radio del circulo");
		radio = Double.parseDouble(mensajeRadio);
		area = Math.PI*Math.pow(radio, 2);	//Formula area circulo
		JOptionPane.showMessageDialog(null, "La area del circulo es "+area);
	}

}
