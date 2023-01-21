import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ItemListener{

	private JComboBox combo_box;

	public Formulario(){
		setLayout(null);

		combo_box = new JComboBox();
		combo_box.setBounds(10, 10, 150, 25);
		add(combo_box);

		combo_box.addItem("Seleccione 1 color");
		combo_box.addItem("Negro");
		combo_box.addItem("blanco");
		combo_box.addItem("azul");
		combo_box.addItem("morado");
		combo_box.addItem("naranja");
		combo_box.addItem("rosa");
		combo_box.addItem("amarillo");
		combo_box.addItem("cafe");
		combo_box.addItem("verde");
		combo_box.addItem("rojo");
		combo_box.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent event){
		if(event.getSource() == combo_box){
			String title = combo_box.getSelectedItem().toString();
			if(title.equals("Seleccione 1 color")){
				setTitle("");
			}else{
				setTitle(title);
			}
		}
	}
}