/**
 * 
 */
package fin.coop1504.tallerjava;

import fin.coop1504.tallerjava.entidades.AireAcondicionado;
import fin.coop1504.tallerjava.entidades.ControlUniversal;
import fin.coop1504.tallerjava.entidades.Televisor;
import fin.coop1504.tallerjava.interfaces.ReferenciaDispositivo;

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
		Televisor televisor = new Televisor("TV-SALA");
		AireAcondicionado aireCuarto = new AireAcondicionado("AIRE-CUARTO");
		ControlUniversal.encenderDispositivo(televisor);
		ControlUniversal.encenderDispositivo(aireCuarto);
		
		ControlUniversal.encenderDispositivo(
			new ReferenciaDispositivo() {
				
				@Override
				public void encender() {
					// TODO Auto-generated method stub
					System.out.println("Encender 2");
				}
				
				@Override
				public void apagar() {
					// TODO Auto-generated method stub
					System.out.println("Apagar 2");
				}
			});
		
	}

}
