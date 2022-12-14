package main;

import model.Otis;

public class main {

	public static void main(String[] args) {
		Otis otis1 = new Otis.OtisBuilder(150).setGold(800).build();
		Otis otis2 = new Otis.OtisBuilder(150).setGold(800).build();

		System.out.println(otis1);
		System.out.println(otis2);
	}

}
