import javax.swing.*;

public class Formulario extends JFrame{

	private JTextField text_field;
	private JTextArea text_area;

	public Formulario(){
		setLayout(null);

		// Text Field
		text_field = new JTextField();
		text_field.setBounds(10, 10, 410, 30);
		add(text_field);

		// Text Area
		text_area = new JTextArea();
		text_area.setBounds(10, 50, 410, 500);
		add(text_area);
	}
}