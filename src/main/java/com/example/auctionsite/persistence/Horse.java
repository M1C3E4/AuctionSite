package com.example.auctionsite.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Horse {
    @Id
    private Long id;
    private String name;
    private String race;
    private int age;
    private String dateOfBirth;
}
