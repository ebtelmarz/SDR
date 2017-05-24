package detector;

import java.util.List;

import domain.NumeroComplesso;
import domain.Segnale;
import domain.Soglia;

public class DetectorSegnalePrimario {

	public DetectorSegnalePrimario(){
	}
	
	// metodo
	public double cercaSegnalePrimario(Segnale s, Soglia soglia){
		
		List<NumeroComplesso> campioni =s.getCampioni();
		int cont=0;
		int index=0;
		
		for(int i=0; i<1000; i++){
			Segnale segnale = new Segnale();
			segnale.setCampioni(campioni.subList(index, index+1000));
			double potenza = segnale.getPotenzaSegnale();
			if(potenza>soglia.getPotenza())
				cont++;
			index+=1000;
		}
		
		return (cont*100/1000);				
		}
	}

