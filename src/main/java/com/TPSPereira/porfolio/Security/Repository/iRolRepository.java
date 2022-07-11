package com.TPSPereira.porfolio.Security.Repository;

import com.TPSPereira.porfolio.Security.Entity.Rol;
import com.TPSPereira.porfolio.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer >{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
