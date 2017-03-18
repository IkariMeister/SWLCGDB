package es.elvalledeljedi.swlcgdb.domain.model;

import java.util.List;

import es.elvalledeljedi.swlcgdb.domain.model.cards.FactionCard;

/**
 * Created by jcgarcia on 16/03/2017.
 */

public class Deck extends BaseEntity {

    private FactionCard factionCard;
    private List<Pod> pods;
}
