package vehiculos;
import java.util.*;
import java.util.Map.Entry;

public class Vehiculo{
	
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	
	private static ArrayList<Fabricante> fabricantes=new ArrayList<Fabricante>();
	private static ArrayList<Pais> paises=new ArrayList<Pais>();
	private static int CantidadVehiculos;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
		
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		Vehiculo.CantidadVehiculos = Vehiculo.CantidadVehiculos+1;
		//Vehiculo.fabricantes.add(fabricante.getNombre());
		Vehiculo.fabricantes.add(fabricante);
		//Vehiculo.paises.add(fabricante.getPais().getNombre());
		Vehiculo.paises.add(fabricante.getPais());
		
	}

	public static String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.getCantidadAutomoviles()
			 +"\nCamionetas: "+Camioneta.getCantidadCamionetas()
			   +"\nCamiones: "+Camion.getCantidadCamiones();
	}
	
	public static Pais paisMasVendedor() {
		Map<Pais, Integer> map = new HashMap<>();
		
		for (Pais string: paises) {
			Integer val = map.get(string);
			map.put(string, val==null ? 1 : val+1);
		}
		
		Entry<Pais, Integer> max = null;
		
		for (Entry<Pais, Integer> e : map.entrySet()) {
			if (max == null || e.getValue() > max.getValue())
				max = e;
		}
		
		return max.getKey();
	}
	
	public static Fabricante fabricaMayorVentas() {
		Map<Fabricante, Integer> map = new HashMap<>();
		
		for (Fabricante string: fabricantes) {
			Integer val = map.get(string);
			map.put(string, val==null ? 1 : val+1);
		}
		
		Entry<Fabricante, Integer> max = null;
		
		for (Entry<Fabricante, Integer> e : map.entrySet()) {
			if (max == null || e.getValue() > max.getValue())
				max = e;
		}
		
		return max.getKey();
	}
	
	
	public String getPlaca(){return placa;}
	public void setPlaca(String x) {this.placa=x;}
	
	public int getPuertas(){return puertas;}
	public void setPuertas(int x) {this.puertas=x;}
	
	public int getVelocidadMaxima(){return velocidadMaxima;}
	public void setVelocidadMaxima(int x) {this.velocidadMaxima=x;}
	
	public String getNombre(){return nombre;}
	public void setNombre(String x) {this.nombre=x;}
	
	public int getPrecio(){return precio;}
	public void setPrecio(int x) {this.precio=x;}
	
	public int getPeso(){return peso;}
	public void setPeso(int x) {this.peso=x;}
	
	public String getTraccion(){return traccion;}
	public void setTraccion(String x){this.traccion=x;}
	
	public Fabricante getFabricante(){return fabricante;}
	public void setFabricante(Fabricante x){this.fabricante=x;}

	public static int getCantidadVehiculos(){return CantidadVehiculos;}
	public static void setCantidadVehiculos(int x) {CantidadVehiculos=x;}




}


