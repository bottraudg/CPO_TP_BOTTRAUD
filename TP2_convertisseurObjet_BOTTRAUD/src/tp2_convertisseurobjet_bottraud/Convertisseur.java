/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_bottraud;

/**
 *
 * @author guilenebottraud
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () {
        nbConversions = 0;
    }
public double CelciusVersKelvin(double tempCelcius) {
    double tempKelvin = (double) (tempCelcius - 273.2);
    nbConversions+=1;
    
    return tempKelvin;
}  
public double KelvinVersCelcius(double tempKelvin) {
    double tempCelcius =(double) (tempKelvin - 273.2);
    nbConversions+=1;
    
    return tempCelcius;
}
public double FahrenheitVersCelcius(double tempFahrenheit) {
    double tempCelcius = (double) ((tempFahrenheit-32)*5/9);
    nbConversions+=1;
    
    return tempCelcius;
}
public double CelciusVersFahrenheit(double tempCelcius) {
    double tempFahrenheit = (double) ((tempCelcius*9/5)+32);
    nbConversions+=1;
    
    return tempFahrenheit;
}
public double FahrenheitVersKelvin(double tempFahrenheit) {
    double tempKelvin = (double) ((tempFahrenheit-32)*5/9+273.2);
    nbConversions+=1;
    
    return tempKelvin;
}
@Override
public String toString () {
  return "nb de conversions"+ nbConversions;
}
}
