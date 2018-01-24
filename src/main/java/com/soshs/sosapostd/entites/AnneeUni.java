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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "ANNEE_UNI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AnneeUni.findAll", query = "SELECT a FROM AnneeUni a")
    , @NamedQuery(name = "AnneeUni.findByCodAnu", query = "SELECT a FROM AnneeUni a WHERE a.codAnu = :codAnu")
    , @NamedQuery(name = "AnneeUni.findByEtaAnuIae", query = "SELECT a FROM AnneeUni a WHERE a.etaAnuIae = :etaAnuIae")
    , @NamedQuery(name = "AnneeUni.findByLibAnu", query = "SELECT a FROM AnneeUni a WHERE a.libAnu = :libAnu")
    , @NamedQuery(name = "AnneeUni.findByLicAnu", query = "SELECT a FROM AnneeUni a WHERE a.licAnu = :licAnu")
    , @NamedQuery(name = "AnneeUni.findByDatOuvOpi", query = "SELECT a FROM AnneeUni a WHERE a.datOuvOpi = :datOuvOpi")
    , @NamedQuery(name = "AnneeUni.findByDatFrmOpi", query = "SELECT a FROM AnneeUni a WHERE a.datFrmOpi = :datFrmOpi")
    , @NamedQuery(name = "AnneeUni.findByEtaAnuIpe", query = "SELECT a FROM AnneeUni a WHERE a.etaAnuIpe = :etaAnuIpe")
    , @NamedQuery(name = "AnneeUni.findByNumOccObtVdi", query = "SELECT a FROM AnneeUni a WHERE a.numOccObtVdi = :numOccObtVdi")
    , @NamedQuery(name = "AnneeUni.findByEtaAnuRes", query = "SELECT a FROM AnneeUni a WHERE a.etaAnuRes = :etaAnuRes")
    , @NamedQuery(name = "AnneeUni.findByNumOccObtVdiUni", query = "SELECT a FROM AnneeUni a WHERE a.numOccObtVdiUni = :numOccObtVdiUni")})
