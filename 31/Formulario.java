import javax.swing.*;

public class Formulario extends JFrame{

	private JTextField text_field;
	private JTextArea text_area;
	private JScrollPane scroll_pane;

	public Formulario(){
		setLayout(null);

		text_field = new JTextField();
		text_field.setBounds(10, 10, 410, 30);
		add(text_field);

		text_area = new JTextArea();
		scroll_pane = new JScrollPane(text_area);
		scroll_pane.setBounds(10, 50, 410, 500);
		add(scroll_pane);
	}
}