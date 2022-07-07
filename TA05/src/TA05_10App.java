import javax.swing.JOptionPane;

public class TA05_10App {

	public static void main(String[] args) {
		int numVentas;
		double venta, sumaVentas = 0.0;
		numVentas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de ventas"));
		for(int i = 0; i < numVentas; i++) {
			venta = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta numero "+(i+1)));
			sumaVentas += venta;
		}
		JOptionPane.showMessageDialog(null, "El total de las ventas es "+sumaVentas);
	}

}
