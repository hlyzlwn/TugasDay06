package com.example.tugasday06;

import java.io.Serializable;

public class ModelNegara implements Serializable {
    private String namaNegara;
    private int gambarNegara;
    private String deskripsi;

    public ModelNegara (String namaNegara, int gambarNegara, String deskripsi) {
        this.namaNegara = namaNegara;
        this.gambarNegara = gambarNegara;
        this.deskripsi = deskripsi;
    }



    public String getNamaNegara() {

        return namaNegara;
    }

    public int getGambarNegara() {

        return gambarNegara;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

}

