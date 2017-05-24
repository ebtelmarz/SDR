package creator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domain.Segnale;
import domain.Soglia;

public class SogliaGenerator {
	
	public Soglia generaSoglia(double SNR){
		
		List<Double> potenze = new ArrayList<>();
		Segnale rumore = new Segnale();
		RumoreCreator rc = new RumoreCreator();
		
		for(int i=0; i<1000; i++){
			rumore = rc.creaRumore(SNR);
			potenze.add(rumore.getPotenzaSegnale());
		}
		Collections.sort(potenze);
		Soglia soglia = new Soglia();
		double valoreSoglia= potenze.get(989);
		soglia.setPfa(0.01);
		soglia.setPotenza(valoreSoglia);
		soglia.setSNR(SNR);
		return soglia;
	}


}
