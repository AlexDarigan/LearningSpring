package com.darigan.lil.learningspring.data;
import lombok.Data;


import javax.persistence.*;
@Entity
@Data
public class Room {
    @Id private int roomId;
    private String name;
    private String roomNumber;
    private String bedInfo;


}
