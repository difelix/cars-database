package com.difelix.cardatabase.mappers

import com.difelix.cardatabase.models.dtos.BrandRequest
import com.difelix.cardatabase.models.dtos.BrandResponse
import com.difelix.cardatabase.models.entities.Brand

fun BrandRequest.toEntity() = Brand(
   name = this.name,
   description = this.description,
   headOffice = this.headOffice,
   foundationYear = this.foundationYear,
   website = this.website
)

fun Brand.toResponse() = BrandResponse(
     id = this.id,
     name = this.name,
     description = this.description,
     headOffice = this.headOffice,
     foundationYear = this.foundationYear,
     website = this.website
)