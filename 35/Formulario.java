import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Formulario extends JFrame implements ActionListener{

	private JLabel label1;
	private JLabel label2;
	private JLabel label3;

	private JComboBox combo_box1;
	private JComboBox combo_box2;
	private JComboBox combo_box3;

	private JButton button;

	public Formulario(){
		setLayout(null);
		setTitle("Color");

		// Label
		label1 = new JLabel("Red");
		label1.setBounds(10, 10, 60, 25);
		add(label1);

		label2 = new JLabel("Green");
		label2.setBounds(10, 40, 60, 25);
		add(label2);

		label3 = new JLabel("Blue");
		label3.setBounds(10, 70, 60, 25);
		add(label3);

		// Combo Box
		combo_box1 = new JComboBox();
		combo_box1.setBounds(120, 10, 160, 25);
		add(combo_box1);
		combo_box1.addItem("Seleccione un numero");
		
		combo_box2 = new JComboBox();
		combo_box2.setBounds(120, 40, 160, 25);
		add(combo_box2);
		combo_box2.addItem("Seleccione un numero");

		combo_box3 = new JComboBox();
		combo_box3.setBounds(120, 70, 160, 25);
		add(combo_box3);
		combo_box3.addItem("Seleccione un numero");

		for(int i = 0; i <= 255; i++){
			combo_box1.addItem(i);
			combo_box2.addItem(i);
			combo_box3.addItem(i);
		}

		// Button
		button = new JButton("Cambiar color");
		button.setBounds(15, 220, 260, 30);
		add(button);
		button.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event){
		if(event.getSource() == button){
			if((combo_box1.getSelectedItem().toString()).equals("Seleccione un numero")
				|| (combo_box2.getSelectedItem().toString()).equals("Seleccione un numero")
				|| (combo_box3.getSelectedItem().toString()).equals("Seleccione un numero")){
				//
			}else{
				int red = Integer.parseInt(combo_box1.getSelectedItem().toString());
				int green = Integer.parseInt(combo_box2.getSelectedItem().toString());
				int blue = Integer.parseInt(combo_box3.getSelectedItem().toString());

				Color color = new Color(red, green, blue);
				button.setBackground(color);
			}
		}
	}
}