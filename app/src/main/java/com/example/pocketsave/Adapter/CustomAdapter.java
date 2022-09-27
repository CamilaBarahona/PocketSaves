package com.example.pocketsave.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pocketsave.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder>{

    public ArrayList<DataModel> dataModelList;


    public CustomAdapter(ArrayList<DataModel> dataModelList){
        this.dataModelList = dataModelList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardhome_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tipoMovimiento.setText(dataModelList.get(i).getTipoMovimiento());
        viewHolder.montoMovimiento.setText(dataModelList.get(i).getMontoMovimiento());
        viewHolder.fechaMovimiento.setText(dataModelList.get(i).getFechaMovimiento());
        viewHolder.descripcion.setText(dataModelList.get(i).getDescripcionMovimiento());
        viewHolder.imageViewIcon.setImageResource(dataModelList.get(i).getImage());

    }

    @Override
    public int getItemCount() {
        return dataModelList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

         TextView tipoMovimiento;
         TextView montoMovimiento;
         TextView fechaMovimiento;
         TextView descripcion;
         ImageView imageViewIcon;

        public ViewHolder( View itemView) {
            super(itemView);

            //Enlazar los elementos de la cardView

            this.tipoMovimiento = (TextView) itemView.findViewById(R.id.textViewTipoMovimiento);
            this.montoMovimiento = (TextView) itemView.findViewById(R.id.textViewDataMontoMovimiento);
            this.fechaMovimiento = (TextView) itemView.findViewById(R.id.textViewDataFechaMovimiento);
            this.descripcion = (TextView) itemView.findViewById(R.id.textViewDataDescripción);
            this.imageViewIcon= (ImageView) itemView.findViewById(R.id.imageView);
        }


    }
}
