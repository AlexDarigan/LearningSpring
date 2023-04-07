package com.darigan.lil.learningspring.util;

import com.darigan.lil.learningspring.data.Guest;
import com.darigan.lil.learningspring.data.GuestRepository;
import com.darigan.lil.learningspring.data.Room;
import com.darigan.lil.learningspring.data.RoomRepository;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartUpEvent implements ApplicationListener<ApplicationStartedEvent> {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;

    public AppStartUpEvent(RoomRepository roomRepository, GuestRepository guestRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
    }
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        Iterable<Room> rooms = roomRepository.findAll();
        rooms.forEach(System.out::println);
        Iterable<Guest> guests = guestRepository.findAll();
        guests.forEach(System.out::println);
    }
}
