package com.difelix.cardatabase.models.dtos

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class BrandResponse(
     val id: String,
     val name: String,
     val description: String?,
     val headOffice: String,
     val foundationYear: Int,
     val website: String?
)
