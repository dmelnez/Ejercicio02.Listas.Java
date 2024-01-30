package edu.Controladores;

import java.util.ArrayList;
import java.util.List;

import edu.Servicios.operativaImplementacion;
import edu.Servicios.operativaInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		operativaInterfaz op = new operativaImplementacion();
		
		List<Object> listaNumeros = new ArrayList<>();
		
		boolean validado;
		
		do{
			
			validado = op.solNumero();
	
			
			
		}
		
		while (validado);
		
		op.mostrarLista();
		
		op.listaModificada();
		
		System.out.println("------------------------");
		op.mostrarListaMod();
		
		
	}

}
