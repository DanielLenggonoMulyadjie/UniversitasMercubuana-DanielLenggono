package com.example.daniellenggonotesttoast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        //Click Toast
        public void clickToast(View view){
            Toast toast = Toast.makeText(this, "Toast Muncul Sebentar", Toast.LENGTH_SHORT);
            toast.show();
        }

        //Click Toast1
        public void clickToast1(View view){
            Toast toast1 = Toast.makeText(this, "Toast Muncul Lama", Toast.LENGTH_LONG);
            toast1.show();
        }

        //Click Toast2
        public void clickToast2(View view){
            Toast toast2 = Toast.makeText(this, "Maaf, Fitur Ini Tidak Berfungsi, Sudah Coba Cara Lain Tapi Tetap Tidak Bisa", Toast.LENGTH_LONG);
            toast2.setGravity(Gravity.CENTER|Gravity.CENTER, 0,0);
            toast2.show();
        }


    //Click Dialog
        public void  clickDialog(View view){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Mau Di Lanjutkan")
                    .setTitle("PERINGATAN")
                    .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            Toast toast = Toast.makeText(getApplicationContext(), "YA", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    })
                    .setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            Toast toast = Toast.makeText(getApplicationContext(), "TIDAK", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    })
                    .setNeutralButton("BATAL", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alert = builder.create();
            alert.show();
        }

}


