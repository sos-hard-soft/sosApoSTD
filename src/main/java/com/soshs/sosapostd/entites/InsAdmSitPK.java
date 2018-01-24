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
public class InsAdmSitPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "COD_ANU")
    private String codAnu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_IND")
    private int codInd;

    public InsAdmSitPK() {
    }

    public InsAdmSitPK(String codAnu, int codInd) {
        this.codAnu = codAnu;
        this.codInd = codInd;
    }

    public String getCodAnu() {
        return codAnu;
    }

    public void setCodAnu(String codAnu) {
        this.codAnu = codAnu;
    }

    public int getCodInd() {
        return codInd;
    }

    public void setCodInd(int codInd) {
        this.codInd = codInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAnu != null ? codAnu.hashCode() : 0);
        hash += (int) codInd;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InsAdmSitPK)) {
            return false;
        }
        InsAdmSitPK other = (InsAdmSitPK) object;
        if ((this.codAnu == null && other.codAnu != null) || (this.codAnu != null && !this.codAnu.equals(other.codAnu))) {
            return false;
        }
        if (this.codInd != other.codInd) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.InsAdmSitPK[ codAnu=" + codAnu + ", codInd=" + codInd + " ]";
    }
    
}
