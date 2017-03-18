package es.elvalledeljedi.swlcgdb.domain.model.cards;

/**
 * Created by jcgarcia on 16/03/2017.
 */

public class Unit extends PodCard {
    private int life;
    private int forceIcons;
    private int cost;
    private int resource;

    public Unit() {
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getForceIcons() {
        return forceIcons;
    }

    public void setForceIcons(int forceIcons) {
        this.forceIcons = forceIcons;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Unit)) return false;
        if (!super.equals(o)) return false;

        Unit unit = (Unit) o;

        if (life != unit.life) return false;
        if (forceIcons != unit.forceIcons) return false;
        if (cost != unit.cost) return false;
        return resource == unit.resource;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + life;
        result = 31 * result + forceIcons;
        result = 31 * result + cost;
        result = 31 * result + resource;
        return result;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "life=" + life +
                ", forceIcons=" + forceIcons +
                ", cost=" + cost +
                ", resource=" + resource +
                '}';
    }
}
