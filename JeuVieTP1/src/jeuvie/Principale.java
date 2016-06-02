package jeuvie;

import controleur.Controleur;

public class Principale {

	public static void main(String[] args) {

		Bestiole bestiole = new Bestiole("verte");
		System.out.println(bestiole);
		Bestiole bestiole1 = new Bestiole("noire");
		System.out.println(bestiole1);
		Bestiole bestiole2 = new Bestiole("rouge");
		System.out.println(bestiole2);
		
		Controleur ctrl = new Controleur();
		ctrl.setBestiole(bestiole, 4, 10);
		ctrl.setBestiole(bestiole1, 40, 20);
		ctrl.setBestiole(bestiole2, 80, 30);
	}
}
