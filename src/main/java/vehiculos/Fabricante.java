package vehiculos;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
	}
	
	public String getNombre(){return nombre;}
	public void setNombre(String x){this.nombre = x;}
	
	public Pais getPais(){return pais;}
	public void setPais(Pais x){this.pais = x;}
	
	public static Fabricante fabricaMayorVentas() {
		return Vehiculo.fabricaMayorVentas();
	}

}
