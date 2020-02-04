package ma.avito.test.demo;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class User {

  private @Id @GeneratedValue Long id;
  private String name;
  private String email;
  private String avatar;

  User() {}

  User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  User(String name, String email, String avatar) {
    this.name = name;
    this.email = email;
    this.avatar = avatar;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAvatar() {
    return this.avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

}