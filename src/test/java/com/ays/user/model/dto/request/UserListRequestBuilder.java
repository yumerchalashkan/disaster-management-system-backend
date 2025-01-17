package com.ays.user.model.dto.request;

import com.ays.common.model.AysPaging;
import com.ays.common.model.AysPagingBuilder;
import com.ays.common.model.AysSorting;
import com.ays.common.model.TestDataBuilder;

import java.util.List;

public class UserListRequestBuilder extends TestDataBuilder<UserListRequest> {

    public UserListRequestBuilder() {
        super(UserListRequest.class);
    }

    public UserListRequestBuilder withValidValues() {
        return this
                .withPagination(new AysPagingBuilder().withValidValues().build())
                .withSort(null);
    }

    public UserListRequestBuilder withPagination(AysPaging aysPaging) {
        data.setPagination(aysPaging);
        return this;
    }

    public UserListRequestBuilder withSort(List<AysSorting> sorting) {
        data.setSort(sorting);
        return this;
    }

}
