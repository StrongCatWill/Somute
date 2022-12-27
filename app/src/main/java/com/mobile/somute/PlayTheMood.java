package com.mobile.somute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayTheMood extends AppCompatActivity {

    DBHelper dbHelper;
    Button btn_play2022, btn_goToMain;
    Button btn_play01, btn_play02, btn_play03, btn_play04, btn_play05, btn_play06;
    Button btn_play07, btn_play08, btn_play09, btn_play10, btn_play11, btn_play12;
    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6, mediaPlayer7, mediaPlayer8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_the_mood);

        dbHelper = new DBHelper(PlayTheMood.this, 1);

        btn_goToMain = (Button) findViewById(R.id.btn_goToMain);
        btn_play2022 = (Button) findViewById(R.id.btn_play2022);
        btn_play01 = (Button) findViewById(R.id.btn_play01);
        btn_play02 = (Button) findViewById(R.id.btn_play02);
        btn_play03 = (Button) findViewById(R.id.btn_play03);
        btn_play04 = (Button) findViewById(R.id.btn_play04);
        btn_play05 = (Button) findViewById(R.id.btn_play05);
        btn_play06 = (Button) findViewById(R.id.btn_play06);
        btn_play07 = (Button) findViewById(R.id.btn_play07);
        btn_play08 = (Button) findViewById(R.id.btn_play08);
        btn_play09 = (Button) findViewById(R.id.btn_play09);
        btn_play10 = (Button) findViewById(R.id.btn_play10);
        btn_play11 = (Button) findViewById(R.id.btn_play11);
        btn_play12 = (Button) findViewById(R.id.btn_play12);

        mediaPlayer1 = MediaPlayer.create(this, R.raw.sound1);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.sound2);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.sound3);
        mediaPlayer4 = MediaPlayer.create(this, R.raw.sound4);
        mediaPlayer5 = MediaPlayer.create(this, R.raw.sound5);
        mediaPlayer6 = MediaPlayer.create(this, R.raw.sound6);
        mediaPlayer7 = MediaPlayer.create(this, R.raw.sound7);
        mediaPlayer8 = MediaPlayer.create(this, R.raw.sound8);

        btn_play2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num2022 = (String) dbHelper.getResult2022();
                String[] array = num2022.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_play01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num01 = (String) dbHelper.getResult01();
                String[] array = num01.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_play02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num02 = (String) dbHelper.getResult02();
                String[] array = num02.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_play03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num03 = (String) dbHelper.getResult03();
                String[] array = num03.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_play04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num04 = (String) dbHelper.getResult04();
                String[] array = num04.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_play05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num05 = (String) dbHelper.getResult05();
                String[] array = num05.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_play06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num06 = (String) dbHelper.getResult06();
                String[] array = num06.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_play07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num07 = (String) dbHelper.getResult07();
                String[] array = num07.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_play08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num08 = (String) dbHelper.getResult08();
                String[] array = num08.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_play09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num09 = (String) dbHelper.getResult09();
                String[] array = num09.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_play10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num10 = (String) dbHelper.getResult10();
                String[] array = num10.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_play11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num11 = (String) dbHelper.getResult11();
                String[] array = num11.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_play12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num12 = (String) dbHelper.getResult12();
                String[] array = num12.split("-");
                for(int i=0; i<array.length; i++){
                    if (array[i].equals("1")){
                        mediaPlayer1.start(); }
                    else if (array[i].equals("2")){
                        mediaPlayer2.start(); }
                    else if (array[i].equals("3")){
                        mediaPlayer3.start(); }
                    else if (array[i].equals("4")){
                        mediaPlayer4.start(); }
                    else if (array[i].equals("5")){
                        mediaPlayer5.start(); }
                    else if (array[i].equals("6")){
                        mediaPlayer6.start(); }
                    else if (array[i].equals("7")){
                        mediaPlayer7.start(); }
                    else {
                        mediaPlayer8.start(); }
                }
            }
        });

        btn_goToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlayTheMood.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}