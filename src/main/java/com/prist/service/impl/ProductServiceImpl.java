package com.prist.service.impl;

import com.prist.domain.Product;
import com.prist.repository.ProductRepository;
import com.prist.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liangyali on 14/6/24.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> list() {
        return productRepository.list();
    }
}
