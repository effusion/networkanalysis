package ch.effusion.networkanalysis.domain.neo4j;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * Created by heuby on 10/07/14.
 */
@NodeEntity
public class CCServer {
    @GraphId
    Long id;
    
}
