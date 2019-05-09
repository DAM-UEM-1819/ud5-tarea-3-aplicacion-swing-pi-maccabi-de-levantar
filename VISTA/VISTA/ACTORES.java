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

public class ACTORES extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNombre;
	private JTextField txtRangoEdad;
	private JTextField txtGnero;
	private JTextField txtCdigoDeGrupo;
	private JTextField txtIdioma;
	private JTextField textField_6;
	private JTable table;
	private JTextField txtComplexin;
	private Controlador contro;
    private Modelo mod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ACTORES frame = new ACTORES();
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
	public ACTORES() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(245, 222, 179));
		panel.setBounds(10, 0, 703, 391);
		contentPane.add(panel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(638, 348, 28, 20);
		panel.add(comboBox);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\buscador-musical.png"));
		button.setBounds(446, 70, 39, 20);
		panel.add(button);
		
		JLabel lblAcotres = new JLabel("ACTORES");
		lblAcotres.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAcotres.setBounds(270, 30, 111, 25);
		panel.add(lblAcotres);
		
		textField = new JTextField();
		textField.setText("        Buscar...");
		textField.setColumns(10);
		textField.setBounds(463, 70, 86, 20);
		panel.add(textField);
		
		JLabel lblCerrarSesin = new JLabel("Cerrar Sesi\u00F3n");
		lblCerrarSesin.setBounds(572, 56, 79, 14);
		panel.add(lblCerrarSesin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 112, 636, 138);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Jimmy", "63", "Hombre", "452", "Ingl\u00E9s", null},
				{"Javier", "58", "Hombre", "515", "Espa\u00F1ol", "Normal"},
				{"Manuel", "42", "Hombre", "874", "Espa\u00F1ol", "Normal"},
				{"Santiago", "34", "Hombre", "547", "Espa\u00F1ol", "Anorexico"},
				{"Ricardo", "19", "Hombre", "125", "Espa\u00F1ol", "Sobrepeso"},
				{"Diego", "58", "Hombre", "321", "Espa\u00F1ol", "Obeso"},
				{"Ra\u00FAl", "20", "Hombre", "123", "Espa\u00F1ol", "Delgado"},
			},
			new String[] {
				"Nombre", "Rango de Edad", "G\u00E9nero", "C\u00F3digo", "Idioma", "Complexi\u00F3n"
			}
		));
		scrollPane.setViewportView(table);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre..");
		txtNombre.setColumns(10);
		txtNombre.setBounds(30, 261, 103, 20);
		panel.add(txtNombre);
		
		txtRangoEdad = new JTextField();
		txtRangoEdad.setText("Rango Edad");
		txtRangoEdad.setColumns(10);
		txtRangoEdad.setBounds(136, 261, 103, 20);
		panel.add(txtRangoEdad);
		
		txtGnero = new JTextField();
		txtGnero.setText("G\u00E9nero");
		txtGnero.setColumns(10);
		txtGnero.setBounds(236, 261, 103, 20);
		panel.add(txtGnero);
		
		txtCdigoDeGrupo = new JTextField();
		txtCdigoDeGrupo.setText("C\u00F3digo ");
		txtCdigoDeGrupo.setColumns(10);
		txtCdigoDeGrupo.setBounds(340, 261, 103, 20);
		panel.add(txtCdigoDeGrupo);
		
		txtIdioma = new JTextField();
		txtIdioma.setText("Idioma");
		txtIdioma.setColumns(10);
		txtIdioma.setBounds(446, 261, 98, 20);
		panel.add(txtIdioma);
		
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
		
		txtComplexin = new JTextField();
		txtComplexin.setText("Complexi\u00F3n");
		txtComplexin.setColumns(10);
		txtComplexin.setBounds(548, 261, 103, 20);
		panel.add(txtComplexin);
	}
	public void setContro(Controlador contro) {

        this.contro = contro;

}

public void setMod(Modelo mod) {

        this.mod = mod;

}



}
