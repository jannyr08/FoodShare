package com.example.photostore.Models;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

@ParseClassName("Created")
public class CreatedImage extends ParseObject {

    public static final String KEY_SCHEDULED_PIC = "scheduled";
    public static final String KEY_CREATED_PIC = "created";
    public static final String KEY_CREATED_AT = "createdAt";
    public static final String KEY_USER = "user";

    public String getScheduledPic() {
        return getString(KEY_SCHEDULED_PIC);
    }

    public void setScheduledPic(String image) {
        put(KEY_SCHEDULED_PIC, image);
    }

    public ParseFile getCreatedPic() {
        return getParseFile(KEY_CREATED_PIC);
    }

    public void setCreatedPic(ParseFile image) {
        put(KEY_CREATED_PIC, image);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }

    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }

}
