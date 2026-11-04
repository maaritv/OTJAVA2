package my.aircraftmvn;


import java.math.BigDecimal;

public class NullExample {


    public static void main(String[] args) {
        BigDecimal saldo = null;

        //saldo osoittaa tyhjään, joten sille ei voi kohdistaa jäsenfunktioiden
        //kutsuja, vaan saamme NullPointer-poikkeuksen. Saldo olisi pitänyt
        //alustaa rakentajalla.
        BigDecimal newSaldo = saldo.subtract(new BigDecimal(900));
        System.out.println(newSaldo);
    }
}
