package com.mobile.somute;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class MoodTracker extends AppCompatActivity {

    CalendarView calView;
    TextView t_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_tracker);

        calView = findViewById(R.id.calView);
        t_text = findViewById(R.id.t_text);

        calView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                t_text.setText(year + "년 " + (month + 1) + "월 " + dayOfMonth + "일");
            }
        });

    }
}