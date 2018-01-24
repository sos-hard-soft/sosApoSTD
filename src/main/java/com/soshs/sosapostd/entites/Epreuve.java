/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.sosapostd.entites;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "EPREUVE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Epreuve.findAll", query = "SELECT e FROM Epreuve e")
    , @NamedQuery(name = "Epreuve.findByCodEpr", query = "SELECT e FROM Epreuve e WHERE e.codEpr = :codEpr")
    , @NamedQuery(name = "Epreuve.findByLibEpr", query = "SELECT e FROM Epreuve e WHERE e.libEpr = :libEpr")
    , @NamedQuery(name = "Epreuve.findByLicEpr", query = "SELECT e FROM Epreuve e WHERE e.licEpr = :licEpr")
    , @NamedQuery(name = "Epreuve.findByTemNotEpr", query = "SELECT e FROM Epreuve e WHERE e.temNotEpr = :temNotEpr")
    , @NamedQuery(name = "Epreuve.findByBarSaiEpr", query = "SELECT e FROM Epreuve e WHERE e.barSaiEpr = :barSaiEpr")
    , @NamedQuery(name = "Epreuve.findByTemResEpr", query = "SELECT e FROM Epreuve e WHERE e.temResEpr = :temResEpr")
    , @NamedQuery(name = "Epreuve.findByCodAdmEpr", query = "SELECT e FROM Epreuve e WHERE e.codAdmEpr = :codAdmEpr")
    , @NamedQuery(name = "Epreuve.findByDatCreEpr", query = "SELECT e FROM Epreuve e WHERE e.datCreEpr = :datCreEpr")
    , @NamedQuery(name = "Epreuve.findByDatModEpr", query = "SELECT e FROM Epreuve e WHERE e.datModEpr = :datModEpr")
    , @NamedQuery(name = "Epreuve.findByTemRelPosSyt", query = "SELECT e FROM Epreuve e WHERE e.temRelPosSyt = :temRelPosSyt")
    , @NamedQuery(name = "Epreuve.findByNotMinRptEpr", query = "SELECT e FROM Epreuve e WHERE e.notMinRptEpr = :notMinRptEpr")
    , @NamedQuery(name = "Epreuve.findByBarMinRptEpr", query = "SELECT e FROM Epreuve e WHERE e.barMinRptEpr = :barMinRptEpr")
    , @NamedQuery(name = "Epreuve.findByTemAnlRptEpr", query = "SELECT e FROM Epreuve e WHERE e.temAnlRptEpr = :temAnlRptEpr")
    , @NamedQuery(name = "Epreuve.findByTemConEpr", query = "SELECT e FROM Epreuve e WHERE e.temConEpr = :temConEpr")
    , @NamedQuery(name = "Epreuve.findByNotMinConEpr", query = "SELECT e FROM Epreuve e WHERE e.notMinConEpr = :notMinConEpr")
    , @NamedQuery(name = "Epreuve.findByBarMinConEpr", query = "SELECT e FROM Epreuve e WHERE e.barMinConEpr = :barMinConEpr")
    , @NamedQuery(name = "Epreuve.findByDurConEpr", query = "SELECT e FROM Epreuve e WHERE e.durConEpr = :durConEpr")
    , @NamedQuery(name = "Epreuve.findByLibCmtEpr", query = "SELECT e FROM Epreuve e WHERE e.libCmtEpr = :libCmtEpr")
    , @NamedQuery(name = "Epreuve.findByTemSesUni", query = "SELECT e FROM Epreuve e WHERE e.temSesUni = :temSesUni")
    , @NamedQuery(name = "Epreuve.findByTemCtlValCadEpr", query = "SELECT e FROM Epreuve e WHERE e.temCtlValCadEpr = :temCtlValCadEpr")
    , @NamedQuery(name = "Epreuve.findByDurExaS1Epr", query = "SELECT e FROM Epreuve e WHERE e.durExaS1Epr = :durExaS1Epr")
    , @NamedQuery(name = "Epreuve.findByDurExaS2Epr", query = "SELECT e FROM Epreuve e WHERE e.durExaS2Epr = :durExaS2Epr")
    , @NamedQuery(name = "Epreuve.findByTemDocAutEpr", query = "SELECT e FROM Epreuve e WHERE e.temDocAutEpr = :temDocAutEpr")
    , @NamedQuery(name = "Epreuve.findByTemOrgEpr", query = "SELECT e FROM Epreuve e WHERE e.temOrgEpr = :temOrgEpr")
    , @NamedQuery(name = "Epreuve.findByNbrEtuHanMotEpr", query = "SELECT e FROM Epreuve e WHERE e.nbrEtuHanMotEpr = :nbrEtuHanMotEpr")
    , @NamedQuery(name = "Epreuve.findByNbrEtuTieTpsEpr", query = "SELECT e FROM Epreuve e WHERE e.nbrEtuTieTpsEpr = :nbrEtuTieTpsEpr")
    , @NamedQuery(name = "Epreuve.findByNbrEtuAidEpr", query = "SELECT e FROM Epreuve e WHERE e.nbrEtuAidEpr = :nbrEtuAidEpr")
    , @NamedQuery(name = "Epreuve.findByLibTypExeEpr", query = "SELECT e FROM Epreuve e WHERE e.libTypExeEpr = :libTypExeEpr")
    , @NamedQuery(name = "Epreuve.findByLibDocAutEpr", query = "SELECT e FROM Epreuve e WHERE e.libDocAutEpr = :libDocAutEpr")
    , @NamedQuery(name = "Epreuve.findByLibEprArb", query = "SELECT e FROM Epreuve e WHERE e.libEprArb = :libEprArb")
    , @NamedQuery(name = "Epreuve.findByLicEprArb", query = "SELECT e FROM Epreuve e WHERE e.licEprArb = :licEprArb")})
