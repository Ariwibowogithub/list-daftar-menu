package me.enzd.menumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rec_Makanan;
    private ArrayList <Kuliner> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rec_Makanan = findViewById(R.id.rec_Makanan);
        initData();

        // memanggil class KulinerAdapter agar menu muncul
        rec_Makanan.setAdapter(new KulinerAdapter(listMakanan));
        rec_Makanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData() {
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Kuliner("Pecel Lele",
                "Rp. 15.000",
                "Pecel lele dengan sambal yang pedas manis dan kriuk yang sangat lezat",
                R.drawable.pecellele));

        listMakanan.add(new Kuliner("Nasi Goreng Mercon",
                "Rp. 14.500",
                "Nasi goreng mercon dengan toping telur dan level kepedasan yang sangat menggoda",
                R.drawable.nasigorengmercon));

        listMakanan.add(new Kuliner("Ayam Geprek Keju",
                "Rp. 20.000",
                "Ayam geprek dengan tambahan toping di atasnya yang membuat semakin lezat",
                R.drawable.nagorkeju));
        listMakanan.add(new Kuliner("Kari Ayam",
                "Rp. 17.500",
                "Ayam dengan bumbu kari khas sepsial semarang",
                R.drawable.kariayam));
        listMakanan.add(new Kuliner("Tahu Bulat",
                "Rp. 500",
                "Tahu bulat dengan sambal yang sangat lezat dan nikmat",
                R.drawable.tahubulat));
        listMakanan.add(new Kuliner("Salad Buah",
                "Rp. 12.000",
                "makan salad buah dapat membuat diri anda semakin fresh",
                R.drawable.saladbuah));
    }


}