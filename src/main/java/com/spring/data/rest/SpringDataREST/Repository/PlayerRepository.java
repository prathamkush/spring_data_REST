package com.spring.data.rest.SpringDataREST.Repository;

import com.spring.data.rest.SpringDataREST.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
