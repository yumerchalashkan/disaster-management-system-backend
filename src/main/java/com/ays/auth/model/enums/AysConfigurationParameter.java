package com.ays.auth.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * AysConfigurationParameter enum represents the possible configuration parameters for an AYS system.
 * The enum constants represent the name of the parameter and the associated default value is stored as a final String field.
 */
@Getter
@RequiredArgsConstructor
public enum AysConfigurationParameter {

    AYS("AYS"),

    AUTH_ACCESS_TOKEN_EXPIRE_MINUTE("120"),
    AUTH_REFRESH_TOKEN_EXPIRE_DAY("1"),
    AUTH_TOKEN_PRIVATE_KEY(""),
    AUTH_TOKEN_PUBLIC_KEY("");

    private final String defaultValue;

}
