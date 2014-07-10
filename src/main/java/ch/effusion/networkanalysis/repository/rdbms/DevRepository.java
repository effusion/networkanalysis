package ch.effusion.networkanalysis.repository.rdbms;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.effusion.networkanalysis.domain.rdbms.Dev;

/**
 * Created by heuby on 07/07/14.
 */
public interface DevRepository extends JpaRepository<Dev, Integer> {
}
