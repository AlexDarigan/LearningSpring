package com.darigan.lil.learningspring.web;

import com.darigan.lil.learningspring.business.GuestService;
import com.darigan.lil.learningspring.data.Guest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/guests")
@AllArgsConstructor
public class GuestController {
    private final GuestService guestService;

    @GetMapping()
    public String getGuests(Model model) {
        List<Guest> guests = guestService.getAllGuests();
        model.addAttribute("guests", guests);
        return "guestlist";
    }
}
