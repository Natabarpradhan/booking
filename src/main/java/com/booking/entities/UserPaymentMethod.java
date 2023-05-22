package com.booking.entities;

import javax.persistence.*;
import javax.xml.crypto.Data;


public class UserPaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = )
    private User user;
    @Column(name="payment_type")
    private String paymentType;

    @Column(name="expiration_date")
    private String cardNumber;

    @Column(name="expiration_date")
    private Data expirationDate;

    @Column(name="card_holder_name")
    private String cardHolderName;

    @Column(name="created_at")
    private Data createAt;

    @Column(name="updated_at")
    private Data updatedAt;
}
