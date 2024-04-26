package EjercicioPlanta.logica;

public abstract class Planta {
	// ESTADO: ATRIBUTOS;
	protected String nombre;
	protected double altoDelTallo;
	protected boolean tieneHojas;
	protected String climaIdeal;

	// COMPORTAMIENTO: FUNCIONES, PROCEDIMIENTOS Y MÉTODOS;
	// MÉTODO CONSTRUCTOR POR DEFECTO(VACIO);
	protected Planta() {
	}

	// MÉTODO CONSTRUCTOR CON PARÁMETROS;
	protected Planta(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal) {
		this.nombre = nombre;
		this.altoDelTallo = altoDelTallo;
		this.tieneHojas = tieneHojas;
		this.climaIdeal = climaIdeal;
	}

	// MÉTODOS GETTERS Y SETTERS;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltoDelTallo() {
		return altoDelTallo;
	}

	public void setAltoDelTallo(double altoDelTallo) {
		this.altoDelTallo = altoDelTallo;
	}

	public boolean getTieneHojas() {
		return tieneHojas;
	}

	public void setTieneHojas(boolean tieneHojas) {
		this.tieneHojas = tieneHojas;
	}

	public String getClimaIdeal() {
		return climaIdeal;
	}

	public void setClimaIdeal(String climaIdeal) {
		this.climaIdeal = climaIdeal;
	}

	// MÉTODOS PROPIOS DE LA CLASE Planta;
	protected abstract void mostrarMensaje();

}
