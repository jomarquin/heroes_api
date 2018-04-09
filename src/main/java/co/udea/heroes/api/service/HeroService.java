package co.udea.heroes.api.service;

import java.util.List;
import java.util.Optional;

import co.udea.heroes.api.domain.Hero;

public interface HeroService {
	
	public List<Hero> getHeroes();

	public Optional<Hero> getHero(int id);

	public Optional<Hero> searchHeroes(String term);
	
	public Hero searchHeroesUpdate(String term);
	
	public Hero updateHero(Hero hero);
	
	public Hero addHero(Hero hero);
	
	public void deleteHero(Hero hero);

	

	

	


}
