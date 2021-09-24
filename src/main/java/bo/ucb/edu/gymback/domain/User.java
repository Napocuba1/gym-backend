package bo.ucb.edu.gymback.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@NamedQueries({
        @NamedQuery(name = "User.findAll", query = "SELECT p FROM User p")
        , @NamedQuery(name = "User.findById", query = "SELECT p FROM User p WHERE p.id = :id")
        , @NamedQuery(name = "User.findByName", query = "SELECT p FROM User p WHERE p.name = :name")
        , @NamedQuery(name = "User.findByAddress", query = "SELECT p FROM User p WHERE p.address = :address")
        , @NamedQuery(name = "User.findByPhone", query = "SELECT p FROM User p WHERE p.phone = :phone")
        , @NamedQuery(name = "User.findByEmail", query = "SELECT p FROM User p WHERE p.email = :email")
        , @NamedQuery(name = "User.findByPassword", query = "SELECT p FROM User p WHERE p.password = :password")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private String id;
    private String name;
    private String address;
    private String email;
    private String password;
    private String phone;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    public String getId() {
        return id;
    }
}
