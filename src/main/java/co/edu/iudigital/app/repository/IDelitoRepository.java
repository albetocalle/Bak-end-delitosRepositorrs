package co.edu.iudigital.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.iudigital.app.model.Delitos;
@Repository
public interface IDelitoRepository extends JpaRepository<Delitos, Long>{

}
