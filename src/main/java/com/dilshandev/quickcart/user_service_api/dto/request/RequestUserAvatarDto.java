package com.dilshandev.quickcart.user_service_api.dto.request;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestUserAvatarDto {

    private MultipartFile file;
}
