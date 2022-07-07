import javax.swing.JOptionPane;

public class TA05_6App {

	public static void main(String[] args) {
		final double IVA = 0.21;
		double precioInicial, precioFinal;
		precioInicial = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto"));
		precioFinal = precioInicial+precioInicial*IVA;
		JOptionPane.showMessageDialog(null, "El precio con IVA es "+Double.toString(precioFinal).substring(0, Double.toString(precioFinal).indexOf('.')+3));
	}

}
