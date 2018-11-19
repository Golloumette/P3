package com.cursan.Exemple;

public class Taxi implements MoyenDeLocomotion{

    @Override
    public void deplace(String adress){
        System.out.println("Je suis un taxi et je vais à l'adress :"+adress);
    }
}
