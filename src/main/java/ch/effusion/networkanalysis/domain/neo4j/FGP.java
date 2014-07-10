package ch.effusion.networkanalysis.domain.neo4j;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedToVia;

import java.util.List;

/**
 * Created by heuby on 10/07/14.
 */
@NodeEntity
public class FGP {

    @GraphId
    Long id;

    @RelatedToVia
    private List<PolycomConnection> connectionList;
}
