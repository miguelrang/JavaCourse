import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Vacations extends JFrame implements ActionListener{
	
	private Image icon;

	private Image image_screen_size;
	private ImageIcon image_screen;
	private JLabel image_label;

	private JLabel welcome;

	private JMenuBar menu_bar;
	private JMenu options_menu;
	private JMenu more_information;
	private JMenuItem more_information2;
	private JMenuItem back;
	private JMenuItem exit;
	private JMenu modify_color;
	private JMenuItem red;
	private JMenuItem blue;
	private JMenuItem magenta;
	private JMenuItem gray;

	private JLabel text;

	private JLabel text1; // Nombre(s):
	private JTextField textf1;

	private JLabel text2; // Apellido Paterno:
	private JTextField textf2;

	private JLabel text3; // Apellido Materno:
	private JTextField textf3;

	private JLabel text4; // Seleccionar Departamento:
	private JComboBox cb4;

	private JLabel text5; // Seleccione la antiguedad:
	private JComboBox cb5;

	private JLabel text6; // Resultado del Calculo:
	private JTextArea ta6;

	private String name;
	private String middle_name;
	private String last_name;
	private String department;
	private String antiquity;

	private JButton show_info;
	private JButton clean;

	public Vacations(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(250, 0, 0));
		setTitle("Vacaciones");
		icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
		setIconImage(icon);

		image_screen_size = new ImageIcon("images/coca-cola-blanco.png").getImage(
			).getScaledInstance(350, 170, Image.SCALE_SMOOTH);
		image_screen = new ImageIcon(image_screen_size);
		
		image_label = new JLabel(image_screen);
		image_label.setSize(280, 150);
		add(image_label);


		// W E L C O M E
		welcome = new JLabel("BIENVENIDO");
		welcome.setBounds(315, 55, 500, 50);
		welcome.setForeground(Color.WHITE);
		welcome.setFont(new Font("Arial Black", Font.PLAIN, 30));
		add(welcome);
		

		// B A R   M E N U
		menu_bar = new JMenuBar();
		setJMenuBar(menu_bar);

		options_menu = new JMenu("Opciones");
		more_information = new JMenu("Acerca de");
		menu_bar.add(options_menu);
		menu_bar.add(more_information);

		more_information2 = new JMenuItem("Mostrar");
		back = new JMenuItem("Volver al Inicio");
		exit = new JMenuItem("Salir");

		modify_color = new JMenu("Color de Fondo");
		options_menu.add(modify_color);
		options_menu.add(back);
		options_menu.add(exit);
		more_information.add(more_information2);

		back.addActionListener(this);
		exit.addActionListener(this);
		more_information2.addActionListener(this);

		red = new JMenuItem("Rojo");
		blue = new JMenuItem("Azul");
		magenta = new JMenuItem("Rosa");
		gray = new JMenuItem("Gris");
		red.addActionListener(this);
		blue.addActionListener(this);
		gray.addActionListener(this);
		magenta.addActionListener(this);
		modify_color.add(red);
		modify_color.add(blue);
		modify_color.add(gray);
		modify_color.add(magenta);


		// L A B E L S   &   T E X T   F I E L D S
		text = new JLabel("Datos del Empleado para Definir las Vacaciones");
		text.setBounds(45, 150, 700, 40);
		text.setFont(new Font("Arial Black", Font.PLAIN, 20));
		text.setForeground(Color.WHITE);
		add(text);

		text1 = new JLabel("Nombre(s):");
		text1.setBounds(30, 200, 100, 30);
		text1.setForeground(Color.WHITE);
		text1.setFont(new Font("Arial Rounded MT Bould", Font.PLAIN, 15));
		add(text1);
		textf1 = new JTextField();
		textf1.setBounds(30, 230, 180, 30);
		add(textf1);

		text2 = new JLabel("Apellido Paterno:");
		text2.setBounds(30, 265, 150, 30);
		text2.setForeground(Color.WHITE);
		text2.setFont(new Font("Arial Rounded MT Bould", Font.PLAIN, 15));
		add(text2);
		textf2 = new JTextField();
		textf2.setBounds(30, 295, 180, 30);
		add(textf2);

		text3 = new JLabel("Apellido Materno:");
		text3.setBounds(30, 330, 150, 30);
		text3.setForeground(Color.WHITE);
		text3.setFont(new Font("Arial Rounded MT Bould", Font.PLAIN, 15));
		add(text3);
		textf3 = new JTextField();
		textf3.setBounds(30, 360, 180, 30);
		add(textf3);

		text4 = new JLabel("Seleccione el Departamento:");
		text4.setBounds(240, 200, 200, 30);
		text4.setForeground(Color.WHITE);
		text4.setFont(new Font("Arial Rounded MT Bould", Font.PLAIN, 15));
		add(text4);
		cb4 = new JComboBox();
		cb4.setBounds(240, 230, 200, 30);
		cb4.addItem("--Seleccionar Departamento--");
		cb4.addItem("Atencion a Cliente");
		cb4.addItem("Logistica");
		cb4.addItem("Gerencia");
		//cb4.addItemListener(this);
		add(cb4);

		text5 = new JLabel("Seleccione la Antiguedad:");
		text5.setBounds(240, 265, 200, 30);
		text5.setForeground(Color.WHITE);
		text5.setFont(new Font("Arial Rounded MT Bould", Font.PLAIN, 15));
		add(text5);
		cb5 = new JComboBox();
		cb5.setBounds(240, 295, 200, 30);
		cb5.addItem("--Seleccionar Antiguedad--");
		cb5.addItem("1 Ano de Servicio");
		cb5.addItem("2 a 6 anos de Servicio");
		cb5.addItem("7 anos o mas de Servicio");
		//cb5.addItemListener(this);
		add(cb5);
		
		text6 = new JLabel("Informacion:");
		text6.setBounds(240, 330, 200, 30);
		text6.setForeground(Color.WHITE);
		text6.setFont(new Font("Arial Rounded MT Bould", Font.PLAIN, 15));
		add(text6);
		ta6 = new JTextArea("Aqui aparecera la informacion del\nempleado");
		ta6.setBounds(240, 360, 350, 110);
		ta6.setForeground(Color.RED);
		ta6.setFont(new Font("Arial", Font.PLAIN, 17));
		ta6.setEditable(false);
		add(ta6);

		// B U T T O N S
		show_info = new JButton("Mostrar");
		show_info.setBounds(30, 440, 85, 30);
		show_info.addActionListener(this);
		add(show_info);

		clean = new JButton("Limpiar");
		clean.setBounds(125, 440, 85, 30);
		clean.addActionListener(this);
		add(clean);
	}

	public void actionPerformed(ActionEvent event){	
		// M O D I F Y   C O L O R S
		if(event.getSource() == red){
			getContentPane().setBackground(Color.RED);
		}
		if(event.getSource() == blue){
			getContentPane().setBackground(Color.BLUE);	
		}
		if(event.getSource() == magenta){
			getContentPane().setBackground(Color.MAGENTA);
		}
		if(event.getSource() == gray){
			getContentPane().setBackground(Color.DARK_GRAY);
		}

		// B A C K
		if(event.getSource() == back){
			this.setVisible(false);
			Login login = null;
			login = new Login();

			login.setBounds(0, 0, 450, 600);
			login.setVisible(true);
			login.setResizable(false);
			login.setLocationRelativeTo(null);
		}
		
		// E X I T
		if(event.getSource() == exit){
			System.exit(0);
		}

		// M O R E   I N F O R M A T I O N
		if(event.getSource() == more_information2){
			Warning warning = null;
			warning = new Warning(3);

			warning.setBounds(0, 0, 395, 100);
			warning.setVisible(true);
			warning.setResizable(false);
			warning.setLocationRelativeTo(null);
		}

		// B U T T O N S
		if(event.getSource() == show_info){
			boolean bool;

			this.name = textf1.getText();
			this.middle_name = textf2.getText();
			this.last_name = textf3.getText();
			this.department = cb4.getSelectedItem().toString();
			this.antiquity = cb5.getSelectedItem().toString();
			
			if(!name.equals("") && !middle_name.equals("") && !last_name.equals("")){
				Pattern pat1 = Pattern.compile("(\\w\\w\\w+|\\w\\w\\w+ \\w\\w\\w+)");
				Pattern pat2 = Pattern.compile("\\w\\w\\w+");
				Matcher match1 = pat1.matcher(name);
				Matcher match2 = pat2.matcher(middle_name);
				Matcher match3 = pat2.matcher(last_name);
				if(match1.matches() && match2.matches() && match3.matches()){
					if(!department.equals("--Seleccionar Departamento--") && !antiquity.equals("--Seleccionar Antiguedad--")){
						bool = true;
					}else{
						bool = false;
					}
				}else{
					bool = false;
				}
			}else{
				bool = false;
			}

			if(bool == true){

				String text = "";
				text = "   El trabajador " + name + " " + middle_name + " " + last_name + "\n";
				text += "   quien labora en el Departamento\n";
				text += "   de " + department + " con\n";
				text +=  "   " + antiquity + ", recibe ";
				if(antiquity.equals("1 Ano de Servicio")){
					text += "6 dias\n";
				}else if(antiquity.equals("2 a 6 anos de Servicio")){
					text += "14 dias\n";
				}else if(antiquity.equals("7 anos o mas de Servicio")){
					text += "22 dias\n";
				}
				text += "   de vacaciones.";
				ta6.setText(text);
			}else{
				Warning warning = null;
				warning = new Warning(2);

				warning.setBounds(0, 0, 385, 100);
				warning.setVisible(true);
				warning.setResizable(false);
				warning.setLocationRelativeTo(null);
			}
		}
		if(event.getSource() == clean){
			textf1.setText("");
			textf2.setText("");
			textf3.setText("");
			cb4.setSelectedItem("--Seleccionar Departamento--");
			cb5.setSelectedItem("--Seleccionar Antiguedad--");
			ta6.setText("Aqui aparecera la informacion del \nempleado");
		}
	}
}