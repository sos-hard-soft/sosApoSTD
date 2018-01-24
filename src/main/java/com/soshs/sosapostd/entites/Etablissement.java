/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.sosapostd.entites;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "ETABLISSEMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etablissement.findAll", query = "SELECT e FROM Etablissement e")
    , @NamedQuery(name = "Etablissement.findByCodEtb", query = "SELECT e FROM Etablissement e WHERE e.codEtb = :codEtb")
    , @NamedQuery(name = "Etablissement.findByCodEsuEse", query = "SELECT e FROM Etablissement e WHERE e.codEsuEse = :codEsuEse")
    , @NamedQuery(name = "Etablissement.findByCodAffDepEtb", query = "SELECT e FROM Etablissement e WHERE e.codAffDepEtb = :codAffDepEtb")
    , @NamedQuery(name = "Etablissement.findByCodAffEtb", query = "SELECT e FROM Etablissement e WHERE e.codAffEtb = :codAffEtb")
    , @NamedQuery(name = "Etablissement.findByLibEtb", query = "SELECT e FROM Etablissement e WHERE e.libEtb = :libEtb")
    , @NamedQuery(name = "Etablissement.findByLicEtb", query = "SELECT e FROM Etablissement e WHERE e.licEtb = :licEtb")
    , @NamedQuery(name = "Etablissement.findByLibCmtEtb", query = "SELECT e FROM Etablissement e WHERE e.libCmtEtb = :libCmtEtb")
    , @NamedQuery(name = "Etablissement.findByLibAd1Etb", query = "SELECT e FROM Etablissement e WHERE e.libAd1Etb = :libAd1Etb")
    , @NamedQuery(name = "Etablissement.findByLibAd2Etb", query = "SELECT e FROM Etablissement e WHERE e.libAd2Etb = :libAd2Etb")
    , @NamedQuery(name = "Etablissement.findByLibAd3Etb", query = "SELECT e FROM Etablissement e WHERE e.libAd3Etb = :libAd3Etb")
    , @NamedQuery(name = "Etablissement.findByTemCnvEtb", query = "SELECT e FROM Etablissement e WHERE e.temCnvEtb = :temCnvEtb")
    , @NamedQuery(name = "Etablissement.findByTemPubEtb", query = "SELECT e FROM Etablissement e WHERE e.temPubEtb = :temPubEtb")
    , @NamedQuery(name = "Etablissement.findByTemEnSveEtb", query = "SELECT e FROM Etablissement e WHERE e.temEnSveEtb = :temEnSveEtb")
    , @NamedQuery(name = "Etablissement.findByLibAdeEtb", query = "SELECT e FROM Etablissement e WHERE e.libAdeEtb = :libAdeEtb")
    , @NamedQuery(name = "Etablissement.findByLibOffEtb", query = "SELECT e FROM Etablissement e WHERE e.libOffEtb = :libOffEtb")
    , @NamedQuery(name = "Etablissement.findByLibArtOffEtb", query = "SELECT e FROM Etablissement e WHERE e.libArtOffEtb = :libArtOffEtb")
    , @NamedQuery(name = "Etablissement.findByTemAutSisEtb", query = "SELECT e FROM Etablissement e WHERE e.temAutSisEtb = :temAutSisEtb")
    , @NamedQuery(name = "Etablissement.findByTemMinEtb", query = "SELECT e FROM Etablissement e WHERE e.temMinEtb = :temMinEtb")
    , @NamedQuery(name = "Etablissement.findByNumOrdEtb", query = "SELECT e FROM Etablissement e WHERE e.numOrdEtb = :numOrdEtb")
    , @NamedQuery(name = "Etablissement.findByLim1Etb", query = "SELECT e FROM Etablissement e WHERE e.lim1Etb = :lim1Etb")
    , @NamedQuery(name = "Etablissement.findByLim2Etb", query = "SELECT e FROM Etablissement e WHERE e.lim2Etb = :lim2Etb")
    , @NamedQuery(name = "Etablissement.findByLim3Etb", query = "SELECT e FROM Etablissement e WHERE e.lim3Etb = :lim3Etb")
    , @NamedQuery(name = "Etablissement.findByTemPreSisEtb", query = "SELECT e FROM Etablissement e WHERE e.temPreSisEtb = :temPreSisEtb")
    , @NamedQuery(name = "Etablissement.findByLibWebEtb", query = "SELECT e FROM Etablissement e WHERE e.libWebEtb = :libWebEtb")
    , @NamedQuery(name = "Etablissement.findByLibOffEtbArb", query = "SELECT e FROM Etablissement e WHERE e.libOffEtbArb = :libOffEtbArb")
    , @NamedQuery(name = "Etablissement.findByLibEtbArb", query = "SELECT e FROM Etablissement e WHERE e.libEtbArb = :libEtbArb")
    , @NamedQuery(name = "Etablissement.findByLibAd1EtbArb", query = "SELECT e FROM Etablissement e WHERE e.libAd1EtbArb = :libAd1EtbArb")
    , @NamedQuery(name = "Etablissement.findByLibAd2EtbArb", query = "SELECT e FROM Etablissement e WHERE e.libAd2EtbArb = :libAd2EtbArb")
    , @NamedQuery(name = "Etablissement.findByLibAd3EtbArb", query = "SELECT e FROM Etablissement e WHERE e.libAd3EtbArb = :libAd3EtbArb")})
