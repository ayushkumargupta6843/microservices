package com.lcwd.user.service.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name="micro_users")
public class User {
    @Id
    @Column(name="ID")
    private String userId;
    @Column(name="NAME",length = 25)
    private String name;
    @Column(name="EMAIL")
    private String email;
    @Column(name="ABOUT")
    private String about;

    @Transient
    private List<Rating> ratings = new ArrayList<>();


}
