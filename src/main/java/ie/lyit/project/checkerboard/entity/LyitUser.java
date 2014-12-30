/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.lyit.project.checkerboard.entity;

import ie.lyit.project.base.BaseEntity;
import ie.lyit.project.base.BaseObject;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Previn
 */
@Entity
@Table(name = "LYIT_USER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LyitUser.findAll", query = "SELECT l FROM LyitUser l"),
    @NamedQuery(name = "LyitUser.findById", query = "SELECT l FROM LyitUser l WHERE l.id = :id"),
    @NamedQuery(name = "LyitUser.findByUsrFname", query = "SELECT l FROM LyitUser l WHERE l.usrFname = :usrFname"),
    @NamedQuery(name = "LyitUser.findByUsrLname", query = "SELECT l FROM LyitUser l WHERE l.usrLname = :usrLname"),
    @NamedQuery(name = "LyitUser.findByOthrDetails", query = "SELECT l FROM LyitUser l WHERE l.othrDetails = :othrDetails"),
    @NamedQuery(name = "LyitUser.findByPassword", query = "SELECT l FROM LyitUser l WHERE l.password = :password"),
    @NamedQuery(name = "LyitUser.findByLoginTime", query = "SELECT l FROM LyitUser l WHERE l.loginTime = :loginTime")})
public class LyitUser  extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID")
    private String id;
    @Size(max = 25)
    @Column(name = "USR_FNAME")
    private String usrFname;
    @Size(max = 25)
    @Column(name = "USR_LNAME")
    private String usrLname;
    @Size(max = 100)
    @Column(name = "OTHR_DETAILS")
    private String othrDetails;
    @Size(max = 20)
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "LOGIN_TIME")
    @Temporal(TemporalType.DATE)
    private Date loginTime;

    public LyitUser() {
    }

    public LyitUser(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsrFname() {
        return usrFname;
    }

    public void setUsrFname(String usrFname) {
        this.usrFname = usrFname;
    }

    public String getUsrLname() {
        return usrLname;
    }

    public void setUsrLname(String usrLname) {
        this.usrLname = usrLname;
    }

    public String getOthrDetails() {
        return othrDetails;
    }

    public void setOthrDetails(String othrDetails) {
        this.othrDetails = othrDetails;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
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
        if (!(object instanceof LyitUser)) {
            return false;
        }
        LyitUser other = (LyitUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ie.lyit.project.checkerboard.entity.LyitUser[ id=" + id + " ]";
    }
    
}
