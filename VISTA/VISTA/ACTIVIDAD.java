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

public class ACTIVIDAD extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNombre;
	private JTextField txtActividad;
	private JTextField txtSimulador;
	private JTextField txtDocumentacin;
	private JTextField txtTipoSala;
	private JTextField textField_6;
	private JTable table;
	private JTextField txtHoras;
	private JTextField txtAoAcadmico;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ACTIVIDAD frame = new ACTIVIDAD();
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
	public ACTIVIDAD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 434);
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
		button.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\buscador-musical.png"));
		button.setBounds(446, 70, 39, 20);
		panel.add(button);
		
		JLabel lblActividad = new JLabel("ACTIVIDAD\r\n");
		lblActividad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblActividad.setBounds(270, 30, 111, 25);
		panel.add(lblActividad);
		
		textField = new JTextField();
		textField.setText("        Buscar...");
		textField.setColumns(10);
		textField.setBounds(463, 70, 86, 20);
		panel.add(textField);
		
		JLabel label_1 = new JLabel("Ajustes");
		label_1.setBounds(589, 56, 46, 14);
		panel.add(label_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 112, 636, 138);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Consultas", "Pr\u00E1ctica", "Simulador 1", "Taller emergencias", "Tipo 1", "2", "2018/2019"},
				{"Suturas", "Pr\u00E1ctica", "Simulador 3", "Taller suturas", "Tipo 3", "2", "2018/2019"},
				{"Emergencias", "Práctica", "Simulador 3", "Taller emergencias", "Tipo 3", "2", "2018/2019"},
				{"Psicolog\u00EDa", "Práctica", "Simulador 2", "Taller psicologia", "Tipo2", "2", "2018/2019"},
				{"Consultas", "Pr\u00E1ctica", "Simulador 1", "Taller emergencias", "Tipo 1", "2", "2018/2019"},
				{"Suturas", "Pr\u00E1ctica", "Simulador 3", "Taller suturas", "Tipo 3", "2", "2018/2019"},
				{"Emergencias", "Práctica", "Simulador 3", "Taller emergencias", "Tipo 3", "2", "2018/2019"},
			},
			new String[] {
				"Nombre", "Tipo de Actividad", "Simulador", "Documentacion T\u00E9cinica", "Tipo de Sala", "Horas de Actividad", "A\u00F1o Acad\u00E9mico"
			}
		));
		scrollPane.setViewportView(table);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre..");
		txtNombre.setColumns(10);
		txtNombre.setBounds(30, 261, 86, 20);
		panel.add(txtNombre);
		
		txtActividad = new JTextField();
		txtActividad.setText("Actividad..");
		txtActividad.setColumns(10);
		txtActividad.setBounds(119, 261, 86, 20);
		panel.add(txtActividad);
		
		txtSimulador = new JTextField();
		txtSimulador.setText("Simulador..");
		txtSimulador.setColumns(10);
		txtSimulador.setBounds(207, 261, 89, 20);
		panel.add(txtSimulador);
		
		txtDocumentacin = new JTextField();
		txtDocumentacin.setText("Documentaci\u00F3n..");
		txtDocumentacin.setColumns(10);
		txtDocumentacin.setBounds(298, 261, 86, 20);
		panel.add(txtDocumentacin);
		
		txtTipoSala = new JTextField();
		txtTipoSala.setText("Tipo sala..");
		txtTipoSala.setColumns(10);
		txtTipoSala.setBounds(386, 261, 86, 20);
		panel.add(txtTipoSala);
		
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
		
		JLabel label_2 = new JLabel("Elige la tabla a buscar:");
		label_2.setBounds(575, 323, 111, 14);
		panel.add(label_2);
		
		textField_6 = new JTextField();
		textField_6.setText("Alumnos");
		textField_6.setColumns(10);
		textField_6.setBounds(580, 348, 86, 20);
		panel.add(textField_6);
		
		txtHoras = new JTextField();
		txtHoras.setText("Horas..");
		txtHoras.setColumns(10);
		txtHoras.setBounds(477, 261, 79, 20);
		panel.add(txtHoras);
		
		txtAoAcadmico = new JTextField();
		txtAoAcadmico.setText("A\u00F1o Acad\u00E9mico");
		txtAoAcadmico.setColumns(10);
		txtAoAcadmico.setBounds(562, 261, 86, 20);
		panel.add(txtAoAcadmico);
	}

}
