package es.elvalledeljedi.swlcgdb.domain.model.cards;

/**
 * Created by jcgarcia on 16/03/2017.
 */

public class Enhacement extends PodCard {
    private int resource;
    private int cost;
    private int forceIcons;

    public Enhacement() {
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
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
        if (!(o instanceof Enhacement)) return false;
        if (!super.equals(o)) return false;

        Enhacement that = (Enhacement) o;

        if (resource != that.resource) return false;
        if (cost != that.cost) return false;
        return forceIcons == that.forceIcons;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resource;
        result = 31 * result + cost;
        result = 31 * result + forceIcons;
        return result;
    }

    @Override
    public String toString() {
        return "Enhacement{" +
                "resource=" + resource +
                ", cost=" + cost +
                ", forceIcons=" + forceIcons +
                '}';
    }
}
