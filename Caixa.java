/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author lais_
 */
@Entity
@Table(name = "caixa", catalog = "atelie", schema = "")
@NamedQueries({
    @NamedQuery(name = "Caixa.findAll", query = "SELECT c FROM Caixa c")
    , @NamedQuery(name = "Caixa.findByCaiCodPgt", query = "SELECT c FROM Caixa c WHERE c.caiCodPgt = :caiCodPgt")
    , @NamedQuery(name = "Caixa.findByCaiPgt", query = "SELECT c FROM Caixa c WHERE c.caiPgt = :caiPgt")
    , @NamedQuery(name = "Caixa.findByCaiProdPgt", query = "SELECT c FROM Caixa c WHERE c.caiProdPgt = :caiProdPgt")
    , @NamedQuery(name = "Caixa.findByCaiNomeCli", query = "SELECT c FROM Caixa c WHERE c.caiNomeCli = :caiNomeCli")
    , @NamedQuery(name = "Caixa.findByCaiDataPgt", query = "SELECT c FROM Caixa c WHERE c.caiDataPgt = :caiDataPgt")})
public class Caixa implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cai_cod_pgt")
    private Integer caiCodPgt;
    @Basic(optional = false)
    @Column(name = "cai_pgt")
    private float caiPgt;
    @Basic(optional = false)
    @Column(name = "cai_prod_pgt")
    private String caiProdPgt;
    @Basic(optional = false)
    @Column(name = "cai_nome_cli")
    private String caiNomeCli;
    @Basic(optional = false)
    @Column(name = "cai_data_pgt")
    @Temporal(TemporalType.DATE)
    private Date caiDataPgt;

    public Caixa() {
    }

    public Caixa(Integer caiCodPgt) {
        this.caiCodPgt = caiCodPgt;
    }

    public Caixa(Integer caiCodPgt, float caiPgt, String caiProdPgt, String caiNomeCli, Date caiDataPgt) {
        this.caiCodPgt = caiCodPgt;
        this.caiPgt = caiPgt;
        this.caiProdPgt = caiProdPgt;
        this.caiNomeCli = caiNomeCli;
        this.caiDataPgt = caiDataPgt;
    }

    public Integer getCaiCodPgt() {
        return caiCodPgt;
    }

    public void setCaiCodPgt(Integer caiCodPgt) {
        Integer oldCaiCodPgt = this.caiCodPgt;
        this.caiCodPgt = caiCodPgt;
        changeSupport.firePropertyChange("caiCodPgt", oldCaiCodPgt, caiCodPgt);
    }

    public float getCaiPgt() {
        return caiPgt;
    }

    public void setCaiPgt(float caiPgt) {
        float oldCaiPgt = this.caiPgt;
        this.caiPgt = caiPgt;
        changeSupport.firePropertyChange("caiPgt", oldCaiPgt, caiPgt);
    }

    public String getCaiProdPgt() {
        return caiProdPgt;
    }

    public void setCaiProdPgt(String caiProdPgt) {
        String oldCaiProdPgt = this.caiProdPgt;
        this.caiProdPgt = caiProdPgt;
        changeSupport.firePropertyChange("caiProdPgt", oldCaiProdPgt, caiProdPgt);
    }

    public String getCaiNomeCli() {
        return caiNomeCli;
    }

    public void setCaiNomeCli(String caiNomeCli) {
        String oldCaiNomeCli = this.caiNomeCli;
        this.caiNomeCli = caiNomeCli;
        changeSupport.firePropertyChange("caiNomeCli", oldCaiNomeCli, caiNomeCli);
    }

    public Date getCaiDataPgt() {
        return caiDataPgt;
    }

    public void setCaiDataPgt(Date caiDataPgt) {
        Date oldCaiDataPgt = this.caiDataPgt;
        this.caiDataPgt = caiDataPgt;
        changeSupport.firePropertyChange("caiDataPgt", oldCaiDataPgt, caiDataPgt);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (caiCodPgt != null ? caiCodPgt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caixa)) {
            return false;
        }
        Caixa other = (Caixa) object;
        if ((this.caiCodPgt == null && other.caiCodPgt != null) || (this.caiCodPgt != null && !this.caiCodPgt.equals(other.caiCodPgt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Caixa[ caiCodPgt=" + caiCodPgt + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
