package com.darigan.lil.learningspring.data;

import lombok.Data;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Reservation {
    @Id private long reservationId;
    private long roomId;
    private long guestId;
    private Date resDate;
}