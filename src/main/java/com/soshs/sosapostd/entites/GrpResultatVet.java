/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.sosapostd.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author docFSJES
 */
@Entity
@Table(name = "GRP_RESULTAT_VET")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrpResultatVet.findAll", query = "SELECT g FROM GrpResultatVet g")
    , @NamedQuery(name = "GrpResultatVet.findByCodEtp", query = "SELECT g FROM GrpResultatVet g WHERE g.grpResultatVetPK.codEtp = :codEtp")
    , @NamedQuery(name = "GrpResultatVet.findByCodVrsVet", query = "SELECT g FROM GrpResultatVet g WHERE g.grpResultatVetPK.codVrsVet = :codVrsVet")
    , @NamedQuery(name = "GrpResultatVet.findByCodAnu", query = "SELECT g FROM GrpResultatVet g WHERE g.grpResultatVetPK.codAnu = :codAnu")
    , @NamedQuery(name = "GrpResultatVet.findByCodSes", query = "SELECT g FROM GrpResultatVet g WHERE g.grpResultatVetPK.codSes = :codSes")
    , @NamedQuery(name = "GrpResultatVet.findByCodAdm", query = "SELECT g FROM GrpResultatVet g WHERE g.grpResultatVetPK.codAdm = :codAdm")
    , @NamedQuery(name = "GrpResultatVet.findByEtaAvcVet", query = "SELECT g FROM GrpResultatVet g WHERE g.etaAvcVet = :etaAvcVet")
    , @NamedQuery(name = "GrpResultatVet.findByDatAvcVet", query = "SELECT g FROM GrpResultatVet g WHERE g.datAvcVet = :datAvcVet")
    , @NamedQuery(name = "GrpResultatVet.findByTemAvcHerVet", query = "SELECT g FROM GrpResultatVet g WHERE g.temAvcHerVet = :temAvcHerVet")
    , @NamedQuery(name = "GrpResultatVet.findByTemIniTabResVet", query = "SELECT g FROM GrpResultatVet g WHERE g.temIniTabResVet = :temIniTabResVet")
    , @NamedQuery(name = "GrpResultatVet.findByTemTrtRptGvt", query = "SELECT g FROM GrpResultatVet g WHERE g.temTrtRptGvt = :temTrtRptGvt")})
public class GrpResultatVet implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GrpResultatVetPK grpResultatVetPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_AVC_VET")
    private String etaAvcVet;
    @Column(name = "DAT_AVC_VET")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datAvcVet;
    @Size(max = 1)
    @Column(name = "TEM_AVC_HER_VET")
    private String temAvcHerVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_INI_TAB_RES_VET")
    private String temIniTabResVet;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_TRT_RPT_GVT")
    private String temTrtRptGvt;
    @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AnneeUni anneeUni;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grpResultatVet")
    private Collection<ResultatVet> resultatVetCollection;

    public GrpResultatVet() {
    }

    public GrpResultatVet(GrpResultatVetPK grpResultatVetPK) {
        this.grpResultatVetPK = grpResultatVetPK;
    }

    public GrpResultatVet(GrpResultatVetPK grpResultatVetPK, String etaAvcVet, String temIniTabResVet, String temTrtRptGvt) {
        this.grpResultatVetPK = grpResultatVetPK;
        this.etaAvcVet = etaAvcVet;
        this.temIniTabResVet = temIniTabResVet;
        this.temTrtRptGvt = temTrtRptGvt;
    }

    public GrpResultatVet(String codEtp, short codVrsVet, String codAnu, String codSes, String codAdm) {
        this.grpResultatVetPK = new GrpResultatVetPK(codEtp, codVrsVet, codAnu, codSes, codAdm);
    }

    public GrpResultatVetPK getGrpResultatVetPK() {
        return grpResultatVetPK;
    }

    public void setGrpResultatVetPK(GrpResultatVetPK grpResultatVetPK) {
        this.grpResultatVetPK = grpResultatVetPK;
    }

    public String getEtaAvcVet() {
        return etaAvcVet;
    }

    public void setEtaAvcVet(String etaAvcVet) {
        this.etaAvcVet = etaAvcVet;
    }

    public Date getDatAvcVet() {
        return datAvcVet;
    }

    public void setDatAvcVet(Date datAvcVet) {
        this.datAvcVet = datAvcVet;
    }

    public String getTemAvcHerVet() {
        return temAvcHerVet;
    }

    public void setTemAvcHerVet(String temAvcHerVet) {
        this.temAvcHerVet = temAvcHerVet;
    }

    public String getTemIniTabResVet() {
        return temIniTabResVet;
    }

    public void setTemIniTabResVet(String temIniTabResVet) {
        this.temIniTabResVet = temIniTabResVet;
    }

    public String getTemTrtRptGvt() {
        return temTrtRptGvt;
    }

    public void setTemTrtRptGvt(String temTrtRptGvt) {
        this.temTrtRptGvt = temTrtRptGvt;
    }

    public AnneeUni getAnneeUni() {
        return anneeUni;
    }

    public void setAnneeUni(AnneeUni anneeUni) {
        this.anneeUni = anneeUni;
    }

    @XmlTransient
    public Collection<ResultatVet> getResultatVetCollection() {
        return resultatVetCollection;
    }

    public void setResultatVetCollection(Collection<ResultatVet> resultatVetCollection) {
        this.resultatVetCollection = resultatVetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grpResultatVetPK != null ? grpResultatVetPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrpResultatVet)) {
            return false;
        }
        GrpResultatVet other = (GrpResultatVet) object;
        if ((this.grpResultatVetPK == null && other.grpResultatVetPK != null) || (this.grpResultatVetPK != null && !this.grpResultatVetPK.equals(other.grpResultatVetPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.GrpResultatVet[ grpResultatVetPK=" + grpResultatVetPK + " ]";
    }
    
}
