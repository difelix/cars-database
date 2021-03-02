package com.difelix.cardatabase.controllers

import com.difelix.cardatabase.mappers.toEntity
import com.difelix.cardatabase.mappers.toResponse
import com.difelix.cardatabase.models.dtos.BrandRequest
import com.difelix.cardatabase.models.dtos.BrandResponse
import com.difelix.cardatabase.services.BrandService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.ExampleObject
import io.swagger.v3.oas.annotations.security.SecurityRequirement
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@Tag(name = "Brand API", description = "Brand APIS")
@RestController
@RequestMapping("/brands")
class BrandController(private val brandService: BrandService) {

    @Operation(requestBody = io.swagger.v3.oas.annotations.parameters.RequestBody(
            content = [
                Content(examples = [
                    ExampleObject(name = "Request Sucesso", externalValue = "resources/swagger/create_brand.json")]
                )]),
            security = [SecurityRequirement(name = "basicAuth")]
    )
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun create(@RequestBody brandRequest: BrandRequest) : BrandResponse {
        val brand = brandService.save(brandRequest.toEntity())
        return brand.toResponse()
    }
}