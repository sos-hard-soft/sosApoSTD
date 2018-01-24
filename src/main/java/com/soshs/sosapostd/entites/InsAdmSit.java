/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.sosapostd.entites;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author docFSJES
 */
@Entity
@Table(name = "INS_ADM_SIT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InsAdmSit.findAll", query = "SELECT i FROM InsAdmSit i")
    , @NamedQuery(name = "InsAdmSit.findByCodAnu", query = "SELECT i FROM InsAdmSit i WHERE i.insAdmSitPK.codAnu = :codAnu")
    , @NamedQuery(name = "InsAdmSit.findByCodInd", query = "SELECT i FROM InsAdmSit i WHERE i.insAdmSitPK.codInd = :codInd")
    , @NamedQuery(name = "InsAdmSit.findByEtaIas", query = "SELECT i FROM InsAdmSit i WHERE i.etaIas = :etaIas")
    , @NamedQuery(name = "InsAdmSit.findByDatModIas", query = "SELECT i FROM InsAdmSit i WHERE i.datModIas = :datModIas")
    , @NamedQuery(name = "InsAdmSit.findByMntDrtPai", query = "SELECT i FROM InsAdmSit i WHERE i.mntDrtPai = :mntDrtPai")
    , @NamedQuery(name = "InsAdmSit.findByMntDrtRmb", query = "SELECT i FROM InsAdmSit i WHERE i.mntDrtRmb = :mntDrtRmb")
    , @NamedQuery(name = "InsAdmSit.findByMntReePai", query = "SELECT i FROM InsAdmSit i WHERE i.mntReePai = :mntReePai")
    , @NamedQuery(name = "InsAdmSit.findByMntReeRmb", query = "SELECT i FROM InsAdmSit i WHERE i.mntReeRmb = :mntReeRmb")
    , @NamedQuery(name = "InsAdmSit.findByMntBalDrt", query = "SELECT i FROM InsAdmSit i WHERE i.mntBalDrt = :mntBalDrt")
    , @NamedQuery(name = "InsAdmSit.findByMntBalRee", query = "SELECT i FROM InsAdmSit i WHERE i.mntBalRee = :mntBalRee")
    , @NamedQuery(name = "InsAdmSit.findByMntIas", query = "SELECT i FROM InsAdmSit i WHERE i.mntIas = :mntIas")})
public class InsAdmSit implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InsAdmSitPK insAdmSitPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "ETA_IAS")
    private String etaIas;
    @Column(name = "DAT_MOD_IAS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datModIas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MNT_DRT_PAI")
    private BigDecimal mntDrtPai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MNT_DRT_RMB")
    private BigDecimal mntDrtRmb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MNT_REE_PAI")
    private BigDecimal mntReePai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MNT_REE_RMB")
    private BigDecimal mntReeRmb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MNT_BAL_DRT")
    private BigDecimal mntBalDrt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MNT_BAL_REE")
    private BigDecimal mntBalRee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MNT_IAS")
    private BigDecimal mntIas;
    @JoinColumns({
        @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)})
    @OneToOne(optional = false)
    private InsAdmAnu insAdmAnu;

    public InsAdmSit() {
    }

    public InsAdmSit(InsAdmSitPK insAdmSitPK) {
        this.insAdmSitPK = insAdmSitPK;
    }

    public InsAdmSit(InsAdmSitPK insAdmSitPK, String etaIas, BigDecimal mntDrtPai, BigDecimal mntDrtRmb, BigDecimal mntReePai, BigDecimal mntReeRmb, BigDecimal mntBalDrt, BigDecimal mntBalRee, BigDecimal mntIas) {
        this.insAdmSitPK = insAdmSitPK;
        this.etaIas = etaIas;
        this.mntDrtPai = mntDrtPai;
        this.mntDrtRmb = mntDrtRmb;
        this.mntReePai = mntReePai;
        this.mntReeRmb = mntReeRmb;
        this.mntBalDrt = mntBalDrt;
        this.mntBalRee = mntBalRee;
        this.mntIas = mntIas;
    }

    public InsAdmSit(String codAnu, int codInd) {
        this.insAdmSitPK = new InsAdmSitPK(codAnu, codInd);
    }

    public InsAdmSitPK getInsAdmSitPK() {
        return insAdmSitPK;
    }

    public void setInsAdmSitPK(InsAdmSitPK insAdmSitPK) {
        this.insAdmSitPK = insAdmSitPK;
    }

    public String getEtaIas() {
        return etaIas;
    }

    public void setEtaIas(String etaIas) {
        this.etaIas = etaIas;
    }

    public Date getDatModIas() {
        return datModIas;
    }

    public void setDatModIas(Date datModIas) {
        this.datModIas = datModIas;
    }

    public BigDecimal getMntDrtPai() {
        return mntDrtPai;
    }

    public void setMntDrtPai(BigDecimal mntDrtPai) {
        this.mntDrtPai = mntDrtPai;
    }

    public BigDecimal getMntDrtRmb() {
        return mntDrtRmb;
    }

    public void setMntDrtRmb(BigDecimal mntDrtRmb) {
        this.mntDrtRmb = mntDrtRmb;
    }

    public BigDecimal getMntReePai() {
        return mntReePai;
    }

    public void setMntReePai(BigDecimal mntReePai) {
        this.mntReePai = mntReePai;
    }

    public BigDecimal getMntReeRmb() {
        return mntReeRmb;
    }

    public void setMntReeRmb(BigDecimal mntReeRmb) {
        this.mntReeRmb = mntReeRmb;
    }

    public BigDecimal getMntBalDrt() {
        return mntBalDrt;
    }

    public void setMntBalDrt(BigDecimal mntBalDrt) {
        this.mntBalDrt = mntBalDrt;
    }

    public BigDecimal getMntBalRee() {
        return mntBalRee;
    }

    public void setMntBalRee(BigDecimal mntBalRee) {
        this.mntBalRee = mntBalRee;
    }

    public BigDecimal getMntIas() {
        return mntIas;
    }

    public void setMntIas(BigDecimal mntIas) {
        this.mntIas = mntIas;
    }

    public InsAdmAnu getInsAdmAnu() {
        return insAdmAnu;
    }

    public void setInsAdmAnu(InsAdmAnu insAdmAnu) {
        this.insAdmAnu = insAdmAnu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (insAdmSitPK != null ? insAdmSitPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsAdmSit)) {
            return false;
        }
        InsAdmSit other = (InsAdmSit) object;
        if ((this.insAdmSitPK == null && other.insAdmSitPK != null) || (this.insAdmSitPK != null && !this.insAdmSitPK.equals(other.insAdmSitPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.InsAdmSit[ insAdmSitPK=" + insAdmSitPK + " ]";
    }
    
}
