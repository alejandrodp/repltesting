package com.example.cotec_2020_app24;

import com.apollographql.apollo.ApolloClient;

import okhttp3.OkHttpClient;

public class GlobalVars {

    private static GlobalVars instance = null;
    private String accessKey = null;
    private ApolloClient apolloClient;
    private static final String ENDPOINT = "https://cotec-server.herokuapp.com/graphql/";



    private GlobalVars() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        apolloClient = ApolloClient.builder().serverUrl(ENDPOINT).okHttpClient(okHttpClient).build();
    }

    public static GlobalVars getInstance(){
        if (instance == null){
            instance = new GlobalVars();
        }
        return instance;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public ApolloClient getApolloClient() {
        return apolloClient;
    }
}
