package Pedro.SAori.repository;

import Pedro.SAori.entity.Inventario;
import Pedro.SAori.service.frank.InventarioDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario,Long> {
}
