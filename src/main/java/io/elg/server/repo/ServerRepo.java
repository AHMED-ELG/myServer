package io.elg.server.repo;

import io.elg.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAdress(String ipAdress);
}
