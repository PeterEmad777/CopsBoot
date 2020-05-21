package com.example.copshoot.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest
{
  @Autowired
  private UserRepository repository;

  @testpublic void testStoreUser()
  {
    HashSet <UserRole> roles = new HasSet<>();
    roles.add(UserRole.OFFICER);
    User user = repository.save(new User(UUID.randomUUID(), "ALex@mail.com", "password"), roles)

    assertThat(user).isNotNull();
    asserThat(repository.count()).isEqualTO(1L);
  }
}
