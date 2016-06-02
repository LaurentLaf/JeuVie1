package jeuvie;

public class Bestiole {
	
	//Constantes classe Bestiole
	public static final String VIVANTE = "verte";
	public static final String MORTE = "rouge";
	public static final String VIRTUELLE = "noire";
	//Variables classe Bestiole
	private static int compteur = 0;
	//Constante
	private final int numero;
	//Variable
	private String couleur;
	
	//Constructeur
	public Bestiole(String couleur) {
		this.couleur = couleur;
		this.numero = compteur++;
	}
	
	//Méthodes de la classe
		public boolean isVivante() {
			return this.couleur.equals(Bestiole.VIVANTE);
		}
		
	//Getters et setters
	/*
	 * Pour Couleur
	 */
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	/*
	 * Pour numéro
	 */
	public int getNumero() {
		return numero;
	}
	/*
	 * Pour NbBestioles
	 */
	public static int getNbBestioles() {
		return compteur;
	}

	
	@Override
	public String toString() {
		String message = "Bestiole "+this.numero;
		if (this.isVivante()) {
			message += " (vivante)";
		}
		return message;
	}
}