public class AnneeUni implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_ANU")
    private String codAnu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_ANU_IAE")
    private String etaAnuIae;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_ANU")
    private String libAnu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "LIC_ANU")
    private String licAnu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DAT_OUV_OPI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datOuvOpi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DAT_FRM_OPI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datFrmOpi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_ANU_IPE")
    private String etaAnuIpe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_OCC_OBT_VDI")
    private int numOccObtVdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_ANU_RES")
    private String etaAnuRes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_OCC_OBT_VDI_UNI")
    private int numOccObtVdiUni;
    @Lob
    @Column(name = "LOG_UNI")
    private byte[] logUni;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anneeUni")
    private Collection<GrpResultatEpr> grpResultatEprCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anneeUni")
    private Collection<GrpResultatVet> grpResultatVetCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anneeUni")
    private Collection<InsPedagogiAnu> insPedagogiAnuCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anneeUni")
    private Collection<GrpResultatElp> grpResultatElpCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anneeUni")
    private Collection<InsAdmAnu> insAdmAnuCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anneeUni")
    private Collection<InsInfoAnu> insInfoAnuCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anneeUni")
    private Collection<GrpResultatVdi> grpResultatVdiCollection;
    @OneToMany(mappedBy = "codAnuSrtInd")
    private Collection<Individu> individuCollection;

    public AnneeUni() {
    }

    public AnneeUni(String codAnu) {
        this.codAnu = codAnu;
    }

    public AnneeUni(String codAnu, String etaAnuIae, String libAnu, String licAnu, Date datOuvOpi, Date datFrmOpi, String etaAnuIpe, int numOccObtVdi, String etaAnuRes, int numOccObtVdiUni) {
        this.codAnu = codAnu;
        this.etaAnuIae = etaAnuIae;
        this.libAnu = libAnu;
        this.licAnu = licAnu;
        this.datOuvOpi = datOuvOpi;
        this.datFrmOpi = datFrmOpi;
        this.etaAnuIpe = etaAnuIpe;
        this.numOccObtVdi = numOccObtVdi;
        this.etaAnuRes = etaAnuRes;
        this.numOccObtVdiUni = numOccObtVdiUni;
    }

    public String getCodAnu() {
        return codAnu;
    }

    public void setCodAnu(String codAnu) {
        this.codAnu = codAnu;
    }

    public String getEtaAnuIae() {
        return etaAnuIae;
    }

    public void setEtaAnuIae(String etaAnuIae) {
        this.etaAnuIae = etaAnuIae;
    }

    public String getLibAnu() {
        return libAnu;
    }

    public void setLibAnu(String libAnu) {
        this.libAnu = libAnu;
    }

    public String getLicAnu() {
        return licAnu;
    }

    public void setLicAnu(String licAnu) {
        this.licAnu = licAnu;
    }

    public Date getDatOuvOpi() {
        return datOuvOpi;
    }

    public void setDatOuvOpi(Date datOuvOpi) {
        this.datOuvOpi = datOuvOpi;
    }

    public Date getDatFrmOpi() {
        return datFrmOpi;
    }

    public void setDatFrmOpi(Date datFrmOpi) {
        this.datFrmOpi = datFrmOpi;
    }

    public String getEtaAnuIpe() {
        return etaAnuIpe;
    }

    public void setEtaAnuIpe(String etaAnuIpe) {
        this.etaAnuIpe = etaAnuIpe;
    }

    public int getNumOccObtVdi() {
        return numOccObtVdi;
    }

    public void setNumOccObtVdi(int numOccObtVdi) {
        this.numOccObtVdi = numOccObtVdi;
    }

    public String getEtaAnuRes() {
        return etaAnuRes;
    }

    public void setEtaAnuRes(String etaAnuRes) {
        this.etaAnuRes = etaAnuRes;
    }

    public int getNumOccObtVdiUni() {
        return numOccObtVdiUni;
    }

    public void setNumOccObtVdiUni(int numOccObtVdiUni) {
        this.numOccObtVdiUni = numOccObtVdiUni;
    }

    public byte[] getLogUni() {
        return logUni;
    }

    public void setLogUni(byte[] logUni) {
        this.logUni = logUni;
    }

    @XmlTransient
    public Collection<GrpResultatEpr> getGrpResultatEprCollection() {
        return grpResultatEprCollection;
    }

    public void setGrpResultatEprCollection(Collection<GrpResultatEpr> grpResultatEprCollection) {
        this.grpResultatEprCollection = grpResultatEprCollection;
    }

    @XmlTransient
    public Collection<GrpResultatVet> getGrpResultatVetCollection() {
        return grpResultatVetCollection;
    }

    public void setGrpResultatVetCollection(Collection<GrpResultatVet> grpResultatVetCollection) {
        this.grpResultatVetCollection = grpResultatVetCollection;
    }

    @XmlTransient
    public Collection<InsPedagogiAnu> getInsPedagogiAnuCollection() {
        return insPedagogiAnuCollection;
    }

    public void setInsPedagogiAnuCollection(Collection<InsPedagogiAnu> insPedagogiAnuCollection) {
        this.insPedagogiAnuCollection = insPedagogiAnuCollection;
    }

    @XmlTransient
    public Collection<GrpResultatElp> getGrpResultatElpCollection() {
        return grpResultatElpCollection;
    }

    public void setGrpResultatElpCollection(Collection<GrpResultatElp> grpResultatElpCollection) {
        this.grpResultatElpCollection = grpResultatElpCollection;
    }

    @XmlTransient
    public Collection<InsAdmAnu> getInsAdmAnuCollection() {
        return insAdmAnuCollection;
    }

    public void setInsAdmAnuCollection(Collection<InsAdmAnu> insAdmAnuCollection) {
        this.insAdmAnuCollection = insAdmAnuCollection;
    }

    @XmlTransient
    public Collection<InsInfoAnu> getInsInfoAnuCollection() {
        return insInfoAnuCollection;
    }

    public void setInsInfoAnuCollection(Collection<InsInfoAnu> insInfoAnuCollection) {
        this.insInfoAnuCollection = insInfoAnuCollection;
    }

    @XmlTransient
    public Collection<GrpResultatVdi> getGrpResultatVdiCollection() {
        return grpResultatVdiCollection;
    }

    public void setGrpResultatVdiCollection(Collection<GrpResultatVdi> grpResultatVdiCollection) {
        this.grpResultatVdiCollection = grpResultatVdiCollection;
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
        hash += (codAnu != null ? codAnu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnneeUni)) {
            return false;
        }
        AnneeUni other = (AnneeUni) object;
        if ((this.codAnu == null && other.codAnu != null) || (this.codAnu != null && !this.codAnu.equals(other.codAnu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.AnneeUni[ codAnu=" + codAnu + " ]";
    }
    
}
