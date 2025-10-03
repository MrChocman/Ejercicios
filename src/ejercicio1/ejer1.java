package ejercicio1;

public class ejer1 {
	
	
	 
	 public static void main(String[] args) {
	        
	        Par<String, Integer> par1 = new Par<>("Edad", 30);
	        System.out.println("Par 1: " + par1); 
	        System.out.println("Primer elemento: " + par1.getPrimero()); 

	        par1.setSegundo(31);
	        System.out.println("Par 1 modificado: " + par1); 

	        
	        
	        Par<Double, Boolean> par2 = new Par<>(3.14159, true);
	        System.out.println("Par 2: " + par2); 
	        
	                
	        
	     
	    }
}
