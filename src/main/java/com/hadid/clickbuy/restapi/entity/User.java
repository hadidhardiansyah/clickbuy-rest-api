package com.hadid.clickbuy.restapi.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;

    private String password;

    private String phoneNumber;

    private String address;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles;

    public String fullName() {
        return firstName + " " + lastName;
    }
}
