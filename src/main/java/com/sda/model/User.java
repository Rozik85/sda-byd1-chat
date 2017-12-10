package com.sda.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    @Column(name = "nick")
    private String nick;
    @Column (name = "pass")
    private String pass;
    @OneToMany (mappedBy = "idUser", cascade = CascadeType.ALL)
    private List<Tweet> tweetList = new ArrayList<>();

}

