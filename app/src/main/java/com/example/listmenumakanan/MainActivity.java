package com.example.listmenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nama_makanan[]={"barobbo","coto","konrobakar","sopkonro","sopsaudara","espisangijo"};

        int img_makanan[]={R.drawable.barobbo, R.drawable.coto, R.drawable.konrobakar, R.drawable.sopkonro,R.drawable.sopsaudara,R.drawable.espiasangijo};

        String harga_makanan[]={"20000", "25000", "95000", "50000","20000","15000"};

        String keterangan[]={"Ini Deskripsi"};
        listView = findViewById(R.id.listmakanan);
        Adapter adapter = new Adapter(nama_makanan, harga_makanan, img_makanan, this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name_makanan=nama_makanan[position].toString();
                int gpr_makanan=img_makanan[position];
                String ket=keterangan[position].toString();
                Intent intent=new Intent(MainActivity.this,DetailMakanan.class);
                intent.putExtra("namamakanan",name_makanan);
                intent.putExtra("gambaremakanan",gpr_makanan);
                intent.putExtra("keter",ket);
                startActivity(intent);
            }
        });



    }
}