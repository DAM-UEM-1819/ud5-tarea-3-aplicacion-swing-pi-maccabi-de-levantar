package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class SUBIDA extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SUBIDA frame = new SUBIDA();
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
	public SUBIDA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setForeground(new Color(244, 164, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExaminarEquipo = new JLabel("Examinar equipo:\r\n");
		lblExaminarEquipo.setBounds(50, 121, 98, 14);
		contentPane.add(lblExaminarEquipo);
		
		textField = new JTextField();
		textField.setBounds(158, 118, 98, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnExamninar = new JButton("Examinar");
		btnExamninar.setBounds(271, 117, 89, 23);
		contentPane.add(btnExamninar);
		
		JButton btnSubir = new JButton("Subir");
		btnSubir.setBounds(167, 199, 89, 23);
		contentPane.add(btnSubir);
		
		JLabel lblSubida = new JLabel("SUBIDA");
		lblSubida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubida.setBounds(158, 22, 98, 32);
		contentPane.add(lblSubida);
	}
}
