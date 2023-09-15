package com.example.demo.data.models;

import jakarta.persistence.*;
import lombok.*;
@Setter@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Document(collection = "Address")
@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "house_number")
    private String houseNumber;
    @Column(name = "street_name")
    private String streetName;
    @Column(name = "state")
    private String state;
}
