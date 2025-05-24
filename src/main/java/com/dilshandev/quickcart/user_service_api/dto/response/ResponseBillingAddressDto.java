package com.dilshandev.quickcart.user_service_api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseBillingAddressDto {
    private String id;

    private String country;

    private String city;

    private String street;
}
