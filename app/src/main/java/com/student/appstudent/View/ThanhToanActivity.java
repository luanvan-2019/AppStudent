package com.student.appstudent.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.student.appstudent.R;

public class ThanhToanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanh_toan);
    }

    public static class TabTTHTActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tab_ttht);
        }
    }
}
