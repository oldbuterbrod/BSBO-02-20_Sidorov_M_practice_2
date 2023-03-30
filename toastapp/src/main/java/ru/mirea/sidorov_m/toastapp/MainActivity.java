package ru.mirea.sidorov_m.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void knopka(View view){
        EditText my_text = (EditText) findViewById(R.id.editTextTextPersonName);
        Toast.makeText(getApplicationContext(),String.format("СТУДЕНТ No 23 ГРУППА БСБО-02-20 Количество символов - %s.",my_text.getText().length()),Toast.LENGTH_SHORT).show();
    }
}