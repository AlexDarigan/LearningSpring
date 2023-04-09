package com.darigan.lil.learningspring.webservice;

import com.darigan.lil.learningspring.business.GuestService;
import com.darigan.lil.learningspring.business.PokemonService;
import com.darigan.lil.learningspring.business.ReservationService;
import com.darigan.lil.learningspring.business.RoomReservation;
import com.darigan.lil.learningspring.data.Guest;
import com.darigan.lil.learningspring.data.Pokemon;
import com.darigan.lil.learningspring.data.Room;
import com.darigan.lil.learningspring.util.DateUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class WebServiceController {

    private final DateUtils dateUtils;
    private final ReservationService reservationService;
    private final GuestService guestService;

    private final PokemonService pokemonService;

    @GetMapping("/reservations")
    public List<RoomReservation> getReservations(@RequestParam(value = "date", required = false) String dateString) {
        Date date = dateUtils.createDateFromDateString(dateString);
        return this.reservationService.getRoomReservationsForDate(date);
    }

    // PostMapping Pokemon(body), insert pokemon
    // GetMapping with filters (for every value, if not null, filter)

    @GetMapping("/pokemon")
    public List<Pokemon> getPokemon() { return this.pokemonService.getPokemon(); }

    @PostMapping("/pokemon")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPokemon(@RequestBody Pokemon pokemon) {
        System.out.println(pokemon);
        pokemonService.addPokemon(pokemon);
    }

    @GetMapping("/rooms")
    public List<Room> getRooms() {
        return this.reservationService.getRooms();
    }

    @GetMapping("/guests")
    public List<Guest> getGuests() {
        return guestService.getAllGuests();
    }

    @PostMapping("/guests")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuest(@RequestBody Guest guest) {
        System.out.println(guest);
        guestService.addGuest(guest);
    }
}
