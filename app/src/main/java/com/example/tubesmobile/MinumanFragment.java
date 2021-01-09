package com.example.tubesmobile;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MinumanFragment extends Fragment {

    LinearLayout Minuman1,Minuman2,Minuman3,Minuman4,Minuman5;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_minuman, container, false);

        Minuman1 = view.findViewById(R.id.minuman1);
        Minuman2 = view.findViewById(R.id.minuman2);
        Minuman3 = view.findViewById(R.id.minuman3);
        Minuman4 = view.findViewById(R.id.minuman4);
        Minuman5 = view.findViewById(R.id.minuman5);

        Minuman1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                    intent.putExtra("foto", R.drawable.es_teh);
                    intent.putExtra("nama", "Es Teh");
                    intent.putExtra("harga", 3000);
                startActivity(intent);
            }
        });
        Minuman2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.es_kopi);
                intent.putExtra("nama", "Es Kopi");
                intent.putExtra("harga", 4000);
                startActivity(intent);
            }
        });
        Minuman3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.es_jeruk);
                intent.putExtra("nama", "Es Jeruk");
                intent.putExtra("harga", 5000);
                startActivity(intent);
            }
        });
        Minuman4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.teh_hangat);
                intent.putExtra("nama", "Teh Hangat");
                intent.putExtra("harga", 3000);
                startActivity(intent);
            }
        });
        Minuman5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PesanActivity.class);
                intent.putExtra("foto", R.drawable.kopi);
                intent.putExtra("nama", "Kopi");
                intent.putExtra("harga", 4000);
                startActivity(intent);
            }
        });

        return view;
    }
}