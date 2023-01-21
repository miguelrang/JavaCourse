import java.awt.*;
import javax.swing.*;


public class Warning extends JFrame{

	private Image icon;
	private JLabel message;

	public Warning(int num){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("ADVERTENCIA");
		getContentPane().setBackground(Color.RED);
		icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
		setIconImage(icon);

		String text = "";
		if(num == 1){
			text = "El nombre de usuario no es valido.";
		}
		if(num == 2){
			text = "Debes llenar los campos correctamente";
		}
		if(num == 3){
			text = "El creador de esta aplicacion es anonimo";
		}
		message = new JLabel(text);
		message.setBounds(10, 10, 500, 30);
		message.setForeground(Color.WHITE);
		message.setFont(new Font("Arial", Font.PLAIN, 20));
		add(message);
	}
}