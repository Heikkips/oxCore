package org.gluu.service.cache;

import org.gluu.persist.model.base.Deletable;
import org.gluu.persist.annotation.AttributeName;
import org.gluu.persist.annotation.DN;
import org.gluu.persist.annotation.DataEntry;
import org.gluu.persist.annotation.ObjectClass;

import java.io.Serializable;
import java.util.Date;

@DataEntry
@ObjectClass(value = "cache")
public class NativePersistenceCacheEntity implements Serializable, Deletable {

    @DN
    private String dn;
    @AttributeName(name = "uuid")
    private String id;
    @AttributeName(name = "iat")
    private Date creationDate;
    @AttributeName(name = "exp")
    private Date expirationDate;
    @AttributeName(name = "del")
    private boolean deletable = true;
    @AttributeName(name = "dat")
    private String data;

    public String getDn() {
        return dn;
    }

    public void setDn(String dn) {
        this.dn = dn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isDeletable() {
        return deletable;
    }

    public void setDeletable(boolean deletable) {
        this.deletable = deletable;
    }

    @Override
    public String toString() {
        return "NativePersistenceCacheEntity{" +
                "dn='" + dn + '\'' +
                ", id='" + id + '\'' +
                ", creationDate=" + creationDate +
                ", expirationDate=" + expirationDate +
                ", deletable=" + deletable +
                ", data='" + data + '\'' +
                '}';
    }
}
