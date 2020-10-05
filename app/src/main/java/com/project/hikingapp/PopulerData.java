package com.project.hikingapp;

import java.util.ArrayList;

public class PopulerData {
    private static String[] JUDUL = {
            "Hiking in Arjuna Mount",
            "Hiking in Kelud Mount"

    };

    private static String[] TANGGAL = {
            "Mon, 21 Agt 2021",
            "Mon, 21 Agt 2021"
    };

    public static ArrayList<PopulerModel> getListData() {
        ArrayList<PopulerModel> list = new ArrayList<>();
        for (int position = 0; position < 2; position++) {
            PopulerModel model = new PopulerModel();
            model.setJudul(JUDUL[position]);
            model.setTanggal(TANGGAL[position]);
            list.add(model);
        }
        return list;
    }
}
