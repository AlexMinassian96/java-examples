package model;

public class Otis {
	private int gold;
	private int crystal;
	static private Otis INSTANCE = null;
	
	private Otis(int gold, int crystal) {
		this.gold = gold;
		this.crystal = crystal;
	} 
	static public Otis getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Otis(800, 150);
		}
		return INSTANCE;
	}
};
