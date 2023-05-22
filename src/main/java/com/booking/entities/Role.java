package com.booking.entities;

import javax.persistence.*;
import java.util.Set;

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="role_name")
    private String roleName;
    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL)
    private Set<UserRole>userRoles;
}
