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
@Table(name = "LYIT_AIRLINE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LyitAirline.findAll", query = "SELECT l FROM LyitAirline l"),
    @NamedQuery(name = "LyitAirline.findById", query = "SELECT l FROM LyitAirline l WHERE l.id = :id"),
    @NamedQuery(name = "LyitAirline.findByName", query = "SELECT l FROM LyitAirline l WHERE l.name = :name"),
    @NamedQuery(name = "LyitAirline.findByHostAirport", query = "SELECT l FROM LyitAirline l WHERE l.hostAirport = :hostAirport"),
    @NamedQuery(name = "LyitAirline.findByHostCountry", query = "SELECT l FROM LyitAirline l WHERE l.hostCountry = :hostCountry"),
    @NamedQuery(name = "LyitAirline.findByCountryCode", query = "SELECT l FROM LyitAirline l WHERE l.countryCode = :countryCode"),
    @NamedQuery(name = "LyitAirline.findByIataCode", query = "SELECT l FROM LyitAirline l WHERE l.iataCode = :iataCode")})
public class LyitAirline extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NAME")
    private String name;
    @Size(max = 50)
    @Column(name = "HOST_AIRPORT")
    private String hostAirport;
    @Size(max = 50)
    @Column(name = "HOST_COUNTRY")
    private String hostCountry;
    @Size(max = 3)
    @Column(name = "COUNTRY_CODE")
    private String countryCode;
    @Size(max = 3)
    @Column(name = "IATA_CODE")
    private String iataCode;

    public LyitAirline() {
    }

    public LyitAirline(String id) {
        this.id = id;
    }

    public LyitAirline(String id, String name) {
        this.id = id;
        this.name = name;
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

    public String getHostAirport() {
        return hostAirport;
    }

    public void setHostAirport(String hostAirport) {
        this.hostAirport = hostAirport;
    }

    public String getHostCountry() {
        return hostCountry;
    }

    public void setHostCountry(String hostCountry) {
        this.hostCountry = hostCountry;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
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
        if (!(object instanceof LyitAirline)) {
            return false;
        }
        LyitAirline other = (LyitAirline) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }    
}
