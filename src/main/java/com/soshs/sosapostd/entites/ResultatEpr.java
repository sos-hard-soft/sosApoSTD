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
import javax.persistence.ManyToOne;
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
 * @author docFSJES
 */
@Entity
@Table(name = "RESULTAT_EPR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResultatEpr.findAll", query = "SELECT r FROM ResultatEpr r")
    , @NamedQuery(name = "ResultatEpr.findByCodInd", query = "SELECT r FROM ResultatEpr r WHERE r.resultatEprPK.codInd = :codInd")
    , @NamedQuery(name = "ResultatEpr.findByCodEpr", query = "SELECT r FROM ResultatEpr r WHERE r.resultatEprPK.codEpr = :codEpr")
    , @NamedQuery(name = "ResultatEpr.findByCodAnu", query = "SELECT r FROM ResultatEpr r WHERE r.resultatEprPK.codAnu = :codAnu")
    , @NamedQuery(name = "ResultatEpr.findByCodSes", query = "SELECT r FROM ResultatEpr r WHERE r.resultatEprPK.codSes = :codSes")
    , @NamedQuery(name = "ResultatEpr.findByCodAdm", query = "SELECT r FROM ResultatEpr r WHERE r.resultatEprPK.codAdm = :codAdm")
    , @NamedQuery(name = "ResultatEpr.findByNotEpr", query = "SELECT r FROM ResultatEpr r WHERE r.notEpr = :notEpr")
    , @NamedQuery(name = "ResultatEpr.findByNotSubEpr", query = "SELECT r FROM ResultatEpr r WHERE r.notSubEpr = :notSubEpr")
    , @NamedQuery(name = "ResultatEpr.findByBarNotEpr", query = "SELECT r FROM ResultatEpr r WHERE r.barNotEpr = :barNotEpr")
    , @NamedQuery(name = "ResultatEpr.findByEtaNotEpr", query = "SELECT r FROM ResultatEpr r WHERE r.etaNotEpr = :etaNotEpr")
    , @NamedQuery(name = "ResultatEpr.findByTemNotRptEpr", query = "SELECT r FROM ResultatEpr r WHERE r.temNotRptEpr = :temNotRptEpr")
    , @NamedQuery(name = "ResultatEpr.findByEtaResEpr", query = "SELECT r FROM ResultatEpr r WHERE r.etaResEpr = :etaResEpr")
    , @NamedQuery(name = "ResultatEpr.findByTemResRptEpr", query = "SELECT r FROM ResultatEpr r WHERE r.temResRptEpr = :temResRptEpr")
    , @NamedQuery(name = "ResultatEpr.findByCodNumUtiCre", query = "SELECT r FROM ResultatEpr r WHERE r.codNumUtiCre = :codNumUtiCre")
    , @NamedQuery(name = "ResultatEpr.findByDatCreEpr", query = "SELECT r FROM ResultatEpr r WHERE r.datCreEpr = :datCreEpr")
    , @NamedQuery(name = "ResultatEpr.findByCodNumUtiMod", query = "SELECT r FROM ResultatEpr r WHERE r.codNumUtiMod = :codNumUtiMod")
    , @NamedQuery(name = "ResultatEpr.findByDatModEpr", query = "SELECT r FROM ResultatEpr r WHERE r.datModEpr = :datModEpr")
    , @NamedQuery(name = "ResultatEpr.findByTemIntEpr", query = "SELECT r FROM ResultatEpr r WHERE r.temIntEpr = :temIntEpr")
    , @NamedQuery(name = "ResultatEpr.findByTemIaeKoEpr", query = "SELECT r FROM ResultatEpr r WHERE r.temIaeKoEpr = :temIaeKoEpr")
    , @NamedQuery(name = "ResultatEpr.findByTemIpEpr", query = "SELECT r FROM ResultatEpr r WHERE r.temIpEpr = :temIpEpr")
    , @NamedQuery(name = "ResultatEpr.findByTemIndCrnEpr", query = "SELECT r FROM ResultatEpr r WHERE r.temIndCrnEpr = :temIndCrnEpr")
    , @NamedQuery(name = "ResultatEpr.findByTemExiNotEpr", query = "SELECT r FROM ResultatEpr r WHERE r.temExiNotEpr = :temExiNotEpr")
    , @NamedQuery(name = "ResultatEpr.findByTemDstSupEpr", query = "SELECT r FROM ResultatEpr r WHERE r.temDstSupEpr = :temDstSupEpr")
    , @NamedQuery(name = "ResultatEpr.findByTemCrnHerEpr", query = "SELECT r FROM ResultatEpr r WHERE r.temCrnHerEpr = :temCrnHerEpr")
    , @NamedQuery(name = "ResultatEpr.findByTemOriActEpr", query = "SELECT r FROM ResultatEpr r WHERE r.temOriActEpr = :temOriActEpr")
    , @NamedQuery(name = "ResultatEpr.findByTemTrtRptEpr", query = "SELECT r FROM ResultatEpr r WHERE r.temTrtRptEpr = :temTrtRptEpr")
    , @NamedQuery(name = "ResultatEpr.findByCodEtuAno", query = "SELECT r FROM ResultatEpr r WHERE r.codEtuAno = :codEtuAno")})
