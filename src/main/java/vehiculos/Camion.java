package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;
	private static int cantidadCamiones;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes=ejes;
		Camion.cantidadCamiones+=1;
	}

	public int getEjes(){return ejes;}
	public void setEjes(int x){this.ejes = x;}
	
	public static int getCantidadCamiones(){return Camion.cantidadCamiones;}
	public static void setCantidadCamiones(int x){Camion.cantidadCamiones = x;}
}
