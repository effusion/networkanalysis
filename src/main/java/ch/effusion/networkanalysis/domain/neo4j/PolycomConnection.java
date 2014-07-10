package ch.effusion.networkanalysis.domain.neo4j;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

/**
 * Created by heuby on 10/07/14.
 */
@RelationshipEntity(type = "COMMUNICATES_WITH")
public class PolycomConnection {
    @StartNode
    @EndNode
    private FGP fgp;

    @StartNode
    @EndNode
    private PolycomBaseStation polycomBaseStation;

    private int weight;

    public FGP getFgp() {
        return fgp;
    }

    public PolycomBaseStation getPolycomBaseStation() {
        return polycomBaseStation;
    }

    public void setPolycomBaseStation(PolycomBaseStation polycomBaseStation) {
        this.polycomBaseStation = polycomBaseStation;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFgp(FGP fgp) {
        this.fgp = fgp;
    }
}
