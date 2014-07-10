package ch.effusion.networkanalysis.domain.rdbms;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by heuby on 07/07/14.
 */
@Entity
public class Netta {
    private long id;
    private int dist;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DIST", nullable = false, insertable = true, updatable = true)
    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Netta netta = (Netta) o;

        if (dist != netta.dist) return false;
        if (id != netta.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + dist;
        return result;
    }
}
