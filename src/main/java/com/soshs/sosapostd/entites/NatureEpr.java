/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.sosapostd.entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author docFSJES
 */
@Entity
@Table(name = "NATURE_EPR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NatureEpr.findAll", query = "SELECT n FROM NatureEpr n")
    , @NamedQuery(name = "NatureEpr.findByCodNep", query = "SELECT n FROM NatureEpr n WHERE n.codNep = :codNep")
    , @NamedQuery(name = "NatureEpr.findByLibNep", query = "SELECT n FROM NatureEpr n WHERE n.libNep = :libNep")
    , @NamedQuery(name = "NatureEpr.findByLicNep", query = "SELECT n FROM NatureEpr n WHERE n.licNep = :licNep")
    , @NamedQuery(name = "NatureEpr.findByTemEnSveNep", query = "SELECT n FROM NatureEpr n WHERE n.temEnSveNep = :temEnSveNep")})
public class NatureEpr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_NEP")
    private String codNep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_NEP")
    private String libNep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_NEP")
    private String licNep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_NEP")
    private String temEnSveNep;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codNep")
    private Collection<Epreuve> epreuveCollection;

    public NatureEpr() {
    }

    public NatureEpr(String codNep) {
        this.codNep = codNep;
    }

    public NatureEpr(String codNep, String libNep, String licNep, String temEnSveNep) {
        this.codNep = codNep;
        this.libNep = libNep;
        this.licNep = licNep;
        this.temEnSveNep = temEnSveNep;
    }

    public String getCodNep() {
        return codNep;
    }

    public void setCodNep(String codNep) {
        this.codNep = codNep;
    }

    public String getLibNep() {
        return libNep;
    }

    public void setLibNep(String libNep) {
        this.libNep = libNep;
    }

    public String getLicNep() {
        return licNep;
    }

    public void setLicNep(String licNep) {
        this.licNep = licNep;
    }

    public String getTemEnSveNep() {
        return temEnSveNep;
    }

    public void setTemEnSveNep(String temEnSveNep) {
        this.temEnSveNep = temEnSveNep;
    }

    @XmlTransient
    public Collection<Epreuve> getEpreuveCollection() {
        return epreuveCollection;
    }

    public void setEpreuveCollection(Collection<Epreuve> epreuveCollection) {
        this.epreuveCollection = epreuveCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codNep != null ? codNep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NatureEpr)) {
            return false;
        }
        NatureEpr other = (NatureEpr) object;
        if ((this.codNep == null && other.codNep != null) || (this.codNep != null && !this.codNep.equals(other.codNep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.NatureEpr[ codNep=" + codNep + " ]";
    }
    
}
