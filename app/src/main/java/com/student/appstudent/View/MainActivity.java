package com.student.appstudent.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.student.appstudent.R;


public class MainActivity extends AppCompatActivity {
    EditText edtuser, edtpassword;
    Button btndangky, btndangnhap, btnthoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(MainActivity.this, DKXTActivity.class);
                startActivity(abc);
            }
        });
    }
    private void Anhxa() {
        edtuser = (EditText) findViewById(R.id.edittextuser);
        edtpassword = (EditText) findViewById(R.id.edittextpassword);
        btndangnhap = (Button) findViewById(R.id.buttondangnhap);
        btndangnhap = (Button) findViewById(R.id.buttondangnhap);
        btndangky = (Button) findViewById(R.id.buttondangky);
        btnthoat = (Button) findViewById(R.id.buttonthoat);
    }
}