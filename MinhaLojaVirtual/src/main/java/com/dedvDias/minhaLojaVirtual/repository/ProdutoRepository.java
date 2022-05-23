package com.dedvDias.minhaLojaVirtual.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.dedvDias.minhaLojaVirtual.domain.Produto;


public interface ProdutoRepository extends PagingAndSortingRepository<Produto,Long>, JpaSpecificationExecutor<Produto>{

}
