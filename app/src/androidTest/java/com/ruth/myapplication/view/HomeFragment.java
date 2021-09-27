package com.ruth.myapplication.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ruth.myapplication.R;
import com.ruth.myapplication.model.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment<CardViewAdapter> extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home,container,false);
        showToolbar(getString(R.string.title_home_fragment),false,view);

        RecyclerView recyclerView=view.findViewById(R.id.recycler_view);

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        CardViewAdapter cardviewAdapter = new CardViewAdapter(buidImages(), R.layout.cardview_image, getActivity());
        recyclerView.setAdapter(cardviewAdapter);
        return view;

    }
    public void showToolbar(String titulo,boolean botonSubir, View view){
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }
    public ArrayList<Image>buidImages(){
        ArrayList<Image> images = new ArrayList<>();
        images.add(new Image("https://www.google.com/url?sa=i&url=http%3A%2F%2Fwww.escuelacarmenvega.com%2Fsite%2Findex.php%2Fes%2Fcochabamba%2Fturismo-cochabamba&psig=AOvVaw2nXc1xmMtl9taQWFi_ISaf&ust=1632799739536000&source=images&cd=vfe&ved=0CAgQjRxqFwoTCIDJhZmbnvMCFQAAAAAdAAAAABAD","Juan","6","2"));
        images.add(new Image("https://images.wallpaperscraft.com/image/single/fox_stick_autumn_221120_1280x720.jpg","Victor","2","5"));
        images.add(new Image("https://images.wallpaperscraft.com/image/single/fox_stick_autumn_221120_1280x720.jpg","Andres","4","10"));
        images.add(new Image("https://images.wallpaperscraft.com/image/single/fox_stick_autumn_221120_1280x720.jpg","Carla","3","20"));
        System.out.println(images);

        return images;
    }
}