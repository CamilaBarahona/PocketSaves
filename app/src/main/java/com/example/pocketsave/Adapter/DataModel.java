package com.example.pocketsave.Adapter;

public class DataModel {
    String tipoMovimiento;
    String fechaMovimiento;
    String descripcionMovimiento;
    int montoMovimiento;
    int id_;
    int image;

    public DataModel(String tipoMovimiento, Integer integer, String fechaMovimiento, String descripcionMovimiento, int montoMovimiento, int id_) {
        this.tipoMovimiento = tipoMovimiento;
        this.fechaMovimiento = fechaMovimiento;
        this.descripcionMovimiento = descripcionMovimiento;
        this.montoMovimiento = montoMovimiento;
        this.id_ = id_;
        this.image = image;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public String getFechaMovimiento() {
        return fechaMovimiento;
    }

    public String getDescripcionMovimiento() {
        return descripcionMovimiento;
    }

    public int getMontoMovimiento() {
        return montoMovimiento;
    }

    public int getId_() {
        return id_;
    }

    public int getImage() {
        return image;
    }
}
