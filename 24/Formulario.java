import javax.swing.*;

public class Formulario extends JFrame{
	private JLabel label;

	// Creamos un metodo constructor
	public Formulario(){
		setLayout(null);
		label = new JLabel("La Gekipedia de Ernesto.");
		label.setBounds(10, 10, 180, 10);
		add(label);
	}
}