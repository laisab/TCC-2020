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
@Table(name = "historico_encomenda", catalog = "atelie", schema = "")
@NamedQueries({
    @NamedQuery(name = "HistoricoEncomenda.findAll", query = "SELECT h FROM HistoricoEncomenda h")
    , @NamedQuery(name = "HistoricoEncomenda.findByHistEncoCod", query = "SELECT h FROM HistoricoEncomenda h WHERE h.histEncoCod = :histEncoCod")
    , @NamedQuery(name = "HistoricoEncomenda.findByHistEncoProd", query = "SELECT h FROM HistoricoEncomenda h WHERE h.histEncoProd = :histEncoProd")
    , @NamedQuery(name = "HistoricoEncomenda.findByHistEncoQtde", query = "SELECT h FROM HistoricoEncomenda h WHERE h.histEncoQtde = :histEncoQtde")
    , @NamedQuery(name = "HistoricoEncomenda.findByHistEncoTamanho", query = "SELECT h FROM HistoricoEncomenda h WHERE h.histEncoTamanho = :histEncoTamanho")
    , @NamedQuery(name = "HistoricoEncomenda.findByHistEncoValor", query = "SELECT h FROM HistoricoEncomenda h WHERE h.histEncoValor = :histEncoValor")
    , @NamedQuery(name = "HistoricoEncomenda.findByHistEncoFormaPgt", query = "SELECT h FROM HistoricoEncomenda h WHERE h.histEncoFormaPgt = :histEncoFormaPgt")
    , @NamedQuery(name = "HistoricoEncomenda.findByHistDataEntrega", query = "SELECT h FROM HistoricoEncomenda h WHERE h.histDataEntrega = :histDataEntrega")})
public class HistoricoEncomenda implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hist_enco_cod")
    private Integer histEncoCod;
    @Basic(optional = false)
    @Column(name = "hist_enco_prod")
    private String histEncoProd;
    @Basic(optional = false)
    @Column(name = "hist_enco_qtde")
    private int histEncoQtde;
    @Basic(optional = false)
    @Column(name = "hist_enco_tamanho")
    private float histEncoTamanho;
    @Basic(optional = false)
    @Column(name = "hist_enco_valor")
    private float histEncoValor;
    @Basic(optional = false)
    @Column(name = "hist_enco_forma_pgt")
    private String histEncoFormaPgt;
    @Basic(optional = false)
    @Column(name = "hist_data_entrega")
    @Temporal(TemporalType.DATE)
    private Date histDataEntrega;

    public HistoricoEncomenda() {
    }

    public HistoricoEncomenda(Integer histEncoCod) {
        this.histEncoCod = histEncoCod;
    }

    public HistoricoEncomenda(Integer histEncoCod, String histEncoProd, int histEncoQtde, float histEncoTamanho, float histEncoValor, String histEncoFormaPgt, Date histDataEntrega) {
        this.histEncoCod = histEncoCod;
        this.histEncoProd = histEncoProd;
        this.histEncoQtde = histEncoQtde;
        this.histEncoTamanho = histEncoTamanho;
        this.histEncoValor = histEncoValor;
        this.histEncoFormaPgt = histEncoFormaPgt;
        this.histDataEntrega = histDataEntrega;
    }

    public Integer getHistEncoCod() {
        return histEncoCod;
    }

    public void setHistEncoCod(Integer histEncoCod) {
        Integer oldHistEncoCod = this.histEncoCod;
        this.histEncoCod = histEncoCod;
        changeSupport.firePropertyChange("histEncoCod", oldHistEncoCod, histEncoCod);
    }

    public String getHistEncoProd() {
        return histEncoProd;
    }

    public void setHistEncoProd(String histEncoProd) {
        String oldHistEncoProd = this.histEncoProd;
        this.histEncoProd = histEncoProd;
        changeSupport.firePropertyChange("histEncoProd", oldHistEncoProd, histEncoProd);
    }

    public int getHistEncoQtde() {
        return histEncoQtde;
    }

    public void setHistEncoQtde(int histEncoQtde) {
        int oldHistEncoQtde = this.histEncoQtde;
        this.histEncoQtde = histEncoQtde;
        changeSupport.firePropertyChange("histEncoQtde", oldHistEncoQtde, histEncoQtde);
    }

    public float getHistEncoTamanho() {
        return histEncoTamanho;
    }

    public void setHistEncoTamanho(float histEncoTamanho) {
        float oldHistEncoTamanho = this.histEncoTamanho;
        this.histEncoTamanho = histEncoTamanho;
        changeSupport.firePropertyChange("histEncoTamanho", oldHistEncoTamanho, histEncoTamanho);
    }

    public float getHistEncoValor() {
        return histEncoValor;
    }

    public void setHistEncoValor(float histEncoValor) {
        float oldHistEncoValor = this.histEncoValor;
        this.histEncoValor = histEncoValor;
        changeSupport.firePropertyChange("histEncoValor", oldHistEncoValor, histEncoValor);
    }

    public String getHistEncoFormaPgt() {
        return histEncoFormaPgt;
    }

    public void setHistEncoFormaPgt(String histEncoFormaPgt) {
        String oldHistEncoFormaPgt = this.histEncoFormaPgt;
        this.histEncoFormaPgt = histEncoFormaPgt;
        changeSupport.firePropertyChange("histEncoFormaPgt", oldHistEncoFormaPgt, histEncoFormaPgt);
    }

    public Date getHistDataEntrega() {
        return histDataEntrega;
    }

    public void setHistDataEntrega(Date histDataEntrega) {
        Date oldHistDataEntrega = this.histDataEntrega;
        this.histDataEntrega = histDataEntrega;
        changeSupport.firePropertyChange("histDataEntrega", oldHistDataEntrega, histDataEntrega);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (histEncoCod != null ? histEncoCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricoEncomenda)) {
            return false;
        }
        HistoricoEncomenda other = (HistoricoEncomenda) object;
        if ((this.histEncoCod == null && other.histEncoCod != null) || (this.histEncoCod != null && !this.histEncoCod.equals(other.histEncoCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.HistoricoEncomenda[ histEncoCod=" + histEncoCod + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
