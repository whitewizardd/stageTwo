package com.example.demo.data.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Document(collection = "Person")
@Entity
@Table(name = "Person")
public class Person {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Field(name = "first_name", order = 3)
    @Column(name = "first_name", nullable = false)
    private String firstName;
//    @Field(name = "last_name", order = 4)
    @Column(name = "last_name", nullable = false)
    private String lastName;
//    @Field(name = "email", order = 1)
//    @Indexed(unique = true)
    @Column(name = "email", unique = true, nullable = false)
    public String email;
//    @Field(name = "mobile_number", order = 2)
//    @Indexed(unique = true)
    @Column(name = "mobile_number", unique = true, nullable = false)
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    @Column(name = "sex")
    public Sex sex;
//    @DBRef
    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private Address address;
}
