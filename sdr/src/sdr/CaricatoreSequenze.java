package sdr;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import domain.NumeroComplesso;
import domain.Segnale;

public class CaricatoreSequenze {

	public CaricatoreSequenze(){}

	public Segnale caricaSegnale(String path, double snr) throws FileNotFoundException{
		File f = new File(path);
		Scanner scan = new Scanner(f);
		Segnale segnale = new Segnale();

		while(scan.hasNext()){
			NumeroComplesso n = new NumeroComplesso();
			n.setParteReale(Double.parseDouble(scan.next()));
			n.setParteImmaginaria(Double.parseDouble(scan.next()));
			segnale.aggiungiCampione(n);
		}
		scan.close();
		return segnale;
	}
}