package com.example.androidtv;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class KalenderFragment extends Fragment {

    private Button bulanJan;
    private Button bulanFeb;
    private Button bulanMar;
    private Button bulanApr;
    private Button bulanMei;
    private Button bulanJun;
    private Button bulanJul;
    private Button bulanAgu;
    private Button bulanSep;
    private Button bulanOkt;
    private Button bulanNov;
    private Button bulanDes;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kalender, container, false);

        bulanJan = view.findViewById(R.id.btnJanuari);
        bulanJan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), JanuariActivity.class);
                startActivity(intent);
            }
        });

        bulanFeb = view.findViewById(R.id.btnFebruari);
        bulanFeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),FebruariActivity.class);
                startActivity(intent);
            }
        });

        bulanMar = view.findViewById(R.id.btnMaret);
        bulanMar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MaretActivity.class);
                startActivity(intent);
            }
        });
        bulanApr = view.findViewById(R.id.btnApril);
        bulanApr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),AprilActivity.class);
                startActivity(intent);
            }
        });
        bulanMei = view.findViewById(R.id.btnMei);
        bulanMei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MeiActivity.class);
                startActivity(intent);
            }
        });
        bulanJun = view.findViewById(R.id.btnJuni);
        bulanJun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),JuniActivity.class);
                startActivity(intent);
            }
        });
        bulanJul = view.findViewById(R.id.btnJuli);
        bulanJul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),JuliActivity.class);
                startActivity(intent);
            }
        });
        bulanAgu = view.findViewById(R.id.btnAgustus);
        bulanAgu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),AgustusActivity.class);
                startActivity(intent);
            }
        });
        bulanSep = view.findViewById(R.id.btnSeptember);
        bulanSep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),SeptemberActivity.class);
                startActivity(intent);
            }
        });

        bulanOkt = view.findViewById(R.id.btnOktober);
        bulanOkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),OktoberActivity.class);
                startActivity(intent);
            }
        });

        bulanNov = view.findViewById(R.id.btnNovember);
        bulanNov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),NovemberActivity.class);
                startActivity(intent);
            }
        });

        bulanDes = view.findViewById(R.id.btnDesember);
        bulanDes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),DesemberActivity.class);
                startActivity(intent);
            }
        });



        return view;


    }
}