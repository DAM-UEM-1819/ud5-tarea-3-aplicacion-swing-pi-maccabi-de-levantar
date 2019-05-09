package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class REGISTRO extends JFrame {
	private JTextField textField_1;
	private JTextField txtFecha;
	private JTextField txtHoras;
	private JTextField txtHorasDeProfesor;
	private JTextField txtCdigoDeGrupo;
	private JTextField txtCdigo;
	private JTable table;
	private JTextField txtAlumnos;
	private Controlador contro;
    private Modelo mod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGISTRO frame = new REGISTRO();
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
	public REGISTRO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 430);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(245, 222, 179));
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(638, 348, 28, 20);
		panel.add(comboBox);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\buscador-musical.png"));
		button.setBounds(446, 70, 39, 20);
		panel.add(button);
		
		JLabel lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRegistro.setBounds(270, 30, 111, 25);
		panel.add(lblRegistro);
		
		textField_1 = new JTextField();
		textField_1.setText("        Buscar...");
		textField_1.setColumns(10);
		textField_1.setBounds(463, 70, 86, 20);
		panel.add(textField_1);
		
		JLabel lblCerrarSesin = new JLabel("Cerrar Sesi\u00F3n");
		lblCerrarSesin.setBounds(589, 56, 46, 14);
		panel.add(lblCerrarSesin);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 112, 636, 138);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"09/04/2019", "19:30", "2", "1235", "0123", null, null},
				{"09/04/2019", "17:30", "2", "1223", "0123", null, null},
				{"09/04/2019", "15:30", "2", "1267", "0123", null, null},
				{"09/04/2019", "11:30", "2", "6547", "0123", null, null},
				{"09/04/2019", "18:30", "2", "1756", "0123", null, null},
				{"09/04/2019", "12:30", "2", "1564", "0123", null, null},
				{"09/04/2019", "13:30", "2", "1434", "0123", null, null},
			},
			new String[] {
				"Fecha", "Horas", "Horas de profesor", "C\u00F3digo de grupo", "C\u00F3digo", "Actor", "Simulador"
			}
		));
		scrollPane.setViewportView(table);
		
		txtFecha = new JTextField();
		txtFecha.setText("Fecha..");
		txtFecha.setColumns(10);
		txtFecha.setBounds(30, 261, 98, 20);
		panel.add(txtFecha);
		
		txtHoras = new JTextField();
		txtHoras.setText("Horas..");
		txtHoras.setColumns(10);
		txtHoras.setBounds(125, 261, 78, 20);
		panel.add(txtHoras);
		
		txtHorasDeProfesor = new JTextField();
		txtHorasDeProfesor.setText("Horas de profesor");
		txtHorasDeProfesor.setColumns(10);
		txtHorasDeProfesor.setBounds(206, 261, 98, 20);
		panel.add(txtHorasDeProfesor);
		
		txtCdigoDeGrupo = new JTextField();
		txtCdigoDeGrupo.setText("C\u00F3digo de grupo");
		txtCdigoDeGrupo.setColumns(10);
		txtCdigoDeGrupo.setBounds(305, 261, 78, 20);
		panel.add(txtCdigoDeGrupo);
		
		txtCdigo = new JTextField();
		txtCdigo.setText("C\u00F3digo");
		txtCdigo.setColumns(10);
		txtCdigo.setBounds(387, 261, 86, 20);
		panel.add(txtCdigo);
		
		JButton button_5 = new JButton("");
		button_5.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Desktop\\CSS HTML\\uem.png"));
		button_5.setBounds(10, 295, 155, 94);
		panel.add(button_5);
		
		JButton button_6 = new JButton("Alta");
		button_6.setBounds(270, 308, 89, 23);
		panel.add(button_6);
		
		JButton button_7 = new JButton("Modificar");
		button_7.setBounds(369, 301, 98, 36);
		panel.add(button_7);
		
		JButton button_8 = new JButton("Baja");
		button_8.setBounds(477, 308, 89, 23);
		panel.add(button_8);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\Settings_30027.png"));
		button_1.setBounds(562, 11, 89, 47);
		panel.add(button_1);
		
		JLabel lblEligeLaTabla = new JLabel("Elige la tabla a buscar:");
		lblEligeLaTabla.setBounds(575, 323, 111, 14);
		panel.add(lblEligeLaTabla);
		
		txtAlumnos = new JTextField();
		txtAlumnos.setText("Alumnos");
		txtAlumnos.setBounds(580, 348, 86, 20);
		panel.add(txtAlumnos);
		txtAlumnos.setColumns(10);
		
		JButton btnListado = new JButton("Listado");
		btnListado.setBounds(292, 80, 89, 23);
		panel.add(btnListado);
	}
	public void setContro(Controlador contro) {

        this.contro = contro;

}

public void setMod(Modelo mod) {

        this.mod = mod;

}


}
