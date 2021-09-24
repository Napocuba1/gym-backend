package bo.ucb.edu.gymback.dto;

import bo.ucb.edu.gymback.domain.User;

public class UserDto {

    private Integer id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String password;

    public UserDto(){

    }

    public UserDto(User user) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    @Override
    public String toString() {
        return "UserDto{" +
            "id=" + id +
//            ", idstatus='" + idstatus + '\'' +
//            ", iduserType='" + iduserType + '\'' +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", phone='" + phone + '\'' +
            ", email='" + email + '\'' +
            ", password='" + password + '\'' +
            '}';
    }
}
