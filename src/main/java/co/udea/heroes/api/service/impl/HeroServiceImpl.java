package co.udea.heroes.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.udea.heroes.api.domain.Hero;
import co.udea.heroes.api.repository.HeroRepository;
import co.udea.heroes.api.service.HeroService;

@Service
@Qualifier("HeroServiceImpl")
public class HeroServiceImpl implements HeroService {
	
	private HeroRepository heroRepository;
	
	public HeroServiceImpl(HeroRepository heroRepository){
		this.heroRepository = heroRepository; 
	}
	
	@Override
	public List<Hero> getHeroes() {
		return heroRepository.findAll();
	}

	@Override
	public Optional<Hero> getHero(int id) {
		return heroRepository.findById(id);
	}

	
	@Override
	public Optional<Hero> searchHeroes(String term) {
		return heroRepository.findByName(term);
	}
	
	@Override
	public Hero searchHeroesUpdate(String term) {
		return heroRepository.findOne(term);
	}
	
	@Override
	public Hero updateHero(Hero hero) {
		return heroRepository.save(hero);
	}
	
	@Override
	public Hero addHero(Hero hero) {
		return heroRepository.save(hero);
	}
	
	@Override
	public void deleteHero(Hero hero) {
		heroRepository.delete(hero);
	}

	


}

