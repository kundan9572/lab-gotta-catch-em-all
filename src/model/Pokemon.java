package model;

public class Pokemon {

	String pokemonName;
	int pokemonNumber;
	
	

	public String getPokemonName() {
		return pokemonName;
	}
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	public int getPokemonNumber() {
		return pokemonNumber;
	}
	public void setPokemonNumber(int pokemonNumber) {
		this.pokemonNumber = pokemonNumber;
	}
	

	public Pokemon(String pokemonName, int pokemonNumber) {
		super();
		this.pokemonName = pokemonName;
		this.pokemonNumber = pokemonNumber;
	}
	

	
}


