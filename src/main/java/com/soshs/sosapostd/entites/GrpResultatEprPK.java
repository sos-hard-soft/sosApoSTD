/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.sosapostd.entites;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author docFSJES
 */
@Embeddable
public class GrpResultatEprPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_EPR")
    private String codEpr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_ANU")
    private String codAnu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_SES")
    private String codSes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "COD_ADM")
    private String codAdm;

    public GrpResultatEprPK() {
    }

    public GrpResultatEprPK(String codEpr, String codAnu, String codSes, String codAdm) {
        this.codEpr = codEpr;
        this.codAnu = codAnu;
        this.codSes = codSes;
        this.codAdm = codAdm;
    }

    public String getCodEpr() {
        return codEpr;
    }

    public void setCodEpr(String codEpr) {
        this.codEpr = codEpr;
    }

    public String getCodAnu() {
        return codAnu;
    }

    public void setCodAnu(String codAnu) {
        this.codAnu = codAnu;
    }

    public String getCodSes() {
        return codSes;
    }

    public void setCodSes(String codSes) {
        this.codSes = codSes;
    }

    public String getCodAdm() {
        return codAdm;
    }

    public void setCodAdm(String codAdm) {
        this.codAdm = codAdm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEpr != null ? codEpr.hashCode() : 0);
        hash += (codAnu != null ? codAnu.hashCode() : 0);
        hash += (codSes != null ? codSes.hashCode() : 0);
        hash += (codAdm != null ? codAdm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrpResultatEprPK)) {
            return false;
        }
        GrpResultatEprPK other = (GrpResultatEprPK) object;
        if ((this.codEpr == null && other.codEpr != null) || (this.codEpr != null && !this.codEpr.equals(other.codEpr))) {
            return false;
        }
        if ((this.codAnu == null && other.codAnu != null) || (this.codAnu != null && !this.codAnu.equals(other.codAnu))) {
            return false;
        }
        if ((this.codSes == null && other.codSes != null) || (this.codSes != null && !this.codSes.equals(other.codSes))) {
            return false;
        }
        if ((this.codAdm == null && other.codAdm != null) || (this.codAdm != null && !this.codAdm.equals(other.codAdm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.GrpResultatEprPK[ codEpr=" + codEpr + ", codAnu=" + codAnu + ", codSes=" + codSes + ", codAdm=" + codAdm + " ]";
    }
    
}
