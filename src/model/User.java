
package model;

public class User {
    private String name;
    private String lastName;
    private String id;
    private String email;
    private String password;
    private String nameUser;
    private String picture;

    public User(String name, String lastName, String id, String email, String password, String nameUser, String picture) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
        this.password = password;
        this.nameUser = nameUser;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    
    
            
          
}
