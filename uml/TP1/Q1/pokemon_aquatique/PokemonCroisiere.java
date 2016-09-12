package uml.pokemon_aquatique;

public final class PokemonCroisiere extends PokemonAquatique
{
	public PokemonCroisiere(String p_nom, float p_poids, int p_nombre_nageoires)
	{
		super(p_nom, p_poids, p_nombre_nageoires);
	}
	
	public float vitesse()
	{
		return super.vitesse() / 2;
	}
}
