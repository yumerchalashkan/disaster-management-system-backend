package com.ays.user.model.mapper;

import com.ays.common.model.mapper.BaseMapper;
import com.ays.user.model.User;
import com.ays.user.model.dto.response.UsersResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * UserToUsersResponseMapper is an interface that defines the mapping between an {@link User} and an {@link UsersResponse}.
 * This interface uses the MapStruct annotation @Mapper to generate an implementation of this interface at compile-time.
 * <p>The class provides a static method {@code initialize()} that returns an instance of the generated mapper implementation.
 * <p>The interface extends the MapStruct interface {@link BaseMapper}, which defines basic mapping methods.
 * The interface adds no additional mapping methods, but simply defines the types to be used in the mapping process.
 */
@Mapper
public interface UserToUsersResponseMapper extends BaseMapper<User, UsersResponse> {

    /**
     * Initializes the mapper.
     *
     * @return the initialized mapper object.
     */
    static UserToUsersResponseMapper initialize() {
        return Mappers.getMapper(UserToUsersResponseMapper.class);
    }
}
