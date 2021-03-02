package com.difelix.cardatabase.models.dtos

data class BrandRequest(
     val name: String,
     val description: String?,
     val headOffice: String,
     val foundationYear: Int,
     val website: String?
)
