package com.difelix.cardatabase.services.impl

import com.difelix.cardatabase.models.entities.Brand
import com.difelix.cardatabase.repositories.BrandRepository
import com.difelix.cardatabase.services.BrandService
import org.springframework.stereotype.Service

@Service
class BrandServiceImpl(
    private val brandRepository: BrandRepository
) : BrandService {

    override fun save(brand: Brand) = brandRepository.save(brand)

}