package ch.effusion.networkanalysis.domain.rdbms;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by heuby on 07/07/14.
 */
@Entity
public class Dev {
    private int deviceid;
    private long lastannounced;
    private long lastseen;

    @Id
    @Column(name = "DEVICEID", nullable = false, insertable = true, updatable = true)
    public int getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(int deviceid) {
        this.deviceid = deviceid;
    }

    @Basic
    @Column(name = "LASTANNOUNCED", nullable = false, insertable = true, updatable = true)
    public long getLastannounced() {
        return lastannounced;
    }

    public void setLastannounced(long lastannounced) {
        this.lastannounced = lastannounced;
    }

    @Basic
    @Column(name = "LASTSEEN", nullable = false, insertable = true, updatable = true)
    public long getLastseen() {
        return lastseen;
    }

    public void setLastseen(long lastseen) {
        this.lastseen = lastseen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dev dev = (Dev) o;

        if (deviceid != dev.deviceid) return false;
        if (lastannounced != dev.lastannounced) return false;
        if (lastseen != dev.lastseen) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deviceid;
        result = 31 * result + (int) (lastannounced ^ (lastannounced >>> 32));
        result = 31 * result + (int) (lastseen ^ (lastseen >>> 32));
        return result;
    }
}
