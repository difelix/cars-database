package com.difelix.cardatabase.services

import com.difelix.cardatabase.models.entities.Brand

interface BrandService {

    fun save(brand: Brand) : Brand
}