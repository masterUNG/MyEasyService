package app.ewtc.masterung.myeasyservice.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.ewtc.masterung.myeasyservice.R;

/**
 * Created by masterung on 21/10/2017 AD.
 */

public class MainFragment extends Fragment{

//    การสร้างหน้ากาก
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}   // Main Class