package es.elvalledeljedi.swlcgdb.domain.model.cards;

import es.elvalledeljedi.swlcgdb.domain.model.BaseEntity;
import es.elvalledeljedi.swlcgdb.domain.model.Faction;

/**
 * Created by jcgarcia on 16/03/2017.
 */

public class Card extends BaseEntity {
    private String text;
    private String name;
    private String imageURL;
    private Faction faction;
    private boolean elite;


    public Card() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;

        if (text != null ? !text.equals(card.text) : card.text != null) return false;
        if (name != null ? !name.equals(card.name) : card.name != null) return false;
        return imageURL != null ? imageURL.equals(card.imageURL) : card.imageURL == null;

    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (imageURL != null ? imageURL.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Card{" +
                "text='" + text + '\'' +
                ", name='" + name + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
