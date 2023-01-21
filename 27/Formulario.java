import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

	private JButton button;

	public Formulario(){
		setLayout(null);
		button = new JButton("Cerrar");
		button.setBounds(340, 520, 80, 30);
		add(button);
		button.addActionListener(this); 
	}

	public void actionPerformed(ActionEvent button){
		if(button.getSource() == this.button){
			System.exit(0);
		}
	}
}