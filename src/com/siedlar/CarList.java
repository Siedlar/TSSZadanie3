package com.siedlar;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private List<Car> lista=new ArrayList<>();


    public List<Car> getLista() {
        return lista;
    }

    public void setLista(List<Car> lista) {
        this.lista = lista;
    }

    public CarList() {
        lista.add(new Car("BMW","M3",500));
        lista.add(new Car("BMW","M4",320));
        lista.add(new Car("Audi","RS7",500));
    }

    public String dodaj(Car car) {
        String napis="blad";
        lista.add(car);
       return ("Dodano do listy "+car.getMarka()+" "+car.getModel());
    }
    public String usun(Car car){
        String napis="usun";
        lista.remove(car);
        return napis;
    }
    public String wypisz(){
        String napis="";
        for(Car car:lista){
            napis+=car.toString()+"<br><br>";
        }
        System.out.println(napis);
        return napis;
    }
}
