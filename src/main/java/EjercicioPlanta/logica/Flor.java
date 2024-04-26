package EjercicioPlanta.logica;

public class Flor extends Planta {
	// ESTADO: ATRIBUTOS;
	private String colorDePetalos;
	private double cantidadPromedioDePetalos;
	private String colorDelPistilo;
	private String variedadDeFlor;
	private String estacionQueFlorece;

	// COMPORTAMIENTO: FUNCIONES, PROCEDIMIENTOS Y MÉTODOS;
	// MÉTODO CONSTRUCTOR POR DEFECTO(VACIO);
	public Flor() {
		super();
	}

	// MÉTODO CONSTRUCTOR CON PARÁMETROS;
	public Flor(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, String colorDePetalos,
			double cantidadPromedioDePetalos, String colorDelPistilo, String colorDeLosPetalos, String variedadDeFlor,
			String estacionQueFlorece) {
		super(nombre, altoDelTallo, tieneHojas, climaIdeal);
		this.colorDePetalos = colorDePetalos;
		this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
		this.colorDelPistilo = colorDelPistilo;
		this.variedadDeFlor = variedadDeFlor;
		this.estacionQueFlorece = estacionQueFlorece;
	}

	// MÉTODOS GETTERS Y SETTERS;
	public String getColorDePetalos() {
		return colorDePetalos;
	}

	public void setColorDePetalos(String colorDePetalos) {
		this.colorDePetalos = colorDePetalos;
	}

	public double getCantidadPromedioDePetalos() {
		return cantidadPromedioDePetalos;
	}

	public void setCantidadPromedioDePetalos(double cantidadPromedioDePetalos) {
		this.cantidadPromedioDePetalos = cantidadPromedioDePetalos;
	}

	public String getColorDelPistilo() {
		return colorDelPistilo;
	}

	public void setColorDelPistilo(String colorDelPistilo) {
		this.colorDelPistilo = colorDelPistilo;
	}

	public String getVariedadDeFlor() {
		return variedadDeFlor;
	}

	public void setVariedadDeFlor(String variedadDeFlor) {
		this.variedadDeFlor = variedadDeFlor;
	}

	public String getEstacionQueFlorece() {
		return estacionQueFlorece;
	}

	public void setEstacionQueFlorece(String estacionQueFlorece) {
		this.estacionQueFlorece = estacionQueFlorece;
	}

	// MÉTODOS PROPIOS DE LA CLASE Flor;

	// MÉTODOS HEREDADOS DE LA SUPERCLASE Planta;
	@Override
	public void mostrarMensaje() {
		System.out.println("Hola soy una flor...");
	}

}
