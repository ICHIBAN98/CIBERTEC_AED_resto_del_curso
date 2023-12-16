package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import hijos.*;
import padre.Chofer;

public class Principal extends JDialog implements ActionListener {
	private static final long serialVersionUID = -6969750365693726130L;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal dialog = new Principal();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Principal() {
		setTitle("Problema_2");
		setBounds(100, 100, 434, 362);
		getContentPane().setLayout(null);

		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(164, 11, 89, 23);
		getContentPane().add(btnProcesar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 398, 267);
		getContentPane().add(scrollPane);

		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		ChoferADestajo cd = new ChoferADestajo(101, 3, "José Miller", "A-IIA", 7, 130);
		ChoferASueldoFijo csf = new ChoferASueldoFijo(202, 5, "Miguel Jiménez", "A-IIB", 1);
		
		mostrarChoferADestajo(cd);
		mostrarChoferASueldoFijo(csf);
	}
	
	private void mostrarChoferADestajo(ChoferADestajo cd) {
		imprimir("************CHOFER A DESTAJO************");
		imprimir("código: "+cd.getCodigo());
		imprimir("años de experiencia: "+ cd.getAniosExp());
		imprimir("nombre: " + cd.getNombre());
		imprimir("tipo de licencia: " + cd.getTipoLicencia());
		imprimir("número de viajes: " + cd.getNumViajes());
		imprimir("tarifa por viaje: S/." + cd.getTarifaPorViaje());
		imprimir("sueldo: S/." + cd.sueldo());
		imprimir("caracterizado: " + cd.caracterizar());
		imprimir("");
	}
	
	private void mostrarChoferASueldoFijo(ChoferASueldoFijo csf) {
		imprimir("************CHOFER A SUELDO FIJO************");
		imprimir("código: " + csf.getCodigo());
		imprimir("años de experiencia: " + csf.getAniosExp());
		imprimir("nombre: " + csf.getNombre());
		imprimir("tipo de licencia: " + csf.getTipoLicencia());
		imprimir("categoría: " + csf.getCategoria());
		imprimir("sueldo: S/." + csf.sueldo());
		imprimir("caracterizado: " + csf.caracterizar());
		imprimir("");
	}
	
}