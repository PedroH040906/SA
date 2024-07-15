package Pedro.SAori.repository;

import Pedro.SAori.entity.EstoqueInsumos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstoqueInsumosRepository extends JpaRepository<EstoqueInsumos,Long> {

}
