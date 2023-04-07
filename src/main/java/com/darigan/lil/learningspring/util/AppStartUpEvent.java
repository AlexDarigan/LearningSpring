package com.darigan.lil.learningspring.util;

import com.darigan.lil.learningspring.data.*;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@AllArgsConstructor
public class AppStartUpEvent implements ApplicationListener<ApplicationStartedEvent> {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;
    
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        Iterable<Room> rooms = roomRepository.findAll();
        rooms.forEach(System.out::println);
        Iterable<Guest> guests = guestRepository.findAll();
        guests.forEach(System.out::println);
        Iterable<Reservation> reservations = reservationRepository.findAll();
        reservations.forEach(System.out::println);
        Date date = Date.valueOf("2022-01-01");
        Iterable<Reservation> onDate = reservationRepository.findAllByResDate(date);
        onDate.forEach(System.out::println);
    }
}
