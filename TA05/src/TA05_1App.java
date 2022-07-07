
public class TA05_1App {

	public static void main(String[] args) {
		int num1, num2;
		num1 = 6;
		num2 = 2;
		comparar(num1,num2);
		num1 = 4;
		num2 = 4;
		comparar(num1,num2);
		num1 = 8;
		num2 = 12;
		comparar(num1,num2);

	}
	
	private static void comparar(int num1, int num2) {
		System.out.println("Valor de num1: "+num1+"\nValor de num2: "+num2);
		if(num1 == num2) {
			System.out.println("num1 y num2 son iguales");
		} else if (num1 > num2) {
			System.out.println("num1 es mas grande que num2");
		} else {
			System.out.println("num1 es mas pequeño que num2");
		}
	}

}
