package com.yintai.repository;

import com.yintai.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商品存储类
 *
 * @author liangyali
 */
@Repository
public interface ProductRepository {

    /**
     * 根据Id获取商品信息
     *
     * @return 商品返回实体
     */
    List<Product> list();
}
