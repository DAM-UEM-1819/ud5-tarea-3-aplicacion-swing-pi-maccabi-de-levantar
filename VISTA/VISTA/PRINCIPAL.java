package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class PRINCIPAL extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtBuscar;
	private JTable table;
	private JTextField txtSala;
	private JTextField txtHoraInicio;
	private JTextField txtHoraFin;
	private JTextField txtActividad;
	private JTextField txtTitulacin;
	private JTextField txtGrupo;
	private JTextField txtProfesor;
	private JTextField textField_8;
	private JButton button_2;
	private JButton btnNewButton_1;
	private JButton btnModificar;
	private JButton btnBaja;
	private JLabel lblNewLabel;
	private JTextField txtAlumnos;
	private JTextField textField_1;
	private Controlador contro;
    private Modelo mod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PRINCIPAL frame = new PRINCIPAL();
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
	public PRINCIPAL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 501);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(719, 376, 28, 20);
		contentPane.add(comboBox);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\buscador-musical.png"));
		button_1.setBounds(390, 67, 49, 23);
		contentPane.add(button_1);
		
		JLabel lblLunes = new JLabel("LUNES");
		lblLunes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLunes.setBounds(10, 11, 68, 25);
		contentPane.add(lblLunes);
		
		textField = new JTextField();
		textField.setText("09/04/2019");
		textField.setBounds(10, 37, 68, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\calendario (1).png"));
		button.setBounds(88, 37, 45, 22);
		contentPane.add(button);
		
		JButton btnPlanificacinMaana = new JButton("Planificaci\u00F3n ma\u00F1ana");
		btnPlanificacinMaana.setBounds(173, 16, 131, 23);
		contentPane.add(btnPlanificacinMaana);
		
		JButton btnPlanificacinTarde = new JButton("Planificaci\u00F3n tarde");
		btnPlanificacinTarde.setBounds(331, 16, 119, 23);
		contentPane.add(btnPlanificacinTarde);
		
		txtBuscar = new JTextField();
		txtBuscar.setText("        Buscar...");
		txtBuscar.setBounds(413, 68, 86, 20);
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Downloads\\Settings_30027.png"));
		btnNewButton.setBounds(562, 16, 92, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblAjustes = new JLabel("Cerrar Sesion");
		lblAjustes.setBounds(572, 56, 65, 14);
		contentPane.add(lblAjustes);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 112, 750, 203);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Simulador 1", "10:00", "12:00", "Consultas", "Medicina", "EN-M13", "Fermin Trujillo", null, "ME-45", "30"},
				{"Simulador 3", "11:00", "13:30", "Parto", "Medicina", "FR-6", "Javier Moroto", null, "PS-34", "12"},
				{"Simulador 4", "10:30", "12:00", "Simulaci\u00F3n", "Medicina", "EN-P9", "Estela Reynolds", null, "EN-45", "15"},
				{"Simulador 2", "13:30", "15:30", "Consultas", "Medicina", "EN-M13", "Amador Rivas", null, "ME-10", "35"},
				{"Simulador 1", "14:00", "15:30", "Simulaci\u00F3n", "Medicina", "RX-TN12", "Lola Reynolds", null, "EN-43", null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"SALA", "HORA DE INICIO", "HORA DE FIN", "ACTIVIDAD", "TITULACI\u00D3N", "GRUPO", "PROFESOR", "ACTOR", "Codigo grupo", "N\u00BA de alumnos"
			}
		));
		scrollPane.setViewportView(table);
		
		txtSala = new JTextField();
		txtSala.setText("Sala..");
		txtSala.setBounds(30, 326, 79, 20);
		contentPane.add(txtSala);
		txtSala.setColumns(10);
		
		txtHoraInicio = new JTextField();
		txtHoraInicio.setText("Hora Inicio");
		txtHoraInicio.setBounds(112, 326, 68, 20);
		contentPane.add(txtHoraInicio);
		txtHoraInicio.setColumns(10);
		
		txtHoraFin = new JTextField();
		txtHoraFin.setText("Hora Fin");
		txtHoraFin.setColumns(10);
		txtHoraFin.setBounds(182, 326, 68, 20);
		contentPane.add(txtHoraFin);
		
		txtActividad = new JTextField();
		txtActividad.setText("Actividad");
		txtActividad.setColumns(10);
		txtActividad.setBounds(252, 326, 79, 20);
		contentPane.add(txtActividad);
		
		txtTitulacin = new JTextField();
		txtTitulacin.setText("Titulaci\u00F3n");
		txtTitulacin.setColumns(10);
		txtTitulacin.setBounds(331, 326, 68, 20);
		contentPane.add(txtTitulacin);
		
		txtGrupo = new JTextField();
		txtGrupo.setText("Grupo");
		txtGrupo.setColumns(10);
		txtGrupo.setBounds(409, 326, 68, 20);
		contentPane.add(txtGrupo);
		
		txtProfesor = new JTextField();
		txtProfesor.setText("Profesor");
		txtProfesor.setColumns(10);
		txtProfesor.setBounds(485, 326, 68, 20);
		contentPane.add(txtProfesor);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(631, 326, 68, 20);
		contentPane.add(textField_8);
		
		button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("C:\\Users\\Javier Fern\u00E1ndez .LAPTOP-EV3GM0D2\\Desktop\\CSS HTML\\uem.png"));
		button_2.setBounds(10, 357, 155, 94);
		contentPane.add(button_2);
		
		btnNewButton_1 = new JButton("Alta");
		btnNewButton_1.setBounds(179, 387, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(369, 380, 98, 36);
		contentPane.add(btnModificar);
		
		btnBaja = new JButton("Baja");
		btnBaja.setBounds(562, 387, 89, 23);
		contentPane.add(btnBaja);
		
		lblNewLabel = new JLabel("Seleccione tabla a buscar:");
		lblNewLabel.setBounds(667, 357, 134, 14);
		contentPane.add(lblNewLabel);
		
		txtAlumnos = new JTextField();
		txtAlumnos.setText("Alumnos");
		txtAlumnos.setBounds(661, 376, 86, 20);
		contentPane.add(txtAlumnos);
		txtAlumnos.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(706, 326, 74, 20);
		contentPane.add(textField_1);
		
		JButton btnSubidaDeDatos = new JButton("Subida de Datos");
		btnSubidaDeDatos.setBounds(719, 52, 116, 23);
		contentPane.add(btnSubidaDeDatos);
	}
	public void setContro(Controlador contro) {

        this.contro = contro;

}

public void setMod(Modelo mod) {

        this.mod = mod;

}


}
