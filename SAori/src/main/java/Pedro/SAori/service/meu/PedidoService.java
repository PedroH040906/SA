package Pedro.SAori.service.meu;

import Pedro.SAori.entity.Pedido;
import Pedro.SAori.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PedidoService {

    private PedidoRepository repository;

    public List<Pedido> listarPedidosPorUsuarioId(Long usuarioId) {
        return repository.findAllByUsuarioId(usuarioId);
    }
}
