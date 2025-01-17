package com.ays.auth.model;

import com.ays.auth.model.enums.AysTokenClaims;
import com.ays.auth.model.enums.AysUserType;
import com.ays.common.model.enums.BeanScope;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

/**
 * This class provides a representation of the identity of the authenticated user in the AYS service.
 * The class is designed to be request-scoped and proxy-target-class scoped, meaning that each HTTP request will have its own instance of this class.
 */
@Component
@Scope(value = BeanScope.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
@RequiredArgsConstructor
public class AysIdentity {

    /**
     * Returns the institution ID associated with the authenticated user's AYS identity.
     *
     * @return the institution ID as a string
     */
    public String getInstitutionId() {
        return this.getJwt().getClaim(AysTokenClaims.INSTITUTION_ID.getValue());
    }

    /**
     * Retrieves the access token value.
     *
     * @return the access token value
     */
    public String getAccessToken() {
        return this.getJwt().getTokenValue();
    }

    /**
     * Retrieves user type from the JWT token
     *
     * @return AysUserType as an admin user type
     */
    public AysUserType getUserType() {
        return AysUserType.valueOf(this.getJwt().getClaim(AysTokenClaims.USER_TYPE.getValue()));
    }

    /**
     * Returns the user ID associated with the authenticated user's AYS identity.
     *
     * @return user Id value
     */
    public String getUserId() {
        return this.getJwt().getClaim(AysTokenClaims.USER_ID.getValue());
    }

    /**
     * Retrieves the JWT token for the authenticated user from the security context.
     *
     * @return the JWT token as a Jwt object
     */
    private Jwt getJwt() {
        return ((Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }

}
