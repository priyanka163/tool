package com.example.next.databindsample;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by next on 17/3/17.
 */
public class Userviewmodel {

    private  User user;

    public Userviewmodel(User user) {
        this.user = user;
    }


    public void onClickFriend(View view) {
        Toast.makeText(view.getContext(), "OnClick Called", Toast.LENGTH_LONG).show();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
