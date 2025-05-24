package com.dilshandev.quickcart.user_service_api.dto.response.Paginate;

import com.dilshandev.quickcart.user_service_api.dto.response.ResponseUserDto;

import java.util.List;

public class ResponseUserPaginateDto {
    private long count;
    private List<ResponseUserDto> users;
}
