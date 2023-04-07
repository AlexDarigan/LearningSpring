package com.darigan.lil.learningspring.data;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Guest {
    @Id
    private long guestId;

    private String firstName;

    private String lastName;

    private String emailAddress;

    private String address;

    private String country;

    private String state;

    private String phoneNumber;


    @Override
    public String toString() {
        return "Guest{" +
                "id=" + guestId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
