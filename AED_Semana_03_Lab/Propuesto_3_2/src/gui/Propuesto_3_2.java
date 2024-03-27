package gui;

import java.awt.EventQueue;
import semana_03.Balon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_3_2 extends JFrame implements ActionListener {
	
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
					Propuesto_3_2 frame = new Propuesto_3_2();
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
	public Propuesto_3_2() {
		setTitle("Propuesto_3_2");
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
		Balon b1 = new Balon("Nike",150,5.3,23.3,40.90);
		Balon b2 = new Balon("Umbro",130.4,4.8);
		Balon b3 = new Balon();
		
		listado(b1);
		listado(b2);
		listado(b3);
		
		imprimir("---------------------------------");
		imprimir("Valor de PI: " + Balon.pi);
		imprimir("Descuento: " + Balon.descuento);
		imprimir("Cantidad de balones: " + Balon.getCantidad());
		imprimir("Importe a pagar acumulado: " + Balon.getSuma());
		imprimir("---------------------------------");
		
		txtS.setCaretPosition(0);
		
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}	
	
	void listado(Balon b) {
		imprimir("Marca: " + b.getMarca());
		imprimir("Peso en gramos: " + b.getPesoGramos());
		imprimir("Presión en libras: " + b.getPresionLibras());
		imprimir("Diámetro en cm: " + b.getDiametroCm());
		imprimir("Precio: S/." + b.getPrecio());
		imprimir("Radio(cm): " + b.radio());
		imprimir("Volumen(cc): " + b.volumen());
		imprimir("Descuento: S/." + b.descuento());
		imprimir("Importe a pagar: S/." + b.importePagar());
		imprimir();
	}
}