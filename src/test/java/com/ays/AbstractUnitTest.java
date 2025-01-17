package com.ays;

import com.ays.auth.model.AysToken;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.test.context.ActiveProfiles;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@ActiveProfiles(value = "test")
public abstract class AbstractUnitTest {

    protected AysToken mockSuperAdminUserToken = AysToken.builder()
            .accessToken("eyJ0eXAiOiJCZWFyZXIiLCJhbGciOiJSUzUxMiJ9.eyJqdGkiOiJmYjE5MTViNS1kZTI3LTRmMzAtYjQ4ZC03NTY5MjAwZDdjZTYiLCJpc3MiOiJBWVMiLCJpYXQiOjE2ODY1MTA4MzQsImV4cCI6MTY4NjUxODAzNCwidXNlckxhc3ROYW1lIjoiU2lzdGVtaSIsInVzZXJUeXBlIjoiU1VQRVJfQURNSU4iLCJ1c2VyRmlyc3ROYW1lIjoiQWZldCBZw7ZuZXRpbSIsInVzZXJJZCI6ImVhMjlhMGJkLWFkNWQtNDA2OC04OGMzLWE4ODM1YjhkNTU1ZSIsInVzZXJuYW1lIjoiYXlzLXN1cGVyLWFkbWluIn0.MGF8vmYi3Erxzs0tiQDsksMmD3WJP8ts7xRItlRUAaP5X-qjAexuhxralmrq0Qo2ZdW2PnyIiBC2BcuuSVCoDoFHfUhU7QwJe6QxnKOkfdvrNWescPg17vTiyIdk4YGzOZt1LytaYXxtL6xqWq_EaeX_D5KZ-ppAQi-1YiZkmJP7fu4zLKa4HLmxI_gZvke3bWHTeHRJuR6HYjx_9EuuXGcL-haQGVALiUKQLLjKKMl7X2m-xmVAGuXAX_MZHSrSRJo3oaQTv4saiI9vbz_lBWNowE8Ai_J2h3_4Tge3_VqKLTm5YvcgXiUtHhyexcFKbrOxYH-fjxZj_Nm9Jqyq4w")
            .accessTokenExpiresAt(1686518034L)
            .refreshToken("eyJ0eXAiOiJCZWFyZXIiLCJhbGciOiJSUzUxMiJ9.eyJqdGkiOiJlMzQ3OTk1OC1kNDVhLTQzMzEtYWYwYi1mNWMyZWYxMGZmMzciLCJpc3MiOiJBWVMiLCJpYXQiOjE2ODY1MTA4MzQsImV4cCI6MTY4NjU5NzIzNCwidXNlcklkIjoiZWEyOWEwYmQtYWQ1ZC00MDY4LTg4YzMtYTg4MzViOGQ1NTVlIn0.cSiYOGke5lubZtrE6eZwjJf3t70pbMrIpuH_CRf8afThEWFpNNAnA56WKw425LRlVyr9l2yXQ14ORV6bcBb6QrZ_9p8bC7W6yhI1awCOdCq819Tr_Ru1KOZfKSs0v-r_buMi0fznlSh6Gp2ALNyPoleMpcgMOcsqQwRd-iMJjZ-GayHak9UMyKOsM3Sui3xgIfc6nW2eA2KKlf4kRYZmP0RnblNNjB3rX-RUyWM8yAolW8B4LKOdDYKLUUOkjuKduDFztXqZKAKuFbAh3MN5DWVfzPJEDZOwqGKCIiiNAXThTtDI0kDLQgtyGUdqdhukWHjJoWh0zWWzNkfzK4sVeQ")
            .build();

