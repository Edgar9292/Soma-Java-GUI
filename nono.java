import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import java.awt.Font;

public class nono {

	private JFrame frame;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nono window = new nono();
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
	public nono() {
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
		
		JButton btnSomar = new JButton("Somar");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strNumero1 = txtNumero1.getText();
				String strNumero2 = txtNumero2.getText();
				
				int n1 = Integer.parseInt(strNumero1);
				int n2 = Integer.parseInt(strNumero2);
				
				int resultado = n1 + n2;
				
				String strResultado = String.valueOf(resultado);
				txtResultado.setText(strResultado);
						
				
				
				
			}
		});
		btnSomar.setBounds(93, 135, 78, 23);
		frame.getContentPane().add(btnSomar);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(93, 77, 78, 20);
		frame.getContentPane().add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(93, 104, 78, 20);
		frame.getContentPane().add(txtNumero2);
		txtNumero2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Número 1");
		lblNewLabel.setBounds(26, 80, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("Número 2");
		lblNmero.setBounds(26, 105, 46, 14);
		frame.getContentPane().add(lblNmero);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(120, 94, 1, 1);
		frame.getContentPane().add(layeredPane);
		
		txtResultado = new JTextField();
		txtResultado.setColumns(10);
		txtResultado.setBounds(93, 186, 78, 20);
		frame.getContentPane().add(txtResultado);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(26, 189, 60, 14);
		frame.getContentPane().add(lblResultado);
		
		JLabel lblNewLabel_1 = new JLabel("Programa Somar");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(145, 35, 233, 29);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
