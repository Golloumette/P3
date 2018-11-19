package com.cursan.Exemple;

public class Bus implements MoyenDeLocomotion {
    @Override
    public void deplace(String adress){
        System.out.println("Je suis un bus et je vais à l'adresse"+ adress);
    }
}
