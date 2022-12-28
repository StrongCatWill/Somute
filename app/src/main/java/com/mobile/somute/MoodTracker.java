package com.mobile.somute;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.metrics.Event;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.List;

public class MoodTracker extends AppCompatActivity {

    int cYear, cMonth, cDayOfMonth;
    CalendarView calView;
    EditText et_date, et_soundNum;
    Button btn_saveDB, btn_goToMain;
    DBHelper dbHelper;
    ImageButton iBtn_mood1, iBtn_mood2, iBtn_mood3, iBtn_mood4, iBtn_mood5, iBtn_mood6, iBtn_mood7, iBtn_mood8;
    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6, mediaPlayer7, mediaPlayer8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_tracker);

        calView = (CalendarView) findViewById(R.id.calView);
        et_date = (EditText) findViewById(R.id.et_date);
        et_soundNum = (EditText) findViewById(R.id.et_soundNum);
        btn_saveDB = (Button) findViewById(R.id.btn_saveDB);
        dbHelper = new DBHelper(MoodTracker.this, 1);
        btn_goToMain = (Button) findViewById(R.id.btn_goToMain);

        iBtn_mood1 = (ImageButton) findViewById(R.id.iBtn_mood1);
        iBtn_mood2 = (ImageButton) findViewById(R.id.iBtn_mood2);
        iBtn_mood3 = (ImageButton) findViewById(R.id.iBtn_mood3);
        iBtn_mood4 = (ImageButton) findViewById(R.id.iBtn_mood4);
        iBtn_mood5 = (ImageButton) findViewById(R.id.iBtn_mood5);
        iBtn_mood6 = (ImageButton) findViewById(R.id.iBtn_mood6);
        iBtn_mood7 = (ImageButton) findViewById(R.id.iBtn_mood7);
        iBtn_mood8 = (ImageButton) findViewById(R.id.iBtn_mood8);

        mediaPlayer1 = MediaPlayer.create(this, R.raw.sound1);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.sound2);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.sound3);
        mediaPlayer4 = MediaPlayer.create(this, R.raw.sound4);
        mediaPlayer5 = MediaPlayer.create(this, R.raw.sound5);
        mediaPlayer6 = MediaPlayer.create(this, R.raw.sound6);
        mediaPlayer7 = MediaPlayer.create(this, R.raw.sound7);
        mediaPlayer8 = MediaPlayer.create(this, R.raw.sound8);

        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                cYear = year;
                cMonth = month+1;
                cDayOfMonth = dayOfMonth;
                et_date.setText(year + "년 " + cMonth + "월 " + dayOfMonth + "일");
            }
        });


        iBtn_mood1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();
            }
        });
        iBtn_mood2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();
            }
        });
        iBtn_mood3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();
            }
        });
        iBtn_mood4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();
            }
        });
        iBtn_mood5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();
            }
        });
        iBtn_mood6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();
            }
        });
        iBtn_mood7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();
            }
        });
        iBtn_mood8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();
            }
        });


        btn_saveDB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insert(cYear, cMonth, cDayOfMonth, Integer.parseInt(et_soundNum.getText().toString()));


                //선택한 무드가 달력에 보이도록 하는 코드
                if(Integer.parseInt(String.valueOf(et_soundNum))==1){
                    ImageView iv_mood1_patch= findViewById(R.id.iv_mood1_patch);
                    iv_mood1_patch.setVisibility(View.VISIBLE);
                    iv_mood1_patch.setX(Integer.parseInt(String.valueOf(cDayOfMonth)));
                    iv_mood1_patch.setY(Integer.parseInt(String.valueOf(cDayOfMonth)));
                }

                else if(Integer.parseInt(String.valueOf(et_soundNum))==2){
                    ImageView iv_mood2_patch= findViewById(R.id.iv_mood2_patch);
                    iv_mood2_patch.setVisibility(View.VISIBLE);
                    iv_mood2_patch.setX(Integer.parseInt(String.valueOf(cDayOfMonth)));
                    iv_mood2_patch.setY(Integer.parseInt(String.valueOf(cDayOfMonth)));
                }

                else if(Integer.parseInt(String.valueOf(et_soundNum))==3){
                    ImageView iv_mood3_patch= findViewById(R.id.iv_mood3_patch);
                    iv_mood3_patch.setVisibility(View.VISIBLE);
                    iv_mood3_patch.setX(Integer.parseInt(String.valueOf(cDayOfMonth)));
                    iv_mood3_patch.setY(Integer.parseInt(String.valueOf(cDayOfMonth)));
                }

                else if(Integer.parseInt(String.valueOf(et_soundNum))==4){
                    ImageView iv_mood4_patch= findViewById(R.id.iv_mood4_patch);
                    iv_mood4_patch.setVisibility(View.VISIBLE);
                    iv_mood4_patch.setX(Integer.parseInt(String.valueOf(cDayOfMonth)));
                    iv_mood4_patch.setY(Integer.parseInt(String.valueOf(cDayOfMonth)));
                }

                else if(Integer.parseInt(String.valueOf(et_soundNum))==5){
                    ImageView iv_mood5_patch= findViewById(R.id.iv_mood5_patch);
                    iv_mood5_patch.setVisibility(View.VISIBLE);
                    iv_mood5_patch.setX(Integer.parseInt(String.valueOf(cDayOfMonth)));
                    iv_mood5_patch.setY(Integer.parseInt(String.valueOf(cDayOfMonth)));
                }

                else if(Integer.parseInt(String.valueOf(et_soundNum))==6){
                    ImageView iv_mood6_patch= findViewById(R.id.iv_mood6_patch);
                    iv_mood6_patch.setVisibility(View.VISIBLE);
                    iv_mood6_patch.setX(Integer.parseInt(String.valueOf(cDayOfMonth)));
                    iv_mood6_patch.setY(Integer.parseInt(String.valueOf(cDayOfMonth)));
                }

                else if(Integer.parseInt(String.valueOf(et_soundNum))==7){
                    ImageView iv_mood7_patch= findViewById(R.id.iv_mood7_patch);
                    iv_mood7_patch.setVisibility(View.VISIBLE);
                    iv_mood7_patch.setX(Integer.parseInt(String.valueOf(cDayOfMonth)));
                    iv_mood7_patch.setY(Integer.parseInt(String.valueOf(cDayOfMonth)));
                }

                else{
                    ImageView iv_mood8_patch= findViewById(R.id.iv_mood8_patch);
                    iv_mood8_patch.setVisibility(View.VISIBLE);
                    iv_mood8_patch.setX(Integer.parseInt(String.valueOf(cDayOfMonth)));
                    iv_mood8_patch.setY(Integer.parseInt(String.valueOf(cDayOfMonth)));
                }

                //달력 위에 붙어야 하는데 지금 이슈는
                /*
                * 1. 선택한 날짜 위로 붙을 수 있게 정확한 location값을 얻어내는 것이 어려움
                * 2. 1~8까지의 무드만 미리 ImageView로 지정해두었으므로 한 달 안에서 하나의 mood가 중복으로 사용되는 경우는 처리가 불가능함.*/

                Toast.makeText(MoodTracker.this, "저장이 완료되었습니다!", Toast.LENGTH_LONG).show();
            }
        });

        btn_goToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoodTracker.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}