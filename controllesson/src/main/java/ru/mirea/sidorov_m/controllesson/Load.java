package ru.mirea.sidorov_m.controllesson;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;

public class Load {
    public Load(Context context) {
        ProgressDialog pd = new ProgressDialog(context);

        pd.setTitle("Sidorov Maxim");

        pd.setMessage("BSBO-02-20");

        pd.setButton(Dialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        pd.show();
    }
}
