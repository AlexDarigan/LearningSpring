package com.darigan.lil.learningspring.business;

import com.darigan.lil.learningspring.data.Guest;
import com.darigan.lil.learningspring.data.GuestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GuestService {

    private final GuestRepository guestRepository;

    public List<Guest> getAllGuests() {
        List<Guest> guests = (List<Guest>) this.guestRepository.findAll();
        return guests;
    }

    public void addGuest(Guest guest) {
        this.guestRepository.save(guest);
    }
}
