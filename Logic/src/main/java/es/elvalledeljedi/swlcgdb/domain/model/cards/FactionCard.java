package es.elvalledeljedi.swlcgdb.domain.model.cards;


/**
 * Created by jcgarcia on 16/03/2017.
 */

public class FactionCard extends Card {
    private int minCardsPerDeck;
    private int resouces;
    private int reserve;

    public FactionCard() {
    }

    public int getMinCardsPerDeck() {
        return minCardsPerDeck;
    }

    public void setMinCardsPerDeck(int minCardsPerDeck) {
        this.minCardsPerDeck = minCardsPerDeck;
    }

    public int getResouces() {
        return resouces;
    }

    public void setResouces(int resouces) {
        this.resouces = resouces;
    }

    public int getReserve() {
        return reserve;
    }

    public void setReserve(int reserve) {
        this.reserve = reserve;
    }
}
