package jp.ac.asojuku.jyousib.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.*;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class Tab2Myimage extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2myimage, container, false);
        return rootView;
    }
}
