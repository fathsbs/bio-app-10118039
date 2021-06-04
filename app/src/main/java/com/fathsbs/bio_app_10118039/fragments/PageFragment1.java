/*
Tanggal Pengerjaan      : Terakhir 4 Juni 2021 22:44
NIM                     : 10118039
Nama                    : Fatahillah Satria Bima Seno
Kelas                   : AKB-1 atau IF-1
 */

package com.fathsbs.bio_app_10118039.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.fathsbs.bio_app_10118039.R;

public class PageFragment1 extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.pager_1,container,false);
        return rootView;
    }
}
