import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame implements ActionListener{
	private int list[] = new int[3];

	private JMenuBar menu_bar;

	private JMenu menu;
	
	private JMenu red_menu;
	private JMenu green_menu;
	private JMenu blue_menu;

	private JMenuItem red0;
	private JMenuItem red100;
	private JMenuItem red200;
	private JMenuItem red255;

	private JMenuItem green0;
	private JMenuItem green100;
	private JMenuItem green200;
	private JMenuItem green255;

	private JMenuItem blue0;
	private JMenuItem blue100;
	private JMenuItem blue200;
	private JMenuItem blue255;

	private JScrollPane red_pane;
	private JScrollPane green_pane;
	private JScrollPane blue_pane;

	public Formulario(){
		setLayout(null);
		setTitle("Change The Interface Color");

		// Creame la barra del menu
		menu_bar = new JMenuBar();
		setJMenuBar(menu_bar);

		// Le agregamos el menu a la barra
		menu = new JMenu("Colores");
		menu_bar.add(menu);

		// Le agregamos las opciones
		red_menu = new JMenu("Rojo");
		menu.add(red_menu);

		green_menu = new JMenu("Verde");
		menu.add(green_menu);
		
		blue_menu = new JMenu("Azul");
		menu.add(blue_menu);

		// Agregamos las sub-opciones
		red0 = new JMenuItem("0");
		red_menu.add(red0);
		red100 = new JMenuItem("100");
		red_menu.add(red100);
		red200 = new JMenuItem("200");
		red_menu.add(red200);
		red255 = new JMenuItem("255");
		red_menu.add(red255);
		
		green0 = new JMenuItem("0");
		green_menu.add(green0);
		green100 = new JMenuItem("100");
		green_menu.add(green100);
		green200 = new JMenuItem("200");
		green_menu.add(green200);
		green255 = new JMenuItem("255");
		green_menu.add(green255);

		blue0 = new JMenuItem("0");
		blue_menu.add(blue0);
		blue100 = new JMenuItem("100");
		blue_menu.add(blue100);
		blue200 = new JMenuItem("200");
		blue_menu.add(blue200);
		blue255 = new JMenuItem("255");
		blue_menu.add(blue255);

		red0.addActionListener(this);
		red100.addActionListener(this);
		red200.addActionListener(this);
		red255.addActionListener(this);

		green0.addActionListener(this);
		green100.addActionListener(this);
		green200.addActionListener(this);
		green255.addActionListener(this);
		
		blue0.addActionListener(this);
		blue100.addActionListener(this);
		blue200.addActionListener(this);
		blue255.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event){
		
		if(event.getSource() == red0){
			this.list[0] = Integer.parseInt(red0.getText());
		}else if(event.getSource() == red100){
			this.list[0] = Integer.parseInt(red100.getText());
		}else if(event.getSource() == red200){
			this.list[0] = Integer.parseInt(red200.getText());
		}else if(event.getSource() == red255){
			this.list[0] = Integer.parseInt(red255.getText());
		}

		if(event.getSource() == green0){	
			this.list[1] = Integer.parseInt(green0.getText());
		}else if(event.getSource() == green100){	
			this.list[1] = Integer.parseInt(green100.getText());
		}else if(event.getSource() == green200){	
			this.list[1] = Integer.parseInt(green200.getText());		
		}else if(event.getSource() == green255){	
			this.list[1] = Integer.parseInt(green255.getText());
		}

		if(event.getSource() == blue0){
			this.list[2] = Integer.parseInt(blue0.getText());
		}else if(event.getSource() == blue100){
			this.list[2] = Integer.parseInt(blue100.getText());
		}else if(event.getSource() == blue200){
			this.list[2] = Integer.parseInt(blue200.getText());
		}else if(event.getSource() == blue255){
			this.list[2] = Integer.parseInt(blue255.getText());
		}
		
		getContentPane().setBackground(new Color(this.list[0], this.list[1], this.list[2]));

	}
}