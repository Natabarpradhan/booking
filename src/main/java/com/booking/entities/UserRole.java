package com.booking.entities;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class UserRole {
    @Id
    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = )
    private User user;
     @Id
    @ManyToOne
    @JoinColumn(name="role_id",referencedColumnName = )
    private Role role;
}