public class Epreuve implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_EPR")
    private String codEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_EPR")
    private String libEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_EPR")
    private String licEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_NOT_EPR")
    private String temNotEpr;
    @Column(name = "BAR_SAI_EPR")
    private Integer barSaiEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_RES_EPR")
    private String temResEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_ADM_EPR")
    private String codAdmEpr;
    @Column(name = "DAT_CRE_EPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datCreEpr;
    @Column(name = "DAT_MOD_EPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datModEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_REL_POS_SYT")
    private String temRelPosSyt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NOT_MIN_RPT_EPR")
    private BigDecimal notMinRptEpr;
    @Column(name = "BAR_MIN_RPT_EPR")
    private Integer barMinRptEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_ANL_RPT_EPR")
    private String temAnlRptEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CON_EPR")
    private String temConEpr;
    @Column(name = "NOT_MIN_CON_EPR")
    private BigDecimal notMinConEpr;
    @Column(name = "BAR_MIN_CON_EPR")
    private Integer barMinConEpr;
    @Column(name = "DUR_CON_EPR")
    private Short durConEpr;
    @Size(max = 2000)
    @Column(name = "LIB_CMT_EPR")
    private String libCmtEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_SES_UNI")
    private String temSesUni;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CTL_VAL_CAD_EPR")
    private String temCtlValCadEpr;
    @Column(name = "DUR_EXA_S1_EPR")
    private Integer durExaS1Epr;
    @Column(name = "DUR_EXA_S2_EPR")
    private Integer durExaS2Epr;
    @Size(max = 1)
    @Column(name = "TEM_DOC_AUT_EPR")
    private String temDocAutEpr;
    @Size(max = 1)
    @Column(name = "TEM_ORG_EPR")
    private String temOrgEpr;
    @Column(name = "NBR_ETU_HAN_MOT_EPR")
    private Short nbrEtuHanMotEpr;
    @Column(name = "NBR_ETU_TIE_TPS_EPR")
    private Short nbrEtuTieTpsEpr;
    @Column(name = "NBR_ETU_AID_EPR")
    private Short nbrEtuAidEpr;
    @Size(max = 40)
    @Column(name = "LIB_TYP_EXE_EPR")
    private String libTypExeEpr;
    @Size(max = 400)
    @Column(name = "LIB_DOC_AUT_EPR")
    private String libDocAutEpr;
    @Size(max = 40)
    @Column(name = "LIB_EPR_ARB")
    private String libEprArb;
    @Size(max = 10)
    @Column(name = "LIC_EPR_ARB")
    private String licEprArb;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "epreuve")
    private Collection<GrpResultatEpr> grpResultatEprCollection;
    @JoinColumn(name = "COD_NEP", referencedColumnName = "COD_NEP")
    @ManyToOne(optional = false)
    private NatureEpr codNep;

    public Epreuve() {
    }

    public Epreuve(String codEpr) {
        this.codEpr = codEpr;
    }

    public Epreuve(String codEpr, String libEpr, String licEpr, String temNotEpr, String temResEpr, String codAdmEpr, String temRelPosSyt, String temAnlRptEpr, String temConEpr, String temSesUni, String temCtlValCadEpr) {
        this.codEpr = codEpr;
        this.libEpr = libEpr;
        this.licEpr = licEpr;
        this.temNotEpr = temNotEpr;
        this.temResEpr = temResEpr;
        this.codAdmEpr = codAdmEpr;
        this.temRelPosSyt = temRelPosSyt;
        this.temAnlRptEpr = temAnlRptEpr;
        this.temConEpr = temConEpr;
        this.temSesUni = temSesUni;
        this.temCtlValCadEpr = temCtlValCadEpr;
    }

    public String getCodEpr() {
        return codEpr;
    }

    public void setCodEpr(String codEpr) {
        this.codEpr = codEpr;
    }

    public String getLibEpr() {
        return libEpr;
    }

    public void setLibEpr(String libEpr) {
        this.libEpr = libEpr;
    }

    public String getLicEpr() {
        return licEpr;
    }

    public void setLicEpr(String licEpr) {
        this.licEpr = licEpr;
    }

    public String getTemNotEpr() {
        return temNotEpr;
    }

    public void setTemNotEpr(String temNotEpr) {
        this.temNotEpr = temNotEpr;
    }

    public Integer getBarSaiEpr() {
        return barSaiEpr;
    }

    public void setBarSaiEpr(Integer barSaiEpr) {
        this.barSaiEpr = barSaiEpr;
    }

    public String getTemResEpr() {
        return temResEpr;
    }

    public void setTemResEpr(String temResEpr) {
        this.temResEpr = temResEpr;
    }

    public String getCodAdmEpr() {
        return codAdmEpr;
    }

    public void setCodAdmEpr(String codAdmEpr) {
        this.codAdmEpr = codAdmEpr;
    }

    public Date getDatCreEpr() {
        return datCreEpr;
    }

    public void setDatCreEpr(Date datCreEpr) {
        this.datCreEpr = datCreEpr;
    }

    public Date getDatModEpr() {
        return datModEpr;
    }

    public void setDatModEpr(Date datModEpr) {
        this.datModEpr = datModEpr;
    }

    public String getTemRelPosSyt() {
        return temRelPosSyt;
    }

    public void setTemRelPosSyt(String temRelPosSyt) {
        this.temRelPosSyt = temRelPosSyt;
    }

    public BigDecimal getNotMinRptEpr() {
        return notMinRptEpr;
    }

    public void setNotMinRptEpr(BigDecimal notMinRptEpr) {
        this.notMinRptEpr = notMinRptEpr;
    }

    public Integer getBarMinRptEpr() {
        return barMinRptEpr;
    }

    public void setBarMinRptEpr(Integer barMinRptEpr) {
        this.barMinRptEpr = barMinRptEpr;
    }

    public String getTemAnlRptEpr() {
        return temAnlRptEpr;
    }

    public void setTemAnlRptEpr(String temAnlRptEpr) {
        this.temAnlRptEpr = temAnlRptEpr;
    }

    public String getTemConEpr() {
        return temConEpr;
    }

    public void setTemConEpr(String temConEpr) {
        this.temConEpr = temConEpr;
    }

    public BigDecimal getNotMinConEpr() {
        return notMinConEpr;
    }

    public void setNotMinConEpr(BigDecimal notMinConEpr) {
        this.notMinConEpr = notMinConEpr;
    }

    public Integer getBarMinConEpr() {
        return barMinConEpr;
    }

    public void setBarMinConEpr(Integer barMinConEpr) {
        this.barMinConEpr = barMinConEpr;
    }

    public Short getDurConEpr() {
        return durConEpr;
    }

    public void setDurConEpr(Short durConEpr) {
        this.durConEpr = durConEpr;
    }

    public String getLibCmtEpr() {
        return libCmtEpr;
    }

    public void setLibCmtEpr(String libCmtEpr) {
        this.libCmtEpr = libCmtEpr;
    }

    public String getTemSesUni() {
        return temSesUni;
    }

    public void setTemSesUni(String temSesUni) {
        this.temSesUni = temSesUni;
    }

    public String getTemCtlValCadEpr() {
        return temCtlValCadEpr;
    }

    public void setTemCtlValCadEpr(String temCtlValCadEpr) {
        this.temCtlValCadEpr = temCtlValCadEpr;
    }

    public Integer getDurExaS1Epr() {
        return durExaS1Epr;
    }

    public void setDurExaS1Epr(Integer durExaS1Epr) {
        this.durExaS1Epr = durExaS1Epr;
    }

    public Integer getDurExaS2Epr() {
        return durExaS2Epr;
    }

    public void setDurExaS2Epr(Integer durExaS2Epr) {
        this.durExaS2Epr = durExaS2Epr;
    }

    public String getTemDocAutEpr() {
        return temDocAutEpr;
    }

    public void setTemDocAutEpr(String temDocAutEpr) {
        this.temDocAutEpr = temDocAutEpr;
    }

    public String getTemOrgEpr() {
        return temOrgEpr;
    }

    public void setTemOrgEpr(String temOrgEpr) {
        this.temOrgEpr = temOrgEpr;
    }

    public Short getNbrEtuHanMotEpr() {
        return nbrEtuHanMotEpr;
    }

    public void setNbrEtuHanMotEpr(Short nbrEtuHanMotEpr) {
        this.nbrEtuHanMotEpr = nbrEtuHanMotEpr;
    }

    public Short getNbrEtuTieTpsEpr() {
        return nbrEtuTieTpsEpr;
    }

    public void setNbrEtuTieTpsEpr(Short nbrEtuTieTpsEpr) {
        this.nbrEtuTieTpsEpr = nbrEtuTieTpsEpr;
    }

    public Short getNbrEtuAidEpr() {
        return nbrEtuAidEpr;
    }

    public void setNbrEtuAidEpr(Short nbrEtuAidEpr) {
        this.nbrEtuAidEpr = nbrEtuAidEpr;
    }

    public String getLibTypExeEpr() {
        return libTypExeEpr;
    }

    public void setLibTypExeEpr(String libTypExeEpr) {
        this.libTypExeEpr = libTypExeEpr;
    }

    public String getLibDocAutEpr() {
        return libDocAutEpr;
    }

    public void setLibDocAutEpr(String libDocAutEpr) {
        this.libDocAutEpr = libDocAutEpr;
    }

    public String getLibEprArb() {
        return libEprArb;
    }

    public void setLibEprArb(String libEprArb) {
        this.libEprArb = libEprArb;
    }

    public String getLicEprArb() {
        return licEprArb;
    }

    public void setLicEprArb(String licEprArb) {
        this.licEprArb = licEprArb;
    }

    @XmlTransient
    public Collection<GrpResultatEpr> getGrpResultatEprCollection() {
        return grpResultatEprCollection;
    }

    public void setGrpResultatEprCollection(Collection<GrpResultatEpr> grpResultatEprCollection) {
        this.grpResultatEprCollection = grpResultatEprCollection;
    }

    public NatureEpr getCodNep() {
        return codNep;
    }

    public void setCodNep(NatureEpr codNep) {
        this.codNep = codNep;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEpr != null ? codEpr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Epreuve)) {
            return false;
        }
        Epreuve other = (Epreuve) object;
        if ((this.codEpr == null && other.codEpr != null) || (this.codEpr != null && !this.codEpr.equals(other.codEpr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.Epreuve[ codEpr=" + codEpr + " ]";
    }
    
}
