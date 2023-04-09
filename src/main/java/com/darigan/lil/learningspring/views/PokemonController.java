package com.darigan.lil.learningspring.views;

import com.darigan.lil.learningspring.services.PokemonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pokemon")
@AllArgsConstructor
public class PokemonController {

    private final PokemonService pokemonService;

    @GetMapping()
    public String getPokemon(Model model) {
        model.addAttribute("pkmns", pokemonService.getPokemon());
        return "pokedex";
    }
}
