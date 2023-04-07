package com.darigan.lil.learningspring.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@ToString
public class Reservation {
    @Id private long reservationId;
    private long roomId;
    private long guestId;
    private Date resDate;
}