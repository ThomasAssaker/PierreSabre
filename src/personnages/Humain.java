package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom=nom;
		this.boissonFavorite=boissonFavorite;
		this.argent=argent;
	}
	public String getnom() {
		return nom;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + "  ! GLOUPS !");
	}
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			argent -= prix;
			parler("J'ai achete un(e)" + bien + " a " + prix + "sous.");
		}
		else {
			parler("Je n'ai pas assez d'argent pour acheter un(e) " + bien + ".");
		}
	}
	public void gagnerArgent(int gain) {
		argent += gain;
		parler("J'ai gagne " + gain + "sous ! ");
	}
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	public void perdreArgent(int perte) {
		argent -= perte;
		parler("J'ai perdu " + nom +") -" );
	}
	public int getArgent() {
		return argent;
	}



}
