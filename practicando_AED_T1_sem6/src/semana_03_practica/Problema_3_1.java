package semana_03_practica;

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

public class Problema_3_1 extends JFrame implements ActionListener{

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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_3_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(157, 11, 89, 23);
		contentPane.add(btnProcesar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 414, 205);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
	}
	
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		Factura f1 = new Factura("15165","YOLO Company",35,40.0);
		Factura f2 = new Factura("28754","YARA PIPIPI");
		Factura f3 = new Factura();
		
		listado(f1);
		listado(f2);
		listado(f3);
		
		imprimir("");
		imprimir("");
		
		imprimir("entidad: " + Factura.entidad);
		imprimir("cantidad de facturas:" + Factura.getCantidad());
		imprimir("suma total de importes: S/." + Factura.getSuma());
		
		txtS.setCaretPosition(0);
		}
	
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
	void listado(Factura f) {
		imprimir("ruc: " + f.getRuc());
		imprimir("empresa: " + f.getEmpresa());
		imprimir("unidades: " + f.getUnidades());
		imprimir("precio unitario: S/." + f.getPrecioUnitario());
		imprimir("importe facturado: S/." + f.importeFacturado());
		imprimir("");
	}
	
}
