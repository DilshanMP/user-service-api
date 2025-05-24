package com.dilshandev.quickcart.user_service_api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseUserAvatarDto {
    private String hash;
    private String directory;
    private String fileName;
    private String resourceUrl;
}
