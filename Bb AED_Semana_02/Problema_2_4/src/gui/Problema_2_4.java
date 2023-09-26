package gui;

import java.awt.EventQueue;
import semana_02.Obrero;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_2_4 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnProcesar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_2_4 frame = new Problema_2_4();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_2_4() {
		setTitle("Problema_2_4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(173, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 414, 403);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}
	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Obrero ob = new Obrero(325,300,"Juancito",10.3);
		listado(ob);
		
		int nuevasHorasTrabajadas = ob.getHorasTrabajadas()+8;
		ob.setHorasTrabajadas(nuevasHorasTrabajadas);
		
		double nuevaTarifaPorHora = ob.getTarifaPorHora()*0.985;
		ob.setTarifaPorHora(nuevaTarifaPorHora);
		
		listado(ob);
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void listado(Obrero o) {
		imprimir("c�digo: " + o.getCodigo());
		imprimir("nombre: " + o.getNombre());
		imprimir("horas trabajadas: " + o.getHorasTrabajadas());
		imprimir("tarifa por hora: S/." + o.getTarifaPorHora());
		imprimir("sueldo bruto: S/." + o.sueldoBruto());
		imprimir("descuento AFP: S/." + o.dsctoAFP());
		imprimir("descuento EPS: S/." + o.dsctoEPS());
		imprimir("sueldo neto: S/" + o.sueldoNeto());
		imprimir("");
	}
	
}