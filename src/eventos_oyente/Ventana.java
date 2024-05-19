package eventos_oyente;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	JPanel panel = new JPanel();
	JTextField caja;
	
	public Ventana() {
		this.setSize(800, 600);
		 setDefaultCloseOperation(EXIT_ON_CLOSE); 
	     setTitle("El titulo");
	     iniciarComponentes();
	    
	     
	     setLocationRelativeTo(null);
	     setVisible(true);
	     
	}
	

	private void iniciarComponentes() {
		panel.setLayout(null);
		colocarBoton();
		colocarEtiqueta();
		colocarCajaDeTexto();
		eventoOyenteDeRaton();
		
		this.getContentPane().add(panel); //para agregar el panel de los componentes
		
		
	}
	
	private void colocarBoton() {
		JButton boton =new JButton("Pulsa Aqui");
		boton.setBounds(150,100, 150, 40);
		boton.setFont(new Font("arial",1,20));
		panel.add(boton);
		
		JLabel saludo = new JLabel();
		saludo.setBounds(50, 200, 300, 40);
		saludo.setFont(new Font("arial",1,20));
		panel.add(saludo);
		
		//agregar evento de accion al presionar boton
		ActionListener oyenteDeaccion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				saludo.setText("Hola "+caja.getText());
				
			}
			
		
			
		};
		boton.addActionListener(oyenteDeaccion);
		
		
		
	}
	
	private void colocarEtiqueta() {
		JLabel etiqueta = new JLabel("Ingrese su nombre");
		etiqueta.setBounds(30, 10, 250, 30);
		etiqueta.setFont(new Font("cooper black",1,20));
		panel.add(etiqueta);
	}
	
	private void colocarCajaDeTexto() {
		 caja = new JTextField();
		caja.setBounds(30, 50, 300, 30);
		panel.add(caja);
	}
	
	private void eventoOyenteDeRaton() {
		
		JButton boton =new JButton("RATON OYENTE");
		boton.setBounds(450,100, 250, 80);
		boton.setFont(new Font("arial",1,20));
		panel.add(boton);
		
		JLabel saludo = new JLabel();
		saludo.setBounds(50, 250, 300, 40);
		saludo.setFont(new Font("arial",1,20));
		panel.add(saludo);
		
		//agregar evento de accion al presionar boton
		MouseListener oyenteDeRaton = new MouseListener() {

			

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				saludo.setText("click realizado");
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				saludo.setText("Mouse Entro");
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				saludo.setText("Mouse Salio");
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				saludo.setText("Mouse presionado");
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				saludo.setText("Mouse soltado");
				System.out.println("Mouse soltado");
				
			}
			
		
			
		};
		boton.addMouseListener(oyenteDeRaton);
		
		
	}
	
	
	private void eventosDeTeclado() {
		
		KeyListener oyenteTeclado = new KeyListener() {

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Caracter: "+arg0.getKeyChar());
				
			}
			
			
		};
		
		
		
		
	}
	

}
