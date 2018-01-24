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
@Table(name = "GRP_RESULTAT_VDI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrpResultatVdi.findAll", query = "SELECT g FROM GrpResultatVdi g")
    , @NamedQuery(name = "GrpResultatVdi.findByCodDip", query = "SELECT g FROM GrpResultatVdi g WHERE g.grpResultatVdiPK.codDip = :codDip")
    , @NamedQuery(name = "GrpResultatVdi.findByCodVrsVdi", query = "SELECT g FROM GrpResultatVdi g WHERE g.grpResultatVdiPK.codVrsVdi = :codVrsVdi")
    , @NamedQuery(name = "GrpResultatVdi.findByCodAnu", query = "SELECT g FROM GrpResultatVdi g WHERE g.grpResultatVdiPK.codAnu = :codAnu")
    , @NamedQuery(name = "GrpResultatVdi.findByCodSes", query = "SELECT g FROM GrpResultatVdi g WHERE g.grpResultatVdiPK.codSes = :codSes")
    , @NamedQuery(name = "GrpResultatVdi.findByCodAdm", query = "SELECT g FROM GrpResultatVdi g WHERE g.grpResultatVdiPK.codAdm = :codAdm")
    , @NamedQuery(name = "GrpResultatVdi.findByEtaAvcVdi", query = "SELECT g FROM GrpResultatVdi g WHERE g.etaAvcVdi = :etaAvcVdi")
    , @NamedQuery(name = "GrpResultatVdi.findByDatAvcVdi", query = "SELECT g FROM GrpResultatVdi g WHERE g.datAvcVdi = :datAvcVdi")
    , @NamedQuery(name = "GrpResultatVdi.findByTemAvcHerVdi", query = "SELECT g FROM GrpResultatVdi g WHERE g.temAvcHerVdi = :temAvcHerVdi")
    , @NamedQuery(name = "GrpResultatVdi.findByTemIniTabResVdi", query = "SELECT g FROM GrpResultatVdi g WHERE g.temIniTabResVdi = :temIniTabResVdi")
    , @NamedQuery(name = "GrpResultatVdi.findByTemTrtRptGvi", query = "SELECT g FROM GrpResultatVdi g WHERE g.temTrtRptGvi = :temTrtRptGvi")})
public class GrpResultatVdi implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GrpResultatVdiPK grpResultatVdiPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_AVC_VDI")
    private String etaAvcVdi;
    @Column(name = "DAT_AVC_VDI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datAvcVdi;
    @Size(max = 1)
    @Column(name = "TEM_AVC_HER_VDI")
    private String temAvcHerVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_INI_TAB_RES_VDI")
    private String temIniTabResVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_TRT_RPT_GVI")
    private String temTrtRptGvi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grpResultatVdi")
    private Collection<ResultatVdi> resultatVdiCollection;
    @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AnneeUni anneeUni;

    public GrpResultatVdi() {
    }

    public GrpResultatVdi(GrpResultatVdiPK grpResultatVdiPK) {
        this.grpResultatVdiPK = grpResultatVdiPK;
    }

    public GrpResultatVdi(GrpResultatVdiPK grpResultatVdiPK, String etaAvcVdi, String temIniTabResVdi, String temTrtRptGvi) {
        this.grpResultatVdiPK = grpResultatVdiPK;
        this.etaAvcVdi = etaAvcVdi;
        this.temIniTabResVdi = temIniTabResVdi;
        this.temTrtRptGvi = temTrtRptGvi;
    }

    public GrpResultatVdi(String codDip, short codVrsVdi, String codAnu, String codSes, String codAdm) {
        this.grpResultatVdiPK = new GrpResultatVdiPK(codDip, codVrsVdi, codAnu, codSes, codAdm);
    }

    public GrpResultatVdiPK getGrpResultatVdiPK() {
        return grpResultatVdiPK;
    }

    public void setGrpResultatVdiPK(GrpResultatVdiPK grpResultatVdiPK) {
        this.grpResultatVdiPK = grpResultatVdiPK;
    }

    public String getEtaAvcVdi() {
        return etaAvcVdi;
    }

    public void setEtaAvcVdi(String etaAvcVdi) {
        this.etaAvcVdi = etaAvcVdi;
    }

    public Date getDatAvcVdi() {
        return datAvcVdi;
    }

    public void setDatAvcVdi(Date datAvcVdi) {
        this.datAvcVdi = datAvcVdi;
    }

    public String getTemAvcHerVdi() {
        return temAvcHerVdi;
    }

    public void setTemAvcHerVdi(String temAvcHerVdi) {
        this.temAvcHerVdi = temAvcHerVdi;
    }

    public String getTemIniTabResVdi() {
        return temIniTabResVdi;
    }

    public void setTemIniTabResVdi(String temIniTabResVdi) {
        this.temIniTabResVdi = temIniTabResVdi;
    }

    public String getTemTrtRptGvi() {
        return temTrtRptGvi;
    }

    public void setTemTrtRptGvi(String temTrtRptGvi) {
        this.temTrtRptGvi = temTrtRptGvi;
    }

    @XmlTransient
    public Collection<ResultatVdi> getResultatVdiCollection() {
        return resultatVdiCollection;
    }

    public void setResultatVdiCollection(Collection<ResultatVdi> resultatVdiCollection) {
        this.resultatVdiCollection = resultatVdiCollection;
    }

    public AnneeUni getAnneeUni() {
        return anneeUni;
    }

    public void setAnneeUni(AnneeUni anneeUni) {
        this.anneeUni = anneeUni;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grpResultatVdiPK != null ? grpResultatVdiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrpResultatVdi)) {
            return false;
        }
        GrpResultatVdi other = (GrpResultatVdi) object;
        if ((this.grpResultatVdiPK == null && other.grpResultatVdiPK != null) || (this.grpResultatVdiPK != null && !this.grpResultatVdiPK.equals(other.grpResultatVdiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.GrpResultatVdi[ grpResultatVdiPK=" + grpResultatVdiPK + " ]";
    }
    
}
