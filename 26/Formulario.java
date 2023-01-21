import javax.swing.*;

public class Formulario extends JFrame{

	private JLabel label1;
	private JLabel label2;

	public Formulario(){
		setLayout(null);
		label1 = new JLabel("Hola!");
		label1.setBounds(10, 10, 300, 30);
		add(label1);
		label2 = new JLabel("Adios!");
		label2.setBounds(10, 25, 300, 30);
		add(label2);
	}
}