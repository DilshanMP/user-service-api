package com.dilshandev.quickcart.user_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Billing_address")
public class BillingAddress {
  @Id
  @Column(nullable = false ,unique = true)
     private String id;
    @Column(length = 80 , nullable = false)
     private String country;
    @Column(length = 80 , nullable = false)
     private String city;
    @Column(length = 80 , nullable = false)
     private String street;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false,unique = true )
    private User user;

}
