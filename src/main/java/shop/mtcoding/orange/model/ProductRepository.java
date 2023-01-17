package shop.mtcoding.orange.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper // product.xml 파일이 new에 뜸
public interface ProductRepository {
    public List<Product> findAll(); // findAll = select id 값

    public Product findOne(int id);

    // -1 DB에러(ex> db insert오류), 1 변경된 1건, 0 변경된 행이 없다
    public int insert(@Param("name") String name, @Param("price") int price, @Param("qty") int qty);

    public int delete(@Param("id") int id);

    public int update(@Param("id") int id, @Param("name") String name, @Param("price") int price,
            @Param("qty") int qty);
}
