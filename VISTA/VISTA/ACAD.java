package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ACAD extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_3;
	private JTable table;
	private JTextField txtAoAcadmico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ACAD frame = new ACAD();
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
	public ACAD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(245, 222, 179));
		panel.setBounds(0, 0, 703, 408);
		contentPane.add(panel);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\buscador-musical.png"));
		button.setBounds(446, 70, 39, 20);
		panel.add(button);
		
		JLabel lblAoAcadmico = new JLabel("A\u00D1O ACAD\u00C9MICO");
		lblAoAcadmico.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAoAcadmico.setBounds(220, 30, 161, 25);
		panel.add(lblAoAcadmico);
		
		textField = new JTextField();
		textField.setText("        Buscar...");
		textField.setColumns(10);
		textField.setBounds(463, 70, 86, 20);
		panel.add(textField);
		
		JLabel lblCerrarSesin = new JLabel("Cerrar Sesi\u00F3n\r\n");
		lblCerrarSesin.setBounds(572, 56, 79, 14);
		panel.add(lblCerrarSesin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 112, 636, 138);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Primer Trimestre", "Segundo Trimestre", "A\u00F1o Acad\u00E9mico"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Desktop\\CSS HTML\\uem.png"));
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
		button_5.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\Settings_30027.png"));
		button_5.setBounds(562, 11, 89, 47);
		panel.add(button_5);
		
		JLabel label_2 = new JLabel("Elige tabla a buscar:");
		label_2.setBounds(589, 317, 104, 14);
		panel.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(647, 342, 28, 20);
		panel.add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setText("Registro");
		textField_3.setColumns(10);
		textField_3.setBounds(572, 342, 86, 20);
		panel.add(textField_3);
		
		txtAoAcadmico = new JTextField();
		txtAoAcadmico.setText("A\u00F1o Acad\u00E9mico\r\n");
		txtAoAcadmico.setColumns(10);
		txtAoAcadmico.setBounds(448, 261, 203, 20);
		panel.add(txtAoAcadmico);
	}

}
