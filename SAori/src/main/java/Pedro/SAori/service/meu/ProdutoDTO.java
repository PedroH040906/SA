package Pedro.SAori.service.meu;

import Pedro.SAori.service.Tamanho;
import Pedro.SAori.service.geral.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

    private UsuarioDTO usuarioDTO;
    private Long id;
    private String material;
    private String cor;
    private Tamanho tamanho;
    private Tipo tipo;
    private int quantidade;

}