package es.elvalledeljedi.swlcgdb.domain.model.cards;


/**
 * Created by jcgarcia on 16/03/2017.
 */

public class Objective extends PodCard {
    private int resource;
    private int life;

    public Objective() {
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Objective)) return false;
        if (!super.equals(o)) return false;

        Objective objective = (Objective) o;

        if (resource != objective.resource) return false;
        return life == objective.life;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + resource;
        result = 31 * result + life;
        return result;
    }

    @Override
    public String toString() {
        return "Objective{" +
                "resource=" + resource +
                ", life=" + life +
                '}';
    }
}
