import java.awt.EventQueue;
import java.text.NumberFormat;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class App {

	private JFrame frame;
	private JTextField textField;
	private NumberFormat numberFormat = java.text.NumberFormat.getNumberInstance();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		numberFormat.setMinimumFractionDigits(2);
		textField = new DoubleJTextField(numberFormat);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 26, 409, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lbAmount = new JLabel("Input number");
		lbAmount.setBounds(10, 11, 409, 14);
		frame.getContentPane().add(lbAmount);
		
		JButton btnFormat = new JButton("Push to format");
		btnFormat.setBounds(10, 69, 409, 62);
		frame.getContentPane().add(btnFormat);
	}
}
