package com.notsorryforbeingme.gitadestrianti_1202150237_modul3;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> arrayListMinuman; //Digunakan untuk Nama Minuman
    private ArrayList<String> arrayListDeskripsi; //Digunakan untuk deskripsi
    private ArrayList<Integer> gambarMinuman; //Digunakan untuk Image/Gambar

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerViewAdapter(ArrayList<String> arrayListMinuman, ArrayList<String> arrayListDeskripsi, ArrayList<Integer> gambarMinuman){
        this.arrayListMinuman = arrayListMinuman;
        this.arrayListDeskripsi = arrayListDeskripsi;
        this.gambarMinuman = gambarMinuman;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView minuman, deskripsi;
        private ImageView gambar;
        private CardView ItemList;

        ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            minuman = itemView.findViewById(R.id.minuman);
            deskripsi = itemView.findViewById(R.id.deskripsi);
            gambar = itemView.findViewById(R.id.icon);
            ItemList = itemView.findViewById(R.id.item_list);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewAdapter.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String nama = arrayListMinuman.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String harga = arrayListDeskripsi.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer gambar = gambarMinuman.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.minuman.setText(nama);
        holder.deskripsi.setText("Deskripsi : "+harga);
        holder.gambar.setImageResource(gambar); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat Judul Pada List ditekan
        holder.minuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //Saat list ditekan, yang dilakukan adalah menampilkan...
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailMinuman.class);
                String deskripsiMinuman="We can answer that question in many different ways. Water is what wets windows when it rains, what we drink when we feel thirsty, and what covers about 70% of Earth's surface. But what exactly is it?\n"+
                        "\n" + "Chemically speaking, water is a liquid substance made of molecules—a single, large drop of water weighing 0.1g contains about 3 billion trillion (3,000,000,000,000,000,000,000) of them! Each molecule of water is made up of three atoms: two hydrogen atoms locked in a sort of triangle with one oxygen atom—giving us the famous chemical formula H2O. The slightly imbalanced structure of water molecules (explained in the box below) means they attract and stick to many different substances. That's also why all kinds of things will dissolve in water, which is sometimes called a \"universal solvent\". Water can even dissolve the solid rocks from which our planet is made, though the process does take many years, decades, or even centuries.\n" +
                        "\n" + "Most of the water in our world is a combination of \"ordinary\" hydrogen atoms with \"ordinary\" oxygen atoms, but there are actually three different istopes (atomic varieties) of hydrogen and each of those can combine with oxygen to give a different kind of water. If deuterium (hydrogen whose atoms contain one neutron and one proton instead of just one proton by itself) combines with oxygen, we get something called heavy water, which is about 10% heavier than normal water. Similarly, tritium (hydrogen with two neutrons and one proton) can combine with oxygen to make something called superheavy water.";
                switch (position){
                    case 0:
                        intent.putExtra("minuman", arrayListMinuman.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", gambarMinuman.get(position));
                        intent.putExtra("deskripsiMinuman", deskripsiMinuman);
                        view.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("minuman", arrayListMinuman.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", gambarMinuman.get(position));
                        intent.putExtra("deskripsiMinuman", deskripsiMinuman);
                        view.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("minuman", arrayListMinuman.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", gambarMinuman.get(position));
                        intent.putExtra("deskripsiMinuman", deskripsiMinuman);
                        view.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("minuman", arrayListMinuman.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", gambarMinuman.get(position));
                        intent.putExtra("deskripsiMinuman", deskripsiMinuman);
                        view.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("minuman", arrayListMinuman.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", gambarMinuman.get(position));
                        intent.putExtra("deskripsiMinuman", deskripsiMinuman);
                        view.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("minuman", arrayListMinuman.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", gambarMinuman.get(position));
                        intent.putExtra("deskripsiMinuman", deskripsiMinuman);
                        view.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("minuman", arrayListMinuman.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", gambarMinuman.get(position));
                        intent.putExtra("deskripsiMinuman", deskripsiMinuman);
                        view.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("minuman", arrayListMinuman.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", gambarMinuman.get(position));
                        intent.putExtra("deskripsiMinuman", deskripsiMinuman);
                        view.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("minuman", arrayListMinuman.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", gambarMinuman.get(position));
                        intent.putExtra("deskripsiMinuman", deskripsiMinuman);
                        view.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("minuman", arrayListMinuman.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", gambarMinuman.get(position));
                        intent.putExtra("deskripsiMinuman", deskripsiMinuman);
                        view.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("minuman", arrayListMinuman.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", gambarMinuman.get(position));
                        intent.putExtra("deskripsiMinuman", deskripsiMinuman);
                        view.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        //Menghitung Ukuran/Jumlah Data Yang Akan Ditampilkan Pada RecyclerView
        return arrayListMinuman.size();
    }

}