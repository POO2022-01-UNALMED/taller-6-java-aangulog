package vehiculos;

public class Automovil extends Vehiculo{

	private int puestos;
	private static int cantidadAutomoviles;
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos=puestos;
		Automovil.cantidadAutomoviles += 1;
	}

	public int getPuestos(){return puestos;}
	public void setPuestos(int x){this.puestos = x;}
	
	public static int getCantidadAutomoviles(){return Automovil.cantidadAutomoviles;}
	public static void setCantidadAutomoviles(int x){Automovil.cantidadAutomoviles = x;}
}

