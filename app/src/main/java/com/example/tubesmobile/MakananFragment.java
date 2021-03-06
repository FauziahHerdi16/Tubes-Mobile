package com.example.tubesmobile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MakananFragment extends Fragment {

    LinearLayout Makanan1,Makanan2,Makanan3,Makanan4,Makanan5;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_makanan, container, false);

        Makanan1 = view.findViewById(R.id.makanan1);
        Makanan2 = view.findViewById(R.id.makanan2);
        Makanan3 = view.findViewById(R.id.makanan3);
        Makanan4 = view.findViewById(R.id.makanan4);
        Makanan5 = view.findViewById(R.id.makanan5);

        Makanan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                    intent.putExtra("foto", R.drawable.nasgor);
                    intent.putExtra("nama", "Nasi Goreng");
                    intent.putExtra("harga", 8000);
                startActivity(intent);
            }
        });
        Makanan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                    intent.putExtra("foto", R.drawable.lengko);
                    intent.putExtra("nama", "Nasi Lengko");
                    intent.putExtra("harga", 4000);
                startActivity(intent);
            }
        });
        Makanan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.ketoprak);
                intent.putExtra("nama", "Ketoprak");
                intent.putExtra("harga", 6000);
                startActivity(intent);
            }
        });
        Makanan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.soto);
                intent.putExtra("nama", "Soto");
                intent.putExtra("harga", 7000);
                startActivity(intent);
            }
        });
        Makanan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.miegor);
                intent.putExtra("nama", "Mie Goreng");
                intent.putExtra("harga", 6000);
                startActivity(intent);
            }
        });
        return view;


    }
}