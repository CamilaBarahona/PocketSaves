package com.example.pocketsave;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.pocketsave.Adapter.CustomAdapter;
import com.example.pocketsave.Adapter.DataModel;
import com.example.pocketsave.Adapter.MyData;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    private static RecyclerView.Adapter adapter;
    private static RecyclerView recyclerCardHome;
    private RecyclerView.LayoutManager layoutManager;
    private static ArrayList<DataModel> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerCardHome = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerCardHome.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerCardHome.setLayoutManager(layoutManager);
        recyclerCardHome.setItemAnimator(new DefaultItemAnimator());
        data = new ArrayList<DataModel>();
        for (int i = 0; i < MyData.tipoMovimiento.length; i++ ){
            data.add(new DataModel(
                    MyData.tipoMovimiento[i],
                    MyData.montoMovimiento[i],
                    MyData.fechaMovimientos[i],
                    MyData.descripciónMovimiento[i],
                    MyData.id_[i],
                    MyData.drawableArray[i]
            ));
        }

    }

       // recyclerCardHome.setAdapter();
}
