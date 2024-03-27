package gui;

import java.awt.EventQueue;
import semana_03.Factura;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_3_1 extends JFrame implements ActionListener {
	
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
					Problema_3_1 frame = new Problema_3_1();
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
	public Problema_3_1() {
		setTitle("Problema_3_1");
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
		Factura f1 = new Factura("0101010101","Pipipi Company",15,35.7);
		Factura f2 = new Factura("0202020202","Babies Don�t Hurt Me");
		Factura f3 = new Factura();
		
		listado(f1);
		listado(f2);
		listado(f3);
		
		imprimir("----------------------------");
		imprimir("entidad: " + Factura.entidad);
		imprimir("cantidad de facturas: " + Factura.getCantidad());
		imprimir("suma total de importes: " + Factura.getSuma());
		imprimir("----------------------------");
		
		txtS.setCaretPosition(0);
	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
	void listado(Factura f) {
		imprimir("ruc: " + f.getRuc());
		imprimir("empresa: " + f.getEmpresa());
		imprimir("unidades: " + f.getUnidades());
		imprimir("precio unitario: " + f.getPrecioUnitario());
		imprimir("importe facturado: " + f.importeFacturado());
		imprimir();
	}
	
}