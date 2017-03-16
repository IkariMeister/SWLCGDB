package es.elvalledeljedi.swlcgdb.domain.model.cards;

/**
 * Created by jcgarcia on 16/03/2017.
 */

public class Fate extends PodCard {
    private int forceIcons;

    public Fate() {
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
        if (!(o instanceof Fate)) return false;
        if (!super.equals(o)) return false;

        Fate fate = (Fate) o;

        return forceIcons == fate.forceIcons;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + forceIcons;
        return result;
    }

    @Override
    public String toString() {
        return "Fate{" +
                "forceIcons=" + forceIcons +
                '}';
    }
}
