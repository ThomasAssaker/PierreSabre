package personnages;

public class Commercant extends Humain {
	public Commercant (String nom){
		super(nom, "the", 20);
	}
	public int seFaireExtorquer() {
		int sommeExtorquee = getArgent();
		perdreArgent(sommeExtorquee);
		parler(sommeExtorquee +" sous ! Je n'ai plus rien ! Le monde est trop injuste...");
		return sommeExtorquee;
	}
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie , genereux donateur!");
	} 
}
	 
		
	


