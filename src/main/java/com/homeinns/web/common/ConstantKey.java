package com.homeinns.web.common;

/**
 * Created by Irving on 2014/11/23.
 */
public class ConstantKey {

    public static final String OAUTH_CLIENT_ID = "fbed1d1b4b1449daa4bc49397cbe2350";
    public static final String OAUTH_CLIENT_SECRET = "fbed1d1b4b1449daa4bc49397cbe2350";//secret
    public static final String OAUTH_CLIENT_SCOPE = "user,order";


    public static final String MEMBER_SESSION_KEY = "MEMBER_SESSION_KEY";//member session key
    public static final String INVALID_CLIENT_GRANT = "VERIFY_CLIENTID_FAIL";//invalid client grant =verify client fail,验证客户端失败
    public static final String INVALID_CLIENT_SECRET = "VERIFY_CLIENT_SECRET_FAIL";//secret verif client secret fail


    //OAUTH2_URL
    public static final String OAUTH_CLIENT_CALLBACK = "http://localhost:8080/client/oauth_callback";
    public static final String OAUTH_CLIENT_AUTHORIZE = "http://localhost:8080/oauth2/authorize";//authorize
    public static final String OAUTH_CLIENT_ACCESS_TOKEN = "http://localhost:8080/oauth2/access_token";
    public static final String OAUTH_CLIENT_GET_RESOURCE = "http://localhost:8080/oauth2/get_resource";
}