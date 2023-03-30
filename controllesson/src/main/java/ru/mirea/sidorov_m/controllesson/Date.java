package ru.mirea.sidorov_m.controllesson;

import android.app.DatePickerDialog;
import android.widget.DatePicker;

import java.util.Calendar;

public class Date {
    Calendar dateAndTime=Calendar.getInstance();
    public Date(MainActivity mainActivity)
    {

        DatePickerDialog.OnDateSetListener d=new DatePickerDialog.OnDateSetListener() {
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                dateAndTime.set(Calendar.YEAR, year);
                dateAndTime.set(Calendar.MONTH, monthOfYear);
                dateAndTime.set(Calendar.DAY_OF_MONTH, dayOfMonth);

            }
        };

        new DatePickerDialog(mainActivity, d,
                dateAndTime.get(Calendar.YEAR),
                dateAndTime.get(Calendar.MONTH),
                dateAndTime.get(Calendar.DAY_OF_MONTH))
                .show();
    }
}
