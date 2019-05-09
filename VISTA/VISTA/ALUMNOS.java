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
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class ALUMNOS extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNombre;
	private JTextField txtExpediente;
	private JTable table;
	private JTextField txtRegistro;
	private Controlador contro;
    private Modelo mod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ALUMNOS frame = new ALUMNOS();
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
	public ALUMNOS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 436);
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
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\buscador-musical.png"));
		button.setBounds(446, 70, 39, 20);
		panel.add(button);
		
		JLabel lblAlumnos = new JLabel("ALUMNOS");
		lblAlumnos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAlumnos.setBounds(270, 30, 111, 25);
		panel.add(lblAlumnos);
		
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
				{"Javier Blanch","1587",null},
				{"Luis Roa","1324", null},
				{"Dario del Valle","1589", null},
				{"Manolo Gemas","2598", null},
				{"Javier Fernández","1234", null},
				{"Laura Linde", "3276", null},
				{"Ines Sanz","2432", null},
			},
			new String[] {
				"Nombre", "Expediente", "Activo"
			}
		));
		scrollPane.setViewportView(table);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre..");
		txtNombre.setColumns(10);
		txtNombre.setBounds(30, 261, 203, 20);
		panel.add(txtNombre);
		
		txtExpediente = new JTextField();
		txtExpediente.setText("Expediente..");
		txtExpediente.setColumns(10);
		txtExpediente.setBounds(236, 261, 203, 20);
		panel.add(txtExpediente);
		
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
		
		JLabel lblEligeTablaA = new JLabel("Elige tabla a buscar:");
		lblEligeTablaA.setBounds(589, 317, 104, 14);
		panel.add(lblEligeTablaA);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(647, 342, 28, 20);
		panel.add(comboBox);
		
		txtRegistro = new JTextField();
		txtRegistro.setText("Registro");
		txtRegistro.setBounds(572, 342, 86, 20);
		panel.add(txtRegistro);
		txtRegistro.setColumns(10);
	}
	public void setContro(Controlador contro) {

        this.contro = contro;

}

public void setMod(Modelo mod) {

        this.mod = mod;

}


}
