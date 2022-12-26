package com.mobile.somute;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.StringTokenizer;

public class PlayTheMood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_the_mood);
    }

    Button btn_playSound = (Button) findViewById(R.id.btn_playSound);


    public void onClick(View v) {
        switch (v.getId()) {

                String DecNum = (String) dbHelper.getResultDec();

                sb = new StringBuilder();
                st = new StringTokenizer(DecNum,"-");

                printSound = new String[st.countTokens()];
                int i = 0;

                //뭉텅이로 붙여진 거 하나씩 떼는 반복문
                while(st.hasMoreTokens()){
                    printSound[i] = st.nextToken();
                    String tokenI = (printSound[i]);
                    i++;

                    viewResult.setText(tokenI);
}