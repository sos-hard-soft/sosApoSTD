/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soshs.sosapostd.entites;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author docFSJES
 */
@Entity
@Table(name = "GROUPE_DIPLOME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GroupeDiplome.findAll", query = "SELECT g FROM GroupeDiplome g")
    , @NamedQuery(name = "GroupeDiplome.findByCodGdi", query = "SELECT g FROM GroupeDiplome g WHERE g.codGdi = :codGdi")
    , @NamedQuery(name = "GroupeDiplome.findByLibGdi", query = "SELECT g FROM GroupeDiplome g WHERE g.libGdi = :libGdi")
    , @NamedQuery(name = "GroupeDiplome.findByTemEnSveGdi", query = "SELECT g FROM GroupeDiplome g WHERE g.temEnSveGdi = :temEnSveGdi")
    , @NamedQuery(name = "GroupeDiplome.findByTemFilGdi", query = "SELECT g FROM GroupeDiplome g WHERE g.temFilGdi = :temFilGdi")})
public class GroupeDiplome implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "COD_GDI")
    private String codGdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LIB_GDI")
    private String libGdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_EN_SVE_GDI")
    private String temEnSveGdi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "TEM_FIL_GDI")
    private String temFilGdi;

    public GroupeDiplome() {
    }

    public GroupeDiplome(String codGdi) {
        this.codGdi = codGdi;
    }

    public GroupeDiplome(String codGdi, String libGdi, String temEnSveGdi, String temFilGdi) {
        this.codGdi = codGdi;
        this.libGdi = libGdi;
        this.temEnSveGdi = temEnSveGdi;
        this.temFilGdi = temFilGdi;
    }

    public String getCodGdi() {
        return codGdi;
    }

    public void setCodGdi(String codGdi) {
        this.codGdi = codGdi;
    }

    public String getLibGdi() {
        return libGdi;
    }

    public void setLibGdi(String libGdi) {
        this.libGdi = libGdi;
    }

    public String getTemEnSveGdi() {
        return temEnSveGdi;
    }

    public void setTemEnSveGdi(String temEnSveGdi) {
        this.temEnSveGdi = temEnSveGdi;
    }

    public String getTemFilGdi() {
        return temFilGdi;
    }

    public void setTemFilGdi(String temFilGdi) {
        this.temFilGdi = temFilGdi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codGdi != null ? codGdi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupeDiplome)) {
            return false;
        }
        GroupeDiplome other = (GroupeDiplome) object;
        if ((this.codGdi == null && other.codGdi != null) || (this.codGdi != null && !this.codGdi.equals(other.codGdi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.soshs.sosapostd.entites.GroupeDiplome[ codGdi=" + codGdi + " ]";
    }
    
}
