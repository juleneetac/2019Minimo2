package com.example.androdiretrofit3;

public class Contributor {  //aqui pongo todos los atributs que quiero coger de la API
    String login;            //anton no tiene esta clase en el minimo de museos no hace falta
    String html_url;
    int following;

    @Override
    public String toString() {
        return login ;
    }
}
