package Pedro.SAori.repository;

import Pedro.SAori.entity.EstoqueInsumos;
import Pedro.SAori.service.luis.EstoqueInsumosDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EstoqueInsumosRepository extends JpaRepository<EstoqueInsumos,Long> {
    Optional<EstoqueInsumosDTO> findByNomeAndCorAndTipo(String nome, String cor, String tipo);
    List<EstoqueInsumos> findByNomeAndCor(String nome, String cor);
}
