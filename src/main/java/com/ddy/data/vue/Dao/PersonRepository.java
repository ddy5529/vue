package com.ddy.data.vue.Dao;

import com.ddy.data.vue.Model.Person;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {

    List<Person> findByName(String name);

    List<Person> findByNameLike(String name);
}
