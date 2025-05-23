package com.dilshandev.quickcart.user_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @Column(name = "user_id", nullable = false)
    private String userId;
    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(name = "first_name",length = 50)
    private String firstname;
    @Column(name = "last_name",length = 50)
    private String lastName;
    @Column(name = "active_status",columnDefinition = "TINYINT")
    private  boolean activeState;
    @Column(name = "otp",nullable = false)
    private int OTP;
    @OneToOne(mappedBy = "user")
    private ShippingAddress shippingAddress;

    @OneToOne(mappedBy = "user")
    private BillingAddress billingAddress;

    @OneToOne(mappedBy = "user")
    private UserAvatar userAvatar;


}
