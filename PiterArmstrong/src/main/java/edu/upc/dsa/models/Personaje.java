package edu.upc.dsa.models;

import edu.upc.dsa.util.RandomUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Personaje {
    public List<Objeto> objetos;
    String nickname;
    int vida;

    public Personaje(String name, int health) {
        this.nickname = name;
        this.vida = health;
        objetos = new LinkedList<Objeto>();
    }

    public Personaje() {
    } //constructor vacio

    public void addObjeto(String name) {   //añadir un objeto a un usuario
        objetos.add(new Objeto(name));
    }


    public List<Objeto> getObjetos() {
        return objetos;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return this.vida;
    }

    public void setNickname(String name) {
        this.nickname = name;
    }

    public String getNick() {
        return this.nickname;
    }

}

/**
 public Objeto getObjeto(String nom) throws ObjectoNotFoundException{    // me devuelve el objeto que yo le he pasado
 for (Objeto o : objetos){
 if (o.getNombre().equals(nom)){
 return o;
 }
 }
 throw new ObjectoNotFoundException();
 }


 private class ObjectoNotFoundException extends Exception {
 }
 */