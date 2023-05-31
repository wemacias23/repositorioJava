/**
 * 
 */
package fin.coop1504.tallerjava.entidades;

/**
 * @author wemacias
 *
 */
public class Persona {
	// private solo para la clase
	// public no se necesita un metodo de acceso
	// protected
	// package
   
	protected String nombre;
	protected String identificacion;
	
	/*
	 * public Persona() { nombre = ""; identificacion = ""; tipoIdentificacion = "";
	 * }
	 * 
	 * public Persona(String pNombre, String pIdentificacion, String
	 * pTipoIdentificacion) { this.nombre = pNombre; this.identificacion =
	 * pIdentificacion; this.tipoIdentificacion = pTipoIdentificacion; }
	 */

	public Persona() {
		super();
		System.out.println("Usando el constructor sin parametros");
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String identificacion) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		//this.tipoIdentificacion = tipoIdentificacion;
		System.out.println("Usando el constructor con parametros");
	}

	public void imprimir() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Identificacion: " + this.identificacion);
		//System.out.println("Tipo Identificacion: " + this.tipoIdentificacion);
	}
	@Override
    public String toString() {
        return "Nombre: " + nombre +
               ", Identificación: " + identificacion;
               //", Tipo Identificacion " + tipoIdentificacion;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	
}
