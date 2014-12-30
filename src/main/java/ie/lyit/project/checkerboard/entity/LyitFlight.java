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
@Table(name = "LYIT_FLIGHT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LyitFlight.findAll", query = "SELECT l FROM LyitFlight l"),
    @NamedQuery(name = "LyitFlight.findById", query = "SELECT l FROM LyitFlight l WHERE l.id = :id"),
    @NamedQuery(name = "LyitFlight.findByName", query = "SELECT l FROM LyitFlight l WHERE l.name = :name"),
    @NamedQuery(name = "LyitFlight.findByFromAirport", query = "SELECT l FROM LyitFlight l WHERE l.fromAirport = :fromAirport"),
    @NamedQuery(name = "LyitFlight.findByFromCountry", query = "SELECT l FROM LyitFlight l WHERE l.fromCountry = :fromCountry"),
    @NamedQuery(name = "LyitFlight.findByDestAirport", query = "SELECT l FROM LyitFlight l WHERE l.destAirport = :destAirport"),
    @NamedQuery(name = "LyitFlight.findByDestCountry", query = "SELECT l FROM LyitFlight l WHERE l.destCountry = :destCountry"),
    @NamedQuery(name = "LyitFlight.findByFlightNo", query = "SELECT l FROM LyitFlight l WHERE l.flightNo = :flightNo"),
    @NamedQuery(name = "LyitFlight.findBySchDept", query = "SELECT l FROM LyitFlight l WHERE l.schDept = :schDept"),
    @NamedQuery(name = "LyitFlight.findByEstTime", query = "SELECT l FROM LyitFlight l WHERE l.estTime = :estTime"),
    @NamedQuery(name = "LyitFlight.findByAircraft", query = "SELECT l FROM LyitFlight l WHERE l.aircraft = :aircraft"),
    @NamedQuery(name = "LyitFlight.findByRoute", query = "SELECT l FROM LyitFlight l WHERE l.route = :route")})
public class LyitFlight  extends BaseEntity{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID")
    private String id;
    @Size(max = 10)
    @Column(name = "NAME")
    private String name;
    @Size(max = 3)
    @Column(name = "FROM_AIRPORT")
    private String fromAirport;
    @Size(max = 3)
    @Column(name = "FROM_COUNTRY")
    private String fromCountry;
    @Size(max = 3)
    @Column(name = "DEST_AIRPORT")
    private String destAirport;
    @Size(max = 3)
    @Column(name = "DEST_COUNTRY")
    private String destCountry;
    @Size(max = 10)
    @Column(name = "FLIGHT_NO")
    private String flightNo;
    @Column(name = "SCH_DEPT")
    @Temporal(TemporalType.DATE)
    private Date schDept;
    @Column(name = "EST_TIME")
    @Temporal(TemporalType.DATE)
    private Date estTime;
    @Size(max = 10)
    @Column(name = "AIRCRAFT")
    private String aircraft;
    @Size(max = 20)
    @Column(name = "ROUTE")
    private String route;

    public LyitFlight() {
    }

    public LyitFlight(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getDestAirport() {
        return destAirport;
    }

    public void setDestAirport(String destAirport) {
        this.destAirport = destAirport;
    }

    public String getDestCountry() {
        return destCountry;
    }

    public void setDestCountry(String destCountry) {
        this.destCountry = destCountry;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Date getSchDept() {
        return schDept;
    }

    public void setSchDept(Date schDept) {
        this.schDept = schDept;
    }

    public Date getEstTime() {
        return estTime;
    }

    public void setEstTime(Date estTime) {
        this.estTime = estTime;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
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
        if (!(object instanceof LyitFlight)) {
            return false;
        }
        LyitFlight other = (LyitFlight) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ie.lyit.project.checkerboard.entity.LyitFlight[ id=" + id + " ]";
    }
    
}
