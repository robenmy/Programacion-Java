package otros;

import javax.swing.JOptionPane;

public class Aleatorios {

	public static void main(String[] args) {
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
		
		int num_aleatorios[] = new int[elementos];
		
		for(int i=0;i<num_aleatorios.length;i++) {
			
			num_aleatorios[i]=(int)(Math.random()*100);
			
		}
		
		for(int elem: num_aleatorios) {
			System.out.println(elem);
		}

	}

}
