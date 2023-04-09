package com.darigan.lil.learningspring.business;

import com.darigan.lil.learningspring.data.Pokemon;
import com.darigan.lil.learningspring.data.PokemonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
@AllArgsConstructor
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public List<Pokemon> getPokemon() {
        return (List<Pokemon>) pokemonRepository.findAll();
    }
}
