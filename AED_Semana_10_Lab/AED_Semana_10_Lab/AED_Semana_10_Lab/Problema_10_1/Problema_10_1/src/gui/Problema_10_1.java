package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import arreglo.ArregloPersonas;
import clase.Persona;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_10_1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblCodigo;
	private JLabel lblNombre;
	private JLabel lblPeso;
	private JLabel lblEstatura;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtPeso;	
	private JTextField txtEstatura;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JTable tblTabla;
	private DefaultTableModel modelo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_10_1 frame = new Problema_10_1();
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
	public Problema_10_1() {
		setTitle("Problema_10_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(10, 11, 40, 28);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(54, 11, 40, 28);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(120, 11, 50, 28);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(170, 11, 60, 28);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblPeso = new JLabel("Peso");
		lblPeso.setBounds(255, 11, 40, 28);
		contentPane.add(lblPeso);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(290, 11, 40, 28);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		lblEstatura = new JLabel("Estatura");
		lblEstatura.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstatura.setBounds(345, 11, 50, 28);
		contentPane.add(lblEstatura);
		
		txtEstatura = new JTextField();
		txtEstatura.setBounds(402, 11, 40, 28);
		contentPane.add(txtEstatura);
		txtEstatura.setColumns(10);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(450, 50, 155, 23);
		contentPane.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(450, 75, 155, 23);
		contentPane.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(450, 100, 155, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(450, 125, 155, 23);
		contentPane.add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 50, 432, 274);
		contentPane.add(scrollPane);
		
		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTabla);

		modelo = new DefaultTableModel();
		modelo.addColumn("código");
		modelo.addColumn("nombre");
		modelo.addColumn("peso");
		modelo.addColumn("estatura");
		modelo.addColumn("imc");
		tblTabla.setModel(modelo);
		
		listar();		
	}
	
	//  Declaración global
	ArregloPersonas ap = new ArregloPersonas();

	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		/**
		 * Adiciona una nueva persona verificando que el código no se repita
		 */	
		
			int codigo = leerCodigo();
			if (ap.buscar(codigo) == null) {
				String nombre = leerNombre();
				double peso = leerPeso();
				double estatura = leerEstatura();
				Persona nuevo = new Persona(codigo, nombre, peso, estatura);
				ap.adicionar(nuevo);
				listar();
			}
			else{
				mensaje("el CÓDIGO ya existe");
			}
		limpieza();
	}
	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
		/**
		 * Busca un código y si existe edita los datos de la persona
		 */
		int codigo = leerCodigo();
		Persona x = ap.buscar(codigo);
		if (x != null) {
			txtNombre.setText(x.getNombre());
			txtPeso.setText("" + x.getPeso());
			txtEstatura.setText("" + x.getEstatura());
			txtCodigo.requestFocus();
		}
		else {
			mensaje("el CÓDIGO no existe");
			limpieza();
		}
		
	}
	protected void actionPerformedBtnModificar(ActionEvent arg0) {
		/**
		 * Busca un código y si existe modifica los datos de la persona
		 */
		
		int codigo = leerCodigo();
		Persona x = ap.buscar(codigo);
		if (x != null) {
			String nombre = leerNombre();
			double peso = leerPeso();
			double estatura = leerEstatura();
			x.setNombre(nombre);
			x.setPeso(peso);
			x.setEstatura(estatura);
			listar();
		}
		else{
			mensaje("el CÓDIGO no existe");
		}
		limpieza();
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
		/**
		 * Busca un código y si existe retira a la persona del arreglo
		 */
		int codigo = leerCodigo();
		Persona x = ap.buscar(codigo);
		if (x != null) {
			ap.eliminar(x);
			listar();
		}
		else{
			mensaje("el CÓDIGO no existe");
		}
		limpieza();
	}
	//  Métodos tipo void (sin parámetros)
	void limpieza() {
		txtCodigo.setText("");
		txtNombre.setText("");
		txtPeso.setText("");
		txtEstatura.setText("");
		txtCodigo.requestFocus();
	}	
   	void listar() {
   		modelo.setRowCount(0);
		for (int i=0; i<ap.tamanio(); i++) {
			Object[] fila = { ap.obtener(i).getCodigo(),
					          ap.obtener(i).getNombre(),
					          ap.obtener(i).getPeso(),
					          ap.obtener(i).getEstatura(),
					          decimalFormat(ap.obtener(i).imc()) };
			modelo.addRow(fila);
		}
		
	}
	//  Métodos tipo void (con parámetros)
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	//  Métodos que retornan valor (sin parámetros)
	int leerCodigo() {
		return Integer.parseInt(txtCodigo.getText().trim());
	}
	String leerNombre() {
		return txtNombre.getText().trim();
	}
	double leerPeso() {
		return Double.parseDouble(txtPeso.getText().trim());
	}
	double leerEstatura() {
		return Double.parseDouble(txtEstatura.getText().trim());
	}
	String decimalFormat(double p){
		return String.format("%.2f",p).replace(",", ".");
	}
	
}