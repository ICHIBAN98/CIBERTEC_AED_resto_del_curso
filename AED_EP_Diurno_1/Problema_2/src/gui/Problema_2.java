package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import examen.ArregloLongitudes;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Problema_2 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JTextField txtLongitud;
	private JLabel lblLongitud;
	private JButton btnAdicionar;
	private JButton btnReemplazarLongitud;
	private JButton btnIntercambiarLongitudes;

	ArregloLongitudes a = new ArregloLongitudes();
	private JButton btnIncrementarLongitud;

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
					Problema_2 frame = new Problema_2();
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
	public Problema_2() {
		setTitle("Problema_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 39, 225, 412);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtS);
		txtS.setEditable(false);

		txtLongitud = new JTextField();
		txtLongitud.setBounds(66, 8, 169, 20);
		contentPane.add(txtLongitud);
		txtLongitud.setColumns(10);

		lblLongitud = new JLabel("Longitud");
		lblLongitud.setBounds(10, 11, 46, 14);
		contentPane.add(lblLongitud);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(247, 7, 213, 23);
		contentPane.add(btnAdicionar);
		
		btnReemplazarLongitud = new JButton("Reemplazar longitud");
		btnReemplazarLongitud.addActionListener(this);
		btnReemplazarLongitud.setBounds(245, 41, 215, 23);
		contentPane.add(btnReemplazarLongitud);
		
		btnIntercambiarLongitudes = new JButton("Intercambiar longitudes");
		btnIntercambiarLongitudes.addActionListener(this);
		btnIntercambiarLongitudes.setBounds(245, 75, 215, 23);
		contentPane.add(btnIntercambiarLongitudes);
		
		btnIncrementarLongitud = new JButton("Incrementar longitud");
		btnIncrementarLongitud.addActionListener(this);
		btnIncrementarLongitud.setBounds(245, 109, 215, 23);
		contentPane.add(btnIncrementarLongitud);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnIntercambiarLongitudes) {
			actionPerformedBtnIntercambiarLongitudes(arg0);
		}
		if (arg0.getSource() == btnReemplazarLongitud) {
			actionPerformedBtnReemplazarLongitud(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		
		if (arg0.getSource() == btnIncrementarLongitud) {
			actionPerformedBtnIncrementarLongitud(arg0);
		}
	}

	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		try {
			a.adicionar(leerLongitud());
			limpiar();
			listar();
		}
		catch (Exception e) {
			mensaje("Error de ingreso");
			limpiar();
		}
	}

	protected void actionPerformedBtnReemplazarLongitud(ActionEvent arg0) {
		boolean validacion=a.reemplazarLongitudMayor120();
		if(validacion==true) {
			limpiar();
			listar();
			mensaje("Operación realizada con éxito");
		} else {
			mensaje("Error en la operación");
			limpiar();
		}
	}
	
	protected void actionPerformedBtnIntercambiarLongitudes(ActionEvent arg0) {
		 if(a.tamaño()>0){
			a.intercambiarLongitudes();
			limpiar();
			listar();
		}
		 else{
			mensaje("Error: Array vacío");
			limpiar();
		}
	}
	
	public void actionPerformedBtnIncrementarLongitud(ActionEvent e) {
		boolean validacion=a.incrementarLongitudMayor120();
		if(validacion==true) {
			limpiar();
			listar();
			mensaje("Operación realizada con éxito");
		} else {
			mensaje("Error en la operación");
			limpiar();
		}
	}
	
	void listar() {
		txtS.setText("");
		for (int i = 0; i < a.tamaño(); i++) {
			imprimir(a.obtener(i) + "");
		}
	}

	void mensaje(String m) {
		JOptionPane.showMessageDialog(this, m);
	}

	void imprimir(String s) {
		txtS.append(s + "\n");
	}

	double leerLongitud() {
		return Double.parseDouble(txtLongitud.getText().trim());
	}
	
	void limpiar() {
		txtLongitud.setText("");
		txtLongitud.requestFocus();
	}
}
