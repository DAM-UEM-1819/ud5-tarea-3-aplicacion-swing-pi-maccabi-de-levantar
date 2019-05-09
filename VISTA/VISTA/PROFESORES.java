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

public class PROFESORES extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNmero;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtApellido_1;
	private JTextField txtDni;
	private JTextField textField_6;
	private JTable table;
	private JTextField txtMail;
	private JTextField txtTlf_1;
	private JTextField txtTitulacin;
	private JTextField txtTlf;
	private JTextField txtRelacin;
	private Controlador contro;
    private Modelo mod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PROFESORES frame = new PROFESORES();
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
	public PROFESORES() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 931, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(245, 222, 179));
		panel.setBounds(0, 0, 915, 391);
		contentPane.add(panel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(638, 348, 28, 20);
		panel.add(comboBox);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\buscador-musical.png"));
		button.setBounds(446, 70, 39, 20);
		panel.add(button);
		
		JLabel lblProfesores = new JLabel("PROFESORES");
		lblProfesores.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProfesores.setBounds(252, 29, 129, 25);
		panel.add(lblProfesores);
		
		textField = new JTextField();
		textField.setText("        Buscar...");
		textField.setColumns(10);
		textField.setBounds(463, 70, 86, 20);
		panel.add(textField);
		
		JLabel lblCerrarSesin = new JLabel("Cerrar Sesi\u00F3n");
		lblCerrarSesin.setBounds(716, 56, 46, 14);
		panel.add(lblCerrarSesin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 112, 829, 138);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Javier", "Roa", "Cielo", "742654V", "6898454", "6897852", "ja@uem.es", "Medicina", "Empleada", null},
				{"2", "Manuela", "Ferni", "Piel", "687489R", "6254879", "6842587", "ma@uem.es", "Medicina", "Empleada", null},
				{"3", "Pilar", "Blach", "Rosa", "545248Y", "6230154", "6235266", "pi@uem.es", "Psicologia", "Empleada", null},
				{"4", "Luis", "del Potro", "Gonzalez", "454455B", "6985745", "6985589", "lu@uem.es", "Enfermeria", "Empleada", null},
				{"5", "Celia", "Manzano", "Ruiz", "574444V", "6214785", "6658478", "ce@uem.es", "Medicina", "Empleada", null},
				{"7", "Felix", "Linde", "Garcia", "714767V", "6897114", "6302584", "fe@uem.es", "Medicia", null, null},
				{null, null, null, null, "", null, null, null, null, null, null},
			},
			new String[] {
				"N\u00FAmero", "Nombre", "Primer Apellido", "Segundo Apellido", "DNI", "Tlf 1", "Tlf 2", "Mail", "Titulaci\u00F3n", "Relaci\u00F3n laboral", "Activo"
			}
		));
		scrollPane.setViewportView(table);
		
		txtNmero = new JTextField();
		txtNmero.setText("N\u00FAmero..");
		txtNmero.setColumns(10);
		txtNmero.setBounds(30, 261, 72, 20);
		panel.add(txtNmero);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre..");
		txtNombre.setColumns(10);
		txtNombre.setBounds(104, 261, 72, 20);
		panel.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setText("1 Apellido..");
		txtApellido.setColumns(10);
		txtApellido.setBounds(177, 261, 72, 20);
		panel.add(txtApellido);
		
		txtApellido_1 = new JTextField();
		txtApellido_1.setText("2 Apellido..");
		txtApellido_1.setColumns(10);
		txtApellido_1.setBounds(252, 261, 72, 20);
		panel.add(txtApellido_1);
		
		txtDni = new JTextField();
		txtDni.setText("DNI..");
		txtDni.setColumns(10);
		txtDni.setBounds(327, 261, 66, 20);
		panel.add(txtDni);
		
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
		button_5.setBounds(695, 11, 89, 47);
		panel.add(button_5);
		
		JLabel label_2 = new JLabel("Elige la tabla a buscar:");
		label_2.setBounds(575, 323, 111, 14);
		panel.add(label_2);
		
		textField_6 = new JTextField();
		textField_6.setText("Alumnos");
		textField_6.setColumns(10);
		textField_6.setBounds(580, 348, 86, 20);
		panel.add(textField_6);
		
		txtMail = new JTextField();
		txtMail.setText("Mail..");
		txtMail.setColumns(10);
		txtMail.setBounds(551, 261, 66, 20);
		panel.add(txtMail);
		
		txtTlf_1 = new JTextField();
		txtTlf_1.setText("Tlf 2..");
		txtTlf_1.setColumns(10);
		txtTlf_1.setBounds(477, 261, 72, 20);
		panel.add(txtTlf_1);
		
		txtTitulacin = new JTextField();
		txtTitulacin.setText("Titulaci\u00F3n..");
		txtTitulacin.setColumns(10);
		txtTitulacin.setBounds(620, 261, 66, 20);
		panel.add(txtTitulacin);
		
		txtTlf = new JTextField();
		txtTlf.setText("Tlf 1..");
		txtTlf.setColumns(10);
		txtTlf.setBounds(401, 261, 66, 20);
		panel.add(txtTlf);
		
		txtRelacin = new JTextField();
		txtRelacin.setText("Relaci\u00F3n..");
		txtRelacin.setColumns(10);
		txtRelacin.setBounds(696, 261, 72, 20);
		panel.add(txtRelacin);
	}
	public void setContro(Controlador contro) {

        this.contro = contro;

}

public void setMod(Modelo mod) {

        this.mod = mod;

}



}
