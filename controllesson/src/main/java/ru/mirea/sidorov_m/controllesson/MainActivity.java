package ru.mirea.sidorov_m.controllesson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void knopochka_1(View view){
        Snackbar.make(view, "Sidorov Maxim BSBO-02-20", Snackbar.LENGTH_SHORT).show();

    }

    public void knopochka_2(View view){
        Time dialog = new Time(MainActivity.this);

    }

    public void knopochka_3(View view){
        Date dialog = new Date(MainActivity.this);

    }

    public void knopochka_4(View view){
        Load dialog = new Load(MainActivity.this);

    }
}