import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Formulario extends JFrame implements ChangeListener, ActionListener{

	private JLabel language;
	
	private JRadioButton english;
	private JRadioButton spanish;
	private JRadioButton french;
	
	private ButtonGroup just_one;

	private JButton button;

	public Formulario(){
		setLayout(null);

		just_one = new ButtonGroup();

		language = new JLabel("Seleccione el idioma.");
		language.setBounds(10, 10, 200, 30);
		add(language);

		english = new JRadioButton("English");
		english.setBounds(10, 40, 100, 30);
		add(english);

		spanish = new JRadioButton("Espanol");
		spanish.setBounds(10, 80, 100, 30);
		add(spanish);

		french = new JRadioButton("francais");
		french.setBounds(10, 120, 100, 30);
		add(french);

		spanish.addChangeListener(this);
		english.addChangeListener(this);
		french.addChangeListener(this);

		just_one.add(english);
		just_one.add(spanish);
		just_one.add(french);
	
		button = new JButton("Continue");
		button.setBounds(10, 150, 100, 30);
		button.setEnabled(false);
		add(button);

		button.addActionListener(this);
	}

	public void stateChanged(ChangeEvent event){
		if(english.isSelected() || spanish.isSelected() || french.isSelected()){
			button.setEnabled(true);
		}else{
			button.setEnabled(false);
		}
	}

	public void actionPerformed(ActionEvent event){
		if(event.getSource() == button){
			System.exit(0);
		}
	}
}