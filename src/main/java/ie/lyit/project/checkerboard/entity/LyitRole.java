/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.project.checkerboard.entity;

import ie.lyit.project.base.BaseEntity;
import ie.lyit.project.base.BaseObject;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Previn
 */
@Entity
@Table(name = "LYIT_ROLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LyitRole.findAll", query = "SELECT l FROM LyitRole l"),
    @NamedQuery(name = "LyitRole.findById", query = "SELECT l FROM LyitRole l WHERE l.id = :id"),
    @NamedQuery(name = "LyitRole.findByRoleName", query = "SELECT l FROM LyitRole l WHERE l.roleName = :roleName")})
public class LyitRole  extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID")
    private String id;
    @Size(max = 25)
    @Column(name = "ROLE_NAME")
    private String roleName;

    public LyitRole() {
    }

    public LyitRole(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LyitRole)) {
            return false;
        }
        LyitRole other = (LyitRole) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ie.lyit.project.checkerboard.entity.LyitRole[ id=" + id + " ]";
    }
    
}
