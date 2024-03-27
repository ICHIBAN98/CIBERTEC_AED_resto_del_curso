package gui;

import java.awt.EventQueue;
import semana_02.Pelota;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Propuesto_2_5 extends JFrame implements ActionListener {
	
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
					Propuesto_2_5 frame = new Propuesto_2_5();
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
	public Propuesto_2_5() {
		setTitle("Propuesto_2_5");
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
		Pelota pel = new Pelota("Viniball",100.5, 6.2, 125, 6);
		listado(pel);
		
		double nuevoPrecio = pel.getPrecio()*0.75;
		pel.setPrecio(nuevoPrecio);
		double nuevoDiametro = pel.getDiametroCentimetros() + 1;
		pel.setDiametroCentimetros(nuevoDiametro);
		listado(pel);
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void listado(Pelota p) {
		imprimir("marca: " + p.getMarca());
		imprimir("peso en gramos: " + p.getPesoGramos() + "gr");
		imprimir("presi�n en libras: " + p.getPresionLibras() + "PSI");
		imprimir("di�metro en cent�metros: " + p.getDiametroCentimetros() + "cm");
		imprimir("precio: S/." + p.getPrecio());
		imprimir("radio: " + p.radio() + "cm");
		imprimir("volumen: " + p.volumen() + "cc");
		imprimir("descuento: S/." + p.dscto());
		imprimir("importe a pagar: S/." + p.importePagar());
		imprimir("");
	}
	
}