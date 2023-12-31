package gui;

import java.awt.EventQueue;
import examen.Congeladora;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;

public class Problema_1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
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
					Problema_1 frame = new Problema_1();
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
	public Problema_1() {
		setTitle("Problema_1");
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
		txtS.setEditable(false);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(arg0);
		}
	}

	protected void actionPerformedBtnProcesar(ActionEvent arg0) {
		Congeladora c = new Congeladora(0.7,1.8,0.7);
		
		mostrarCongeladora(c);
		
		double nuevoAncho = c.getAncho()*1.05;
		c.setAncho(nuevoAncho);
		
		double nuevoAlto = c.getAlto()*0.85;
		c.setAlto(nuevoAlto);
		
		mostrarCongeladora(c);
	}

	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
	void mostrarCongeladora(Congeladora c) {
		imprimir("ancho(m): " + c.getAncho());
		imprimir("alto(m): " + c.getAlto());
		imprimir("profundidad(m): " + c.getProfundidad());
		imprimir("�rea de la base(m^2): " + c.areaBase());
		imprimir("volumen(m^3): " + c.volumen());
		imprimir("clase de congeladora: " + c.claseCongeladora());
		imprimir("");
	}
}
