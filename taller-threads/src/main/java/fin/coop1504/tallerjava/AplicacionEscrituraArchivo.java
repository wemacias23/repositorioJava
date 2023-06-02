/**
 * 
 */
package fin.coop1504.tallerjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.Buffer;

/**
 * @author wemacias
 *
 */
public class AplicacionEscrituraArchivo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintWriter formateador = null;
		try {
			// - FileWriter archivo = new FileWriter("C:/cursoJavaCoop1504/Archivo2.txt",true);
			// - BufferedWriter escritor = new BufferedWriter(archivo);
			//escritor.write("Datos");
			// - formateador = new PrintWriter(escritor);
			// - formateador = new PrintWriter(archivo);
			
			
			formateador = new PrintWriter(new FileWriter("C:/cursoJavaCoop1504/Archivo2.txt",true));
			formateador.println("Ingreso por consola");
			formateador.println("Ingreso por consola 4");
			
			formateador.flush();
			
			
			FileOutputStream salidaArchivo = new FileOutputStream("C:/cursoJavaCoop1504/Archivo3.txt",true);
			PrintStream salida = new PrintStream(salidaArchivo);
			System.setOut(salida);
			System.out.println("Escritura por consola");
			PrintStream archivoError = new PrintStream("C:/cursoJavaCoop1504/error.txt");
			System.setErr(archivoError);
			System.err.println("Esto es un error");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(formateador!=null)
				formateador.close();
		}
		// TODO Auto-generated method stub
		
	}

}
