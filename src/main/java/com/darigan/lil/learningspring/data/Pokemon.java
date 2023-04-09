package com.darigan.lil.learningspring.data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Pokemon {

    @Id private int pkmnId;
    private String pkmnName;
    private String type1;
    private String type2;
    private int stage;
}
