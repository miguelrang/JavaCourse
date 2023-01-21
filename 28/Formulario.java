import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	
	// Label
	private JLabel label;

	// Buttons
	private JButton button1;
	private JButton button2;
	private JButton button3;

	public Formulario(){
		setLayout(null);
		// Label
		label = new JLabel("Seleccione 1 boton...");
		label.setBounds(10, 10, 280, 30);
		add(label);

		// Buttons
		button1 = new JButton("Boton 1");
		button1.setBounds(10, 170, 80, 30);
		add(button1);
		button1.addActionListener(this);
		
		button2 = new JButton("Boton 2");
		button2.setBounds(150, 170, 80, 30);
		add(button2);
		button2.addActionListener(this);
		
		button3 = new JButton("Boton 3");
		button3.setBounds(290, 170, 80, 30);
		add(button3);
		button3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent button){
		if(button.getSource() == button1){
			label.setText("Presiono el boton 1");

		}else if(button.getSource() == button2){
			label.setText("Presiono el boton 2");

		}else if(button.getSource() == button3){
			label.setText("Presiono el boton 3");
		}
	}
}