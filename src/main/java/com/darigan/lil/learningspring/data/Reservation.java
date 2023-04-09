package com.darigan.lil.learningspring.data;

import lombok.Data;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Reservation {
    @Id private int reservationId;
    private int roomId;
    private int guestId;
    private Date resDate;
}