package com.wangtak.blog.account.domain;

import javax.persistence.*;

@Entity
public class Account {

    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;

}
