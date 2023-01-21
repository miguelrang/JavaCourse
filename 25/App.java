public class App{
	public static void main(String args[]){
		Formulario formulario = null;
		formulario = new Formulario();
		formulario.setBounds(450, 150, 400, 550); // (x-location, y-location,x-dimension, y-dimension)
		formulario.setVisible(true);
		formulario.setLocationRelativeTo(null); // Centra la interfaz
		formulario.setResizable(false);
	}
}