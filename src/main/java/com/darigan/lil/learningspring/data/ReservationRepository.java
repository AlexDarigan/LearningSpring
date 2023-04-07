package com.darigan.lil.learningspring.data;

import org.springframework.data.repository.CrudRepository;

import java.sql.Date;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {

    Iterable<Reservation> findAllByResDate(Date resDate);
}
