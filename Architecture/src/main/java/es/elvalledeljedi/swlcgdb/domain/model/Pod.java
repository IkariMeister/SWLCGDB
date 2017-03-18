package es.elvalledeljedi.swlcgdb.domain.model;

import java.util.ArrayList;
import java.util.List;

import es.elvalledeljedi.swlcgdb.domain.model.cards.Card;
import es.elvalledeljedi.swlcgdb.domain.model.cards.Objective;
import es.elvalledeljedi.swlcgdb.domain.model.cards.PodCard;

/**
 * Created by jcgarcia on 16/03/2017.
 */

public class Pod extends BaseEntity {
    public static final int CARDS_PER_POD = 5;

    private final List<PodCard> cards;
    private Objective objective;
    private Faction faction;
    private boolean onePerDeck;
    private boolean onlyFaction;

    public Pod() {
        cards = new ArrayList<>(CARDS_PER_POD);
    }

    public List<PodCard> getCards() {
        return cards;
    }

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public boolean isOnePerDeck() {
        return onePerDeck;
    }

    public void setOnePerDeck(boolean onePerDeck) {
        this.onePerDeck = onePerDeck;
    }

    public boolean isOnlyFaction() {
        return onlyFaction;
    }

    public void setOnlyFaction(boolean onlyFaction) {
        this.onlyFaction = onlyFaction;
    }
    public boolean addCard(PodCard card){
        return cards.add(card);
    }
}
