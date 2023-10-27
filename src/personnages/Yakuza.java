package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation ;
	public Yakuza (String nom, String boissonFavorite, int getArgent, String clan) {
		super(nom,boissonFavorite, argent);
		this.clan =clan;
		this.reputation = 0 ;
		
	}

}
