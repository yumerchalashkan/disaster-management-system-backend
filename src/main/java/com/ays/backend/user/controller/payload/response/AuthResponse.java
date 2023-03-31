package com.ays.backend.user.controller.payload.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthResponse {

    private String accessToken;
    private Long accessTokenExpireIn;
    private String refreshToken;
}