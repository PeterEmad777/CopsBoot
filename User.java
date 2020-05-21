package com.example.copshoot.user;

import java.util.Set;
import java.util.UUID;


@Entity
@Table(name = "copsboot_user")
public class User
{
  @id
  private UUID id;
  private String email;
  private String password;

  @ElementCollection(fetch = FetchType.EAGER)
  @Enumareted(EnumType.STRING)
  @NotNull
  private Set <UserRole> roles;

  protected User()
  {}

  public User(UUID id, String email, String password, Set<UserRole> roles)
  {
    this.id = id;
    this.email = email;
    this.password = password;
    this.roles = roles;
  }

  public UUID getId()
  {
    return id;
  }
  public String getEmail()
  {
    return email;
  }
  public String getPassword()
  {
    return password;
  }
  public Set<UserRole> getRoles()
  {
    return roles;
  }
}
