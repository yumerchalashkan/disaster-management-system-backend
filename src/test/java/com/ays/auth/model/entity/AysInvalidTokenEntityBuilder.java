package com.ays.auth.model.entity;

import com.ays.common.model.TestDataBuilder;
import com.ays.common.util.AysRandomUtil;

public class AysInvalidTokenEntityBuilder extends TestDataBuilder<AysInvalidTokenEntity> {

    public AysInvalidTokenEntityBuilder() {
        super(AysInvalidTokenEntity.class);
    }

    public AysInvalidTokenEntityBuilder withValidValues() {
        return new AysInvalidTokenEntityBuilder()
                .id(1L)
                .tokenId(AysRandomUtil.generateUUID());
    }

    public AysInvalidTokenEntityBuilder id(Long id) {
        data.setId(id);
        return this;
    }

    public AysInvalidTokenEntityBuilder tokenId(String tokenId) {
        data.setTokenId(tokenId);
        return this;
    }

}
