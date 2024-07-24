package ufg.poo.Save.Store.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ufg.poo.Save.Store.Entities.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
    @Procedure(name = "get_products_by_id_client")
    List<Product> get_products_by_id_client(@Param("id") long id);

    Product getProductById(Long id);
}
