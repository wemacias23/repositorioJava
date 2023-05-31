/**
 * 
 */
package fin.coop1504.tallerjava.entidades;

import fin.coop1504.tallerjava.interfaces.ConsultarDatos;

/**
 * @author wemacias
 *
 */
public class PersonaJuridica extends Persona implements ConsultarDatos{
	private DocumentoSRI ruc;

	public PersonaJuridica(String nombre, String identificacion, DocumentoSRI documentoSRI) {
		super(nombre, identificacion);
		ruc = documentoSRI;
	}

	public DocumentoSRI getRuc() {
		return ruc;
	}

	@Override
	public String toString() {
		return super.toString() + "\n DocumentoSRI: " + ruc;

	}

	@Override
	public Persona consulta(String identi) {
		System.out.println("Imprimo "+ identi); 
		return new PersonaJuridica(nombre, identificacion, ruc);
	}
	
	
}
