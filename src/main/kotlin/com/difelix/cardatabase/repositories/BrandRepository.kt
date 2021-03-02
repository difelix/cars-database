package com.difelix.cardatabase.repositories

import com.difelix.cardatabase.models.Brand
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BrandRepository : CrudRepository<Brand, String> {
}