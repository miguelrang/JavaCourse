import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

	private JTextField text_field;
	
	private JTextArea text_area;
	
	private JScrollPane scroll_pane;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;

	public Formulario(){
		setLayout(null);

		// Text Field
		text_field = new JTextField();
		text_field.setBounds(10, 10, 410, 30);
		add(text_field);

		// Button
		button1 = new JButton("Agregar");
		button1.setBounds(10, 41, 200, 30);
		add(button1);

		button2 = new JButton("Limpiar");
		button2.setBounds(215, 41, 200, 30);
		add(button2);

		button3 = new JButton("Limpiar");
		button3.setBounds(10, 518, 410, 30);
		add(button3);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

		// Text Area
		text_area = new JTextArea();
		scroll_pane = new JScrollPane(text_area);
		scroll_pane.setBounds(10, 80, 410, 437);
		add(scroll_pane);
	}

	public void actionPerformed(ActionEvent evento){
		if(evento.getSource() == button1){
			//String text = text_area.getText() + "\n" + text_field.getText();
			String text = text_area.getText() + text_field.getText() + "\n";
			text_area.setText(text);
		}else if(evento.getSource() == button2){
			text_field.setText("");
		}else if(evento.getSource() == button3){
			text_area.setText("");
		}
	}
}