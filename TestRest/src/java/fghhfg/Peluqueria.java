/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fghhfg;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author usrcur200
 */
@Entity
@Table(name = "PELUQUERIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Peluqueria.findAll", query = "SELECT p FROM Peluqueria p"),
    @NamedQuery(name = "Peluqueria.findByPeluId", query = "SELECT p FROM Peluqueria p WHERE p.peluId = :peluId"),
    @NamedQuery(name = "Peluqueria.findByPeluDireccion", query = "SELECT p FROM Peluqueria p WHERE p.peluDireccion = :peluDireccion"),
    @NamedQuery(name = "Peluqueria.findByPeluNombre", query = "SELECT p FROM Peluqueria p WHERE p.peluNombre = :peluNombre"),
    @NamedQuery(name = "Peluqueria.findByPeluTelefono", query = "SELECT p FROM Peluqueria p WHERE p.peluTelefono = :peluTelefono")})
public class Peluqueria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PELU_ID")
    private Long peluId;
    @Column(name = "PELU_DIRECCION")
    private String peluDireccion;
    @Column(name = "PELU_NOMBRE")
    private String peluNombre;
    @Column(name = "PELU_TELEFONO")
    private String peluTelefono;

    public Peluqueria() {
    }

    public Peluqueria(Long peluId) {
        this.peluId = peluId;
    }

    public Long getPeluId() {
        return peluId;
    }

    public void setPeluId(Long peluId) {
        this.peluId = peluId;
    }

    public String getPeluDireccion() {
        return peluDireccion;
    }

    public void setPeluDireccion(String peluDireccion) {
        this.peluDireccion = peluDireccion;
    }

    public String getPeluNombre() {
        return peluNombre;
    }

    public void setPeluNombre(String peluNombre) {
        this.peluNombre = peluNombre;
    }

    public String getPeluTelefono() {
        return peluTelefono;
    }

    public void setPeluTelefono(String peluTelefono) {
        this.peluTelefono = peluTelefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peluId != null ? peluId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peluqueria)) {
            return false;
        }
        Peluqueria other = (Peluqueria) object;
        if ((this.peluId == null && other.peluId != null) || (this.peluId != null && !this.peluId.equals(other.peluId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fghhfg.Peluqueria[ peluId=" + peluId + " ]";
    }
    
}
