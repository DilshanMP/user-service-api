package com.dilshandev.quickcart.user_service_api.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestUserDto {
 private String username;
 private String password;
 private String firstName;
 private String lastName;
}
