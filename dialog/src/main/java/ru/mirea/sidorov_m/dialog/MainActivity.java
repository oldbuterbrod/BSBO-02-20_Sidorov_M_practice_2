package ru.mirea.sidorov_m.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tieck(View view){
        MyDialog mydialog = new MyDialog();
        mydialog.show(getSupportFragmentManager(), "mirea");
    }

    public void Clicked() {
        Toast.makeText(this, "Жмяк!", Toast.LENGTH_SHORT).show();
    }
}