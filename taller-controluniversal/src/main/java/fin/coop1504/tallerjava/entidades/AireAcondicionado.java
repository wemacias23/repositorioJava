package fin.coop1504.tallerjava.entidades;

import fin.coop1504.tallerjava.interfaces.ReferenciaDispositivo;

public class AireAcondicionado implements ReferenciaDispositivo {

	private String nombre;

	public AireAcondicionado(String nom) {
		nombre = nom;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encender AC " + nombre);
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagar AC " + nombre);
	}

}
