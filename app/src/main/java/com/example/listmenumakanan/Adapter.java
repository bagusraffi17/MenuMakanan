package com.example.listmenumakanan;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends ArrayAdapter {
    String[] namaMakanan;
    String[] hargaMakanan;
    int[] imgGambar;
    Activity activity;

    public Adapter(String[] nama_makanan, String[] harga_makanan, int[] img_gambar, Activity activity) {
        super(activity, R.layout.list_item, nama_makanan);
        this.namaMakanan = nama_makanan;
        this.hargaMakanan = harga_makanan;
        this.imgGambar = img_gambar;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        @SuppressLint({"ViewHolder", "InflateParams"}) View v = inflater.inflate(R.layout.list_item, null);

        ImageView gambar;
        TextView nm_makanan;
        TextView price_makanan;

        gambar = v.findViewById(R.id.img_makanan);
        nm_makanan = v.findViewById(R.id.nama_makanan);
        price_makanan = v.findViewById(R.id.harga_makanan);

        gambar.setImageResource(imgGambar[position]);
        nm_makanan.setText(namaMakanan[position]);
        price_makanan.setText(hargaMakanan[position]);

        return v;
    }
}
