package com.notsorryforbeingme.gitadestrianti_1202150237_modul3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMinuman extends AppCompatActivity {

    //deklarasi variabel
    ImageView baterai;
    TextView ukuran;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_minuman);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //membuat button back pada action bar muncul

        //menerima nilai yang dilempar dari activity menu sebelumnya
        String minuman = getIntent().getStringExtra("minuman");
        String deskripsi = getIntent().getStringExtra("deskripsi");
        String deskripsiMinuman = getIntent().getStringExtra("deskripsiMinuman");
        Integer image = getIntent().getIntExtra("gambar", 0);

        //mendefinisikan semua kompenen berdasarkan id
        TextView tvMinuman = findViewById(R.id.namaMinuman);
        TextView tvDeskripsi = findViewById(R.id.deskripsi);
        TextView tvDeskripsiMinuman = findViewById(R.id.deskripsiMinuman);
        ImageView images = findViewById(R.id.gambar);

        //menyimpan nilai yang sudah ditangkap kedalam kompenen yang sudah di definisikan
        tvMinuman.setText(minuman);
        tvDeskripsi.setText(deskripsi);
        tvDeskripsiMinuman.setText(deskripsiMinuman);
        images.setImageResource(image);


        baterai = findViewById(R.id.baterai);
        ukuran = findViewById(R.id.ukuran);


        baterai.setImageLevel(i);
        ukuran.setText(i + "L");
    }

    @Override
    public boolean onSupportNavigateUp() {
        //ketika button back di klik maka akan ke view sebelumnya.
        onBackPressed();
        return true;
    }

    //method jika button plus ditekan
    public void tambah(View v) {
        i++;
        if (i == 1) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
            Toast.makeText(this, "Air Sedikit", Toast.LENGTH_LONG).show();
        } else if (i == 2) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 3) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 4) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 5) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 6) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 7) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
            Toast.makeText(this, "Air Sudah Full", Toast.LENGTH_LONG).show();
        }
    }

    //method jika button minus ditekan
    public void kurang(View v) {
        i--;
        if (i == 1) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
            Toast.makeText(this, "Air Sedikit", Toast.LENGTH_LONG).show();
        } else if (i == 2) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 3) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 4) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 5) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 6) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
        } else if (i == 7) {
            baterai.setImageLevel(i);
            ukuran.setText(i + "L");
            Toast.makeText(this, "Air Sudah Full", Toast.LENGTH_LONG).show();
        }
    }


}
