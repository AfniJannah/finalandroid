package comndaf.example.user.pariwisatamakassar;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class LokasiWisata extends Fragment implements OnMapReadyCallback, View.OnClickListener {
    GoogleMap map;
    Button a, b, c, d;
    SupportMapFragment mp;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View ti = inflater.inflate(R.layout.activity_lokasi_wisata, null);
        mp = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.mapFragment);
        mp.getMapAsync(this);
        a = (Button)
                ti.findViewById(R.id.normal);
        b = (Button)
                ti.findViewById(R.id.satelit);
        c = (Button)
                ti.findViewById(R.id.hybrid);
        d = (Button)
                ti.findViewById(R.id.terrain);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        return ti;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        LatLng tugu_jogja = new LatLng(-7.7828893, 110.3648875);

        map.addMarker(new MarkerOptions().position(tugu_jogja).title("Tugu Jogja"));

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(tugu_jogja, 0));
    }

    @Override
    public void onClick(View v) {
        int tombol = v.getId();
        if (tombol == R.id.normal) {
            map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        }
        if (tombol == R.id.satelit) {
            map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        }
        if (tombol == R.id.hybrid) {
            map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        }
        if (tombol == R.id.terrain) {
            map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        }
    }
}
