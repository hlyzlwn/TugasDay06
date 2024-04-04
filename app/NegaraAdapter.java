public class NegaraAdapter {

    import android.content.Context;
import android.content.Intent;
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

    public class BarangAdaptor extends RecyclerView.Adapter<BarangAdaptor.ViewHolder> {

        private ArrayList<ModelBarang> modelBarangArrayList;
        private Context context;

        public interface OnItemClickListener {
            void onItemClick(ModelBarang barang);
        }

        private OnItemClickListener listener;

        public void setOnItemClickListener(OnItemClickListener listener) {
            this.listener = listener;
        }




        public BarangAdaptor(ArrayList<ModelBarang> modelSepatu) {
            this.modelBarangArrayList = modelSepatu;
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
            ModelBarang barang = modelBarangArrayList.get(position);
            holder.namabarang.setText(barang.getNama_sepatu());
            holder.gambarbarang.setImageResource(barang.getGambar_sepatu());
            holder.deskripsibarang.setText(barang.getDeskripsi_sepatu());
            holder.hargabarang.setText(barang.getHarga_sepatu());


            holder.cardbarang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Mengirim objek Model_Sepatu yang diklik ke DetailActivity
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("BARANG_EXTRA", barang);
                    context.startActivity(intent);
                }
            });

        }


        @Override
        public int getItemCount() {
            return modelBarangArrayList.size();
        }




        public class ViewHolder extends RecyclerView.ViewHolder {
            CardView cardbarang;
            TextView namabarang;
            ImageView gambarbarang;
            TextView deskripsibarang;
            TextView hargabarang;
            ScrollView Teks_Scroll;


            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                cardbarang = itemView.findViewById(R.id.CardViewSepatu);
                Teks_Scroll = itemView.findViewById(R.id.scrolldeskripsi);
                namabarang = itemView.findViewById(R.id.TeksNama);
                gambarbarang = itemView.findViewById(R.id.Gambar);
                deskripsibarang = itemView.findViewById(R.id.textDeskripsi);
                hargabarang = itemView.findViewById(R.id.Rp1);
            }
        }
    }
}
