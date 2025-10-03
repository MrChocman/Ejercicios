package ejercicio4;

import java.util.ArrayList;



public class Contenedor<F,S> {
	
	private ArrayList<Par<F,S>> arra1;
	
	public Contenedor() {
		
		this.arra1 = new ArrayList<>();
	}
	
	public void agregarPar(F primero, S segundo) {
		Par<F,S> p1 = new Par<>(primero,segundo);
		
		arra1.add(p1);
		System.out.print("Par añadido al contenedor \n");
	}
	
	public void obtenerPar(int index) {
		if (index >= 0 && index<arra1.size()) {
			System.out.print("El elemento en la posicion " + index + "es " + arra1.get(index) + "\n");
		}
		else {
			System.out.print("Error en el indice, fuera de rango");
		}
		
		
		
	}
	
	
	public ArrayList<Par<F,S>> obtenerallpares(){
		return this.arra1;
		
	}
	
	public void mostrarpares() {
		
		System.out.print("Los pares en total son: ");
		
		for (Par<F,S> e : arra1) {
			System.out.print(e);
		}
		
		System.out.print("\n");
	}
	
	
	
	
	

}
