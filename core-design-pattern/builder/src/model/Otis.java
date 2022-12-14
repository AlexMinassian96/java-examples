package model;

public class Otis {
	private int gold;
	final private int crystal;
	
	private Otis(OtisBuilder builder) {
		this.gold = builder.gold;
		this.crystal = builder.crystal;
	} 

	public static class OtisBuilder {
		private int gold;
		final private int crystal;
		
		public OtisBuilder(int crystal) {
			this.crystal = crystal;
		}
		public OtisBuilder setGold(int gold) {
			this.gold = gold;
			return this;
		}
		
		public Otis build() {
			Otis otis = new Otis(this);
			return otis;
		}
	}
};
