package com.difelix.cardatabase.controllers

import com.difelix.cardatabase.mappers.toEntity
import com.difelix.cardatabase.mappers.toResponse
import com.difelix.cardatabase.models.dtos.BrandRequest
import com.difelix.cardatabase.models.dtos.BrandResponse
import com.difelix.cardatabase.services.BrandService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/brands")
class BrandController(private val brandService: BrandService) {

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun create(@RequestBody brandRequest: BrandRequest) : BrandResponse {
        val brand = brandService.save(brandRequest.toEntity())
        return brand.toResponse()
    }
}