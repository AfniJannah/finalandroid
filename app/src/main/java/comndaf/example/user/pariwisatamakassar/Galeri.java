package comndaf.example.user.pariwisatamakassar;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Galeri extends Fragment{
    RecyclerView rc;
    public String images[] = {
            "http://www.dutawisata.co.id/wp-content/uploads/2016/07/tugu-jogja.jpg",
            "http://i0.wp.com/alampriangan.com/wp-content/uploads/2016/06/Candi-Prambanan.png",
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vi = inflater.inflate(R.layout.activity_galeri, null);
        rc = (RecyclerView) vi.findViewById(R.id.rv);
        rc.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new GridLayoutManager(getContext(), 2);
        rc.setLayoutManager(lm);

        GaleriAdapter galeri = new GaleriAdapter(images, getContext());
        rc.setAdapter(galeri);
        return vi;
    }
}
