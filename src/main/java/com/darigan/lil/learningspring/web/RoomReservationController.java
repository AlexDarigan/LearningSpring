package com.darigan.lil.learningspring.web;

import com.darigan.lil.learningspring.business.ReservationService;
import com.darigan.lil.learningspring.business.RoomReservation;
import com.darigan.lil.learningspring.util.DateUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
@AllArgsConstructor
public class RoomReservationController {
    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    @GetMapping()
    public String getReservations(@RequestParam(value="date", required = false) String dateString, Model model) {
        Date date = dateUtils.createDateFromDateString(dateString);
        List<RoomReservation> roomReservations = reservationService.getRoomReservationsForDate(date);
        model.addAttribute("roomReservations", roomReservations);
        return "roomres";
    }

}
