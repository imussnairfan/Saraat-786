package com.example.project_saraat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Home_frag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home_frag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    RecyclerViewAdapter1 recyclerViewAdapter;
    List<Highlights> highlights = new ArrayList<>();

    public Home_frag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home_frag.
     */
    // TODO: Rename and change types and number of parameters
    public static Home_frag newInstance(String param1, String param2) {
        Home_frag fragment = new Home_frag();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_frag, container, false);
        recyclerView = view.findViewById(R.id.rv_home);
        highlights.add(new Highlights(R.drawable.flash_3));
        highlights.add(new Highlights(R.drawable.flash_10));
        highlights.add(new Highlights(R.drawable.flash_11));
        highlights.add(new Highlights(R.drawable.flash_4));
        highlights.add(new Highlights(R.drawable.flash_1));
        highlights.add(new Highlights(R.drawable.flash_6));
        highlights.add(new Highlights(R.drawable.flash_7));
        highlights.add(new Highlights(R.drawable.flash_8));
        highlights.add(new Highlights(R.drawable.flash_5));
        highlights.add(new Highlights(R.drawable.flash_12));
        highlights.add(new Highlights(R.drawable.flash_4));
        highlights.add(new Highlights(R.drawable.flash_2));
        highlights.add(new Highlights(R.drawable.flash_13));

        recyclerViewAdapter = new RecyclerViewAdapter1(Home_frag.this,highlights);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.hasFixedSize();
        recyclerView.setAdapter(new RecyclerViewAdapter1(highlights));

        return view;
    }
}