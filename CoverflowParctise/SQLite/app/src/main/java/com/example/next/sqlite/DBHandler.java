package com.example.next.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by next on 24/3/17.
 */
public class DBHandler extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MyDBName.db";
    public static final String Emp_Tabl_Name = "EmployeeTable";
    public static final String Colm_EmpName = "EmpName";
    public static final  Colm_Id = ;
    public static final String Colm_Date = "Date";
    public static final String Colm_empDEPT = "empdept";

    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
