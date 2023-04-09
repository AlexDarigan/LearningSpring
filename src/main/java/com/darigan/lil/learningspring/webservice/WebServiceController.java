package com.darigan.lil.learningspring.webservice;

import com.darigan.lil.learningspring.business.PokemonService;
import com.darigan.lil.learningspring.data.Pokemon;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class WebServiceController {

    private final PokemonService pokemonService;


    @GetMapping("/pokemon")
    public List<Pokemon> getPokemon() { return this.pokemonService.getPokemon(); }

    @PostMapping("/pokemon")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPokemon(@RequestBody Pokemon pokemon) {
        System.out.println(pokemon);
        pokemonService.addPokemon(pokemon);
    }
}
