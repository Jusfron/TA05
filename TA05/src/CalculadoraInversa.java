import javax.swing.JOptionPane;

public class CalculadoraInversa {

	public static void main(String[] args) {
		int operando1, operando2;
		String signo;
		double resultado;
		operando1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer operando"));
		operando2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo operando"));
		signo = JOptionPane.showInputDialog("Introduce el signo aritmético");
		switch(signo) {
		case "+":
			resultado = operando1+operando2;
			JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
			break;
		case "-":
			resultado = operando1-operando2;
			JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
			break;
		case "*":
			resultado = operando1*operando2;
			JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
			break;
		case "/":
			resultado = (double)operando1/operando2;
			JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
			break;
		case "^":
			resultado = Math.pow(operando1, operando2);
			JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
			break;
		case "%":
			resultado = operando1%operando2;
			JOptionPane.showMessageDialog(null, "Resultado: "+resultado);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Signo aritmético no reconocido");
			break;
		}
	}

}
