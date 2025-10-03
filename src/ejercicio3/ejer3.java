package ejercicio3;

public class ejer3 {
public static<F,S> void imprimirPar(Par<F,S> parr) {
		
		System.out.print("Par Impreso: " + parr.getPrimero() + ", " + parr.getSegundo() + "\n" );
		 
		 
	 }
	 
	 public static void main(String[] args) {
	        
	        Par<String, Integer> par1 = new Par<>("Edad", 30);
	        System.out.println("Par 1: " + par1); 
	        System.out.println("Primer elemento: " + par1.getPrimero()); 

	        par1.setSegundo(31);
	        System.out.println("Par 1 modificado: " + par1); 

	        
	        
	        Par<Double, Boolean> par2 = new Par<>(3.14159, true);
	        System.out.println("Par 2: " + par2); 
	        
	        Persona p1 = new Persona("Pedro", 19);
	        
	        Par<Persona,Integer> par3 = new Par<>(p1, 39);
	        
	        
	        
	        imprimirPar(par1);
	        imprimirPar(par2);
	        imprimirPar(par3);
	       
	        
	    }
}
