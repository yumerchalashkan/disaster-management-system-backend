package com.ays.admin_user.util.exception;

import com.ays.common.util.exception.AysAlreadyException;

import java.io.Serial;

/**
 * Exception indicating that an admin user already exists with the specified email address.
 * This exception is a subclass of AysAlreadyException.
 */
public class AysAdminUserAlreadyExistsByEmailException extends AysAlreadyException {

    /**
     * Unique identifier for serialization.
     */
    @Serial
    private static final long serialVersionUID = -8333833736509873511L;

    /**
     * Constructs a new AysAdminUserAlreadyExistsByEmailException with the specified email address.
     *
     * @param email The email address of the admin user that already exists.
     */
    public AysAdminUserAlreadyExistsByEmailException(String email) {
        super("ADMIN USER ALREADY EXIST! email:" + email);
    }

}
