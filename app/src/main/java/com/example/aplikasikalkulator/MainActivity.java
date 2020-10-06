package com.example.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputPertama;
    private EditText inputKedua;
    private TextView viewHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputPertama = findViewById(R.id.input_pertama);
        inputKedua = findViewById(R.id.input_kedua);
        viewHasil = findViewById(R.id.view_hasil);
    }


    public void tambah(View view) {
        String sAngka1 = inputPertama.getText().toString();
        String sAngka2 = inputKedua.getText().toString();
        double angka1 = Double.parseDouble(sAngka1);
        double angka2 = Double.parseDouble(sAngka2);
        double jumlah = angka1 + angka2;
        viewHasil.setText(""+jumlah);

    }

    public void kurang(View view) {
        String sAngka1 = inputPertama.getText().toString();
        String sAngka2 = inputKedua.getText().toString();
        double angka1 = Double.parseDouble(sAngka1);
        double angka2 = Double.parseDouble(sAngka2);
        double jumlah = angka1 - angka2;
        viewHasil.setText(""+jumlah);

    }

    public void kali(View view) {
        String sAngka1 = inputPertama.getText().toString();
        String sAngka2 = inputKedua.getText().toString();
        double angka1 = Double.parseDouble(sAngka1);
        double angka2 = Double.parseDouble(sAngka2);
        double jumlah = angka1 * angka2;
        viewHasil.setText(""+jumlah);

    }

    public void bagi(View view) {
        String sAngka1 = inputPertama.getText().toString();
        String sAngka2 = inputKedua.getText().toString();
        double angka1 = Double.parseDouble(sAngka1);
        double angka2 = Double.parseDouble(sAngka2);
        double jumlah = angka1 / angka2;
        viewHasil.setText(""+jumlah);

    }

    public void bersihkan(View view){
        inputPertama.setText("");
        inputKedua.setText("");
        viewHasil.setText("");
    }
}