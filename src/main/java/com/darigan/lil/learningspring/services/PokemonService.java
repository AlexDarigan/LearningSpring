package com.darigan.lil.learningspring.services;

import com.darigan.lil.learningspring.models.Pokemon;
import com.darigan.lil.learningspring.repositories.PokemonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public List<Pokemon> getPokemon() {
        return (List<Pokemon>) pokemonRepository.findAll();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }
}
