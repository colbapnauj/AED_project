package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class FrmBuscarAlumno extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBuscarAlumno frame = new FrmBuscarAlumno();
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
	public FrmBuscarAlumno() {
		setBounds(100, 100, 450, 300);

	}

}
