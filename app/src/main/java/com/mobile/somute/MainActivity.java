package com.mobile.somute;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView i_logoSomute;
    Button btn_toMoodTracker, btn_shutDownAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 로고 클릭시 소무트의 뜻과 로고 고슴도치의 의미를 알려주는 Toast 메시지 출력
        i_logoSomute = (ImageView) findViewById(R.id.i_logoSomute);
        i_logoSomute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder_logoSomute = new AlertDialog.Builder(MainActivity.this);
                builder_logoSomute.setTitle("소무트란");
                builder_logoSomute.setMessage("셰익스피어 소네트(sonnet)의 낭만을 표방한 '소리나는 무드트래커'의 줄임말입니다.\n" +
                        "소무트의 마스코트인 고슴도치 고치는, 그리스 신화 야누스와 같이 다양한 얼굴을 가졌으며 감정을 있는 그대로 받아들이는 진솔한 고슴도치입니다. \n" +
                        "고치와 함께 매일 달라지는 그날의 무드를 기록해보세요!");
                builder_logoSomute.show();
            }
        });

        // 다음 페이지로 이동하는 버튼 만들기
        btn_toMoodTracker = (Button) findViewById(R.id.btn_toMoodTracker);
        btn_toMoodTracker.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //화면 전환
                Intent intent = new Intent(MainActivity.this, MoodTracker.class);
                startActivity(intent);
            }
        });

        // 전체 종료 버튼 btn_shutDownAll
        btn_shutDownAll = (Button) findViewById(R.id.btn_shutDownAll);
        btn_shutDownAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder_shutDownAll = new AlertDialog.Builder(MainActivity.this);
                builder_shutDownAll.setMessage("정말로 종료하시겠습니까? \n저장된 데이터가 유실될 수 있습니다.");
                builder_shutDownAll.setTitle("종료 알림창").setCancelable(false).setPositiveButton("예", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("아니오", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alertDialog = builder_shutDownAll.create();
                alertDialog.setTitle("종료 알림창");
                alertDialog.show();
            }
        });

    }
}

