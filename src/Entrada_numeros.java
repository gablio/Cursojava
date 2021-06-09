import javax.swing.*;
public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

	//double x=10000.00;
	
	//System.out.printf("%1.2f", x/3);
	
	String num1= JOptionPane.showInputDialog("introduce un numero");
	
	double num2= Double.parseDouble(num1);
	
	System.out.print("la raiz de " + num2 + "es ");
	
	System.out.printf("%1.2f", Math.sqrt(num2));
	
		
		
		
		
		
	}

}
