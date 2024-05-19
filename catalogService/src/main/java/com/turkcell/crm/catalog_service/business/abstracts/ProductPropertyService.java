package com.turkcell.crm.catalog_service.business.abstracts;

import com.turkcell.crm.catalog_service.business.dtos.requests.product_property.CreateProductPropertyRequest;
import com.turkcell.crm.catalog_service.business.dtos.responses.product_property.DeletedProductPropertyResponse;

public interface ProductPropertyService {
    void add(int productId, CreateProductPropertyRequest request);

    DeletedProductPropertyResponse delete(int id);
}