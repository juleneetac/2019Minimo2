package com.marc285.ejemplominimo2;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.marc285.ejemplominimo2.models.Element;
import com.squareup.picasso.Picasso;

import java.util.List;


public class MuseumDescription extends AppCompatActivity {

    private Context context;

    private List<Element> museumelements;
    private TextView direccion;
    private TextView descripcion;
    private TextView grupdirec;
    private TextView codpostal;
    private TextView municipio;
    private TextView email;
    private TextView telefono;
    private TextView hab;
    private TextView extension;
    private TextView altitud;


    private ImageView escudo;
    private ImageView bandera;

   // private Context con = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Definimos el nombre del layput relacionado con este activity
        setContentView(R.layout.museumdetail_layout);

        direccion = (TextView) findViewById(R.id.nomdireccion);
        descripcion = (TextView) findViewById(R.id.descripcion);
        grupdirec = (TextView) findViewById(R.id.direcciongrupo);
        codpostal = (TextView) findViewById(R.id.codigopostal);
        municipio = (TextView) findViewById(R.id.nommunicipio);
        email = (TextView) findViewById(R.id.email);
        telefono = (TextView) findViewById(R.id.telefono);
        hab = (TextView) findViewById(R.id.habitantes);
        extension = (TextView) findViewById(R.id.extension);
        altitud = (TextView) findViewById(R.id.altitud);

        escudo = (ImageView) findViewById(R.id.imageescudo);
        bandera = (ImageView) findViewById(R.id.imagebandera);

        getInfo();
    }





    public void getInfo() {   //acabar esto

        direccion.setText(museumelements.get(1).getAdrecaNom());
        descripcion.setText(museumelements.get(1).getDescripcio());
        grupdirec.setText(museumelements.get(1).getGrupAdreca().getAdreca());
        codpostal.setText(museumelements.get(1).getGrupAdreca().getCodiPostal());
        municipio.setText(museumelements.get(1).getGrupAdreca().getMunicipiNom());
        email.setText(museumelements.get(1).getEmail().get(0));
        telefono.setText(museumelements.get(1).getTelefonContacte().get(0));
        hab.setText(museumelements.get(1).getRelMunicipis().getNohab());
        extension.setText(museumelements.get(1).getRelMunicipis().getExtensio());
        altitud.setText(museumelements.get(1).getRelMunicipis().getAltitud());


        Picasso.with(context).load(museumelements.get(1).getRelMunicipis().getMunicipiEscut()).into(escudo);
        Picasso.with(context).load(museumelements.get(1).getRelMunicipis().getMunicipiBandera()).into(bandera);
    }


    }

