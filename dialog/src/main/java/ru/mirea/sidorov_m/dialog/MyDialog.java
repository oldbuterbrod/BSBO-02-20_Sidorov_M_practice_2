package ru.mirea.sidorov_m.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Sidorov Maxim").setMessage("Wake up, samurai! We have android to do ").setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("Do Android", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((MainActivity) getActivity()).Clicked();
                        dialog.cancel();
                    }
                })

                .setNeutralButton("I use Iphone", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((MainActivity) getActivity()).Clicked();
                        dialog.cancel();
                    }
                })

                .setNegativeButton("No I don't think I will", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((MainActivity) getActivity()).Clicked();
                        dialog.cancel();
                    }
                });

        return builder.create();
    }
}
