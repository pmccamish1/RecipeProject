package guru.springframework.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
@Service
@Primary
public class RecipeServiceImpl implements RecipeService {
	private RecipeRepository recipeRepository;
	

	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}

	@Override
	public Set<Recipe> getRecipes() {
		Set<Recipe> recipeSet = new HashSet<Recipe>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		return recipeSet;
	}

}
