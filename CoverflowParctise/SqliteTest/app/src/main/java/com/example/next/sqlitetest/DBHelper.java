package com.example.next.sqlitetest;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by next on 23/3/17.
 */
public class DBHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 19;
    public static final String DATABASE_NAME = "MyDBName.db";
    public static final String TABLE_NAME = "EmployeeTable";
    public static final String Colm_Name = "EmpName";
    public static final String Colm_Id = "EmpId";
    public static final String Colm_Date = "Date";
    public static final String Colm_empDEPT = "empdept";

    public static final String Colm_DeptId = "Deptid";
    public static final String Colm_DeptName = "DeptName";
    public static final String TABLE_NAME_Dept = "DeptTable";
    public static final String Colm_DeptHeadcount = "Deptid";

    private SQLiteDatabase db;

    public DBHelper(Context context) {

        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_ENTRIES_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + Colm_Id + " INTEGER PRIMARY KEY AUTOINCREMENT," + Colm_Name + " TEXT, "+Colm_Date+" TEXT," + Colm_empDEPT +" TEXT " +")";
        db.execSQL(CREATE_ENTRIES_TABLE);

        String CREATE_Dept_TABLE = "CREATE TABLE " + TABLE_NAME_Dept + "("
                + Colm_DeptId + " INTEGER PRIMARY KEY  AUTOINCREMENT , " + Colm_DeptName + " TEXT, " + Colm_DeptHeadcount+"TEXT  " +")";
        db.execSQL(CREATE_Dept_TABLE);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME );
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME_Dept);

        // Create tables again
        onCreate(db);
    }

  /*  public void insertData(String name, String empid)
    {
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues initialValues = new ContentValues();

        initialValues.put(Colm_Name, name);
        initialValues.put(Colm_Id, empid);
         db.insert(TABLE_NAME, null, initialValues);


    }*/

    void addEmpDetails(Datamodel datamodel) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Colm_Name, datamodel.getEmpname()); // Contact Name
        values.put(Colm_Id, datamodel.getEmpid()); // Contact Phone
        values.put(Colm_Date,datamodel.getEmpdatejoining());
        values.put(Colm_empDEPT,datamodel.getDepartmentid());

        // Inserting Row
        db.insert(TABLE_NAME, null, values);
        db.close(); // Closing database connection
    }

    void addDeptDetails(DeptMOdel deptMOdel){
        SQLiteDatabase db=this.getReadableDatabase();
        ContentValues values = new ContentValues();
        values.put(Colm_DeptId,deptMOdel.getDeptId());
        values.put(Colm_DeptName,deptMOdel.getDeptName());
        values.put(Colm_DeptHeadcount,deptMOdel.getDeptHeadcount());
        // Inserting Row
        db.insert(TABLE_NAME_Dept, null, values);
        db.close(); // Closing database connection
    }






    public List<Datamodel> getAllEmpDetails() {
        List<Datamodel> listofdata= new ArrayList<Datamodel>();
//write a query to select all datas
        String query="select * from " +TABLE_NAME;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);
        if(cursor!=null && cursor.getCount() > 0){
            if (cursor.moveToFirst()) {
            do {


                Datamodel model= new Datamodel();
                model.setEmpid(Integer.toString(cursor.getInt(0)));
                model.setEmpname(cursor.getString(1));
                model.setEmpdatejoining(cursor.getString(2));
                model.setDepartmentid(cursor.getString(3));

                //Adding contacts to list

                listofdata.add(model);

            }
            while (cursor.moveToNext());
        }}
        Log.i("dbhelper", "getAllDetails: "+listofdata.size());
        return listofdata;

    }

    public  void deleteEntireData(){

        SQLiteDatabase db=this.getReadableDatabase();
        db.delete(TABLE_NAME,null,null);
        db.delete(TABLE_NAME_Dept,null,null);

    }



    //dept

    public List<DeptMOdel> getAllDeptDetails() {
        List<DeptMOdel> listofdata= new ArrayList<DeptMOdel>();
//write a query to select all datas
        String query="select * from " +TABLE_NAME_Dept;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);
        if(cursor!=null && cursor.getCount() > 0){
            if (cursor.moveToFirst()) {
                do {


                    DeptMOdel model= new DeptMOdel();
                    model.setDeptId(cursor.getString(0));
                    model.setDeptName(cursor.getString(1));
                   // model.setDeptHeadcount(cursor.getString(2));
                  //  model.setDeptId(cursor.getString(2));

                    //Adding contacts to list

                    listofdata.add(model);

                }
                while (cursor.moveToNext());
            }}
        Log.i("dbhelper", "getAllDetails: "+listofdata.size());
        return listofdata;

    }

    public long getEntries(String tableName)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        return DatabaseUtils.queryNumEntries(db, tableName);
    }





}















































/*
    public ArrayList<String> getAllCotactsss() {
        ArrayList<String> array_list = new ArrayList<String>();

        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+TABLE_NAME, null );
        res.moveToFirst();

        while(res.isAfterLast() == false){
            array_list.add(res.getString(0));
            res.moveToNext();
        }
        return array_list;
    }


    //---retrieves all the contacts---
    public Cursor getAllContacts()
    {
        return db.query(TABLE_NAME, new String[] {Colm_Name, Colm_Id,Colm_Date},
                null, null, null, null, null);
    }


    //---retrieves a particular contact---
    public Cursor getContact(long rowId) throws SQLException
    {
        Cursor mCursor =db.query(true, TABLE_NAME, new String[] {Colm_Name,
                        Colm_Id, Colm_Date}, Colm_Id+ "=" + rowId, null,
                null, null, null, null);
        if (mCursor != null) {
            mCursor.moveToFirst();
        }
        return mCursor;
    }*/