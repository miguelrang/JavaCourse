import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class TermsConditions extends JFrame implements ActionListener, ChangeListener{

	private Image icon;

	private Image image_screen_size;
	private ImageIcon image_screen;
	private JLabel image_label;

	private JLabel title;
	
	private JTextArea tc_ta; // Terms and Conditions _ Text Area

	private JCheckBox i_have_read; //accept _ check box

	private JButton accept;
	private JButton no_accept;


	public TermsConditions(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
		setIconImage(icon);
		setTitle("Terminos y Condiciones");

		// T I T L E (terms & conditions)
		title = new JLabel("TERMINOS Y CONDICIONES");
		title.setBounds(200, 10, 800, 30);
		title.setFont(new Font("Arial Black", Font.PLAIN, 20));
		add(title);

		// T E X T   U N E D I T A B L E
		String text;
		text = "    TERMINOS Y CONDICIONES\n\n";
		text += "      A. PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE LA GEEKIPEDIA DE ERNESTO.\n";
		text += "      B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS.\n";
		text += "      C. LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE.\n\n";
		text += "    LOS ACUERDOS LEGALES EXPUESTO A CONTINNUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE\n";
		text += "    (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO). NO SE RESPONSABILIZAN DEL USO QUE USTED\n";
		text += "    HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN 'ACEPTO'\n";
		text += "    SI USTED 'NO ACEPTA' ESTOS TERMINOS, HAGA CLIC EN 'NO ACEPTO' Y NO HAGA USO DEL SOFTWARE\n";

		tc_ta = new JTextArea(text);
		tc_ta.setBounds(10, 50, 680, 170);
		tc_ta.setEditable(false);
		add(tc_ta);

		// C H E C K   I F   Y O U   H A V E   R E A D   T & C
		i_have_read = new JCheckBox("He Leido Terminos y Condiciones");
		i_have_read.setBounds(10, 210, 250, 40);
		i_have_read.addChangeListener(this);
		add(i_have_read);

		// B U T T O N S
		accept = new JButton("Acepto");
		accept.setBounds(10, 255, 100, 30);
		accept.setEnabled(false);
		accept.addActionListener(this);
		add(accept);

		no_accept = new JButton("No Acepto");
		no_accept.setBounds(120, 255, 100, 30);
		no_accept.setEnabled(true);
		no_accept.addActionListener(this);
		add(no_accept);

		// I M A G E
		image_screen_size = new ImageIcon("images/coca-cola.png").getImage(
			).getScaledInstance(300, 130, Image.SCALE_SMOOTH);
		image_screen = new ImageIcon(image_screen_size);
		
		image_label = new JLabel(image_screen);
		image_label.setSize(1100, 520);
		add(image_label);
	}

	public void stateChanged(ChangeEvent event){
		if(i_have_read.isSelected() == true){
			accept.setEnabled(true);
		}else if(i_have_read.isSelected() == false){
			accept.setEnabled(false);
		}
	}

	public void actionPerformed(ActionEvent event){
		if(event.getSource() == accept){
			this.setVisible(false);

			Vacations vacations = null;
			vacations = new Vacations();

			vacations.setBounds(0, 0, 640, 545);
			vacations.setVisible(true);
			vacations.setResizable(false);
			vacations.setLocationRelativeTo(null);
		}
		if(event.getSource() == no_accept){
			this.setVisible(false);
			
			Login login = null;
			login = new Login();
			login.setBounds(0, 0, 450, 600);
			login.setVisible(true);
			login.setResizable(false);
			login.setLocationRelativeTo(null);
		}
	}

	public static void main(String args[]){
		Vacations vacations = null;
		vacations = new Vacations();

		vacations.setBounds(0, 0, 640, 545);
		vacations.setVisible(true);
		vacations.setResizable(false);
		vacations.setLocationRelativeTo(null);
	}
}