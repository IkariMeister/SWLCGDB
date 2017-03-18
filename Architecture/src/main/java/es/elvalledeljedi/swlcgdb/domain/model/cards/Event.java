package es.elvalledeljedi.swlcgdb.domain.model.cards;

/**
 * Created by jcgarcia on 16/03/2017.
 */

public class Event extends PodCard {

    private int cost;
    private int forceIcons;

    public Event() {
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getForceIcons() {
        return forceIcons;
    }

    public void setForceIcons(int forceIcons) {
        this.forceIcons = forceIcons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        if (!super.equals(o)) return false;

        Event event = (Event) o;

        if (cost != event.cost) return false;
        return forceIcons == event.forceIcons;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + cost;
        result = 31 * result + forceIcons;
        return result;
    }

    @Override
    public String toString() {
        return "Event{" +
                "cost=" + cost +
                ", forceIcons=" + forceIcons +
                '}';
    }
}
