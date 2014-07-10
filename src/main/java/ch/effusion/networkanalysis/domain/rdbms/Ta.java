package ch.effusion.networkanalysis.domain.rdbms;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by heuby on 07/07/14.
 */
@Entity
public class Ta {
    private String name;
    private boolean connected;
    private long lastconnectedstatechange;

    @Id
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "CONNECTED", nullable = false, insertable = true, updatable = true)
    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    @Basic
    @Column(name = "LASTCONNECTEDSTATECHANGE", nullable = false, insertable = true, updatable = true)
    public long getLastconnectedstatechange() {
        return lastconnectedstatechange;
    }

    public void setLastconnectedstatechange(long lastconnectedstatechange) {
        this.lastconnectedstatechange = lastconnectedstatechange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ta ta = (Ta) o;

        if (connected != ta.connected) return false;
        if (lastconnectedstatechange != ta.lastconnectedstatechange) return false;
        if (name != null ? !name.equals(ta.name) : ta.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (connected ? 1 : 0);
        result = 31 * result + (int) (lastconnectedstatechange ^ (lastconnectedstatechange >>> 32));
        return result;
    }
}
