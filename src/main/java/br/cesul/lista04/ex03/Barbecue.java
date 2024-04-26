package br.cesul.lista04.ex03;

public class Barbecue {

    private int women;

    private int mans;

    private int kids;

    private static final double CONSUME_WOMAN = 0.3;

    private static final double CONSUME_MAN = 0.5;
    private static final double CONSUME_KID = 0.2;

    private static final double BEER_FOR_MAN =0.75;

    private static final double BEER_FOR_WOMAN = 0.3;

    public Barbecue(int women, int mans, int kids) {
        this.women = women;
        this.mans = mans;
        this.kids = kids;
    }

    public double getBeerConsume(){
        return (women*BEER_FOR_WOMAN) + (mans * BEER_FOR_MAN);
    }


    public double getMeatConsume(){
        return (mans * CONSUME_MAN) + (kids * CONSUME_KID) + (women*CONSUME_WOMAN);
    }



}
