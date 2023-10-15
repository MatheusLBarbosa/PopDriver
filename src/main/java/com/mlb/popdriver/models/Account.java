package com.mlb.popdriver.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter@Setter
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    private long account_id;
    private String name;
    private String email;
    private String cpf;
    private String password;
}
