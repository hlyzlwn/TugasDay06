package com.example.tugasday06;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("NEGARA_EXTRA")) {
            ModelNegara negara = (ModelNegara) intent.getSerializableExtra("NEGARA_EXTRA");

            TextView namaNegara = findViewById(R.id.Nama);
            ImageView imageView = findViewById(R.id.imageView);
            TextView deskripsiTextView = findViewById(R.id.Deskripsi);
            Button btnShare = findViewById(R.id.Button);

            namaNegara.setText(negara.getNamaNegara());
            imageView.setImageResource(negara.getGambarNegara());
            deskripsiTextView.setText(negara.getDeskripsi());

            btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    String text = negara.getNamaNegara() + "\n" + negara.getGambarNegara() + "\n" + negara.getDeskripsi();
                    shareIntent.putExtra(Intent.EXTRA_TEXT, text);
                    startActivity(Intent.createChooser(shareIntent, "Bagikan Dengan"));
                }
            });

        }
            };
        }
