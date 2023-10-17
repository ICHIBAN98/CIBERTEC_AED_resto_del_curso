package gui;


import examen.Desarrollador;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class problema_02 extends JFrame implements ActionListener {
	
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
					problema_02 frame = new problema_02();
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
	public problema_02() {
		setTitle("problema_02");
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
		Desarrollador d1 = new Desarrollador(101,68,30.0);
		Desarrollador d2 = new Desarrollador(202,27.0);
		Desarrollador d3 = new Desarrollador();
		
		listadoDesarollador(d1);
		listadoDesarollador(d2);
		listadoDesarollador(d3);
		
		imprimir("------------------------");
		imprimir("cantidad de desarrolladores: " + Desarrollador.getCantidad());
		imprimir("sueldos netos acumulados: S/." + Desarrollador.getSuma());
		imprimir("------------------------");
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	void listadoDesarollador(Desarrollador x) {
		imprimir("código: " + x.getCodigo());
		imprimir("horas trabajadas: " + x.getHorasTrabajadas());
		imprimir("tarifa por hora: S/." + x.getTarifaHora());
		imprimir("sueldo bruto: S/." + x.sueldoBruto());
		imprimir("descuento: S/." + x.descuento());
		imprimir("sueldo neto: S/." + x.sueldoNeto());
		imprimir();
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
}
