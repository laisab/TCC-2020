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
@Table(name = "cliente", catalog = "atelie", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")
    , @NamedQuery(name = "Cliente.findByCliCod", query = "SELECT c FROM Cliente c WHERE c.cliCod = :cliCod")
    , @NamedQuery(name = "Cliente.findByCliNome", query = "SELECT c FROM Cliente c WHERE c.cliNome = :cliNome")
    , @NamedQuery(name = "Cliente.findByCliTel", query = "SELECT c FROM Cliente c WHERE c.cliTel = :cliTel")
    , @NamedQuery(name = "Cliente.findByCliEmail", query = "SELECT c FROM Cliente c WHERE c.cliEmail = :cliEmail")
    , @NamedQuery(name = "Cliente.findByCliCpf", query = "SELECT c FROM Cliente c WHERE c.cliCpf = :cliCpf")
    , @NamedQuery(name = "Cliente.findByCliSexo", query = "SELECT c FROM Cliente c WHERE c.cliSexo = :cliSexo")
    , @NamedQuery(name = "Cliente.findByCliRua", query = "SELECT c FROM Cliente c WHERE c.cliRua = :cliRua")
    , @NamedQuery(name = "Cliente.findByCliNum", query = "SELECT c FROM Cliente c WHERE c.cliNum = :cliNum")
    , @NamedQuery(name = "Cliente.findByCliCompl", query = "SELECT c FROM Cliente c WHERE c.cliCompl = :cliCompl")
    , @NamedQuery(name = "Cliente.findByCliBairro", query = "SELECT c FROM Cliente c WHERE c.cliBairro = :cliBairro")
    , @NamedQuery(name = "Cliente.findByCliCidade", query = "SELECT c FROM Cliente c WHERE c.cliCidade = :cliCidade")
    , @NamedQuery(name = "Cliente.findByCliCep", query = "SELECT c FROM Cliente c WHERE c.cliCep = :cliCep")})
public class Cliente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cli_cod")
    private Integer cliCod;
    @Basic(optional = false)
    @Column(name = "cli_nome")
    private String cliNome;
    @Basic(optional = false)
    @Column(name = "cli_tel")
    private String cliTel;
    @Column(name = "cli_email")
    private String cliEmail;
    @Basic(optional = false)
    @Column(name = "cli_cpf")
    private String cliCpf;
    @Basic(optional = false)
    @Column(name = "cli_sexo")
    private Character cliSexo;
    @Basic(optional = false)
    @Column(name = "cli_rua")
    private String cliRua;
    @Basic(optional = false)
    @Column(name = "cli_num")
    private String cliNum;
    @Column(name = "cli_compl")
    private String cliCompl;
    @Basic(optional = false)
    @Column(name = "cli_bairro")
    private String cliBairro;
    @Basic(optional = false)
    @Column(name = "cli_cidade")
    private String cliCidade;
    @Basic(optional = false)
    @Column(name = "cli_cep")
    private String cliCep;

    public Cliente() {
    }

    public Cliente(Integer cliCod) {
        this.cliCod = cliCod;
    }

    public Cliente(Integer cliCod, String cliNome, String cliTel, String cliCpf, Character cliSexo, String cliRua, String cliNum, String cliBairro, String cliCidade, String cliCep) {
        this.cliCod = cliCod;
        this.cliNome = cliNome;
        this.cliTel = cliTel;
        this.cliCpf = cliCpf;
        this.cliSexo = cliSexo;
        this.cliRua = cliRua;
        this.cliNum = cliNum;
        this.cliBairro = cliBairro;
        this.cliCidade = cliCidade;
        this.cliCep = cliCep;
    }

    public Integer getCliCod() {
        return cliCod;
    }

    public void setCliCod(Integer cliCod) {
        Integer oldCliCod = this.cliCod;
        this.cliCod = cliCod;
        changeSupport.firePropertyChange("cliCod", oldCliCod, cliCod);
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        String oldCliNome = this.cliNome;
        this.cliNome = cliNome;
        changeSupport.firePropertyChange("cliNome", oldCliNome, cliNome);
    }

    public String getCliTel() {
        return cliTel;
    }

    public void setCliTel(String cliTel) {
        String oldCliTel = this.cliTel;
        this.cliTel = cliTel;
        changeSupport.firePropertyChange("cliTel", oldCliTel, cliTel);
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        String oldCliEmail = this.cliEmail;
        this.cliEmail = cliEmail;
        changeSupport.firePropertyChange("cliEmail", oldCliEmail, cliEmail);
    }

    public String getCliCpf() {
        return cliCpf;
    }

    public void setCliCpf(String cliCpf) {
        String oldCliCpf = this.cliCpf;
        this.cliCpf = cliCpf;
        changeSupport.firePropertyChange("cliCpf", oldCliCpf, cliCpf);
    }

    public Character getCliSexo() {
        return cliSexo;
    }

    public void setCliSexo(Character cliSexo) {
        Character oldCliSexo = this.cliSexo;
        this.cliSexo = cliSexo;
        changeSupport.firePropertyChange("cliSexo", oldCliSexo, cliSexo);
    }

    public String getCliRua() {
        return cliRua;
    }

    public void setCliRua(String cliRua) {
        String oldCliRua = this.cliRua;
        this.cliRua = cliRua;
        changeSupport.firePropertyChange("cliRua", oldCliRua, cliRua);
    }

    public String getCliNum() {
        return cliNum;
    }

    public void setCliNum(String cliNum) {
        String oldCliNum = this.cliNum;
        this.cliNum = cliNum;
        changeSupport.firePropertyChange("cliNum", oldCliNum, cliNum);
    }

    public String getCliCompl() {
        return cliCompl;
    }

    public void setCliCompl(String cliCompl) {
        String oldCliCompl = this.cliCompl;
        this.cliCompl = cliCompl;
        changeSupport.firePropertyChange("cliCompl", oldCliCompl, cliCompl);
    }

    public String getCliBairro() {
        return cliBairro;
    }

    public void setCliBairro(String cliBairro) {
        String oldCliBairro = this.cliBairro;
        this.cliBairro = cliBairro;
        changeSupport.firePropertyChange("cliBairro", oldCliBairro, cliBairro);
    }

    public String getCliCidade() {
        return cliCidade;
    }

    public void setCliCidade(String cliCidade) {
        String oldCliCidade = this.cliCidade;
        this.cliCidade = cliCidade;
        changeSupport.firePropertyChange("cliCidade", oldCliCidade, cliCidade);
    }

    public String getCliCep() {
        return cliCep;
    }

    public void setCliCep(String cliCep) {
        String oldCliCep = this.cliCep;
        this.cliCep = cliCep;
        changeSupport.firePropertyChange("cliCep", oldCliCep, cliCep);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cliCod != null ? cliCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.cliCod == null && other.cliCod != null) || (this.cliCod != null && !this.cliCod.equals(other.cliCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Cliente[ cliCod=" + cliCod + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