public class ResultatEpr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ResultatEprPK resultatEprPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NOT_EPR")
    private BigDecimal notEpr;
    @Size(max = 3)
    @Column(name = "NOT_SUB_EPR")
    private String notSubEpr;
    @Column(name = "BAR_NOT_EPR")
    private Integer barNotEpr;
    @Size(max = 1)
    @Column(name = "ETA_NOT_EPR")
    private String etaNotEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_NOT_RPT_EPR")
    private String temNotRptEpr;
    @Size(max = 1)
    @Column(name = "ETA_RES_EPR")
    private String etaResEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_RES_RPT_EPR")
    private String temResRptEpr;
    @Column(name = "COD_NUM_UTI_CRE")
    private Integer codNumUtiCre;
    @Column(name = "DAT_CRE_EPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datCreEpr;
    @Column(name = "COD_NUM_UTI_MOD")
    private Integer codNumUtiMod;
    @Column(name = "DAT_MOD_EPR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datModEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_INT_EPR")
    private String temIntEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_IAE_KO_EPR")
    private String temIaeKoEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_IP_EPR")
    private String temIpEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TEM_IND_CRN_EPR")
    private String temIndCrnEpr;
    @Size(max = 1)
    @Column(name = "TEM_EXI_NOT_EPR")
    private String temExiNotEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_DST_SUP_EPR")
    private String temDstSupEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_CRN_HER_EPR")
    private String temCrnHerEpr;
    @Size(max = 1)
    @Column(name = "TEM_ORI_ACT_EPR")
    private String temOriActEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_TRT_RPT_EPR")
    private String temTrtRptEpr;
    @Column(name = "COD_ETU_ANO")
    private Integer codEtuAno;
    @JoinColumns({
        @JoinColumn(name = "COD_EPR", referencedColumnName = "COD_EPR", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_SES", referencedColumnName = "COD_SES", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_ADM", referencedColumnName = "COD_ADM", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private GrpResultatEpr grpResultatEpr;
    @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Individu individu;

    public ResultatEpr() {
    }

    public ResultatEpr(ResultatEprPK resultatEprPK) {
        this.resultatEprPK = resultatEprPK;
    }

    public ResultatEpr(ResultatEprPK resultatEprPK, String temNotRptEpr, String temResRptEpr, String temIntEpr, String temIaeKoEpr, String temIpEpr, String temIndCrnEpr, String temDstSupEpr, String temCrnHerEpr, String temTrtRptEpr) {
        this.resultatEprPK = resultatEprPK;
        this.temNotRptEpr = temNotRptEpr;
        this.temResRptEpr = temResRptEpr;
        this.temIntEpr = temIntEpr;
        this.temIaeKoEpr = temIaeKoEpr;
        this.temIpEpr = temIpEpr;
        this.temIndCrnEpr = temIndCrnEpr;
        this.temDstSupEpr = temDstSupEpr;
        this.temCrnHerEpr = temCrnHerEpr;
        this.temTrtRptEpr = temTrtRptEpr;
    }

    public ResultatEpr(int codInd, String codEpr, String codAnu, String codSes, String codAdm) {
        this.resultatEprPK = new ResultatEprPK(codInd, codEpr, codAnu, codSes, codAdm);
    }

    public ResultatEprPK getResultatEprPK() {
        return resultatEprPK;
    }

    public void setResultatEprPK(ResultatEprPK resultatEprPK) {
        this.resultatEprPK = resultatEprPK;
    }

    public BigDecimal getNotEpr() {
        return notEpr;
    }

    public void setNotEpr(BigDecimal notEpr) {
        this.notEpr = notEpr;
    }

    public String getNotSubEpr() {
        return notSubEpr;
    }

    public void setNotSubEpr(String notSubEpr) {
        this.notSubEpr = notSubEpr;
    }

    public Integer getBarNotEpr() {
        return barNotEpr;
    }

    public void setBarNotEpr(Integer barNotEpr) {
        this.barNotEpr = barNotEpr;
    }

    public String getEtaNotEpr() {
        return etaNotEpr;
    }

    public void setEtaNotEpr(String etaNotEpr) {
        this.etaNotEpr = etaNotEpr;
    }

    public String getTemNotRptEpr() {
        return temNotRptEpr;
    }

    public void setTemNotRptEpr(String temNotRptEpr) {
        this.temNotRptEpr = temNotRptEpr;
    }

    public String getEtaResEpr() {
        return etaResEpr;
    }

    public void setEtaResEpr(String etaResEpr) {
        this.etaResEpr = etaResEpr;
    }

    public String getTemResRptEpr() {
        return temResRptEpr;
    }

    public void setTemResRptEpr(String temResRptEpr) {
        this.temResRptEpr = temResRptEpr;
    }

    public Integer getCodNumUtiCre() {
        return codNumUtiCre;
    }

    public void setCodNumUtiCre(Integer codNumUtiCre) {
        this.codNumUtiCre = codNumUtiCre;
    }

    public Date getDatCreEpr() {
        return datCreEpr;
    }

    public void setDatCreEpr(Date datCreEpr) {
        this.datCreEpr = datCreEpr;
    }

    public Integer getCodNumUtiMod() {
        return codNumUtiMod;
    }

    public void setCodNumUtiMod(Integer codNumUtiMod) {
        this.codNumUtiMod = codNumUtiMod;
    }

    public Date getDatModEpr() {
        return datModEpr;
    }

    public void setDatModEpr(Date datModEpr) {
        this.datModEpr = datModEpr;
    }

    public String getTemIntEpr() {
        return temIntEpr;
    }

    public void setTemIntEpr(String temIntEpr) {
        this.temIntEpr = temIntEpr;
    }

    public String getTemIaeKoEpr() {
        return temIaeKoEpr;
    }

    public void setTemIaeKoEpr(String temIaeKoEpr) {
        this.temIaeKoEpr = temIaeKoEpr;
    }

    public String getTemIpEpr() {
        return temIpEpr;
    }

    public void setTemIpEpr(String temIpEpr) {
        this.temIpEpr = temIpEpr;
    }

    public String getTemIndCrnEpr() {
        return temIndCrnEpr;
    }

    public void setTemIndCrnEpr(String temIndCrnEpr) {
        this.temIndCrnEpr = temIndCrnEpr;
    }

    public String getTemExiNotEpr() {
        return temExiNotEpr;
    }

    public void setTemExiNotEpr(String temExiNotEpr) {
        this.temExiNotEpr = temExiNotEpr;
    }

    public String getTemDstSupEpr() {
        return temDstSupEpr;
    }

    public void setTemDstSupEpr(String temDstSupEpr) {
        this.temDstSupEpr = temDstSupEpr;
    }

    public String getTemCrnHerEpr() {
        return temCrnHerEpr;
    }

    public void setTemCrnHerEpr(String temCrnHerEpr) {
        this.temCrnHerEpr = temCrnHerEpr;
    }

    public String getTemOriActEpr() {
        return temOriActEpr;
    }

    public void setTemOriActEpr(String temOriActEpr) {
        this.temOriActEpr = temOriActEpr;
    }

    public String getTemTrtRptEpr() {
        return temTrtRptEpr;
    }

    public void setTemTrtRptEpr(String temTrtRptEpr) {
        this.temTrtRptEpr = temTrtRptEpr;
    }

    public Integer getCodEtuAno() {
        return codEtuAno;
    }

    public void setCodEtuAno(Integer codEtuAno) {
        this.codEtuAno = codEtuAno;
    }

    public GrpResultatEpr getGrpResultatEpr() {
        return grpResultatEpr;
    }

    public void setGrpResultatEpr(GrpResultatEpr grpResultatEpr) {
        this.grpResultatEpr = grpResultatEpr;
    }

    public Individu getIndividu() {
        return individu;
    }

    public void setIndividu(Individu individu) {
        this.individu = individu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resultatEprPK != null ? resultatEprPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultatEpr)) {
            return false;
        }
        ResultatEpr other = (ResultatEpr) object;
        if ((this.resultatEprPK == null && other.resultatEprPK != null) || (this.resultatEprPK != null && !this.resultatEprPK.equals(other.resultatEprPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.ResultatEpr[ resultatEprPK=" + resultatEprPK + " ]";
    }
    
}
