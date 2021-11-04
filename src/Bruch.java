/*
* Übung Git Clone und Push - Bruch
* Florian Wagenhofer_Gutruf
* */

public class Bruch {

    //Variablen
    private int numerator; // Zähler
    private int denominator; // Nenner

    //Konstruktor
    public Bruch(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Getter Numerator
    public int getNumerator() {
        return numerator;
    }

    //Getter Denominator
    public int getDenominator() {
        return denominator;
    }

    //Gibt Bruch als Dezimahlzahl aus (Numerator / Denumerator)
    public double toDecimal() {
        return (double)numerator / denominator;
    }

    //Gibt Bruch als String aus
    public String print() {
        return numerator + "/" + denominator;
    }

    //Multipliziert Bruch mit b2
    public Bruch multiplicate(Bruch b2) {
        Bruch erg_temp = new Bruch(getNumerator() * b2.getNumerator(), getDenominator() * b2.getDenominator());

        return erg_temp;
    }

    //Multipliziert Bruch mit b2 & b3
    public Bruch multiplicate(Bruch b2,  Bruch b3) {
        Bruch erg_temp = new Bruch(getNumerator() * b2.getNumerator() * b3.getNumerator(), getDenominator() * b2.getDenominator() * b3.getDenominator());

        return erg_temp;
    }
}
