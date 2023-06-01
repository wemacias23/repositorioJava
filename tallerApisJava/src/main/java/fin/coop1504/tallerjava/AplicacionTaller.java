/**
 * 
 */
package fin.coop1504.tallerjava;

import java.util.ArrayList;
import java.util.Vector;

import fin.coop1504.tallerjava.excepciones.ExcepcionValidacion;

/**
 * @author wemacias
 *
 */
public class AplicacionTaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String cadena = "Hola Mundo";
		System.out.println(cadena.concat(" Tierra"));
		System.out.println(cadena);
		// SE DEBE UTILIZAR PARA CUANDO SE TRATEN CADENAS
		StringBuffer cadenaEspecial = new StringBuffer("Hola Mundo");
		cadenaEspecial.append(" Tierra");
		System.out.println(cadenaEspecial.toString());
		// PARA INVERTIR LA CADENA
		for (int i = cadena.length() - 1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}
		// PARA MOSTRAR UNA LISTA
		for (char a : cadena.toCharArray()) {
			System.out.println(a);
		}
		// PARA INVERTIR LA CADENA
		System.out.print(cadenaEspecial.reverse());

		String[] cadenas = new String[4];
		String[] cadena2 = { "Uno", "Dos", "Tres" };
		cadenas[0] = "\nKaren";
		cadenas[1] = "Yo";
		cadenas[2] = "Tu";
		cadenas[3] = "El";

		for (String cad : cadenas) {
			System.out.println(cad);
		}

		for (String cad : cadena2) {
			System.out.println(cad);
		}

		Vector<String> vector = new Vector<>();
		vector.add("Cadena Uno");
		vector.add("Cadena Dos");
		vector.add("Cadena Tres");
		System.out.println(vector.size());

		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		System.out.println(lista.size());

		// PARA LEER CADA ELEMENTO
		lista.forEach(elelmento -> {
			if (elelmento.equals(20))
				System.out.println(elelmento + 20);
			else
				System.out.println(elelmento);
		});
		// ESTO IMPLICA MEMORIA XQ CREA NUEVO OBJETO
		String cadenaVector = vector.get(0);
		System.out.println(cadenaVector);
		// ENVIA EL MISMO OBJETO
		Integer numeroArrayList = lista.get(0);
		System.out.println(numeroArrayList);*/
		
		validarDatos("12345");
		try {
			validarDatosEspecificos("");
		} catch (ExcepcionValidacion e) {
			// TODO Auto-generated catch block
			System.err.println("Codigo Error: "+e.getCodigo()+" Mensaje: "+e.getMensajeTecnico());
			e.printStackTrace();
			
		}finally {
			System.out.println("Error");
		}

	}

	public static void validarDatos(String anios) {
		Integer edad = Integer.parseInt(anios);
		System.out.println(edad);

	}
public static void validarDatosEspecificos(String dato) throws ExcepcionValidacion {
	
	if(dato == null || dato.isEmpty()) {
		/*ExcepcionValidacion error = new ExcepcionValidacion("001","Error al validar dato");
		throw error;*/
		throw new ExcepcionValidacion("001","Error al validar dato"); 
		
	}
}
}
