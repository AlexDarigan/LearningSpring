package com.darigan.lil.learningspring.controllers;

import com.darigan.lil.learningspring.services.PokemonService;
import com.darigan.lil.learningspring.models.Pokemon;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("v1/")
@AllArgsConstructor
public class PokemonController {

    private final PokemonService pokemonService;

    @GetMapping("/pokemon")
    public List<Pokemon> getPokemon() { return this.pokemonService.getPokemon(); }

    @PostMapping("/pokemon")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPokemon(@RequestBody Pokemon pokemon) { pokemonService.addPokemon(pokemon); }
}
