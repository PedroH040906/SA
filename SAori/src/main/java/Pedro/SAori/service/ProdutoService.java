package Pedro.SAori.service;

import Pedro.SAori.entity.Produto;
import Pedro.SAori.repository.ProdutoRepository;

public class ProdutoService {

    private ProdutoRepository repository;

    public void criarProduto(ProdutoDTO produtoDTO) {
        Produto produto = new Produto();
        produto.setMaterial(produtoDTO.getMaterial());
        produto.setCor(produtoDTO.getCor());
        produto.setTamanho(produtoDTO.getTamanho());
        repository.save(produto);
    }
}
