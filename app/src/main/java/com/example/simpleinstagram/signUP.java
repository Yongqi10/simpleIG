package com.example.simpleinstagram;


import com.parse.ParseClassName;
import com.parse.ParseObject;

@ParseClassName("User")
public class signUP extends ParseObject {

    public static final String KEY_username = "username";
    public static final String KEY_password = "password";

    public String getKEY_username(){
        return getString(KEY_username);
    }
    public void setKEY_username(String username){
        put(KEY_username,username);
    }
    public String getKEY_password(){
        return KEY_password;
    }
    public void setKEY_password(String password)
    {
        put(KEY_password,password);
    }

}
