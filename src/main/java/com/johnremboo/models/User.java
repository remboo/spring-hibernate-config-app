package com.johnremboo.models;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Igor Orekhov on 05.05.17.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
}
