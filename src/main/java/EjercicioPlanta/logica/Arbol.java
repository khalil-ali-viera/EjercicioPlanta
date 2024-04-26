package EjercicioPlanta.logica;

public class Arbol extends Planta {
	// ESTADO: ATRIBUTOS;
	private String variedad;
	private String tipoDeTronco;
	private double radioDeTronco;
	private String color;
	private String tipoDeHojas;

	// COMPORTAMIENTO: FUNCIONES, PROCEDIMIENTOS Y MÉTODOS;
	// MÉTODO CONSTRUCTOR POR DEFECTO(VACIO);
	public Arbol() {
		super();
	}

	// MÉTODO CONSTRUCTOR CON PARÁMETROS;
	public Arbol(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, String variedad,
			String tipoDeTronco, double radioDeTronco, String color, String tipoDeHojas) {
		super(nombre, altoDelTallo, tieneHojas, climaIdeal);
		this.variedad = variedad;
		this.tipoDeTronco = tipoDeTronco;
		this.radioDeTronco = radioDeTronco;
		this.color = color;
		this.tipoDeHojas = tipoDeHojas;
	}

	// MÉTODOS GETTERS Y SETTERS;
	public String getVariedad() {
		return variedad;
	}

	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}

	public String getTipoDeTronco() {
		return tipoDeTronco;
	}

	public void setTipoDeTronco(String tipoDeTronco) {
		this.tipoDeTronco = tipoDeTronco;
	}

	public double getRadioDeTronco() {
		return radioDeTronco;
	}

	public void setRadioDeTronco(double radioDeTronco) {
		this.radioDeTronco = radioDeTronco;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipoDeHojas() {
		return tipoDeHojas;
	}

	public void setTipoDeHojas(String tipoDeHojas) {
		this.tipoDeHojas = tipoDeHojas;
	}

	// MÉTODOS PROPIOS DE LA CLASE Arbol;

	// MÉTODOS HEREDADOS DE LA SUPERCLASE Planta;
	@Override
	public void mostrarMensaje() {
		System.out.println("Hola soy un árbol...");
	}

}
