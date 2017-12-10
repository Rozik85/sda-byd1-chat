package com.sda.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Tweet")
    private int id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @Column(name = "time")
    private Long time;
    @Column(name = "message")
    private String message;


    public Tweet(User user, String message, long time) {
        this.user = user;
        this.message = message;
        this.time = time;
    }
}
