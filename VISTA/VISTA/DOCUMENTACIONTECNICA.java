package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class DOCUMENTACIONTECNICA extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DOCUMENTACIONTECNICA frame = new DOCUMENTACIONTECNICA();
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
	public DOCUMENTACIONTECNICA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(184, 35, 133, 163);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDocumentacinTcnica = new JLabel("Documentaci\u00F3n t\u00E9cnica: ");
		lblDocumentacinTcnica.setBounds(48, 36, 126, 14);
		contentPane.add(lblDocumentacinTcnica);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(208, 227, 89, 23);
		contentPane.add(btnImprimir);
	}
}
