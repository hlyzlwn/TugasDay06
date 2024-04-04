package com.example.tugasday06;

import android.content.Context;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NegaraAdapter extends RecyclerView.Adapter<NegaraAdapter.ViewHolder> {

    private ArrayList<ModelNegara> modelNegaraArrayList;
    private Context context;

    public interface OnItemClickListener {
        void onItemClick(ModelNegara barang);
    }

    private OnItemClickListener listener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }


    public NegaraAdapter(ArrayList<ModelNegara> modelNegaraArrayList) {
        this.modelNegaraArrayList = modelNegaraArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelNegara negara = modelNegaraArrayList.get(position);
        holder.namaNegara.setText(negara.getNamaNegara());
        holder.gambarNegara.setImageResource(negara.getGambarNegara());
        holder.deskripsi.setText(negara.getDeskripsi());

        holder.cardNegara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengirim objek ModelNegara yang diklik ke DetailActivity
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("NEGARA_EXTRA", negara);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelNegaraArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardNegara;
        TextView namaNegara;
        ImageView gambarNegara;
        TextView deskripsi;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardNegara = itemView.findViewById(R.id.CardViewNegara);
            namaNegara = itemView.findViewById(R.id.TeksNama);
            gambarNegara = itemView.findViewById(R.id.Gambar);
            deskripsi = itemView.findViewById(R.id.textDeskripsi);
        }
    }
}
