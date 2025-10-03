package ejercicio2;

public class PruebaPar {
	
	public static void main(String[] args) {
        
        Par<String, Integer> par1 = new Par<>("Edad", 30);
        Par<Double, Integer> par2  = new Par<>(45.34,34);
        Par<Double, Boolean> par3 = new Par<>(3.14159, true);
        Par<Double, Integer> par4  = new Par<>(90.32,26);
        
        System.out.println("Par 1: " + par1); 
        System.out.println("Primer elemento: " + par1.getPrimero()); 

        par1.setSegundo(31);
        System.out.println("Par 1 modificado: " + par1); 

        System.out.print("El par 2 es igual que el par 3 ? " + par2.iguales(par4) + "\n");        
        
       
        System.out.println("Par 2: " + par3); 
    }
	
	

}
