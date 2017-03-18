package es.elvalledeljedi.swlcgdb.domain.model.cards;

/**
 * Created by jcgarcia on 16/03/2017.
 */

public class Mission extends PodCard {

    private int forceIcons;
    private int life;
    private int cost;

    public Mission() {
    }

    public int getForceIcons() {
        return forceIcons;
    }

    public void setForceIcons(int forceIcons) {
        this.forceIcons = forceIcons;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Mission)) return false;
        if (!super.equals(o)) return false;

        Mission mission = (Mission) o;

        if (forceIcons != mission.forceIcons) return false;
        if (life != mission.life) return false;
        return cost == mission.cost;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + forceIcons;
        result = 31 * result + life;
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "forceIcons=" + forceIcons +
                ", life=" + life +
                ", cost=" + cost +
                '}';
    }
}
