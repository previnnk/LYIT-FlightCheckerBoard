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
@Table(name = "LYIT_DISPLAYBOARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LyitDisplayboard.findAll", query = "SELECT l FROM LyitDisplayboard l"),
    @NamedQuery(name = "LyitDisplayboard.findById", query = "SELECT l FROM LyitDisplayboard l WHERE l.id = :id"),
    @NamedQuery(name = "LyitDisplayboard.findByFlightNo", query = "SELECT l FROM LyitDisplayboard l WHERE l.flightNo = :flightNo"),
    @NamedQuery(name = "LyitDisplayboard.findByAircraft", query = "SELECT l FROM LyitDisplayboard l WHERE l.aircraft = :aircraft"),
    @NamedQuery(name = "LyitDisplayboard.findByStatus", query = "SELECT l FROM LyitDisplayboard l WHERE l.status = :status"),
    @NamedQuery(name = "LyitDisplayboard.findByGate", query = "SELECT l FROM LyitDisplayboard l WHERE l.gate = :gate"),
    @NamedQuery(name = "LyitDisplayboard.findByEstTime", query = "SELECT l FROM LyitDisplayboard l WHERE l.estTime = :estTime"),
    @NamedQuery(name = "LyitDisplayboard.findBySchTime", query = "SELECT l FROM LyitDisplayboard l WHERE l.schTime = :schTime"),
    @NamedQuery(name = "LyitDisplayboard.findByActTime", query = "SELECT l FROM LyitDisplayboard l WHERE l.actTime = :actTime"),
    @NamedQuery(name = "LyitDisplayboard.findByRoute", query = "SELECT l FROM LyitDisplayboard l WHERE l.route = :route")})
public class LyitDisplayboard  extends BaseEntity{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 20)
    @Column(name = "FLIGHT_NO")
    private String flightNo;
    @Size(max = 20)
    @Column(name = "AIRCRAFT")
    private String aircraft;
    @Size(max = 50)
    @Column(name = "STATUS")
    private String status;
    @Size(max = 20)
    @Column(name = "GATE")
    private String gate;
    @Column(name = "EST_TIME")
    @Temporal(TemporalType.DATE)
    private Date estTime;
    @Column(name = "SCH_TIME")
    @Temporal(TemporalType.DATE)
    private Date schTime;
    @Column(name = "ACT_TIME")
    @Temporal(TemporalType.DATE)
    private Date actTime;
    @Size(max = 50)
    @Column(name = "ROUTE")
    private String route;

    public LyitDisplayboard() {
    }

    public LyitDisplayboard(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public Date getEstTime() {
        return estTime;
    }

    public void setEstTime(Date estTime) {
        this.estTime = estTime;
    }

    public Date getSchTime() {
        return schTime;
    }

    public void setSchTime(Date schTime) {
        this.schTime = schTime;
    }

    public Date getActTime() {
        return actTime;
    }

    public void setActTime(Date actTime) {
        this.actTime = actTime;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
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
        if (!(object instanceof LyitDisplayboard)) {
            return false;
        }
        LyitDisplayboard other = (LyitDisplayboard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ie.lyit.project.checkerboard.entity.LyitDisplayboard[ id=" + id + " ]";
    }
    
}
