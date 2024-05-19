package otros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaSalida_de_Datos {
	public static void main(String[] arg) {
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0;
		
		System.out.print("Digite un numero");
		valor =entrada.nextInt();
		System.out.print(valor);
		
		/*JOPTION PANE*/
		String cadena;
		
		cadena = JOptionPane.showInputDialog("Digite una cadena: ");
		
		for(char l : cadena.toCharArray()) {
			System.out.println(l);
			
		}
		
		
	}

}
