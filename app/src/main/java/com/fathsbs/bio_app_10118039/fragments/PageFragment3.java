package com.fathsbs.bio_app_10118039.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.fathsbs.bio_app_10118039.R;
import com.fathsbs.bio_app_10118039.MenuActivity;

public class PageFragment3 extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.pager_3, container, false);

        Button btn = rootView.findViewById(R.id.buttonGo);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindahMenu(v);
            }
        });

        return rootView;
    }

    public void pindahMenu(View view) {
        Intent intent = new Intent(getActivity(), MenuActivity.class);
        startActivity(intent);
    }
}
