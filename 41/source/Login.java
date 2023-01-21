import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Login extends JFrame implements ActionListener{
	private Image icon;

	private Image image_screen_size;
	private ImageIcon image_screen;
	private JLabel image_label;

	private JLabel text;

	private JLabel name;
	private JTextField add_mame;

	private JButton login;

	private Pattern pat;
	private Matcher match;

	public Login(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
		setIconImage(icon);

		//T I T L E
		setTitle("Login");
		getContentPane().setBackground(new Color(250, 0, 0));

		// I M A G E
		image_screen_size = new ImageIcon("images/coca-cola-blanco.png").getImage(
			).getScaledInstance(500, 315, Image.SCALE_SMOOTH);
		image_screen = new ImageIcon(image_screen_size);
		
		image_label = new JLabel(image_screen);
		image_label.setSize(430, 250);
		add(image_label); 
	
		// T E X T
		text = new JLabel("Sistema de Control Vacacional");
		text.setBounds(10, 210, 500, 50);
		
		text.setForeground(Color.WHITE);
		
		text.setFont(new Font("Arial Black", Font.PLAIN, 24));
		
		add(text);

		// R E Q U E S T   N A M E
		name = new JLabel("Escriba su nombre: ");
		add_mame = new JTextField();

		name.setBounds(30, 300, 200, 30);
		add_mame.setBounds(30, 330, 370, 30);

		name.setForeground(Color.WHITE);

		name.setFont(new Font("Arial Black", Font.PLAIN, 14));
		add_mame.setFont(new Font("Arial Black", Font.PLAIN, 12));

		add(name);
		add(add_mame);

		// L O G I N   B U T T O N
		login = new JButton("Ingresar");
		login.setBounds(160, 370, 100, 30);
		login.addActionListener(this);
		add(login);
	}

	public void actionPerformed(ActionEvent event){
		if(event.getSource() == login){

			String get_name = add_mame.getText();
			pat = Pattern.compile("(\\w\\w\\w+ |\\w\\w\\w+)+");
			match = pat.matcher(get_name);

			if(match.matches()){
				this.setVisible(false);

				TermsConditions tc = new TermsConditions();
				tc.setBounds(0, 0, 720, 350);
				tc.setVisible(true);
				tc.setResizable(true);
				tc.setLocationRelativeTo(null);

			}else{
				Warning warning = null;
				warning = new Warning(1);

				warning.setBounds(0, 0, 385, 100);
				warning.setVisible(true);
				warning.setResizable(false);
				warning.setLocationRelativeTo(null);
			}
		}
	}

	public static void main(String args[]){
		TermsConditions tc = new TermsConditions();
		tc.setBounds(0, 0, 720, 350);
		tc.setVisible(true);
		tc.setResizable(true);
		tc.setLocationRelativeTo(null);
	}
}