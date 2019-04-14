package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Choice;
import javax.swing.JTextField;
import java.awt.Button;

public class MANANA extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtAlumnos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MANANA frame = new MANANA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void MAÑANA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 328);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(186, 85, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAlumnos = new JTextField();
		txtAlumnos.setText("Alumnos");
		txtAlumnos.setBounds(752, 212, 86, 20);
		contentPane.add(txtAlumnos);
		txtAlumnos.setColumns(10);
		
		JLabel lblTurnoDeMaana = new JLabel("TURNO DE MA\u00D1ANA");
		lblTurnoDeMaana.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTurnoDeMaana.setBounds(22, 25, 191, 25);
		contentPane.add(lblTurnoDeMaana);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 61, 894, 138);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Horario", "Consulta 1", "Consulta 2","Consulta 3","Consulta 4", "SimCompleja1","SimCompleja2", "SimCompleja3","SimCompleja4","TaskTraining", "Hospitalizacion"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnCambioDeTurno = new JButton("Cambio de turno");
		btnCambioDeTurno.setBounds(151, 235, 121, 23);
		contentPane.add(btnCambioDeTurno);
		
		JButton btnNewButton = new JButton("Gesti\u00F3n");
		btnNewButton.setBounds(295, 235, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblSeleccioneTablaA = new JLabel("Seleccione tabla a buscar:");
		lblSeleccioneTablaA.setBounds(625, 212, 147, 14);
		contentPane.add(lblSeleccioneTablaA);
		
		Choice choice = new Choice();
		choice.setBounds(810, 212, 28, 20);
		contentPane.add(choice);
		
		JButton btnIr = new JButton("Ir");
		btnIr.setBounds(845, 212, 89, 23);
		contentPane.add(btnIr);
	}
}
