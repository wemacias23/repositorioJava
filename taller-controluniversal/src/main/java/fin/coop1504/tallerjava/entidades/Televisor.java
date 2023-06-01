package fin.coop1504.tallerjava.entidades;

import fin.coop1504.tallerjava.interfaces.ReferenciaDispositivo;

public class Televisor implements ReferenciaDispositivo {

	private String nombre;

	public Televisor(String nom) {
		nombre = nom;
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encender TV " + nombre);
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagar TV " + nombre);
	}

}
