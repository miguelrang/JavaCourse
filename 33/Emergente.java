import javax.swing.*;

public class Emergente extends JFrame{

	private JLabel label;

	public Emergente(){
		setLayout(null);

		label = new JLabel("No se aceptan Strings");
		label.setBounds(10, 10, 150, 30);
		add(label);
	}

	public Emergente(float resultado){
		setLayout(null);

		String str = "Resultado: " + resultado;
		label = new JLabel(str);
		label.setBounds(5, 5, (str.length())*10, 40);
		add(label);
	}
}