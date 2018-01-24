/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.sosapostd.entites;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author docFSJES
 */
@Entity
@Table(name = "IND_DISPENSE_ELP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IndDispenseElp.findAll", query = "SELECT i FROM IndDispenseElp i")
    , @NamedQuery(name = "IndDispenseElp.findByCodAnu", query = "SELECT i FROM IndDispenseElp i WHERE i.indDispenseElpPK.codAnu = :codAnu")
    , @NamedQuery(name = "IndDispenseElp.findByCodInd", query = "SELECT i FROM IndDispenseElp i WHERE i.indDispenseElpPK.codInd = :codInd")
    , @NamedQuery(name = "IndDispenseElp.findByCodEtp", query = "SELECT i FROM IndDispenseElp i WHERE i.indDispenseElpPK.codEtp = :codEtp")
    , @NamedQuery(name = "IndDispenseElp.findByCodVrsVet", query = "SELECT i FROM IndDispenseElp i WHERE i.indDispenseElpPK.codVrsVet = :codVrsVet")
    , @NamedQuery(name = "IndDispenseElp.findByCodElp", query = "SELECT i FROM IndDispenseElp i WHERE i.indDispenseElpPK.codElp = :codElp")
    , @NamedQuery(name = "IndDispenseElp.findByDatDecElpVaa", query = "SELECT i FROM IndDispenseElp i WHERE i.datDecElpVaa = :datDecElpVaa")})
public class IndDispenseElp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IndDispenseElpPK indDispenseElpPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DAT_DEC_ELP_VAA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datDecElpVaa;
    @JoinColumn(name = "COD_ELP", referencedColumnName = "COD_ELP", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ElementPedagogi elementPedagogi;
    @JoinColumns({
        @JoinColumn(name = "COD_ANU", referencedColumnName = "COD_ANU", insertable = false, updatable = false)
        , @JoinColumn(name = "COD_IND", referencedColumnName = "COD_IND", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private InsPedagogiAnu insPedagogiAnu;

    public IndDispenseElp() {
    }

    public IndDispenseElp(IndDispenseElpPK indDispenseElpPK) {
        this.indDispenseElpPK = indDispenseElpPK;
    }

    public IndDispenseElp(IndDispenseElpPK indDispenseElpPK, Date datDecElpVaa) {
        this.indDispenseElpPK = indDispenseElpPK;
        this.datDecElpVaa = datDecElpVaa;
    }

    public IndDispenseElp(String codAnu, int codInd, String codEtp, short codVrsVet, String codElp) {
        this.indDispenseElpPK = new IndDispenseElpPK(codAnu, codInd, codEtp, codVrsVet, codElp);
    }

    public IndDispenseElpPK getIndDispenseElpPK() {
        return indDispenseElpPK;
    }

    public void setIndDispenseElpPK(IndDispenseElpPK indDispenseElpPK) {
        this.indDispenseElpPK = indDispenseElpPK;
    }

    public Date getDatDecElpVaa() {
        return datDecElpVaa;
    }

    public void setDatDecElpVaa(Date datDecElpVaa) {
        this.datDecElpVaa = datDecElpVaa;
    }

    public ElementPedagogi getElementPedagogi() {
        return elementPedagogi;
    }

    public void setElementPedagogi(ElementPedagogi elementPedagogi) {
        this.elementPedagogi = elementPedagogi;
    }

    public InsPedagogiAnu getInsPedagogiAnu() {
        return insPedagogiAnu;
    }

    public void setInsPedagogiAnu(InsPedagogiAnu insPedagogiAnu) {
        this.insPedagogiAnu = insPedagogiAnu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indDispenseElpPK != null ? indDispenseElpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IndDispenseElp)) {
            return false;
        }
        IndDispenseElp other = (IndDispenseElp) object;
        if ((this.indDispenseElpPK == null && other.indDispenseElpPK != null) || (this.indDispenseElpPK != null && !this.indDispenseElpPK.equals(other.indDispenseElpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.IndDispenseElp[ indDispenseElpPK=" + indDispenseElpPK + " ]";
    }
    
}
