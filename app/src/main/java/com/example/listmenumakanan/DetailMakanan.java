package com.example.listmenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {
    ImageView gambarmakanan_in;
    TextView namaMakanan_in, keteranganfood_in;

    String name_kunci="namamakanan";
    String ket_kunci="keterangan";
    int gambaremakanan;

    String namamakanan;
    String keteranganmakanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        gambarmakanan_in=findViewById(R.id.gambarterima);
        namaMakanan_in=findViewById(R.id.namefood);
        keteranganfood_in=findViewById(R.id.ketfood);

        Bundle bundle=getIntent().getExtras();

        gambaremakanan=bundle.getInt("gambaremakanan");
        gambarmakanan_in.setImageResource(gambaremakanan);
        namamakanan=bundle.getString("namamakanan");
        keteranganmakanan=bundle.getString("keter");
        namaMakanan_in.setText(namamakanan);
        keteranganfood_in.setText(keteranganmakanan);


    }
}