package com.example.soohoon.community;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

class BoardWriteRequest_2 extends StringRequest{
    final static private String URL = "http://ccit.cafe24.com/jbCommunity/API/lostInsert.php";
    private Map<String, String> parameters;

    public BoardWriteRequest_2(String userID, String userPer, String Content, String Title, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPer", userPer);
        parameters.put("b_content", Content);
        parameters.put("b_title", Title);


    }

    public Map<String, String> getParams() {
        return parameters;
    }
}