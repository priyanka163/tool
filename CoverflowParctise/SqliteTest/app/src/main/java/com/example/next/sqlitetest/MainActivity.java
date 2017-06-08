package com.example.next.sqlitetest;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Button click,enter;
    ExpandableListView explist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

click= (Button) findViewById(R.id.click);
        enter= (Button) findViewById(R.id.enter);
        explist= (ExpandableListView) findViewById(R.id.exlist);

        final DBHelper dbHelper= new DBHelper(MainActivity.this);
        dbHelper.deleteEntireData();


        Log.d("Insert: ", "Inserting ..");
        if(dbHelper.getEntries("DeptTable") <= 0)
        {
            dbHelper.addDeptDetails(new DeptMOdel("SQL", "1"));
            dbHelper.addDeptDetails(new DeptMOdel("computerscience", "2"));
            dbHelper.addDeptDetails(new DeptMOdel("javascript", "3"));
            dbHelper.addDeptDetails(new DeptMOdel("php", "4"));

        }
        // Reading all contacts
        Log.d("Reading: ", "Reading all DEPT..");
        List<DeptMOdel> deptlist = dbHelper.getAllDeptDetails();

        for (DeptMOdel cn : deptlist) {
            String log = "Id: "+cn.getDeptId()+" ,Name: " + cn.getDeptName();
            // Writing Contacts to log
            Log.d("Name: ", log);

        }


        if(dbHelper.getEntries("EmployeeTable") <= 0)
        {
            Log.d("Insert: ", "Inserting ..");
            dbHelper.addEmpDetails(new Datamodel("Ravi", "15", "21/2/17", "1"));
            dbHelper.addEmpDetails(new Datamodel("Srinivas", "16", "3/1/17", "2 "));
            dbHelper.addEmpDetails(new Datamodel("Tommy", "17", "23/4/17", "3"));
            dbHelper.addEmpDetails(new Datamodel("Karthik", "18", "25/12/16", "4"));
        }

        // Reading all contacts
        Log.d("Reading: ", "Reading all empcontacts..");
        List<Datamodel> emplylist = dbHelper.getAllEmpDetails();

        for (Datamodel cn : emplylist) {
            String log = "Id: "+cn.getEmpid()+" ,Name: " + cn.getEmpname() + " ,date: " + cn.getEmpdatejoining() +  " depptt " + cn.getDepartmentid();
            // Writing Contacts to log
            Log.d("Name: ", log);
        }



        ListAdapter adapter = new ListAdapter(emplylist,deptlist,this);

        explist.setAdapter(adapter);




        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*dbHelper.insertData("priya","23");
                Toast.makeText(MainActivity.this, "hfhfhj", Toast.LENGTH_SHORT).show();*/
              //  List<Datamodel> datamodelList=new ArrayList<Datamodel>();
               // datamodelList=dbHelper.getAllDetails();


              //  Log.i("data", "onClick: "+dbHelper.getAllDetails());


                Log.d("onclickDeptInsert: ", "Inserting ..");
                dbHelper.addDeptDetails(new DeptMOdel("Ra","21"));
                dbHelper.addDeptDetails(new DeptMOdel("Srin","3"));
                dbHelper.addDeptDetails(new DeptMOdel("To","23"));
                dbHelper.addDeptDetails(new DeptMOdel("Kart", "25"));

                // Reading all contacts
                Log.d("Reading: ", "Reading all DEPTdata..");
                List<DeptMOdel> contacts = dbHelper.getAllDeptDetails();

                for (DeptMOdel cn : contacts) {
                    String log = "DId: "+cn.getDeptId()+" ,DName: " + cn.getDeptName() + " ,Ddate: " + cn.getDeptHeadcount();
                    // Writing Contacts to log
                    Log.d("DName: ", log);
                }

            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inserting Contacts
                Log.d("on Clock emp Insert: ", "Inserting ..");
                dbHelper.addEmpDetails(new Datamodel("Ravi", "15","21/2/17", " 21"));
                dbHelper.addEmpDetails(new Datamodel("Srinivas","16","3/1/17", " 3"));
                dbHelper.addEmpDetails(new Datamodel("Tommy", "17","23/4/17", " 23"));
                dbHelper.addEmpDetails(new Datamodel("Karthik", "65","5/12/16"," 25"));

                // Reading all contacts
                Log.d("Reading: ", "Reading all employee contacts onclic..");
                List<Datamodel> contacts = dbHelper.getAllEmpDetails();

                for (Datamodel cn : contacts) {
                    String log = "BEId: "+cn.getEmpid()+" ,BEName: " + cn.getEmpname() + " ,BEdate: " + cn.getEmpdatejoining() +  "BE depptt " + cn.getDepartmentid();
                    // Writing Contacts to log
                    Log.d("Name: ", log);
                }
            }
        });


    }
}
