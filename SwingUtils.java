package List6;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingUtils {

	public static JButton createButton (ActionListener handleClick, String labelButton, int[] size) {
		JButton button = new JButton(labelButton);
		button.setBounds(size[0], size[1],size[2], size[3]);
        button.addActionListener(handleClick);
        return button;
	}
	
	public static JLabel  createLabel (String labelScreen, int[] size) {
		JLabel screen = new JLabel();
		screen.setText(labelScreen);
		screen.setBounds(size[0], size[1],size[2], size[3]);
		return screen;
	}
	
	public static JTextArea  createTextArea (String data) {
		JTextArea textArea = new JTextArea();
		textArea.setText(data);
		textArea.setBounds(50, 100, 350, 200);
        return textArea;
	}
	
	public static JTextField  createTextField (int[] size) {
		JTextField textField = new JTextField();
		textField.setText("");
		textField.setBounds(size[0], size[1],size[2], size[3]);
        return textField;
	}

}
