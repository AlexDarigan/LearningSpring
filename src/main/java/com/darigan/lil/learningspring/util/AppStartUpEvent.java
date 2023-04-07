package com.darigan.lil.learningspring.util;

import com.darigan.lil.learningspring.data.Room;
import com.darigan.lil.learningspring.data.RoomRepository;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartUpEvent implements ApplicationListener<ApplicationStartedEvent> {

    private final RoomRepository roomRepository;

    public AppStartUpEvent(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        Iterable<Room> rooms = roomRepository.findAll();
        rooms.forEach(System.out::println);
    }
}
