package ch.effusion.networkanalysis.domain.rdbms;

import javax.persistence.*;

/**
 * Created by heuby on 07/07/14.
 */
@Entity
public class Devnet {
    private long id;
    private long lastannounced;
    private long lastseen;
    private String physaddr;
    private Dev devByDevDeviceid;

    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Basic
    @Column(name = "PHYSADDR", nullable = false, insertable = true, updatable = true, length = 255)
    public String getPhysaddr() {
        return physaddr;
    }

    public void setPhysaddr(String physaddr) {
        this.physaddr = physaddr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Devnet devnet = (Devnet) o;

        if (id != devnet.id) return false;
        if (lastannounced != devnet.lastannounced) return false;
        if (lastseen != devnet.lastseen) return false;
        if (physaddr != null ? !physaddr.equals(devnet.physaddr) : devnet.physaddr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (lastannounced ^ (lastannounced >>> 32));
        result = 31 * result + (int) (lastseen ^ (lastseen >>> 32));
        result = 31 * result + (physaddr != null ? physaddr.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DEV_DEVICEID", referencedColumnName = "DEVICEID", nullable = false)
    public Dev getDevByDevDeviceid() {
        return devByDevDeviceid;
    }

    public void setDevByDevDeviceid(Dev devByDevDeviceid) {
        this.devByDevDeviceid = devByDevDeviceid;
    }
}
