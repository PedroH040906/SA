package Pedro.SAori.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {
    private Long id;
    private String material;
    private String cor;
    private Tamanho tamanho;

    private ProdutoDTO(String material, Tamanho tamanho, String cor){
        this.material = material;
        this.tamanho = tamanho;
        this.cor = cor;
    }
}
