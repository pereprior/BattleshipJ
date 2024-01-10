package model;

import java.util.List;

public class Table {

    private final int length;
    private final int shipNumber;
    private List<List<Character>> table;

    public Table(int length, int shipNumber){
        this.length = length;
        this.shipNumber = shipNumber;

    }

    public int getLength() {
        return length;
    }

    public int getShipNumber() {
        return shipNumber;
    }

    private void setTable() {

    }
}
