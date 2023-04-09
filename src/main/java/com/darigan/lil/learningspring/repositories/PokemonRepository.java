package com.darigan.lil.learningspring.repositories;

import com.darigan.lil.learningspring.models.Pokemon;
import org.springframework.data.repository.CrudRepository;

public interface PokemonRepository extends CrudRepository<Pokemon, Integer> {

}
