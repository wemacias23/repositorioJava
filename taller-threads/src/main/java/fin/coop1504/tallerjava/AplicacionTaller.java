/**
 * 
 */
package fin.coop1504.tallerjava;

import fin.coop1504.tallerjava.servicios.Ciclista;

/**
 * @author wemacias
 *
 */
public class AplicacionTaller {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread hilo1 = new Thread(new Runnable() {

			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 100; i++) {
					System.out.println("Soy el hilo 1");
				}
			}
		});

		Thread hilo2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Ejecucion del hilo 2");
			}
		});
		hilo1.start();
		hilo2.start();
		System.out.println("Ejecucion del hilo Principal");
//		Ciclista ciclista1 = new Ciclista("Karen", "001");
//		Ciclista ciclista2 = new Ciclista("Daniel", "002");
//		Ciclista ciclista3 = new Ciclista("Aurelio", "003");
//		Ciclista ciclista4 = new Ciclista("Jose", "004");
//		System.out.println("Hilo1");
//		ciclista1.start();
//		System.out.println("Hilo2");
//		ciclista2.start();
//		System.out.println("Hilo3");
//		ciclista3.start();
//		System.out.println("Hilo4");
//		ciclista4.start();
//		System.out.println("Hilo Principal Termino");

	}

}