public class Etablissement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "COD_ETB")
    private String codEtb;
    @Size(max = 1)
    @Column(name = "COD_ESU_ESE")
    private String codEsuEse;
    @Column(name = "COD_AFF_DEP_ETB")
    private Short codAffDepEtb;
    @Column(name = "COD_AFF_ETB")
    private Short codAffEtb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_ETB")
    private String libEtb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_ETB")
    private String licEtb;
    @Size(max = 200)
    @Column(name = "LIB_CMT_ETB")
    private String libCmtEtb;
    @Size(max = 32)
    @Column(name = "LIB_AD1_ETB")
    private String libAd1Etb;
    @Size(max = 32)
    @Column(name = "LIB_AD2_ETB")
    private String libAd2Etb;
    @Size(max = 32)
    @Column(name = "LIB_AD3_ETB")
    private String libAd3Etb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CNV_ETB")
    private String temCnvEtb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PUB_ETB")
    private String temPubEtb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_ETB")
    private String temEnSveEtb;
    @Size(max = 32)
    @Column(name = "LIB_ADE_ETB")
    private String libAdeEtb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "LIB_OFF_ETB")
    private String libOffEtb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "LIB_ART_OFF_ETB")
    private String libArtOffEtb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_AUT_SIS_ETB")
    private String temAutSisEtb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_MIN_ETB")
    private String temMinEtb;
    @Column(name = "NUM_ORD_ETB")
    private Short numOrdEtb;
    @Size(max = 35)
    @Column(name = "LIM1_ETB")
    private String lim1Etb;
    @Size(max = 35)
    @Column(name = "LIM2_ETB")
    private String lim2Etb;
    @Size(max = 35)
    @Column(name = "LIM3_ETB")
    private String lim3Etb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_PRE_SIS_ETB")
    private String temPreSisEtb;
    @Size(max = 120)
    @Column(name = "LIB_WEB_ETB")
    private String libWebEtb;
    @Size(max = 80)
    @Column(name = "LIB_OFF_ETB_ARB")
    private String libOffEtbArb;
    @Size(max = 40)
    @Column(name = "LIB_ETB_ARB")
    private String libEtbArb;
    @Size(max = 32)
    @Column(name = "LIB_AD1_ETB_ARB")
    private String libAd1EtbArb;
    @Size(max = 32)
    @Column(name = "LIB_AD2_ETB_ARB")
    private String libAd2EtbArb;
    @Size(max = 32)
    @Column(name = "LIB_AD3_ETB_ARB")
    private String libAd3EtbArb;
    @OneToMany(mappedBy = "codEtb")
    private Collection<Diplome> diplomeCollection;
    @OneToMany(mappedBy = "codEtb")
    private Collection<IndBac> indBacCollection;
    @OneToMany(mappedBy = "codEtbAnnPre")
    private Collection<InsAdmAnu> insAdmAnuCollection;
    @OneToMany(mappedBy = "codEtbTpt")
    private Collection<InsAdmAnu> insAdmAnuCollection1;
    @OneToMany(mappedBy = "codEtr")
    private Collection<InsAdmAnu> insAdmAnuCollection2;
    @OneToMany(mappedBy = "codEtbAnt")
    private Collection<InsAdmAnu> insAdmAnuCollection3;
    @OneToMany(mappedBy = "codEtbPrlChg")
    private Collection<InsAdmAnu> insAdmAnuCollection4;
    @OneToMany(mappedBy = "codEtb")
    private Collection<Individu> individuCollection;

    public Etablissement() {
    }

    public Etablissement(String codEtb) {
        this.codEtb = codEtb;
    }

    public Etablissement(String codEtb, String libEtb, String licEtb, String temCnvEtb, String temPubEtb, String temEnSveEtb, String libOffEtb, String libArtOffEtb, String temAutSisEtb, String temMinEtb, String temPreSisEtb) {
        this.codEtb = codEtb;
        this.libEtb = libEtb;
        this.licEtb = licEtb;
        this.temCnvEtb = temCnvEtb;
        this.temPubEtb = temPubEtb;
        this.temEnSveEtb = temEnSveEtb;
        this.libOffEtb = libOffEtb;
        this.libArtOffEtb = libArtOffEtb;
        this.temAutSisEtb = temAutSisEtb;
        this.temMinEtb = temMinEtb;
        this.temPreSisEtb = temPreSisEtb;
    }

    public String getCodEtb() {
        return codEtb;
    }

    public void setCodEtb(String codEtb) {
        this.codEtb = codEtb;
    }

    public String getCodEsuEse() {
        return codEsuEse;
    }

    public void setCodEsuEse(String codEsuEse) {
        this.codEsuEse = codEsuEse;
    }

    public Short getCodAffDepEtb() {
        return codAffDepEtb;
    }

    public void setCodAffDepEtb(Short codAffDepEtb) {
        this.codAffDepEtb = codAffDepEtb;
    }

    public Short getCodAffEtb() {
        return codAffEtb;
    }

    public void setCodAffEtb(Short codAffEtb) {
        this.codAffEtb = codAffEtb;
    }

    public String getLibEtb() {
        return libEtb;
    }

    public void setLibEtb(String libEtb) {
        this.libEtb = libEtb;
    }

    public String getLicEtb() {
        return licEtb;
    }

    public void setLicEtb(String licEtb) {
        this.licEtb = licEtb;
    }

    public String getLibCmtEtb() {
        return libCmtEtb;
    }

    public void setLibCmtEtb(String libCmtEtb) {
        this.libCmtEtb = libCmtEtb;
    }

    public String getLibAd1Etb() {
        return libAd1Etb;
    }

    public void setLibAd1Etb(String libAd1Etb) {
        this.libAd1Etb = libAd1Etb;
    }

    public String getLibAd2Etb() {
        return libAd2Etb;
    }

    public void setLibAd2Etb(String libAd2Etb) {
        this.libAd2Etb = libAd2Etb;
    }

    public String getLibAd3Etb() {
        return libAd3Etb;
    }

    public void setLibAd3Etb(String libAd3Etb) {
        this.libAd3Etb = libAd3Etb;
    }

    public String getTemCnvEtb() {
        return temCnvEtb;
    }

    public void setTemCnvEtb(String temCnvEtb) {
        this.temCnvEtb = temCnvEtb;
    }

    public String getTemPubEtb() {
        return temPubEtb;
    }

    public void setTemPubEtb(String temPubEtb) {
        this.temPubEtb = temPubEtb;
    }

    public String getTemEnSveEtb() {
        return temEnSveEtb;
    }

    public void setTemEnSveEtb(String temEnSveEtb) {
        this.temEnSveEtb = temEnSveEtb;
    }

    public String getLibAdeEtb() {
        return libAdeEtb;
    }

    public void setLibAdeEtb(String libAdeEtb) {
        this.libAdeEtb = libAdeEtb;
    }

    public String getLibOffEtb() {
        return libOffEtb;
    }

    public void setLibOffEtb(String libOffEtb) {
        this.libOffEtb = libOffEtb;
    }

    public String getLibArtOffEtb() {
        return libArtOffEtb;
    }

    public void setLibArtOffEtb(String libArtOffEtb) {
        this.libArtOffEtb = libArtOffEtb;
    }

    public String getTemAutSisEtb() {
        return temAutSisEtb;
    }

    public void setTemAutSisEtb(String temAutSisEtb) {
        this.temAutSisEtb = temAutSisEtb;
    }

    public String getTemMinEtb() {
        return temMinEtb;
    }

    public void setTemMinEtb(String temMinEtb) {
        this.temMinEtb = temMinEtb;
    }

    public Short getNumOrdEtb() {
        return numOrdEtb;
    }

    public void setNumOrdEtb(Short numOrdEtb) {
        this.numOrdEtb = numOrdEtb;
    }

    public String getLim1Etb() {
        return lim1Etb;
    }

    public void setLim1Etb(String lim1Etb) {
        this.lim1Etb = lim1Etb;
    }

    public String getLim2Etb() {
        return lim2Etb;
    }

    public void setLim2Etb(String lim2Etb) {
        this.lim2Etb = lim2Etb;
    }

    public String getLim3Etb() {
        return lim3Etb;
    }

    public void setLim3Etb(String lim3Etb) {
        this.lim3Etb = lim3Etb;
    }

    public String getTemPreSisEtb() {
        return temPreSisEtb;
    }

    public void setTemPreSisEtb(String temPreSisEtb) {
        this.temPreSisEtb = temPreSisEtb;
    }

    public String getLibWebEtb() {
        return libWebEtb;
    }

    public void setLibWebEtb(String libWebEtb) {
        this.libWebEtb = libWebEtb;
    }

    public String getLibOffEtbArb() {
        return libOffEtbArb;
    }

    public void setLibOffEtbArb(String libOffEtbArb) {
        this.libOffEtbArb = libOffEtbArb;
    }

    public String getLibEtbArb() {
        return libEtbArb;
    }

    public void setLibEtbArb(String libEtbArb) {
        this.libEtbArb = libEtbArb;
    }

    public String getLibAd1EtbArb() {
        return libAd1EtbArb;
    }

    public void setLibAd1EtbArb(String libAd1EtbArb) {
        this.libAd1EtbArb = libAd1EtbArb;
    }

    public String getLibAd2EtbArb() {
        return libAd2EtbArb;
    }

    public void setLibAd2EtbArb(String libAd2EtbArb) {
        this.libAd2EtbArb = libAd2EtbArb;
    }

    public String getLibAd3EtbArb() {
        return libAd3EtbArb;
    }

    public void setLibAd3EtbArb(String libAd3EtbArb) {
        this.libAd3EtbArb = libAd3EtbArb;
    }

    @XmlTransient
    public Collection<Diplome> getDiplomeCollection() {
        return diplomeCollection;
    }

    public void setDiplomeCollection(Collection<Diplome> diplomeCollection) {
        this.diplomeCollection = diplomeCollection;
    }

    @XmlTransient
    public Collection<IndBac> getIndBacCollection() {
        return indBacCollection;
    }

    public void setIndBacCollection(Collection<IndBac> indBacCollection) {
        this.indBacCollection = indBacCollection;
    }

    @XmlTransient
    public Collection<InsAdmAnu> getInsAdmAnuCollection() {
        return insAdmAnuCollection;
    }

    public void setInsAdmAnuCollection(Collection<InsAdmAnu> insAdmAnuCollection) {
        this.insAdmAnuCollection = insAdmAnuCollection;
    }

    @XmlTransient
    public Collection<InsAdmAnu> getInsAdmAnuCollection1() {
        return insAdmAnuCollection1;
    }

    public void setInsAdmAnuCollection1(Collection<InsAdmAnu> insAdmAnuCollection1) {
        this.insAdmAnuCollection1 = insAdmAnuCollection1;
    }

    @XmlTransient
    public Collection<InsAdmAnu> getInsAdmAnuCollection2() {
        return insAdmAnuCollection2;
    }

    public void setInsAdmAnuCollection2(Collection<InsAdmAnu> insAdmAnuCollection2) {
        this.insAdmAnuCollection2 = insAdmAnuCollection2;
    }

    @XmlTransient
    public Collection<InsAdmAnu> getInsAdmAnuCollection3() {
        return insAdmAnuCollection3;
    }

    public void setInsAdmAnuCollection3(Collection<InsAdmAnu> insAdmAnuCollection3) {
        this.insAdmAnuCollection3 = insAdmAnuCollection3;
    }

    @XmlTransient
    public Collection<InsAdmAnu> getInsAdmAnuCollection4() {
        return insAdmAnuCollection4;
    }

    public void setInsAdmAnuCollection4(Collection<InsAdmAnu> insAdmAnuCollection4) {
        this.insAdmAnuCollection4 = insAdmAnuCollection4;
    }

    @XmlTransient
    public Collection<Individu> getIndividuCollection() {
        return individuCollection;
    }

    public void setIndividuCollection(Collection<Individu> individuCollection) {
        this.individuCollection = individuCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEtb != null ? codEtb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etablissement)) {
            return false;
        }
        Etablissement other = (Etablissement) object;
        if ((this.codEtb == null && other.codEtb != null) || (this.codEtb != null && !this.codEtb.equals(other.codEtb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.Etablissement[ codEtb=" + codEtb + " ]";
    }
    
}
