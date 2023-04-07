package com.darigan.lil.learningspring.data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Entity
@Setter
@Getter
@ToString
public class Room {
    @Id private long roomId;
    private String name;
    private String roomNumber;
    private String bedInfo;


}
