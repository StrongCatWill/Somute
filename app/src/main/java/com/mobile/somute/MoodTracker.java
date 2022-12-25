package com.mobile.somute;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.EditText;

public class MoodTracker extends AppCompatActivity {

    CalendarView calView;
    EditText et_date, et_soundNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_tracker);

        calView = findViewById(R.id.calView);
        et_date = findViewById(R.id.et_date);

        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                int pyear = year;
                et_date.setText(year + "년 " + (month+1) + "월 " + dayOfMonth + "일");
            }
        });

    }
}