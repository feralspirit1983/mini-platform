package com.github.hiling.gateway.modules.oauth.service;

import com.github.hiling.gateway.modules.oauth.model.AccessToken;
import com.github.hiling.gateway.modules.oauth.model.RevokeToken;

import java.util.List;

/**
 * Author by hiling, Email admin@mn-soft.com, Date on 10/9/2018.
 */
public interface AccessTokenService{

    String getJwtToken(String accessToken);

    boolean deleteToken(String accessToken);

    List<String> getRevokeAccessToken(List<RevokeToken> list);

    void deleteExpiredAccessToken();

    void batchDeleteByAccessToken(List<String> accessTokenList);

    AccessToken createAccessToken(String accessIp, String clientId, String clientSecret, String grantType, String username, String password, String refreshToken);

}