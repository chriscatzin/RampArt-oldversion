package com.example.rampart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rellay_Profile, rellay_Register;

    /*SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button _btnregister;
    EditText _txtfname, _txtlname, _txtpass, _txtemail, _txtphone;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        rellay_Profile = findViewById(R.id.rellay_Profile);
        rellay_Register = findViewById(R.id.rellay_Register);

        rellay_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });

        rellay_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });


        /*openHelper = new DatabaseHelper(this);

        _btnregister = (Button)findViewById(R.id.btnregister);
        _txtfname = (EditText) findViewById(R.id.txtfname);
        _txtlname = (EditText) findViewById(R.id.txtlname);
        _txtpass = (EditText) findViewById(R.id.txtpass);
        _txtemail = (EditText) findViewById(R.id.txtemail);
        _txtphone = (EditText) findViewById(R.id.txtphone);

        _btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db = openHelper.getWritableDatabase();
                String fname = _txtfname.getText().toString();
                String lname = _txtlname.getText().toString();
                String pass = _txtpass.getText().toString();
                String email = _txtemail.getText().toString();
                String phone = _txtphone.getText().toString();
                insertdata(fname, lname, pass, email, phone);
                Toast.makeText(getApplicationContext(), "registered successfully!", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void insertdata(String fname, String lname, String pass, String email, String phone) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.COL_TWO, fname);
        contentValues.put(DatabaseHelper.COL_THREE, lname);
        contentValues.put(DatabaseHelper.COL_FOUR, pass);
        contentValues.put(DatabaseHelper.COL_FIVE, email);
        contentValues.put(DatabaseHelper.COL_SIX, phone);
        long id = db.insert(DatabaseHelper.TABLE_NAME, null, contentValues);

    }*/
    }
}
