/*
Tanggal Pengerjaan      : Terakhir 4 Juni 2021 22:44
NIM                     : 10118039
Nama                    : Fatahillah Satria Bima Seno
Kelas                   : AKB-1 atau IF-1
 */

package com.fathsbs.bio_app_10118039.menuFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fathsbs.bio_app_10118039.Adapter.GalleryAdapter;
import com.fathsbs.bio_app_10118039.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragment extends Fragment {




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GalleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GalleryFragment newInstance(String param1, String param2) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    GalleryAdapter galleryAdapter;

    int []arr ={R.drawable.pictures1,R.drawable.pictures2,R.drawable.pictures3,R.drawable.pictures4,R.drawable.pictures5,R.drawable.pictures6,R.drawable.pictures7,R.drawable.pictures8,R.drawable.pictures9,R.drawable.pictures10,R.drawable.pictures11,R.drawable.pictures12};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        recyclerView= view.findViewById(R.id.galleryRecyclerView);
        layoutManager= new GridLayoutManager(getActivity(),2);
        recyclerView.setLayoutManager(layoutManager);
        galleryAdapter= new GalleryAdapter(arr);
        recyclerView.setAdapter(galleryAdapter);
        recyclerView.setHasFixedSize(true);

        return view;

    }


}