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
@Table(name = "LYIT_ROLE_USER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LyitRoleUser.findAll", query = "SELECT l FROM LyitRoleUser l"),
    @NamedQuery(name = "LyitRoleUser.findById", query = "SELECT l FROM LyitRoleUser l WHERE l.id = :id"),
    @NamedQuery(name = "LyitRoleUser.findByRoleId", query = "SELECT l FROM LyitRoleUser l WHERE l.roleId = :roleId"),
    @NamedQuery(name = "LyitRoleUser.findByUserId", query = "SELECT l FROM LyitRoleUser l WHERE l.userId = :userId")})
public class LyitRoleUser  extends BaseEntity{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ROLE_ID")
    private String roleId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "USER_ID")
    private String userId;

    public LyitRoleUser() {
    }

    public LyitRoleUser(String id) {
        this.id = id;
    }

    public LyitRoleUser(String id, String roleId, String userId) {
        this.id = id;
        this.roleId = roleId;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
        if (!(object instanceof LyitRoleUser)) {
            return false;
        }
        LyitRoleUser other = (LyitRoleUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ie.lyit.project.checkerboard.entity.LyitRoleUser[ id=" + id + " ]";
    }
    
}
