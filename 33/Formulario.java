import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	private Emergente emergente;
	public boolean bolean = false; 

	private JLabel label1;
	private JLabel label2;
	private JLabel label3;

	private JTextField text_field1;
	private JTextField text_field2;

	private JButton button1;
	private JButton button2;

	public Formulario(){
		setLayout(null);

		// Label
		label1 = new JLabel("Numero 1:");
		label1.setBounds(10, 10, 60, 30);
		add(label1);

		label2 = new JLabel("Numero 2:");
		label2.setBounds(10, 35, 60, 30);
		add(label2);

		// Text Field
		text_field1 = new JTextField("0");
		text_field1.setBounds(70, 15, 110, 20);
		add(text_field1);

		text_field2 = new JTextField("0");
		text_field2.setBounds(70, 40, 110, 20);
		add(text_field2);

		// Button
		button1 = new JButton("Sumar");
		button1.setBounds(10, 70, 85, 30);
		add(button1);

		button2 = new JButton("Limpiar");
		button2.setBounds(100, 70, 85, 30);
		add(button2);

		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event){
		if(event.getSource() == button1){
			// Sumar
			float valor1;
			float valor2;
			float resultado;

			try{
				if((text_field1.getText()).equals("")){
					valor1 = 0;
				}else{
					valor1 = Float.parseFloat(text_field1.getText());
				}
				if((text_field2.getText()).equals("")){
					valor2 = 0;
				}else{
					valor2 = Float.parseFloat(text_field2.getText());
				}

				resultado =  valor1 + valor2;

				emergente = new Emergente(resultado);
				emergente.setBounds(0, 0, (("resultado: " + resultado).length())*10, 100);
				emergente.setVisible(true);
				emergente.setResizable(false);
				emergente.setLocationRelativeTo(null);

			}catch(Exception except){

				emergente = new Emergente();
				emergente.setBounds(0, 0, 160, 100);
				emergente.setVisible(true);
				emergente.setResizable(false);
				emergente.setLocationRelativeTo(null);
			}
		}else if(event.getSource() == button2){
			// Limpiar
			text_field1.setText("");
			text_field2.setText("");
			this.bolean = false;
		}

	}
}