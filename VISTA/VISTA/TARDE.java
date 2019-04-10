package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Choice;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TARDE extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TARDE frame = new TARDE();
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
	public TARDE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(186, 85, 211));
		contentPane.add(panel, BorderLayout.CENTER);

		textField = new JTextField();
		textField.setText("Alumnos");
		textField.setColumns(10);
		textField.setBounds(752, 244, 86, 20);
		panel.add(textField);

		JLabel label = new JLabel("TURNO DE TARDE");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(22, 25, 191, 25);
		panel.add(label);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 61, 894, 153);
		panel.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null, null, null, null }, },

				new String[] { "Horario", "Consulta 1", "Consulta 2", "Consulta 3", "Consulta 4", "SimCompleja1",
						"SimCompleja2", "SimCompleja3", "SimCompleja4", "TaskTraining", "Hospitalizacion" }

		));
		scrollPane.setViewportView(table);

		JButton button = new JButton("Cambio de turno");
		button.setBounds(151, 243, 121, 23);
		panel.add(button);

		JButton button_1 = new JButton("Gesti\u00F3n");
		button_1.setBounds(294, 243, 89, 23);
		panel.add(button_1);

		JLabel label_1 = new JLabel("Seleccione tabla a buscar:");
		label_1.setBounds(625, 247, 147, 14);
		panel.add(label_1);

		Choice choice = new Choice();
		choice.setBounds(810, 244, 28, 20);
		panel.add(choice);

		JButton btnIr = new JButton("Ir");
		btnIr.setBounds(848, 243, 89, 23);
		panel.add(btnIr);
	}

}
