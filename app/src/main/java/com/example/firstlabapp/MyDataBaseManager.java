package com.example.firstlabapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDataBaseManager extends SQLiteOpenHelper {
    private static final String Mydbms = "Student.db";
    public MyDataBaseManager(Context context) {

        super(context,Mydbms,null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry = "create table student_tbl(id integer primary key autoincrement, name text, mail text, course text)";
        db.execSQL(qry);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS student_tbl");
        onCreate(db);
    }
    public String addRecord(String p1, String p2, String p3)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name",p1);
        cv.put("mail",p2);
        cv.put("course",p3);

        long res = db.insert("student_tbl",null,cv);
        if (res == -1)
            return "False";
        else
            return "Successful Operation";

    }
}
