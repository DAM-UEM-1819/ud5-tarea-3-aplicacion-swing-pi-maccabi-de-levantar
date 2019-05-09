package VISTA;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class SALIRSI extends JFrame {

	private JPanel contentPane;
	private Controlador contro;
    private Modelo mod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SALIRSI frame = new SALIRSI();
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
	public SALIRSI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblseguro = new JLabel("\u00BFSeguro?");
		lblseguro.setBounds(149, 59, 61, 14);
		contentPane.add(lblseguro);
		
		JButton btnS = new JButton("S\u00ED");
		btnS.setBounds(60, 118, 89, 23);
		contentPane.add(btnS);
		
		JButton btnNo = new JButton("No");
		btnNo.setBounds(260, 118, 89, 23);
		contentPane.add(btnNo);
	}
	public void setContro(Controlador contro) {

        this.contro = contro;

}

public void setMod(Modelo mod) {

        this.mod = mod;

}



}
