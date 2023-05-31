/**
 * 
 */
package fin.coop1504.tallerjava.entidades;

import fin.coop1504.tallerjava.interfaces.ConsultarDatos;

/**
 * @author wemacias
 *
 */
public class PersonaNatural extends Persona implements ConsultarDatos {
	protected String tipoIdentificacion;

	public PersonaNatural(String nombre, String identificacion, String tipoIdentificacion) {
		super(nombre, identificacion);
		this.tipoIdentificacion = tipoIdentificacion;
	}

	@Override
	public String toString() {
		return super.toString() + "Tipo Identificacion: " + tipoIdentificacion;
	}

	@Override
	public Persona consulta(String ident) {
		// TODO Auto-generated method stub
		System.out.println("Consultando "+ ident);
		return new PersonaNatural(nombre, this.identificacion, tipoIdentificacion);
	}
	
	
}
