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
@Table(name = "GRP_RESULTAT_EPR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrpResultatEpr.findAll", query = "SELECT g FROM GrpResultatEpr g")
    , @NamedQuery(name = "GrpResultatEpr.findByCodEpr", query = "SELECT g FROM GrpResultatEpr g WHERE g.grpResultatEprPK.codEpr = :codEpr")
    , @NamedQuery(name = "GrpResultatEpr.findByCodAnu", query = "SELECT g FROM GrpResultatEpr g WHERE g.grpResultatEprPK.codAnu = :codAnu")
    , @NamedQuery(name = "GrpResultatEpr.findByCodSes", query = "SELECT g FROM GrpResultatEpr g WHERE g.grpResultatEprPK.codSes = :codSes")
    , @NamedQuery(name = "GrpResultatEpr.findByCodAdm", query = "SELECT g FROM GrpResultatEpr g WHERE g.grpResultatEprPK.codAdm = :codAdm")
    , @NamedQuery(name = "GrpResultatEpr.findByEtaAvcEpr", query = "SELECT g FROM GrpResultatEpr g WHERE g.etaAvcEpr = :etaAvcEpr")
    , @NamedQuery(name = "GrpResultatEpr.findByDatAvcEpr", query = "SELECT g FROM GrpResultatEpr g WHERE g.datAvcEpr = :datAvcEpr")
    , @NamedQuery(name = "GrpResultatEpr.findByTemAvcHerEpr", query = "SELECT g FROM GrpResultatEpr g WHERE g.temAvcHerEpr = :temAvcHerEpr")
    , @NamedQuery(name = "GrpResultatEpr.findByTemIniTabResEpr", query = "SELECT g FROM GrpResultatEpr g WHERE g.temIniTabResEpr = :temIniTabResEpr")})
public class GrpResultatEpr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GrpResultatEprPK grpResultatEprPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_AVC_EPR")
    private String etaAvcEpr;
    @Column(name = "DAT_AVC_EPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datAvcEpr;
    @Size(max = 1)
    @Column(name = "TEM_AVC_HER_EPR")
    private String temAvcHerEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_INI_TAB_RES_EPR")
    private String temIniTabResEpr;
    @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AnneeUni anneeUni;
    @JoinColumn(name = "COD_EPR", referencedColumnName = "COD_EPR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Epreuve epreuve;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grpResultatEpr")
    private Collection<ResultatEpr> resultatEprCollection;

    public GrpResultatEpr() {
    }

    public GrpResultatEpr(GrpResultatEprPK grpResultatEprPK) {
        this.grpResultatEprPK = grpResultatEprPK;
    }

    public GrpResultatEpr(GrpResultatEprPK grpResultatEprPK, String etaAvcEpr, String temIniTabResEpr) {
        this.grpResultatEprPK = grpResultatEprPK;
        this.etaAvcEpr = etaAvcEpr;
        this.temIniTabResEpr = temIniTabResEpr;
    }

    public GrpResultatEpr(String codEpr, String codAnu, String codSes, String codAdm) {
        this.grpResultatEprPK = new GrpResultatEprPK(codEpr, codAnu, codSes, codAdm);
    }

    public GrpResultatEprPK getGrpResultatEprPK() {
        return grpResultatEprPK;
    }

    public void setGrpResultatEprPK(GrpResultatEprPK grpResultatEprPK) {
        this.grpResultatEprPK = grpResultatEprPK;
    }

    public String getEtaAvcEpr() {
        return etaAvcEpr;
    }

    public void setEtaAvcEpr(String etaAvcEpr) {
        this.etaAvcEpr = etaAvcEpr;
    }

    public Date getDatAvcEpr() {
        return datAvcEpr;
    }

    public void setDatAvcEpr(Date datAvcEpr) {
        this.datAvcEpr = datAvcEpr;
    }

    public String getTemAvcHerEpr() {
        return temAvcHerEpr;
    }

    public void setTemAvcHerEpr(String temAvcHerEpr) {
        this.temAvcHerEpr = temAvcHerEpr;
    }

    public String getTemIniTabResEpr() {
        return temIniTabResEpr;
    }

    public void setTemIniTabResEpr(String temIniTabResEpr) {
        this.temIniTabResEpr = temIniTabResEpr;
    }

    public AnneeUni getAnneeUni() {
        return anneeUni;
    }

    public void setAnneeUni(AnneeUni anneeUni) {
        this.anneeUni = anneeUni;
    }

    public Epreuve getEpreuve() {
        return epreuve;
    }

    public void setEpreuve(Epreuve epreuve) {
        this.epreuve = epreuve;
    }

    @XmlTransient
    public Collection<ResultatEpr> getResultatEprCollection() {
        return resultatEprCollection;
    }

    public void setResultatEprCollection(Collection<ResultatEpr> resultatEprCollection) {
        this.resultatEprCollection = resultatEprCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grpResultatEprPK != null ? grpResultatEprPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrpResultatEpr)) {
            return false;
        }
        GrpResultatEpr other = (GrpResultatEpr) object;
        if ((this.grpResultatEprPK == null && other.grpResultatEprPK != null) || (this.grpResultatEprPK != null && !this.grpResultatEprPK.equals(other.grpResultatEprPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.GrpResultatEpr[ grpResultatEprPK=" + grpResultatEprPK + " ]";
    }
    
}
