package es.elvalledeljedi.swlcgdb.domain.model.cards;


/**
 * Created by jcgarcia on 16/03/2017.
 */

public class PodCard extends Card {
    private String order;
    private String trait;

    public PodCard() {
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PodCard)) return false;
        if (!super.equals(o)) return false;

        PodCard podCard = (PodCard) o;

        if (order != null ? !order.equals(podCard.order) : podCard.order != null) return false;
        return trait != null ? trait.equals(podCard.trait) : podCard.trait == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (order != null ? order.hashCode() : 0);
        result = 31 * result + (trait != null ? trait.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PodCard{" +
                "order='" + order + '\'' +
                ", trait='" + trait + '\'' +
                '}';
    }
}
