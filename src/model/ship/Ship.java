package model.ship;

/**
 * Esta clase crea los datos de los barcos que aparecen en el tablero
 */

public class Ship {

    private final int length;
    private ShipState state;

    public Ship(int length){
        this.length = length;
        this.state = ShipState.HIDE;
    }

    public int getLength() {
        return length;
    }

    public ShipState getState() {
        return state;
    }

    public void setState(ShipState state) {
        this.state = state;
    }
}
