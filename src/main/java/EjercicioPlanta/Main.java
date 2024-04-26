package EjercicioPlanta;

import EjercicioPlanta.logica.Arbol;
import EjercicioPlanta.logica.Flor;
import EjercicioPlanta.logica.Arbusto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arbol arbol = new Arbol();
		Flor flor = new Flor();
		Arbusto arbusto = new Arbusto();

		arbol.setNombre("Acacia");
		arbol.setAltoDelTallo(25.0);
		arbol.setTieneHojas(true);
		arbol.setClimaIdeal("Primavera");

		arbol.setVariedad("Acacia Negra");
		arbol.setTipoDeTronco("Grueso");
		arbol.setRadioDeTronco(5.00);
		arbol.setColor("Marrón");
		arbol.setTipoDeHojas("Finas");

		System.out.println("Nombre: " + arbol.getNombre());
		System.out.println("Alto del tallo: " + arbol.getAltoDelTallo());
		System.out.println("Tiene Hojas: " + arbol.getTieneHojas());
		System.out.println("Clima ideal: " + arbol.getClimaIdeal());
		System.out.println("Variedad: " + arbol.getVariedad());
		System.out.println("Radio De Tronco: " + arbol.getRadioDeTronco());
		System.out.println("Color: " + arbol.getColor());
		System.out.println("Tipo de hojas: " + arbol.getTipoDeHojas());

		arbol.mostrarMensaje();

		System.out.println();

		flor.setNombre("Lavanda");
		flor.setAltoDelTallo(1.50);
		flor.setTieneHojas(true);
		flor.setClimaIdeal("Primavera");

		flor.setColorDePetalos("Violeta");
		flor.setCantidadPromedioDePetalos(4.5);
		flor.setVariedadDeFlor("Lavanda Flor");
		flor.setColorDelPistilo("Violeta");
		flor.setEstacionQueFlorece("Primavera");

		System.out.println("Nombre: " + flor.getNombre());
		System.out.println("Alto del tallo: " + flor.getAltoDelTallo());
		System.out.println("Tiene Hojas: " + flor.getTieneHojas());
		System.out.println("Clima ideal: " + flor.getClimaIdeal());
		System.out.println("Color de los petalos: " + flor.getColorDePetalos());
		System.out.println("Cantidad Promedio de petalos: " + flor.getCantidadPromedioDePetalos());
		System.out.println("Variedad de flor: " + flor.getVariedadDeFlor());
		System.out.println("Color del pistilo: " + flor.getColorDelPistilo());
		System.out.println("Estación que florece: " + flor.getEstacionQueFlorece());

		flor.mostrarMensaje();

		System.out.println();

		arbusto.setNombre("Aloe Vera");
		arbusto.setAltoDelTallo(0.50);
		arbusto.setTieneHojas(true);
		arbusto.setClimaIdeal("Otoño");

		arbusto.setAnchoArbusto(0.20);
		arbusto.setEsDomestico(true);
		arbusto.setVariedadArbusto("Aloe Vera Hoja Ancha");
		arbusto.setColorDeHojas("Verde");
		arbusto.setSePodaONo(true);

		System.out.println("Nombre: " + arbusto.getNombre());
		System.out.println("Alto del tallo: " + arbusto.getAltoDelTallo());
		System.out.println("Tiene Hojas: " + arbusto.getTieneHojas());
		System.out.println("Clima ideal: " + arbusto.getClimaIdeal());
		System.out.println("Ancho arbusto: " + arbusto.getAnchoArbusto());
		System.out.println("¿Es doméstico?: " + arbusto.getEsDomestico());
		System.out.println("Variedad de arbusto: " + arbusto.getVariedadArbusto());
		System.out.println("Color de hojas: " + arbusto.getColorDeHojas());
		System.out.println("¿Se poda o no?: " + arbusto.getSePodaONo());

		arbusto.mostrarMensaje();

	}

}
