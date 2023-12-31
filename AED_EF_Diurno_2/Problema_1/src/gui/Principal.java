package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import arreglo.ArregloElectricista;
import clases.Electricista;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JButton btnReportar;
	private JScrollPane scrollPaneA;
	private JScrollPane scrollPaneB;
	private JTextArea txtS;
	private JTable tblTabla;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblEdad;
	private JTextField txtEdad;
	private JLabel lblTarifa;
	private JLabel lblConexiones;
	private JTextField txtTarifa;
	private JTextField txtConexiones;
	private JButton btnAdicionar;
	private JButton btnEliminarUltimo;
	private JButton btnEliminarTodo;
	private DefaultTableModel modelo;

	ArregloElectricista a = new ArregloElectricista();
	private JButton btnTarifaProm;
	private JButton btnPrimeroMayor10;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Problema_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		scrollPaneA = new JScrollPane();
		scrollPaneA.setBounds(10, 121, 443, 182);
		contentPane.add(scrollPaneA);

		tblTabla = new JTable();
		scrollPaneA.setViewportView(tblTabla);

		modelo = new DefaultTableModel();
		modelo.addColumn("Nombre");
		modelo.addColumn("Edad");
		modelo.addColumn("Tarifa");
		modelo.addColumn("Conexiones");
		modelo.addColumn("Sueldo");
		tblTabla.setModel(modelo);

		scrollPaneB = new JScrollPane();
		scrollPaneB.setBounds(10, 314, 443, 137);
		contentPane.add(scrollPaneB);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPaneB.setViewportView(txtS);

		btnReportar = new JButton("Reportar");
		btnReportar.setBounds(354, 82, 99, 23);
		contentPane.add(btnReportar);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 84, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(104, 8, 84, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 36, 84, 14);
		contentPane.add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(104, 33, 84, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		lblTarifa = new JLabel("Tarifa");
		lblTarifa.setBounds(10, 61, 84, 14);
		contentPane.add(lblTarifa);
		
		lblConexiones = new JLabel("Conexiones");
		lblConexiones.setBounds(10, 86, 84, 14);
		contentPane.add(lblConexiones);
		
		txtTarifa = new JTextField();
		txtTarifa.setBounds(104, 58, 86, 20);
		contentPane.add(txtTarifa);
		txtTarifa.setColumns(10);
		
		txtConexiones = new JTextField();
		txtConexiones.setBounds(104, 83, 86, 20);
		contentPane.add(txtConexiones);
		txtConexiones.setColumns(10);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(354, 7, 99, 23);
		contentPane.add(btnAdicionar);
		
		btnEliminarUltimo = new JButton("Eliminar \u00FAltimo");
		btnEliminarUltimo.addActionListener(this);
		btnEliminarUltimo.setBounds(354, 32, 99, 23);
		contentPane.add(btnEliminarUltimo);
		
		btnEliminarTodo = new JButton("Eliminar todo");
		btnEliminarTodo.addActionListener(this);
		btnEliminarTodo.setBounds(354, 57, 99, 23);
		contentPane.add(btnEliminarTodo);
		
		btnTarifaProm = new JButton("Tarifa Promedio");
		btnTarifaProm.addActionListener(this);
		btnTarifaProm.setBounds(227, 7, 117, 23);
		contentPane.add(btnTarifaProm);
		
		btnPrimeroMayor10 = new JButton("Primero mayor que 10");
		btnPrimeroMayor10.addActionListener(this);
		btnPrimeroMayor10.setBounds(207, 32, 137, 23);
		contentPane.add(btnPrimeroMayor10);
		btnReportar.addActionListener(this);

		listar();
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEliminarTodo) {
			actionPerformedBtnEliminarTodo(arg0);
		}
		if (arg0.getSource() == btnEliminarUltimo) {
			actionPerformedBtnEliminarUltimo(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnTarifaProm) {
			actionPerformedBtnTarifaPromedio(arg0);
		}
		if (arg0.getSource() == btnPrimeroMayor10) {
			actionPerformedBtnPrimeroMayorQue10(arg0);
		}
		
	}

	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		a.adicionar(new Electricista(leerNombre(), leerEdad(), leerTarifa(), leerConexiones()));
		listar();
	}
	
	protected void actionPerformedBtnEliminarUltimo(ActionEvent arg0) {
		if(a.tamanio() > 0) {
			a.eliminarUltimo();
			listar();
		}
		else
			mensaje("Arreglo vac�o");
	}
	
	protected void actionPerformedBtnEliminarTodo(ActionEvent arg0) {
		if(a.tamanio() > 0) {
			a.eliminarTodo();
			listar();
		}
		else
			mensaje("Arreglo vac�o");
	}
	
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		txtS.setText("");
	}
	
	public void actionPerformedBtnTarifaPromedio(ActionEvent e) {
		txtS.setText("La tarifa promedio de todos los electricistas con edades menores que 45 es: \n" + a.tarifaPromedio());
	}
	
	public void actionPerformedBtnPrimeroMayorQue10(ActionEvent e) {
		txtS.setText("El nombre del primer electricista cuya cantidad de conexiones es mayor que 10 es: \n" + a.nombrePrimerElectricistaMayorQue10());
	}
	
	

	public void listar() {
		modelo.setRowCount(0);
		for (int i = 0; i < a.tamanio(); i++) {
			Electricista x = a.obtener(i);
			Object fila[] = {x.getNombre(), x.getEdad(), x.getTarifa(), x.getConexiones(), x.sueldo() };
			modelo.addRow(fila);
		}
	}

	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
	String leerNombre() {
		return txtNombre.getText();
	}
	
	int leerEdad() {
		return Integer.parseInt(txtEdad.getText());
	}
	
	double leerTarifa() {
		return Double.parseDouble(txtTarifa.getText());
	}
	
	int leerConexiones() {
		return Integer.parseInt(txtConexiones.getText());
				
	}
	
	void mensaje(String m) {
		JOptionPane.showMessageDialog(this, m, "Error", JOptionPane.ERROR_MESSAGE);
	}
}
