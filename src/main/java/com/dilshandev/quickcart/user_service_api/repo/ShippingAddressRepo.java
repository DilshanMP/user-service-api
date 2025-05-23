package com.dilshandev.quickcart.user_service_api.repo;

import com.dilshandev.quickcart.user_service_api.entity.BillingAddress;
import com.dilshandev.quickcart.user_service_api.entity.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingAddressRepo extends JpaRepository<ShippingAddress,String> {
}
