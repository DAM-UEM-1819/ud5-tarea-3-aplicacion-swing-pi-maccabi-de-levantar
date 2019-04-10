package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.ImagingOpException;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class LOGIN extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN frame = new LOGIN();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LOGIN() {
		setBackground(new Color(0, 750, 455));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 401);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("TextField.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("LOGIN");
		label.setBackground(UIManager.getColor("TextPane.selectionBackground"));
		label.setFont(new Font("DejaVu Sans Light", Font.PLAIN, 30));
		label.setForeground(UIManager.getColor("TextPane.caretForeground")); 
		label.setBounds(218, 66, 99, 32);
		contentPane.add(label);
		
		Label label_1 = new Label("Nombre de Usuario:");
		label_1.setBounds(91, 125, 109, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Contraseña: ");
		label_2.setBounds(91, 201, 62, 22);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(206, 125, 109, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(206, 203, 109, 20);
		contentPane.add(textField_1);
		
		btnNewButton = new JButton("Acceder");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(408, 267, 114, 63);
		 btnNewButton.setBackground(new Color(0, 0, 205));
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Desktop\\CSS HTML\\descarga (1).png"));
		lblNewLabel.setBounds(10, 254, 376, 88);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Desktop\\CSS HTML\\descarga.jpg"));
		lblNewLabel_1.setBounds(343, 34, 166, 189);
		contentPane.add(lblNewLabel_1);
		ImageIcon imagen;
	}
}
