package EjercicioPlanta.logica;

public class Arbusto extends Planta {
	// ESTADO: ATRIBUTOS;
	private double anchoArbusto;
	private boolean esDomestico;
	private String variedadArbusto;
	private String colorDeHojas;
	private boolean sePodaONo;

	// COMPORTAMIENTO: FUNCIONES, PROCEDIMIENTO Y MÉTODOS;
	// MÉTODO CONSTRUCTOR POR DEFECTO(VACIO);
	public Arbusto() {
		super();
	}

	// MÉTODO CONSTRUCTOR CON PARÁMETROS;
	public Arbusto(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, double anchoArbusto,
			boolean esDomestico, String variedadArbusto, String colorDeHojas, boolean sePodaONo) {
		super(nombre, altoDelTallo, tieneHojas, climaIdeal);
		this.anchoArbusto = anchoArbusto;
		this.esDomestico = esDomestico;
		this.variedadArbusto = variedadArbusto;
		this.colorDeHojas = colorDeHojas;
		this.sePodaONo = sePodaONo;
	}

	// MÉTODOS GETTERS Y SETTERS;
	public double getAnchoArbusto() {
		return anchoArbusto;
	}

	public void setAnchoArbusto(double anchoArbusto) {
		this.anchoArbusto = anchoArbusto;
	}

	public boolean getEsDomestico() {
		return esDomestico;
	}

	public void setEsDomestico(boolean esDomestico) {
		this.esDomestico = esDomestico;
	}

	public String getVariedadArbusto() {
		return variedadArbusto;
	}

	public void setVariedadArbusto(String variedadArbusto) {
		this.variedadArbusto = variedadArbusto;
	}

	public String getColorDeHojas() {
		return colorDeHojas;
	}

	public void setColorDeHojas(String colorDeHojas) {
		this.colorDeHojas = colorDeHojas;
	}

	public boolean getSePodaONo() {
		return sePodaONo;
	}

	public void setSePodaONo(boolean sePodaONo) {
		this.sePodaONo = sePodaONo;
	}

	// MÉTODOS PROPIOS DE LA CLASE Arbusto;

	// MÉTODOS HEREDADOS DE LA SUPERCLASE Planta;
	@Override
	public void mostrarMensaje() {
		System.out.println("Hola soy un arbusto...");
	}
}
