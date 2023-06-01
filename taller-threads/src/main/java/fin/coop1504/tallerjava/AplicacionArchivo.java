/**
 * 
 */
package fin.coop1504.tallerjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wemacias
 *
 */
public class AplicacionArchivo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File archivo = new File("C:/cursoJavaCoop1504/Archivo.txt");
		System.out.println("Se puede Leer " + archivo.canRead());
		System.out.println("Se puede Escribir " + archivo.canWrite());
		System.out.println("Se archivo existe " + archivo.exists());
		System.out.println("El path es un directorio " + archivo.isDirectory());
		System.out.println("Ruta Absoluta " + archivo.getAbsolutePath());
		System.out.println("Nombre del Archivo " + archivo.getName());
		System.out.println("Tamanio del Archivo " + archivo.getTotalSpace());

		BufferedReader recorreArchivo = null;
		try {
			FileReader lector = new FileReader(archivo);
			recorreArchivo = new BufferedReader(lector);
			String linea = recorreArchivo.readLine();
//			System.out.println("Linea 1 del archivo: " + linea);
//			linea = recorreArchivo.readLine();
//			System.out.println("Linea 2 del archivo: " + linea);
			while (linea != null) {
				System.out.println(linea);
				linea = recorreArchivo.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.err.println("Error al abrir el archivo");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println("Error recorrer el archivo");
			e.printStackTrace();
		} finally {
			if (recorreArchivo != null)
				recorreArchivo.close();
		}

	}

}
