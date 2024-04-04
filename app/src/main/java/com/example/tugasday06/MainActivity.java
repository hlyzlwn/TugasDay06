package com.example.tugasday06;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NegaraAdapter negaraAdapter;
    private ArrayList<ModelNegara> modelNegaraArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdgeToEdge.enable(this);

        // Panggil metode isiDataBarang untuk mengisi data negara
        isiDataBarang();

        recyclerView = findViewById(R.id.Tampilan);

        // Buat objek negaraAdapter setelah mengisi data negara
        negaraAdapter = new NegaraAdapter(modelNegaraArrayList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Gunakan objek negaraAdapter untuk RecyclerView
        recyclerView.setAdapter(negaraAdapter);
    }

    private void isiDataBarang() {
        modelNegaraArrayList = new ArrayList<>();
        // Tambahkan item ke modelNegaraArrayList
        modelNegaraArrayList.add(new ModelNegara("AUSTRIA", R.drawable.negara1,
                "Negara : Austria\n" +
                        "Ibu kota: Wina\n" +
                        "Mata uang: Euro (EUR)\n" +
                        "Bahasa: Bahasa Jerman\n" +
                        "Lagu Kebangsaan: Land der Berge, Land am Strome\n" +
                        "Letak Astronomi: 47.5162° N, 14.5501° E\n" +
                        "Luas Wilayah: Sekitar 83,879 km²\n" +
                        "Batas Negara: Jerman, Republik Ceko, Slovakia, Hungaria, Slovenia, Italia, Swiss, Liechtenstein\n" +
                        "Bentuk Pemerintahan: Republik Federal Parlementer\n\n" +
                        "Austria merupakan salah satu negara tempat kelahiran Adolf Hitler, salah satu pemimpin paling buruk yang meletupkan Perang Dunia ll. Austria dianggap sebagai negara paling kaya tidak hanya di Eropa tetapi juga di dunia"));
        modelNegaraArrayList.add(new ModelNegara("BELGIA", R.drawable.negara2,
                "Negara : Belgia.\n" +
                        "Ibu kota: Brussels\n"+
                        "Mata uang: Euro (EUR)\n" +
                        "Bahasa: Bahasa Belanda, Bahasa Prancis, Bahasa Jerman\n"+
                        "Lagu Kebangsaan: LaBrabanconneDe\n"+
                        "Letak Astronomi: 50.8503° N, 4.3517° E\n"+
                        "Luas Wilayah: Sekitar 30,528 km²\n"+
                        "Batas Negara: Prancis, Jerman, Luksemburg, Belanda\n"+
                        "Bentuk Pemerintahan: Monarki Konstitusional Federal Parlementer\n\n"+
                        "Belgia dikenal sebagai negara penghasil cokelat. Selain itu, sektor terbesar Belgia adalah sektor industri, teknologi dan manufaktur, layaknya negara di Benua Eropa lainnya. Belgia memiliki benda yang jadi bahan ekspor seperti produk kimia, bahan dasar kimia dan olahan logam"));
        modelNegaraArrayList.add(new ModelNegara("PERANCIS", R.drawable.negara3,
                "Negara : Perancis.\n" +
                        "Ibu kota: Paris\n"+
                        "Mata uang: Euro (EUR)\n"+
                        "Bahasa: Bahasa Prancis\n"+
                        "Lagu Kebangsaan: La Marseillaise\n"+
                        "Letak Astronomi: 46.6034° N, 1.8883° E\n"+
                        "Luas Wilayah: Sekitar 551,695 km²\n"+
                        "Batas Negara: Belgia, Luksemburg, Jerman, Swiss, Italia, Spanyol, Andorra, Monako\n"+
                        "Bentuk Pemerintahan: Republik Semi-Presidensial\n"+
                        "Perancis memiliki perekonomian negara yang cukup bagus. Pada tahun 2022, posisi perekonomiannya berada di posisi ke-26 negara dengan pendapatan per kapita tertinggi di dunia. Sektor teknologi, manufaktur dan pariwisata jadi sektor paling menopang di Perancis"));
        modelNegaraArrayList.add(new ModelNegara("SWISS", R.drawable.negara4,
                "Negara : Swiss.\n" +
                        "Ibu Kota: Bern\n"+
                        "Mata Uang: Swiss Franc (CHF)\n"+
                        "Bahasa Negara: Bahasa Jerman, Bahasa Prancis, Bahasa Italia, Bahasa Romansh\n"+
                        "Lagu Kebangsaan: Swiss Psalm (Teks: Leonhard Widmer, Musik: Alberich Zwyssig)\n"+
                        "Letak Astronomi: sekitar 46.8182° N lintang dan 8.2275° E bujur\n"+
                        "Luas Wilayah: Sekitar 41,290 km²\n"+
                        "Batas Negara: Jerman, Prancis, Italia, Austria, Liechtenstein\n"+
                        "Bentuk Pemerintahan: Republik Federal Parlementer\n\n"+
                        "Swiss memiliki banyak lokasi wisata di dalam kota dan alam yang menarik serta indah dilihat. Sektor pariwisata jadi salah satu sektor yang menopang perekonomian Swiss. Selain itu, perbankan juga jadi sumber pendapatan terbesar Swiss dan menyerap banyak tenaga kerja"));
        modelNegaraArrayList.add(new ModelNegara("MONAKO", R.drawable.negara5,
                "Negara : Monako.\n" +
                        "Ibu Kota: Monaco\n"+
                        "Mata Uang: Euro (EUR)\n"+
                        "Bahasa Negara: Bahasa Prancis\n"+
                        "Lagu Kebangsaan: Monaco, Le Rocher, sa plage, ses vallées, ses montagnes\n"+
                        "Letak Astronomi: sekitar 43.7384° N lintang dan 7.4246° E bujur\n"+
                        "Luas Wilayah: Sekitar 2.02 km²\n"+
                        "Batas Negara: Prancis\n"+
                        "Bentuk Pemerintahan: Monarki Konstitusional\n\n"+
                        "Sumber pendapatan Monako paling banyak bersumber dari sektor jasa dan pariwisata. Selain itu, Monako juga memiliki industri hiburan dan dunia malam yang cukup kuat, menarik para turis untuk berkunjung. "));
        modelNegaraArrayList.add(new ModelNegara("LUKSEMBURG", R.drawable.negara6,
                "Negara : Luksemburg\n" +
                        "Ibu Kota: Luksemburg\n"+
                        "Mata Uang: Euro (EUR)\n"+
                        "Bahasa Negara: Bahasa Luksemburg, Bahasa Prancis, Bahasa Jerman\n"+
                        "Lagu Kebangsaan: Ons Heemecht (Negara Kami)\n"+
                        "Letak Astronomi: sekitar 49.8153° N lintang dan 6.1296° E bujur\n"+
                        "Luas Wilayah: Sekitar 2,586 km²\n"+
                        "Batas Negara: Belgia, Prancis, Jerman\n"+
                        "Bentuk Pemerintahan: Monarki Konstitusional\n"+
                        "Luksemburg termasuk negara yang terkenal dengan sektor industri jasa seperti teknologi telekomunikasi dan perbankan yang berkembang di dalamnya. Selain itu, Luksemburg juga memiliki bahan dasar yang diekspor seperti besi, kaca, karet dan alumunium. "));
        modelNegaraArrayList.add(new ModelNegara("JERMAN", R.drawable.negara7,
                "Negara : Jerman.\n" +
                        "Ibu kota: Brussels\n"+
                        "Mata uang: Euro (EUR)\n" +
                        "Bahasa: Bahasa Belanda, Bahasa Prancis, Bahasa Jerman\n"+
                        "Lagu Kebangsaan: LaBrabanconneDe\n"+
                        "Letak Astronomi: 50.8503° N, 4.3517° E\n"+
                        "Luas Wilayah: Sekitar 30,528 km²\n"+
                        "Batas Negara: Prancis, Jerman, Luksemburg, Belanda\n"+
                        "Bentuk Pemerintahan: Monarki Konstitusional Federal Parlementer\n\n"+
                        "Teknologi dan manufaktur merupakan sektor terkuat di Jerman. Jerman juga banyak mengekspor produk kendaraan bermotor dan mesin ke sejumlah negara lain seperti Inggris, Cina dan Amerika Serikat. "));
        modelNegaraArrayList.add(new ModelNegara("BELANDA", R.drawable.negara8,
                "Negara : Belanda.\n" +
                        "Ibu Kota: Amsterdam\n"+
                        "Mata Uang: Euro (EUR)\n"+
                        "Bahasa Negara: Bahasa Belanda\n"+
                        "Lagu Kebangsaan: Wilhelmus van Nassouwe\n"+
                        "Letak Astronomi: sekitar 52.3676° N lintang dan 4.9041° E bujur\n"+
                        "Luas Wilayah: Sekitar 41,543 km²\n"+
                        "Batas Negara: Belgia, Jerman\n"+
                        "Bentuk Pemerintahan: Monarki Konstitusional\n\n"+
                                "Pada tahun 2022, Belanda sempat menempati urutan ke-15 dalam total pendapatan per kapita. Sektor manufaktur dan industri menjadi sumber utama penghasilan Belanda sekaligus banyak menyerap lapangan kerja. Belanda juga banyak mengekspor minyak bumi dan olahan makanan"));
        modelNegaraArrayList.add(new ModelNegara("LIECHTENSTEIN", R.drawable.negara9,
                "Negara : Liechtenstein\n" +
                        "Ibu Kota: Vaduz\n"+
                        "Mata Uang: Swiss Franc (CHF)\n"+
                        "Bahasa Negara: Bahasa Jerman\n"+
                        "Lagu Kebangsaan: Oben am jungen Rhein\n"+
                        "Letak Astronomi: sekitar 47.166° N lintang dan 9.555° E bujur\n"+
                        "Luas Wilayah: Sekitar 160 km²\n"+
                        "Batas Negara: Swiss, Austria\n"+
                        "Bentuk Pemerintahan: Monarki Konstitusional\n\n"+
                        "Meski luasnya ¼ kota Jakarta tetapi diakui sebagai negara dengan pendapatan per kapita tertinggi di dunia. Negara Liechtenstein terkenal dengan sektor industri dan teknologi yang mumpuni. "));
        modelNegaraArrayList.add(new ModelNegara("DENMARK", R.drawable.negara10,
                "Negara : Denmark \n" +
                        "Ibu Kota: Kopenhagen\n"+
                        "Mata Uang: Krone Denmark (DKK)\n"+
                        "Bahasa Negara: Bahasa Denmark\n"+
                        "Lagu Kebangsaan: Der er et yndigt land (Ada Sebuah Negeri yang Indah)\n"+
                        "Letak Astronomi: sekitar 56.2639° N lintang dan 9.5018° E bujur\n"+
                        "Luas Wilayah: Sekitar 42,924 km²\n"+
                        "Batas Negara: Jerman, Swedia, Norwegia\n"+
                        "Bentuk Pemerintahan: Monarki Konstitusional\n\n"+
                        "Denmark termasuk negara di benua Eropa Utara yang maju dengan pendapatan perkapita tinggi yaitu sebesar US$49.600. Denmark memiliki pasar modern dalam sektor teknologi tinggi dan perusahaan terkemuka di bidang pelayaran, farmasi dan energi terbarukan"));
        modelNegaraArrayList.add(new ModelNegara("FINLANDIA", R.drawable.negara11,
                "Negara : Finlandia\n" +
                        "Ibu Kota: Helsinki\n"+
                        "Mata Uang: Euro (EUR)\n"+
                        "Bahasa Negara: Bahasa Finlandia, Bahasa Swedia\n"+
                        "Lagu Kebangsaan: Maamme (Tanah Air Kami)\n"+
                        "Letak Astronomi: sekitar 61.9241° N lintang dan 25.7482° E bujur\n"+
                        "Luas Wilayah: Sekitar 338,455 km²\n"+
                        "Batas Negara: Swedia, Norwegia, Rusia\n"+
                        "Bentuk Pemerintahan: Republik Parlementer\n\n"+
                        "Finlandia termasuk negara maju dengan pendapatan perkapita tinggi yaitu sebesar US$44.500. Finlandia memiliki industri yang menjadi tulang punggung negaranya seperti produk logam, elektronik, mesin, kimia, tekstil, perkapalan dan pakaian."));
        modelNegaraArrayList.add(new ModelNegara("ISLANDIA", R.drawable.negara12,
                "Negara : Islandia\n" +
                        "Ibu Kota: Reykjavik\n"+
                        "Mata Uang: Krona Islandia (ISK)\n"+
                        "Bahasa Negara: Bahasa Islandia\n"+
                        "Lagu Kebangsaan: Lofsöngur (Lagu Kebangsaan Islandia)\n" +
                        "Letak Astronomi: sekitar 64.9631° N lintang dan 19.0208° W bujur\n" +
                        "Luas Wilayah: Sekitar 103,000 km²\n"+
                        "Batas Negara: Tidak berbatasan dengan negara lain\n"+
                        "Bentuk Pemerintahan: Republik Parlementer\n\n"+
                        "Islandia termasuk negara Skandavia yang merupakan negara makmur dengan tingkat keamanan tinggi, dikenal juga sebagai negara yang ramah bagi orang asing dan memiliki teknologi canggih"));
        modelNegaraArrayList.add(new ModelNegara("NORWEGIA", R.drawable.negara13,
                "Negara : Norwegia\n" +
                        "Ibu Kota: Oslo\n"+
                        "Mata Uang: Krona Norwegia (NOK)\n"+
                        "Bahasa Negara: Bahasa Norwegia\n"+
                        "Lagu Kebangsaan: Ja, vi elsker dette landet (Ya, Kita Cinta Negeri Ini)\n"+
                        "Letak Astronomi: sekitar 60.4720° N lintang dan 8.4689° E bujur\n"+
                        "Luas Wilayah: Sekitar 323,802 km²\n"+
                        "Batas Negara: Swedia, Finlandia, Rusia\n"+
                        "Bentuk Pemerintahan: Monarki Konstitusional\n\n"+
                        "Norwegia termasuk negara dengan angka kriminalitas rendah, pemandangan wisata yang mengagumkan,  kesetaraan gender terbaik dalam bidang pendidikan, sosial dan kebudayaan"));
        modelNegaraArrayList.add(new ModelNegara("SWEDIA", R.drawable.negara14,
                "Negara : Swedia\n" +
                        "Ibu Kota: Stockholm\n"+
                        "Mata Uang: Krona Swedia (SEK)\n"+
                        "Bahasa Negara: Bahasa Swedia\n"+
                        "Lagu Kebangsaan: Du gamla, du fria (Kau yang Tua, Kau yang Merdeka)\n"+
                        "Letak Astronomi: sekitar 60.1282° N lintang dan 18.6435° E bujur\n"+
                        "Luas Wilayah: Sekitar 450,295 km²\n"+
                        "Batas Negara: Norwegia, Finlandia\n"+
                        "Bentuk Pemerintahan: Monarki Konstitusional\n\n"+
                        "Swedia negara terluas ketiga di Uni Eropa dengan total penduduk 9,8 juta jiwa. Swedia termasuk negara maju di Eropa Utara dengan PDB terkaya ke tujuh di dunia"));
        modelNegaraArrayList.add(new ModelNegara("ITALIA", R.drawable.negara15,
                "Negara : Italia\n" +
                        "Ibu Kota: Roma\n"+
                        "Mata Uang: Euro (EUR)\n"+
                        "Bahasa Negara: Bahasa Italia\n"+
                        "Lagu Kebangsaan: Il Canto degli Italiani (Lagu Italia)\n"+
                        "Letak Astronomi: sekitar 41.8719° N lintang dan 12.5674° E bujur\n"+
                        "Luas Wilayah: Sekitar 301,340 km²\n"+
                        "Batas Negara: Prancis, Swiss, Austria, Slovenia\n"+
                        "Bentuk Pemerintahan: Republik Parlementer\n\n"+
                        "Selain Italia dikenal sebagai pusat peradaban jaman kuno, jumlah perusahaan multinasioanl global yang dimiliki oleh Italia memang terbilang sedikit. Namun Italia memiliki usaha kecil dan menengah dalam jumlah besar yang jadi tulang punggung perekonomian Italia."));

    }
}
