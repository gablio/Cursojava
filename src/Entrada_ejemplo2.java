import javax.swing.*;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad");
		int edad_usuario= Integer.parseInt(edad);
		
		
		
		System.out.println("Hola" + nombre_usuario + "El año que viene tendras " +(edad_usuario+1)+ "años");
		
		
		
		
		
	}

}
