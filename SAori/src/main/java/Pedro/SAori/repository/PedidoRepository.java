package Pedro.SAori.repository;

import Pedro.SAori.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findAll();
    List<Pedido> findAllByUsuarioId(Long usuarioId);
}
