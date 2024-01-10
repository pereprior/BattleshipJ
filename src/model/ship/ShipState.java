package model.ship;

public enum ShipState {
    HIDE("_"), //ESCONDIDO
    TOUCHED("x"), //TOCADO
    SUNK("*"), //HUNDIDO
    HACK("-")
    ;

    ShipState(String value) {}
}
