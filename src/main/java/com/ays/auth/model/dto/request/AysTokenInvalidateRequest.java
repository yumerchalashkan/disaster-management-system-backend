package com.ays.auth.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * AysTokenInvalidateRequest is a request class used for invalidating a token.
 * It includes a refresh token field.
 */
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AysTokenInvalidateRequest {

    @NotBlank
    private String refreshToken;

}
