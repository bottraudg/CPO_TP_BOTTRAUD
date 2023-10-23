/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author guilenebottraud
 */
public class Baton extends Arme {
    int age;
  
    public Baton(String nomArme, int nivAttaque, int age){
    
    this.nomArme = nomArme;
    this.nivAttaque = nivAttaque;
    this.age = age;
    }
}
