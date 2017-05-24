package domain;

import java.util.ArrayList;
import java.util.List;

public class Segnale {
	private List<NumeroComplesso> campioni;
	private double SNR;
	
	public Segnale(){
		this.campioni = new ArrayList<>();
	}
	
	public void aggiungiCampione(NumeroComplesso n){
		campioni.add(n);
	}
	
	public List<NumeroComplesso> getCampioni() {  
		return campioni;
	}
	public void setCampioni(List<NumeroComplesso> campioni) {
		this.campioni = campioni;
	}
	public double getSNR() {
		return SNR;
	}
	public void setSNR(double sNR) {
		SNR = sNR;
	}
	
	public double getPotenzaSegnale(){
		double potenza=0;
		
		for(NumeroComplesso nc : this.campioni){
			double reale = Math.pow(nc.getParteReale(), 2);
			double im = Math.pow(nc.getParteImmaginaria(), 2);
			double moduloQuadro = reale+im;
			potenza += moduloQuadro;
			//System.out.println(reale);
		}
		return potenza/1000.0;
	}
	
	
	
}
