import javax.swing.*;
import javax.swing.event.*;

public class Formulario extends JFrame implements ChangeListener{

	private JCheckBox english;
	private JCheckBox spanish;
	private JCheckBox french;

	public Formulario(){
		setLayout(null);

		english = new JCheckBox("English");
		english.setBounds(10, 10, 100, 30);
		english.addChangeListener(this);
		add(english);

		spanish = new JCheckBox("Spanish");
		spanish.setBounds(10, 55, 100, 30);
		spanish.addChangeListener(this);
		add(spanish);

		french = new JCheckBox("French");
		french.setBounds(10, 100, 100, 30);
		french.addChangeListener(this);
		add(french);
	}

	public void stateChanged(ChangeEvent event){
		String new_title = "";
		if(english.isSelected() == true){
			new_title = new_title + "English ";

		}
		if(spanish.isSelected() == true){
			new_title = new_title + "Spanish ";
		
		}
		if(french.isSelected() == true){
			new_title = new_title + "French ";
		}

		new_title = new_title.replace("English Spanish ", "English-Spanish ");
		new_title = new_title.replace("English French ", "English-French ");
		new_title = new_title.replace("English-Spanish French", "English-Spanish-French ");
		new_title = new_title.replace("Spanish French", "Spanish-French ");
		
		setTitle(new_title);
	}
}