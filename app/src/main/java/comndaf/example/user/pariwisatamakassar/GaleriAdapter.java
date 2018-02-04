package comndaf.example.user.pariwisatamakassar;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class GaleriAdapter extends RecyclerView.Adapter<GaleriAdapter.ViewHolder> {
    private String url[];
    private Context context;

    public GaleriAdapter (String[] url, Context context) {
        this.url = url;
        this.context = context;
    }

    @Override
    public GaleriAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_galeri_adapter, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(GaleriAdapter.ViewHolder holder, int position) {
        Picasso.with(context).load(url[position]).placeholder(R.drawable.h).error(R.drawable.hihi).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return url.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        public ViewHolder (View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.gambar);
        }
    }
}
