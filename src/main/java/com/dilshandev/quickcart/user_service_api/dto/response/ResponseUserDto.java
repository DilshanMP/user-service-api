package com.dilshandev.quickcart.user_service_api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseUserDto {
    private String username;
    private String firstName;
    private String lastName;
    private boolean activeStatus;
    private ResponseUserAvatarDto avatar;
    private ResponseBillingAddressDto billingAddress;
    private ResponseShippingAddressDto shippingAddress;

}
