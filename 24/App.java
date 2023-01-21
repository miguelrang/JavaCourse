import javax.swing.*;

public class App{
	public static void main(String args[]){
		Formulario formulario = null;
		formulario = new Formulario();

		formulario.setBounds(0, 0, 200, 190); // (x-location, y-location,x-dimension, y-dimension)
		formulario.setVisible(true);
		formulario.setLocationRelativeTo(null); // Centra la interfaz
	}
}