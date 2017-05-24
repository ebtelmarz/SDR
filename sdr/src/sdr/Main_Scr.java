package sdr;

import java.io.FileNotFoundException;

import creator.SogliaGenerator;
import detector.DetectorSegnalePrimario;
import domain.Segnale;
import domain.Soglia;

public class Main_Scr {

	public static void main (String[] args) throws FileNotFoundException{
		SogliaGenerator sg = new SogliaGenerator();
		CaricatoreSequenze caricatore = new CaricatoreSequenze();
		
		Soglia soglia1 = sg.generaSoglia(-13.0);
		Soglia soglia2 = sg.generaSoglia(-8.0);
		Soglia soglia3 = sg.generaSoglia(-3.0);
		Soglia soglia4 = sg.generaSoglia(2.0);
		
		
		DetectorSegnalePrimario detector = new DetectorSegnalePrimario();
		
		Segnale s1 = caricatore.caricaSegnale("src/Sequenza_1/output_1.dat", -3.0);
		Segnale s2 = caricatore.caricaSegnale("src/Sequenza_1/output_2.dat", 2.0);
		Segnale s3 = caricatore.caricaSegnale("src/Sequenza_1/output_3.dat", -8.0);
		Segnale s4 = caricatore.caricaSegnale("src/Sequenza_1/output_4.dat", -13.0);

		System.out.println(detector.cercaSegnalePrimario(s1, soglia3)+"%");
		System.out.println(detector.cercaSegnalePrimario(s2, soglia4)+"%");
		System.out.println(detector.cercaSegnalePrimario(s3, soglia2)+"%");
		System.out.println(detector.cercaSegnalePrimario(s4, soglia1)+"%");
		
		Segnale s5 = caricatore.caricaSegnale("src/Sequenza_2/output_1.dat", -3.0);
		Segnale s6 = caricatore.caricaSegnale("src/Sequenza_2/output_2.dat", 2.0);
		Segnale s7 = caricatore.caricaSegnale("src/Sequenza_2/output_3.dat", -8.0);
		Segnale s8 = caricatore.caricaSegnale("src/Sequenza_2/output_4.dat", -13.0);
		
		System.out.println(detector.cercaSegnalePrimario(s5, soglia3)+"%");
		System.out.println(detector.cercaSegnalePrimario(s6, soglia4)+"%");
		System.out.println(detector.cercaSegnalePrimario(s7, soglia2)+"%");
		System.out.println(detector.cercaSegnalePrimario(s8, soglia1)+"%");
		
		Segnale s9 = caricatore.caricaSegnale("src/Sequenza_3/output_1.dat", -3.0);
		Segnale s10 = caricatore.caricaSegnale("src/Sequenza_3/output_2.dat", 2.0);
		Segnale s11 = caricatore.caricaSegnale("src/Sequenza_3/output_3.dat", -8.0);
		Segnale s12 = caricatore.caricaSegnale("src/Sequenza_3/output_4.dat", -13.0);
		
		System.out.println(detector.cercaSegnalePrimario(s9, soglia3)+"%");
		System.out.println(detector.cercaSegnalePrimario(s10, soglia4)+"%");
		System.out.println(detector.cercaSegnalePrimario(s11, soglia2)+"%");
		System.out.println(detector.cercaSegnalePrimario(s12, soglia1)+"%");
		
		
//		double prob = detector.cercaSegnalePrimario(s, soglia);
//		System.out.println(prob);
		
	}
}
