package com.proje.Ecommerce.model;


import com.proje.Ecommerce.enums.Gender;
import com.proje.Ecommerce.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;


@Entity
@Data
@Table( name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    private String firstName;
    private String lastName;
    private String username;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    @Column(unique = true)
    private String phoneNumber;

    private String bio;
    private String address;
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private Role role;

}