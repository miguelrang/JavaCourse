import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

	private JTextField text_field;
	
	private JLabel label;

	private JButton button1;
	private JButton button2;

	public Formulario(){
		setLayout(null);
		setTitle("Name");
		// LABEL
		label = new JLabel("User: ");
		label.setBounds(10, 10, 50, 30);
		add(label);

		// TEXT FIELD
		text_field = new JTextField("Write the new name");
		text_field.setBounds(50, 10, 160, 30);
		text_field.setVisible(true);
		add(text_field);

		// BUTTON
		button1 = new JButton("Modify");
		button1.setBounds(10, 70, 80, 30);
		add(button1);
		button1.addActionListener(this);

		button2 = new JButton("Cerrar");
		button2.setBounds(130, 70, 80, 30);
		add(button2);
		button2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent button){
		if(button.getSource() == button1){
			String text = text_field.getText();
			setTitle(text); 
		}else if(button.getSource() == button2){
			System.exit(0);
		}
	}
}