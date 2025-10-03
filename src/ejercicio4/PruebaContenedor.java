package ejercicio4;


public class PruebaContenedor {
	 public static class Persona {
	        private String nombre;
	        public Persona(String nombre) { this.nombre = nombre; }
	        @Override
	        public String toString() { return "Persona[" + nombre + "]"; }
	    }

	    public static void main(String[] args) {

	        Contenedor<String, Integer> inventario = new Contenedor<>();
	        
	        System.out.println("--- Agregando Pares ---");
	        inventario.agregarPar("Lápices", 50);
	        inventario.agregarPar("Borradores", 12);
	        inventario.agregarPar("Cuadernos", 30);
	        
	        inventario.mostrarpares(); 
	        
	        
	        System.out.println("\n--- Obteniendo un Par por índice ---");
	        inventario.obtenerPar(2);
	    
	        System.out.println("\n--- Obteniendo todos los Pares ---");
	        inventario.obtenerallpares();
	        
	        
	        
	        Contenedor<Persona, Double> empleados = new Contenedor<>();
	        empleados.agregarPar(new Persona("Javier"), 55000.0);
	        empleados.agregarPar(new Persona("Andrea"), 62000.50);
	        empleados.mostrarpares();
	    }
}
