package vehiculos;

public class Pais {
	
	private String nombre;
	
	public Pais(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre(){return nombre;}
	public void setNombre(String x){this.nombre = x;}
	
	public static Pais paisMasVendedor() {
		return Vehiculo.paisMasVendedor();
	}
}
