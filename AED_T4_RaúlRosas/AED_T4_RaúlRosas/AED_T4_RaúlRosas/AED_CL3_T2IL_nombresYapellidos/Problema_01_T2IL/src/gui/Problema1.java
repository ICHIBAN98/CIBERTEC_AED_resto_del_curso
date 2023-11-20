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

import arreglo.ArregloLibros;
import clase.Libro;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JLabel lblCodigo;
	private JLabel lblTitulo;
	private JLabel lblEditorial;
	private JLabel lblPrecio;
	private JTextField txtCodigo;
	private JTextField txtTitulo;
	private JTextField txtEditorial;	
	private JTextField txtPrecio;
	private JButton btnAdicionar;
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
					Problema1 frame = new Problema1();
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
	public Problema1() {
		setTitle("Problema_1");
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
		
		lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(120, 11, 50, 28);
		contentPane.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(170, 11, 60, 28);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		lblEditorial = new JLabel("Editorial");
		lblEditorial.setBounds(240, 11, 40, 28);
		contentPane.add(lblEditorial);
		
		txtEditorial = new JTextField();
		txtEditorial.setBounds(290, 11, 40, 28);
		contentPane.add(txtEditorial);
		txtEditorial.setColumns(10);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecio.setBounds(345, 11, 50, 28);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(402, 11, 40, 28);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(450, 50, 155, 23);
		contentPane.add(btnAdicionar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(450, 73, 155, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(450, 96, 155, 23);
		contentPane.add(btnEliminar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 50, 432, 274);
		contentPane.add(scrollPane);
		
		tblTabla = new JTable();
		tblTabla.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblTabla);

		modelo = new DefaultTableModel();
		modelo.addColumn("código");
		modelo.addColumn("titulo");
		modelo.addColumn("editorial");
		modelo.addColumn("precio");
		modelo.addColumn("texto");
		tblTabla.setModel(modelo);
		
		listar();		
	}
	
	//  Declaración global
	ArregloLibros al = new ArregloLibros();
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		/**
		 * Adiciona un nuevo libro verificando que el código no se repita
		 */	
		
		adicionarLibros();
		limpieza();
	}
	
	protected void actionPerformedBtnModificar(ActionEvent arg0) {
		/**
		 * Busca un código y si existe modifica los datos del libro
		 */

		modificarLibro();
		limpieza();
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
		/**
		 * Busca un código y si existe retira el libro del arreglo
		 */
		
		eliminarLibro();
		limpieza();
	}
	//  Métodos tipo void (sin parámetros)
	void limpieza() {
		txtCodigo.setText("");
		txtTitulo.setText("");
		txtEditorial.setText("");
		txtPrecio.setText("");
		txtCodigo.requestFocus();
	}	
   	void listar() {
		modelo.setRowCount(0);
		for (int i=0; i<al.tamanio(); i++) {
			Object[] fila = { al.obtener(i).getCodigo(),
							  al.obtener(i).getTitulo(),
							  al.obtener(i).getEditorial(),
					          al.obtener(i).getPrecio(),
					          al.obtener(i).tituloDeVenta() };
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
	String leerTitulo() {
		return txtTitulo.getText().trim();
	}
	String leerEditorial() {
		return txtEditorial.getText().trim();
	}
	double leerPrecio() {
		return Double.parseDouble(txtPrecio.getText().trim());
	}
	
	void adicionarLibros() {
		int codigoIn = leerCodigo();
		String tituloIn = leerTitulo();
		String editoriaIn = leerEditorial();
		double precioIn = leerPrecio();
		
		Libro x = al.buscar(codigoIn);
		if(x==null) {
			Libro nuevoLibro = new Libro(codigoIn,tituloIn,editoriaIn,precioIn);
			al.adicionar(nuevoLibro);
			listar();
			mensaje("Libro adicionado" + "\n" +
					"Cantidad actual de Libros: " + al.tamanio());
		}else {
			mensaje("El código ingresado ya existe");
		}
	}
	
	void eliminarLibro() {
		int codigoIn = leerCodigo();
		
		Libro x = al.buscar(codigoIn);
		if(x==null) {
			mensaje("El código ingresado no existe");
		}else {
			al.eliminar(x);
			listar();
			mensaje("El libro con código " + codigoIn + " fue eliminado");
		}
		
	}
	
	void modificarLibro () {
		int codigoIn = leerCodigo();
		
		Libro x = al.buscar(codigoIn);
		
		if(x!=null) {
			double precioActual = x.getPrecio();
			double nuevoPrecio = precioActual*0.81;
			x.setPrecio(nuevoPrecio);
			listar();
			mensaje("Modificación efectuada" + "\n" + "Nuevo precio: S/." + nuevoPrecio);
		} else {
			mensaje("El código ingresado no existe");
		}
	}
}