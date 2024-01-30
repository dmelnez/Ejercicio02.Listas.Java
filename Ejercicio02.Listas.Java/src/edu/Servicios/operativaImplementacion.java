package edu.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class operativaImplementacion implements operativaInterfaz{

	List<Object> listaNumeros = new ArrayList<>();
	List<Object> aux = new ArrayList<>();

		// TODO Auto-generated method stub

		public boolean  solNumero () {
			
			Scanner sc = new Scanner(System.in);
			
		
			// Solicitar un numero entero al usuario
			System.out.println("INTRODUZCA UN NUMERO ENTERO");
			
			int numeroIntro = sc.nextInt();
			
			boolean validador = false;
			
			if (numeroIntro <=0 ) {
				
				validador = false;
				
				
			}
			
			else {
				
				 validador = true;
				
			}
			
			
			listaNumeros.add(numeroIntro);
			
			return validador;
			
			
		
		}
		
		
		
		public void mostrarLista () {
			
			for (var numeros : listaNumeros) {
				
				
				System.out.println(numeros);
			
				
				
			}
			
		}
	
		
		
		
		
		public void listaModificada () {
			
			
			for (int i = 0 ; i < listaNumeros.size()-1; ++i) {
				
				
				for (int j = 1 ; j < listaNumeros.size()-1; ++j) {
					
					if (listaNumeros.get(i) == listaNumeros.get(j) ) {
				
						aux.add(listaNumeros.set(j, 0));

					}
					
				}
		
			}
			

		}
		
		public void mostrarListaMod () {
			
			for (var valores : aux) {
				System.out.println(valores);
			}
			
			
		}




		
			
			
			
		
}
