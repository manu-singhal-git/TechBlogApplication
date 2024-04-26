package org.example.Repository;

import org.example.Model.Peoples;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Peoples,Integer> {
}
