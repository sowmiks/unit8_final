package main;

import java.util.ArrayList;
import java.util.List;

public class Building {
    static List<Flat> flatList = new ArrayList<Flat>();
    public Building(List <Flat> flatList){
        this.flatList = flatList;
    }

    public static void main(String[] args){
        //List<Flat> flatList = new ArrayList<Flat>();
        Building bulding1 = new Building(flatList);
        Flat flat1 = new Flat("flat1", 100.0);
        Flat flat2 = new Flat("flat2", 110.0);
        flatList.add(flat1);
        flatList.add(flat2);
    }
}