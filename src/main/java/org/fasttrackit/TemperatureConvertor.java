package org.fasttrackit;

public class TemperatureConvertor {

    public static void main(String[] args){

        double temperatureInF = transformInFarenheit(30);
        System.out.println("Temperature in Farenheit " + temperatureInF);


        double temperatureInC = transformeInCelsius(550);
        System.out.println("Temperature in Celsius is " + temperatureInC);
    }

    public static double transformInFarenheit (double temperatureInC){
        double temperatureInF = (temperatureInC * 9/ 5)+ 32;
        return temperatureInF;
    }

    public static double transformeInCelsius (double temperatureInF){
        return (temperatureInF - 32) * 5/ 9;
    }

}
