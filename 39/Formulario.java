import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener, ChangeListener{

	private JLabel message;

	private JCheckBox accept;

	private JButton continuee;

	public Formulario(){
		setLayout(null);

		message = new JLabel("Aceptar Terminos y Condiciones.");
		message.setBounds(10, 10, 400, 30);
		add(message);

		accept = new JCheckBox("Acepto");
		accept.setBounds(10, 50, 100, 30);
		accept.addChangeListener(this);
		add(accept);

		continuee = new JButton("Continuar");
		continuee.setBounds(10, 100, 100, 30);
		continuee.addActionListener(this);
		add(continuee);
		continuee.setEnabled(false);
	}

	public void stateChanged(ChangeEvent event){
		if(accept.isSelected() == true){
			continuee.setEnabled(true);
		}else{
			continuee.setEnabled(false);
		}
	}

	public void actionPerformed(ActionEvent event){
		if(event.getSource() == continuee){
			System.exit(0);
		}
	}
}