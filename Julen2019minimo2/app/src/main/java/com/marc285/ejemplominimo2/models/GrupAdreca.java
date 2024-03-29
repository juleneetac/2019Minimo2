package com.marc285.ejemplominimo2.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GrupAdreca {

    @SerializedName("adreca")  //de aqui
    @Expose
    private String adreca;
    @SerializedName("codi_postal")  // de aqui
    @Expose
    private String codiPostal;
    @SerializedName("municipi_nom")  // de aqui
    @Expose
    private String municipiNom;
    @SerializedName("adreca_completa")
    @Expose
    private String adrecaCompleta;

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
    }

    public String getMunicipiNom() {
        return municipiNom;
    }

    public void setMunicipiNom(String municipiNom) {
        this.municipiNom = municipiNom;
    }

    public String getAdrecaCompleta() {
        return adrecaCompleta;
    }

    public void setAdrecaCompleta(String adrecaCompleta) {
        this.adrecaCompleta = adrecaCompleta;
    }

}
