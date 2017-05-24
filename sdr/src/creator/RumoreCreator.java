package creator;

import java.util.Random;

import domain.NumeroComplesso;
import domain.Segnale;

public class RumoreCreator {
	
	public Segnale creaRumore(double SNR){
		
		double potenzaSegnale = 1.0/(Math.pow(10.0, SNR/10.0));
		Segnale rumore = new Segnale();
		Random random = new Random();
		
		for (int i=0; i<1000; i++){
			NumeroComplesso n = new NumeroComplesso();
			n.setParteReale(random.nextGaussian()*(Math.sqrt(potenzaSegnale/2.0)));
			n.setParteImmaginaria(random.nextGaussian()*(Math.sqrt(potenzaSegnale/2.0)));
			rumore.aggiungiCampione(n);
		}
		return rumore;
	}
	

}
