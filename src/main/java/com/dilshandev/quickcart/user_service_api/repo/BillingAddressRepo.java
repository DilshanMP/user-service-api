package com.dilshandev.quickcart.user_service_api.repo;

import com.dilshandev.quickcart.user_service_api.entity.BillingAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingAddressRepo extends JpaRepository<BillingAddress ,String> {
}
