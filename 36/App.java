public class App{
	public static void main(String args[]){
		Formulario formulario = null;
		formulario = new Formulario();

		formulario.setBounds(0, 0, 500, 500);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}