package com.darigan.lil.learningspring.data;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Guest {
    @Id private long guestId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private String country;
    private String state;
    private String phoneNumber;

}
