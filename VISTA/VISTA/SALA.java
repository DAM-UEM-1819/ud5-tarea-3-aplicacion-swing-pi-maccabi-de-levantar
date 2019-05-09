package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SALA extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private Controlador contro;
	private Modelo mod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SALA frame = new SALA();
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
	public SALA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(245, 222, 179));
		panel.setBounds(0, 0, 703, 391);
		contentPane.add(panel);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(638, 348, 28, 20);
		panel.add(comboBox);

		JButton button = new JButton("");
		button.setIcon(
				new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\buscador-musical.png"));
		button.setBounds(446, 70, 39, 20);
		panel.add(button);

		JLabel lblSalas = new JLabel("SALAS");
		lblSalas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSalas.setBounds(292, 30, 89, 25);
		panel.add(lblSalas);

		textField = new JTextField();
		textField.setText("        Buscar...");
		textField.setColumns(10);
		textField.setBounds(463, 70, 86, 20);
		panel.add(textField);

		JLabel lblCerrarSesin = new JLabel("Cerrar Sesi\u00F3n");
		lblCerrarSesin.setBounds(589, 56, 46, 14);
		panel.add(lblCerrarSesin);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 112, 636, 138);
		panel.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { "Simulador", "2", "0157", "35" }, { "Consulta", "1", "0245", "35" },
						{ "Consulta", "9", "0158", "40" }, { "Simulador", "7", "0358", "40" },
						{ "Consulta", "5", "0985", "35" }, { "Simulador", "6", "0125", "30" },
						{ "Simulador", "8", "0157", null }, },
				new String[] { "Tipo de Sala", "N\u00FAmero", "C\u00F3digo de Sala", "Capacidad" }));
		scrollPane.setViewportView(table);

		textField_1 = new JTextField();
		textField_1.setText("Fecha..");
		textField_1.setColumns(10);
		textField_1.setBounds(30, 261, 121, 20);
		panel.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setText("Horas..");
		textField_2.setColumns(10);
		textField_2.setBounds(155, 261, 121, 20);
		panel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setText("Horas de profesor");
		textField_3.setColumns(10);
		textField_3.setBounds(277, 261, 121, 20);
		panel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setText("C\u00F3digo de grupo");
		textField_4.setColumns(10);
		textField_4.setBounds(399, 261, 121, 20);
		panel.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setText("C\u00F3digo");
		textField_5.setColumns(10);
		textField_5.setBounds(522, 261, 129, 20);
		panel.add(textField_5);

		JButton button_1 = new JButton("");
		button_1.setIcon(
				new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Desktop\\CSS HTML\\uem.png"));
		button_1.setBounds(10, 295, 155, 94);
		panel.add(button_1);

		JButton button_2 = new JButton("Alta");
		button_2.setBounds(270, 308, 89, 23);
		panel.add(button_2);

		JButton button_3 = new JButton("Modificar");
		button_3.setBounds(369, 301, 98, 36);
		panel.add(button_3);

		JButton button_4 = new JButton("Baja");
		button_4.setBounds(477, 308, 89, 23);
		panel.add(button_4);

		JButton button_5 = new JButton("");
		button_5.setIcon(
				new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\Settings_30027.png"));
		button_5.setBounds(562, 11, 89, 47);
		panel.add(button_5);

		JLabel label_2 = new JLabel("Elige la tabla a buscar:");
		label_2.setBounds(575, 323, 111, 14);
		panel.add(label_2);

		textField_6 = new JTextField();
		textField_6.setText("Alumnos");
		textField_6.setColumns(10);
		textField_6.setBounds(580, 348, 86, 20);
		panel.add(textField_6);
	}

	public void setContro(Controlador contro) {

		this.contro = contro;

	}

	public void setMod(Modelo mod) {

		this.mod = mod;

	}

}
