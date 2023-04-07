package com.darigan.lil.learningspring.business;

import com.darigan.lil.learningspring.data.Guest;
import com.darigan.lil.learningspring.data.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    private final GuestRepository guestRepository;

    @Autowired
    public GuestService(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    public List<Guest> getAllGuests() {
        List<Guest> guests = (List<Guest>) this.guestRepository.findAll();
        return guests;
    }
}
