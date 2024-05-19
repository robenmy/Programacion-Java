package Logica;

import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Trabajador> tra = new ArrayList<Trabajador>();
		Trabajador  t1 = new Trabajador("5","pepe",5,10);
		Trabajador  t2 = new Trabajador("89","juan",5,10);
		Trabajador  t3 = new Trabajador("62","mario",5,10);
		
		tra.add(t1);
		tra.add(t2);
		tra.add(t3);
		
		Departamento dep = new Departamento("676","economia");
        dep.regTrabajador(tra);
        dep.getMisTrabajadores();
        dep.cantTrabajadores();
        dep.generarFicheroDep();
        
        Empresa em= new Empresa();
        
      //  ArrayList<Departamento> mis = new ArrayList<Departamento>();
       // mis.add(dep);
      // em.regDepartamentos(mis);
        //em.generarFicheroDepTxt();
        
        
        
	}

}
