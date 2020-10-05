package com.project.hikingapp;

public class PopulerModel {
    private String judul;
    private String tanggal;

    public PopulerModel(){

    }

    public PopulerModel(String judul, String tanggal) {
        this.judul = judul;
        this.tanggal = tanggal;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }


}
