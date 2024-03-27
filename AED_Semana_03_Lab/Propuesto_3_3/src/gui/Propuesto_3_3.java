package gui;

import java.awt.EventQueue;
import semana_03.Consultor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_3_3 extends JFrame implements ActionListener {
	
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
					Propuesto_3_3 frame = new Propuesto_3_3();
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
	public Propuesto_3_3() {
		setTitle("Propuesto_3_3");
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
		Consultor c1 = new Consultor("Superman",111,320,11.4);
		Consultor c2 = new Consultor(222,"Batman",240);
		Consultor c3 = new Consultor();
		
		listado(c1);
		listado(c2);
		listado(c3);
		
		imprimir("------------------------------------");
		imprimir("Descuento por AFP: S/." + Consultor.dsctoAfp);
		imprimir("Descuento por EPS: S/." + Consultor.dsctoEps);
		imprimir("Cantidad de consultores: " + Consultor.getCantidad());
		imprimir("Acumulado de sueldos netos: S/." + Consultor.getSuma());
		imprimir("------------------------------------");
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
	void listado (Consultor c) {
		imprimir("Nombre: " + c.getNombre());
		imprimir("Código: " + c.getCodigo());
		imprimir("Horas trabajadas: " + c.getHorasTrabajadas());
		imprimir("Tarifa por hora: S/." + c.getTarifaHora());
		imprimir("Sueldo bruto: S/." + c.sueldoBruto());
		imprimir("Descuento AFP: S/." + c.descuentoAFP());
		imprimir("Descuento EPS: S/." + c.descuentoEPS());
		imprimir("Sueldo neto: S/." + c.sueldoNeto());
		imprimir();
	}
}