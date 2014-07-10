package ch.effusion.networkanalysis.domain.rdbms;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by heuby on 07/07/14.
 */
@Entity
public class Net {
    private String name;
    private long lastannounced;
    private long lastseen;
    private String bcastaddr;
    private int cost;
    private String nettech;

    @Id
    @Column(name = "NAME", nullable = false, insertable = true, updatable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "BCASTADDR", nullable = true, insertable = true, updatable = true, length = 255)
    public String getBcastaddr() {
        return bcastaddr;
    }

    public void setBcastaddr(String bcastaddr) {
        this.bcastaddr = bcastaddr;
    }

    @Basic
    @Column(name = "COST", nullable = false, insertable = true, updatable = true)
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "NETTECH", nullable = true, insertable = true, updatable = true, length = 255)
    public String getNettech() {
        return nettech;
    }

    public void setNettech(String nettech) {
        this.nettech = nettech;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Net net = (Net) o;

        if (cost != net.cost) return false;
        if (lastannounced != net.lastannounced) return false;
        if (lastseen != net.lastseen) return false;
        if (bcastaddr != null ? !bcastaddr.equals(net.bcastaddr) : net.bcastaddr != null) return false;
        if (name != null ? !name.equals(net.name) : net.name != null) return false;
        if (nettech != null ? !nettech.equals(net.nettech) : net.nettech != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (lastannounced ^ (lastannounced >>> 32));
        result = 31 * result + (int) (lastseen ^ (lastseen >>> 32));
        result = 31 * result + (bcastaddr != null ? bcastaddr.hashCode() : 0);
        result = 31 * result + cost;
        result = 31 * result + (nettech != null ? nettech.hashCode() : 0);
        return result;
    }
}
