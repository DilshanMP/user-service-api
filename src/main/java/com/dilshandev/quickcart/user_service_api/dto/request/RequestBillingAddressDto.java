package com.dilshandev.quickcart.user_service_api.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestBillingAddressDto {


    private String country;

    private String city;

    private String street;

}
