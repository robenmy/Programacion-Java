package a_sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.*;

import javax.net.*;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		
		addWindowListener(new EnvioOnline());
		}	
	
}

//------------- ENVIO DE SENAL ONLINE---------------------------------
class EnvioOnline extends WindowAdapter{ // esta clase es parecida windowslistener pero evita tener que implementar todos los metodos y solo elegir el que se desea usar
	
	public void windowOpened(WindowEvent e){

		try{
			
			Socket misocket = new Socket("10.0.2.15",9999);
			
			PaqueteEnvio datos = new PaqueteEnvio();
			
			datos.setMensaje(" Online");
			
			ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
			
			paquete_datos.writeObject(datos);
			
			misocket.close();
			
		}catch(Exception e2){
			
			
		}
	}
	
	
}
//-----------------------------------------------------------------------------------

class LaminaMarcoCliente extends JPanel implements Runnable{
	
	public LaminaMarcoCliente(){
		
		String nick_usuario = JOptionPane.showInputDialog("Nick:  ");
		
		JLabel n_nick = new JLabel("Nick: ");
		
		add(n_nick);
	
		nick = new JLabel();
		
		nick.setText(nick_usuario);
		add(nick);
		
		JLabel texto=new JLabel("Online: ");
		
		add(texto);
		
		ip = new JComboBox();
		
		//ip.addItem("Usuario 1");
		//ip.addItem("Usuario 2");
		//ip.addItem("Usuario 3");
		
		add(ip);
		
		campochat = new JTextArea(12,20);
		
		add(campochat);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviaTexto mievento = new EnviaTexto();
		
		miboton.addActionListener(mievento);
		
		add(miboton);	
		
		Thread mihilo = new Thread(this);
		
		mihilo.start();
		
	}
	
	
	
	private class EnviaTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			//System.out.println(campo1.getText());
			
			campochat.append("\n"+campo1.getText());
			
			try {
				Socket misocket = new Socket("10.0.2.15",9999);
				
				PaqueteEnvio datos = new PaqueteEnvio();
				
				datos.setNick(nick.getText());
				datos.setIp(ip.getSelectedItem().toString());
				datos.setMensaje(campo1.getText());
				
				ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
				
				paquete_datos.writeObject(datos);
				misocket.close();
				
				/*DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
				
				flujo_salida.writeUTF(campo1.getText());
				
				flujo_salida.close();*/
				
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
				System.out.println(e1.getMessage());
			}
		}
		
		
	}
		
		
	private JTextField campo1;
	
	private JComboBox ip;
	
	private JLabel nick;
	
	private JTextArea campochat;
	
	private JButton miboton;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try{
			
			ServerSocket servidor_cliente = new ServerSocket(9090);
			
			Socket cliente;
			
			PaqueteEnvio paqueteRecibido;
			
			while(true){
				
				cliente = servidor_cliente.accept();
				
				ObjectInputStream flujoentrada = new ObjectInputStream(cliente.getInputStream());
				
				paqueteRecibido = (PaqueteEnvio) flujoentrada.readObject();
				
				if(!paqueteRecibido.equals(" Online")){
					
					campochat.append("\n"+paqueteRecibido.getNick()+": "+paqueteRecibido.getMensaje()); //chateando
				}else{
					

					//campochat.append("\n "+paqueteRecibido.getIps());
					
					ArrayList<String> IpsMenu = new ArrayList<>();
					
					IpsMenu = paqueteRecibido.getIps();
					
					ip.removeAllItems();
					
					for(String z: IpsMenu){
						
						ip.addItem(z);
						
					}
					
				}
				
				
			}
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
}

class PaqueteEnvio implements Serializable{
	
	private String nick, ip, mensaje;
	
	private ArrayList<String> Ips;
	

	public ArrayList<String> getIps() {
		return Ips;
	}

	public void setIps(ArrayList<String> ips) {
		Ips = ips;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
