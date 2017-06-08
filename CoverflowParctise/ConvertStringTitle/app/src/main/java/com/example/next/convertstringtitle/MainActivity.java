package com.example.next.convertstringtitle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       method("hi hello bye");

        System.out.println(method("   enter your Statement!"));
        Log.i("hi", "onCreate: "+method("hi hello bye"));

    }

    public String method(String sent)

        {
            sent = sent.trim();
            sent = sent.toLowerCase();
            String[] str1 = new String[sent.length()];
            for (int k = 0; k <= str1.length - 1; k++) {
                str1[k] = sent.charAt(k) + "";
            }

            for (int i = 0; i <= sent.length() - 1; i++) {
                if (i == 0) {
                    String s = sent.charAt(i) + "";
                    str1[i] = s.toUpperCase();
                }
                if (str1[i].equals(" ")) {
                    String s = sent.charAt(i + 1) + "";
                    str1[i + 1] = s.toUpperCase();
                }

                System.out.print(str1[i]);
            }

            return "";
        }


}
