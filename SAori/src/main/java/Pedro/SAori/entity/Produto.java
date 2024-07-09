package Pedro.SAori.entity;

import Pedro.SAori.service.Tamanho;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "material")
    private String material;
    @Column(name = "cor")
    private String cor;
    @Column(name = "tamanho")
    private Tamanho tamanho;
}
