package com.mobile.somute;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    static final String DATABASE_NAME = "somute4.db";

    // DBHelper 생성자
    public DBHelper(Context context, int version) {
        super(context, DATABASE_NAME, null, version);
    }

    // Sound Table 생성
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Sound(year INT, month INT, day INT, num INT)");
    }

    // Sound Table Upgrade
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Sound");
        onCreate(db);
    }

    // Sound Table 데이터 입력
    public void insert(int year, int month, int day, int num) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO Sound VALUES('" + year + "', '" + month + "', '" + day + "', '" + num + "');");
        db.close();
    }

    /*// Sound Table 데이터 수정
    public void Update(int date, int num) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("UPDATE Sound SET num = " + num + " WHERE date = '" + date + "'");
        db.close();
    }

    // Sound Table 조회
    public String getResult() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // DB에 있는 데이터를 쉽게 처리하기 위해 Cursor를 사용하여 테이블에 있는 모든 데이터 출력
        Cursor cursor = db.rawQuery("SELECT * FROM Sound ORDER BY date ASC", null);
        while (cursor.moveToNext()) {
            result += "s" + cursor.getInt(0)
                    + "n"
                    + cursor.getInt(1)
                    + "\n";
        }
        return result;
    }*/

    public String getResult2022() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 ORDER BY year, month, day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

    public String getResult01() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 AND month=1 ORDER BY day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

    public String getResult02() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 AND month=2 ORDER BY day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

    public String getResult03() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 AND month=3 ORDER BY day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

    public String getResult04() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 AND month=4 ORDER BY day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

    public String getResult05() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 AND month=5 ORDER BY day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

    public String getResult06() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 AND month=6 ORDER BY day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

    public String getResult07() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 AND month=7 ORDER BY day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

    public String getResult08() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 AND month=8 ORDER BY day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

    public String getResult09() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 AND month=9 ORDER BY day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

    public String getResult10() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 AND month=10 ORDER BY day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

    public String getResult11() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 AND month=11 ORDER BY day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

    public String getResult12() {
        // 읽기가 가능하게 DB 열기
        SQLiteDatabase db = getReadableDatabase();
        String result = "";
        // 쿼리문과 Cursor를 사용하여 원하는 데이터 출력
        Cursor cursor = db.rawQuery("SELECT num FROM Sound WHERE year=2022 AND month=12 ORDER BY day ASC", null);
        while (cursor.moveToNext()) {
            result += cursor.getInt(0) + "-";
        }
        return result;
    }

}