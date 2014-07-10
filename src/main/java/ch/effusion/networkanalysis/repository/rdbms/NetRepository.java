package ch.effusion.networkanalysis.repository.rdbms;

import ch.effusion.networkanalysis.domain.rdbms.Net;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by heuby on 09/07/14.
 */
public interface NetRepository extends JpaRepository<Net, String> {
}
