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
	
	private static ArrayList<String> fabricantes=new ArrayList<String>();
	private static ArrayList<String> paises=new ArrayList<String>();
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
		Vehiculo.fabricantes.add(fabricante.getNombre());
		Vehiculo.paises.add(fabricante.getPais().getNombre());
		
	}

	public static String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.getCantidadAutomoviles()
			 +"\nCamionetas: "+Camioneta.getCantidadCamionetas()
			   +"\nCamiones: "+Camion.getCantidadCamiones();
	}
	
	public static String paisMasVendedor() {
		Map<String, Integer> map = new HashMap<>();
		
		for (String string: paises) {
			Integer val = map.get(string);
			map.put(string, val==null ? 1 : val+1);
		}
		
		Entry<String, Integer> max = null;
		
		for (Entry<String, Integer> e : map.entrySet()) {
			if (max == null || e.getValue() > max.getValue())
				max = e;
		}
		
		return max.getKey();
	}
	
	public static String fabricaMayorVentas() {
		Map<String, Integer> map = new HashMap<>();
		
		for (String string: fabricantes) {
			Integer val = map.get(string);
			map.put(string, val==null ? 1 : val+1);
		}
		
		Entry<String, Integer> max = null;
		
		for (Entry<String, Integer> e : map.entrySet()) {
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


