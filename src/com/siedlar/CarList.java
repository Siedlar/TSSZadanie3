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
        lista.add(new Car("BMW","M3",420));
        lista.add(new Car("BMW","M4",560));
        lista.add(new Car("Audi","RS7",605));
    }

    public String dodaj(Car car) {
        String napis="blad";
        lista.add(car);
       return ("Dodano do listy "+car.getMarka()+" "+car.getModel());
    }
    public String usun(int id) throws IndexOutOfBoundsException{
        String napis="usun";
        napis="Usunieto z bazy " +lista.get(id-1).toString();
        lista.remove(lista.get(id-1));
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