    protected AysToken mockAdminUserToken = AysToken.builder()
            .accessToken("eyJ0eXAiOiJCZWFyZXIiLCJhbGciOiJSUzUxMiJ9.eyJqdGkiOiJiZjk3MTZjOC1hMDg2LTQ3MGItYWIyOS1hMDQ0MmI1NWVkNWEiLCJpc3MiOiJBWVMiLCJpYXQiOjE2ODY1MTA5MTIsImV4cCI6MTY4NjUxODExMiwiaW5zdGl0dXRpb25JZCI6Ijc3ZWNlMjU2LWJmMGUtNGJiZS04MDFkLTE3MzA4M2Y4YmRjZiIsInVzZXJMYXN0TmFtZSI6IlNpc3RlbWkiLCJ1c2VyVHlwZSI6IkFETUlOIiwidXNlckZpcnN0TmFtZSI6IkFmZXQgWcO2bmV0aW0iLCJ1c2VySWQiOiI5MjYyZjBmYy05M2RiLTRmN2UtODFjNi1hYWFkODVjMmIyMDYiLCJ1c2VybmFtZSI6ImF5cy1hZG1pbiJ9.Y5SUBHHDEwWAdR4M5cq5WNjpQh2zo7b2O2g1Jc9fVdDsm8x9alAVJo7PFReJ8lkGlwvNzGPFS--QKSxp4mLE74o2oZvjxVHM0OOHvNyajlyZzQqSsbGuk8Im-kpvNUGglJn77g6lm6s5yrjw6H2XvItPtxup_Leq062j1Q2ZT1CXHtjhCwaCAAsLhHazL2RG7JO9FxwUEwsgJ3lYdwo4LgCkuJrGV3kwYR6RNCtIiGCrJYpdW3752wpGrw5X_MsXKAf6hua2QMF8kdbTRRBBPAaSpdpvCnNS7cu__FEqG64KJ_Ecsos9xMtfDCZ_funwRY6PzuJWyxJewnqG1u2pdA")
            .accessTokenExpiresAt(1686518112L)
            .refreshToken("eyJ0eXAiOiJCZWFyZXIiLCJhbGciOiJSUzUxMiJ9.eyJqdGkiOiIxNDkzZGU2Yy1mZjc1LTRkMTYtOGY1ZS1lMWI1NmE2MDNkNjciLCJpc3MiOiJBWVMiLCJpYXQiOjE2ODY1MTA5MTIsImV4cCI6MTY4NjU5NzMxMiwidXNlcklkIjoiOTI2MmYwZmMtOTNkYi00ZjdlLTgxYzYtYWFhZDg1YzJiMjA2In0.XC8vf9ZWDNqUqC8dpR5d_WjTg6lFF5pB38pTbPxyHP5bnD7hVf2OFZVY2UKaCrF7Jl_mkfliTkLdWTvQQ4r_JSElauawbTiRB6l6NjhE1hPBjcjtsZfj_mDpbXOR5PQjdKNyInLdiImgkDfsTojor4ql_dXTZGCH4_8-zuRUFcWCPm3Z2iYTL36TLYxkaYb75Xg5bl0cLKjpLA6DlVUVtglSfTk4cB5U-sWoFz9pmG_Jnaf8HQ_TS_GfZEw6wT8pzAkiBHIyAftlRGRMEvne0wvu94-PZuNer7BzxwexCuuXHB6KhB8qfvqiigQDFK7Rs3iMcl8mzQhXX6Gin-095A")
            .build();

    protected AysToken mockUserToken = AysToken.builder()
            .accessToken("eyJ0eXAiOiJCZWFyZXIiLCJhbGciOiJSUzUxMiJ9.eyJqdGkiOiI4YjNmMThmZS05NDE4LTQ5NTItYjFkZi03MThkMjgwNzBiNTUiLCJpc3MiOiJBWVMiLCJpYXQiOjE2ODY1MTEwMjIsImV4cCI6MTY4NjUxODIyMiwiaW5zdGl0dXRpb25JZCI6Ijc3ZWNlMjU2LWJmMGUtNGJiZS04MDFkLTE3MzA4M2Y4YmRjZiIsInVzZXJMYXN0TmFtZSI6IlNpc3RlbWkiLCJyb2xlcyI6WyJWT0xVTlRFRVIiXSwidXNlclR5cGUiOiJVU0VSIiwidXNlckZpcnN0TmFtZSI6IkFmZXQgWcO2bmV0aW0iLCJ1c2VySWQiOiJjNGI0ZTRkYi01NjQxLTQxZjctODIyMi1hNzZkZWIxYzA2NWMiLCJ1c2VybmFtZSI6IjIzMjE4MCJ9.cUXG7s675JpBYVh0FmPKCBd8xdD4OCZV9cW6r6rw7oKgEQGs6BNsKc5awQcvCUr9R-v4oqC72pZCAZDmRnrjrTye2SxGImJw17xe9gUZiFyqX0DIFLf94fY5P8v-V3qfJW4A_ffwubvjcJg5aFWAZOqlePfj-pI4UECi1UAygLjz-ZOzxHYWolJXS0QfhWwwUJ0JOSc_3F00-L13mWzYi_NtHF9Y0sjk90iQBUTY0VLVs5JEaDHwvDh92XidmqboI6mw3G_RJqSyVBsCCpqBx09A4LHhv1u84HBgeh4MjdXDR5GDXS6sEMVLOGqlr7FVXWSD6apUoJZlQf1UrWyrQg")
            .accessTokenExpiresAt(1686518222L)
            .refreshToken("eyJ0eXAiOiJCZWFyZXIiLCJhbGciOiJSUzUxMiJ9.eyJqdGkiOiIwZThlZTE0Mi04NzEwLTQ4MmUtOTllYS01ZmMwODgxYmY0N2MiLCJpc3MiOiJBWVMiLCJpYXQiOjE2ODY1MTEwMjIsImV4cCI6MTY4NjU5NzQyMiwidXNlcklkIjoiYzRiNGU0ZGItNTY0MS00MWY3LTgyMjItYTc2ZGViMWMwNjVjIn0.YM9GFtzoKqF8TqmxhisrsBHawDKNRoeSX5kdhP_-oOBjx90C_uFF9tr40EKpvXgsebJgPDXTpr6Kq42t_qFCeSeIY7d20gynHlRTf-_JgmAv7w0tUNZkOFZAWSGXA2koS3Q-In8j7J50qxjZYy4FkiIf8XgIxHuVSQ6mf9WjyX4IpIcbPijn3w-cgbf0_rR5hNxmJJVqf22elSDMenQhRHm1C4kvZ6o_Lv4j65T2BaCKx6VFTGBIsTuhqwJuu8nuBWwKyC50zypXXFqroDfRYfT5KTcFrEBA1PU4TVluahXZY7UyC21ZbSxRPNnDoAug9a2gQwydap1qvRAg-09Jkg")
            .build();

}
