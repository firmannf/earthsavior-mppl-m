package id.or.codelabs.earthsavior.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.or.codelabs.earthsavior.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IntroTigaAplikasi extends Fragment {


    public IntroTigaAplikasi() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_intro_tiga_aplikasi, container, false);
    }

}
