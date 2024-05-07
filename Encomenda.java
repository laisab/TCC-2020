/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "encomenda", catalog = "atelie", schema = "")
@NamedQueries({
    @NamedQuery(name = "Encomenda.findAll", query = "SELECT e FROM Encomenda e")
    , @NamedQuery(name = "Encomenda.findByEncoCod", query = "SELECT e FROM Encomenda e WHERE e.encoCod = :encoCod")
    , @NamedQuery(name = "Encomenda.findByEncoProd", query = "SELECT e FROM Encomenda e WHERE e.encoProd = :encoProd")
    , @NamedQuery(name = "Encomenda.findByEncoQtde", query = "SELECT e FROM Encomenda e WHERE e.encoQtde = :encoQtde")
    , @NamedQuery(name = "Encomenda.findByEncoTamanho", query = "SELECT e FROM Encomenda e WHERE e.encoTamanho = :encoTamanho")
    , @NamedQuery(name = "Encomenda.findByEncoValor", query = "SELECT e FROM Encomenda e WHERE e.encoValor = :encoValor")
    , @NamedQuery(name = "Encomenda.findByEncoFormaPgt", query = "SELECT e FROM Encomenda e WHERE e.encoFormaPgt = :encoFormaPgt")
    , @NamedQuery(name = "Encomenda.findByEncoDataEntrega", query = "SELECT e FROM Encomenda e WHERE e.encoDataEntrega = :encoDataEntrega")
    , @NamedQuery(name = "Encomenda.findByCliCod", query = "SELECT e FROM Encomenda e WHERE e.cliCod = :cliCod")})
public class Encomenda implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "enco_cod")
    private Integer encoCod;
    @Basic(optional = false)
    @Column(name = "enco_prod")
    private String encoProd;
    @Basic(optional = false)
    @Column(name = "enco_qtde")
    private int encoQtde;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "enco_tamanho")
    private BigDecimal encoTamanho;
    @Basic(optional = false)
    @Column(name = "enco_valor")
    private BigDecimal encoValor;
    @Basic(optional = false)
    @Column(name = "enco_forma_pgt")
    private String encoFormaPgt;
    @Basic(optional = false)
    @Column(name = "enco_data_entrega")
    @Temporal(TemporalType.DATE)
    private Date encoDataEntrega;
    @Basic(optional = false)
    @Column(name = "cli_cod")
    private int cliCod;

    public Encomenda() {
    }

    public Encomenda(Integer encoCod) {
        this.encoCod = encoCod;
    }

    public Encomenda(Integer encoCod, String encoProd, int encoQtde, BigDecimal encoTamanho, BigDecimal encoValor, String encoFormaPgt, Date encoDataEntrega, int cliCod) {
        this.encoCod = encoCod;
        this.encoProd = encoProd;
        this.encoQtde = encoQtde;
        this.encoTamanho = encoTamanho;
        this.encoValor = encoValor;
        this.encoFormaPgt = encoFormaPgt;
        this.encoDataEntrega = encoDataEntrega;
        this.cliCod = cliCod;
    }

    public Integer getEncoCod() {
        return encoCod;
    }

    public void setEncoCod(Integer encoCod) {
        Integer oldEncoCod = this.encoCod;
        this.encoCod = encoCod;
        changeSupport.firePropertyChange("encoCod", oldEncoCod, encoCod);
    }

    public String getEncoProd() {
        return encoProd;
    }

    public void setEncoProd(String encoProd) {
        String oldEncoProd = this.encoProd;
        this.encoProd = encoProd;
        changeSupport.firePropertyChange("encoProd", oldEncoProd, encoProd);
    }

    public int getEncoQtde() {
        return encoQtde;
    }

    public void setEncoQtde(int encoQtde) {
        int oldEncoQtde = this.encoQtde;
        this.encoQtde = encoQtde;
        changeSupport.firePropertyChange("encoQtde", oldEncoQtde, encoQtde);
    }

    public BigDecimal getEncoTamanho() {
        return encoTamanho;
    }

    public void setEncoTamanho(BigDecimal encoTamanho) {
        BigDecimal oldEncoTamanho = this.encoTamanho;
        this.encoTamanho = encoTamanho;
        changeSupport.firePropertyChange("encoTamanho", oldEncoTamanho, encoTamanho);
    }

    public BigDecimal getEncoValor() {
        return encoValor;
    }

    public void setEncoValor(BigDecimal encoValor) {
        BigDecimal oldEncoValor = this.encoValor;
        this.encoValor = encoValor;
        changeSupport.firePropertyChange("encoValor", oldEncoValor, encoValor);
    }

    public String getEncoFormaPgt() {
        return encoFormaPgt;
    }

    public void setEncoFormaPgt(String encoFormaPgt) {
        String oldEncoFormaPgt = this.encoFormaPgt;
        this.encoFormaPgt = encoFormaPgt;
        changeSupport.firePropertyChange("encoFormaPgt", oldEncoFormaPgt, encoFormaPgt);
    }

    public Date getEncoDataEntrega() {
        return encoDataEntrega;
    }

    public void setEncoDataEntrega(Date encoDataEntrega) {
        Date oldEncoDataEntrega = this.encoDataEntrega;
        this.encoDataEntrega = encoDataEntrega;
        changeSupport.firePropertyChange("encoDataEntrega", oldEncoDataEntrega, encoDataEntrega);
    }

    public int getCliCod() {
        return cliCod;
    }

    public void setCliCod(int cliCod) {
        int oldCliCod = this.cliCod;
        this.cliCod = cliCod;
        changeSupport.firePropertyChange("cliCod", oldCliCod, cliCod);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (encoCod != null ? encoCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encomenda)) {
            return false;
        }
        Encomenda other = (Encomenda) object;
        if ((this.encoCod == null && other.encoCod != null) || (this.encoCod != null && !this.encoCod.equals(other.encoCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Encomenda[ encoCod=" + encoCod + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
