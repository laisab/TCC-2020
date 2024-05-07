/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author lais_
 */
@Entity
@Table(name = "estoque", catalog = "atelie", schema = "")
@NamedQueries({
    @NamedQuery(name = "Estoque.findAll", query = "SELECT e FROM Estoque e")
    , @NamedQuery(name = "Estoque.findByEstoCodProduto", query = "SELECT e FROM Estoque e WHERE e.estoCodProduto = :estoCodProduto")
    , @NamedQuery(name = "Estoque.findByEstoIngrediente", query = "SELECT e FROM Estoque e WHERE e.estoIngrediente = :estoIngrediente")
    , @NamedQuery(name = "Estoque.findByEstoEmbalagem", query = "SELECT e FROM Estoque e WHERE e.estoEmbalagem = :estoEmbalagem")
    , @NamedQuery(name = "Estoque.findByEstoQtdIngrediente", query = "SELECT e FROM Estoque e WHERE e.estoQtdIngrediente = :estoQtdIngrediente")
    , @NamedQuery(name = "Estoque.findByEstoQtdEmbalagem", query = "SELECT e FROM Estoque e WHERE e.estoQtdEmbalagem = :estoQtdEmbalagem")})
public class Estoque implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "esto_cod_produto")
    private Integer estoCodProduto;
    @Basic(optional = false)
    @Column(name = "esto_ingrediente")
    private String estoIngrediente;
    @Basic(optional = false)
    @Column(name = "esto_embalagem")
    private String estoEmbalagem;
    @Basic(optional = false)
    @Column(name = "esto_qtd_ingrediente")
    private int estoQtdIngrediente;
    @Basic(optional = false)
    @Column(name = "esto_qtd_embalagem")
    private int estoQtdEmbalagem;

    public Estoque() {
    }

    public Estoque(Integer estoCodProduto) {
        this.estoCodProduto = estoCodProduto;
    }

    public Estoque(Integer estoCodProduto, String estoIngrediente, String estoEmbalagem, int estoQtdIngrediente, int estoQtdEmbalagem) {
        this.estoCodProduto = estoCodProduto;
        this.estoIngrediente = estoIngrediente;
        this.estoEmbalagem = estoEmbalagem;
        this.estoQtdIngrediente = estoQtdIngrediente;
        this.estoQtdEmbalagem = estoQtdEmbalagem;
    }

    public Integer getEstoCodProduto() {
        return estoCodProduto;
    }

    public void setEstoCodProduto(Integer estoCodProduto) {
        Integer oldEstoCodProduto = this.estoCodProduto;
        this.estoCodProduto = estoCodProduto;
        changeSupport.firePropertyChange("estoCodProduto", oldEstoCodProduto, estoCodProduto);
    }

    public String getEstoIngrediente() {
        return estoIngrediente;
    }

    public void setEstoIngrediente(String estoIngrediente) {
        String oldEstoIngrediente = this.estoIngrediente;
        this.estoIngrediente = estoIngrediente;
        changeSupport.firePropertyChange("estoIngrediente", oldEstoIngrediente, estoIngrediente);
    }

    public String getEstoEmbalagem() {
        return estoEmbalagem;
    }

    public void setEstoEmbalagem(String estoEmbalagem) {
        String oldEstoEmbalagem = this.estoEmbalagem;
        this.estoEmbalagem = estoEmbalagem;
        changeSupport.firePropertyChange("estoEmbalagem", oldEstoEmbalagem, estoEmbalagem);
    }

    public int getEstoQtdIngrediente() {
        return estoQtdIngrediente;
    }

    public void setEstoQtdIngrediente(int estoQtdIngrediente) {
        int oldEstoQtdIngrediente = this.estoQtdIngrediente;
        this.estoQtdIngrediente = estoQtdIngrediente;
        changeSupport.firePropertyChange("estoQtdIngrediente", oldEstoQtdIngrediente, estoQtdIngrediente);
    }

    public int getEstoQtdEmbalagem() {
        return estoQtdEmbalagem;
    }

    public void setEstoQtdEmbalagem(int estoQtdEmbalagem) {
        int oldEstoQtdEmbalagem = this.estoQtdEmbalagem;
        this.estoQtdEmbalagem = estoQtdEmbalagem;
        changeSupport.firePropertyChange("estoQtdEmbalagem", oldEstoQtdEmbalagem, estoQtdEmbalagem);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estoCodProduto != null ? estoCodProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estoque)) {
            return false;
        }
        Estoque other = (Estoque) object;
        if ((this.estoCodProduto == null && other.estoCodProduto != null) || (this.estoCodProduto != null && !this.estoCodProduto.equals(other.estoCodProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Estoque[ estoCodProduto=" + estoCodProduto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
