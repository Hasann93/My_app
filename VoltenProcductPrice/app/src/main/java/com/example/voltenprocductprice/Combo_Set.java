package com.example.voltenprocductprice;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Combo_Set extends Fragment {
    View v;
    private RecyclerView FRecyclerView;
    private List<Combo> lstCombo;

    public Combo_Set() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_combo__set, container, false);
        FRecyclerView = (RecyclerView) v.findViewById(R.id.recycler_VCombo);
        RecyclerViewAdapter FRecyclerViews = new RecyclerViewAdapter(getContext(), lstCombo);
        FRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));
        FRecyclerView.setAdapter(FRecyclerViews);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstCombo = new ArrayList<>();
        lstCombo.add(new Combo("Combo A", "150 USD", "", R.drawable.combo_a));
        lstCombo.add(new Combo("Combo B", "150 USD", "", R.drawable.combo_b));
        lstCombo.add(new Combo("Combo C", "165 USD", "", R.drawable.combo_c));
        lstCombo.add(new Combo("Combo D", "165 USD", "", R.drawable.combo_d));
        lstCombo.add(new Combo("Combo E", "165 USD", "", R.drawable.combo_e));
        lstCombo.add(new Combo("Combo f", "160 USD", "", R.drawable.combo_f));
        lstCombo.add(new Combo("Combo G", "150 USD", "", R.drawable.combo_g));
        lstCombo.add(new Combo("Combo H", "150 USD", "", R.drawable.combo_h));
        lstCombo.add(new Combo("Combo I", "160 USD", "", R.drawable.combo_i));
        lstCombo.add(new Combo("Combo K", "165 USD", "", R.drawable.combo_k));
        lstCombo.add(new Combo("Combo L", "165 USD", "", R.drawable.combo_l));
        lstCombo.add(new Combo("Combo M", "165 USD", "", R.drawable.combo_m));
        lstCombo.add(new Combo("Combo N", "165 USD", "", R.drawable.combo_n));
        lstCombo.add(new Combo("Combo P", "165 USD", "", R.drawable.combo_p));
        lstCombo.add(new Combo("Combo Q", "165 USD", "", R.drawable.combo_q));
    }
}