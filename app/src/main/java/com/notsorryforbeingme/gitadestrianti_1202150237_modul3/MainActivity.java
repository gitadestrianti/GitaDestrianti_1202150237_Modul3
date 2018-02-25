package com.notsorryforbeingme.gitadestrianti_1202150237_modul3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    //Deklarasi Variabel
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> Minuman;
    private ArrayList<Integer> Gambar;
    private ArrayList<String> Deskripsi;
    private GridLayoutManager mmLayoutManager;


    //Daftar Nama Minuman
    private String[] minuman = {"Aqua", "Pristine", "LeMinerale", "Cleo", "Club", "Amidis","Ades","Evian","Equil","Nestle","Vit"};
    //Daftar Deskripsi Minuman
    private String[] deskripsi = {"Ini adalah air mineral merk Aqua", "Ini adalah air mineral merk Pristine", "Ini adalah air mineral merk LeMinerale",
            "Ini adalah air mineral merk Cleo", "Ini adalah air mineral merk Club", "Ini adalah air mineral merk Amidis","Ini adalah air mineral merk Ades",
    "Ini adalah air mineral merk Evian","Ini adalah air mineral merk Equil","Ini adalah air mineral merk Nestle","Ini adalah air mineral merk Vit"};
    //Daftar Gambar Minuman
    private int[] gambar = {R.drawable.gambaraqua, R.drawable.pristine,  R.drawable.leminerale,
            R.drawable.cleo, R.drawable.club, R.drawable.amidis, R.drawable.ades, R.drawable.evian, R.drawable.equil, R.drawable.nestle, R.drawable.vit };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //membuat objek arraylist
        Minuman = new ArrayList<>();
        Deskripsi = new ArrayList<>();
        Gambar = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        DaftarItem();

        //Menggunakan Layout Manager dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(Minuman, Deskripsi, Gambar);

        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);

        //agar saat di landscape layout manager akan mengambil data dari grid_column_count yang ada di folder integers.xml


        
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int w=0; w<minuman.length; w++){
            Gambar.add(gambar[w]);
            Minuman.add(minuman[w]);
            Deskripsi.add(deskripsi[w]);
        }
    }
}