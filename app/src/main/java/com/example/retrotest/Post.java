package com.example.retrotest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class  Post  implements Serializable {

//    @SerializedName("status")
//    @Expose
//    private List<Integer> status;
    @SerializedName("message")
    @Expose
    private String message;
//    @SerializedName("results")
//    @Expose
//    private List<String> results;

    // string variables for our name and job
    private String email;
    private String password;

    public Post(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getMsg() {
        return message;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}


