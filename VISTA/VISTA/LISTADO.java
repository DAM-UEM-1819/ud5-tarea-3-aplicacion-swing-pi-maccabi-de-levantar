package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JButton;

public class LISTADO extends JFrame {

	private JPanel contentPane;
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
					LISTADO frame = new LISTADO();
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
	public LISTADO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 11, 169, 207);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Fermin Trujillo"},
				{"Estela Reynolds"},
				{"Seldon Cooper"},
				{"Pablo Escobar"},
				{"Diego Armando"},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Listado Alumnos"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setBounds(255, 227, 89, 23);
		contentPane.add(btnImprimir);
	}
	public void setContro(Controlador contro) {

        this.contro = contro;

}

public void setMod(Modelo mod) {

        this.mod = mod;

}


}
