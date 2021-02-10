package com.difelix.cardatabase.models

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "TBL_CAR_BRAND")
data class CarBrand(

    @Id
    @Column(name = "id")
    val id: String = UUID.randomUUID().toString(),

    @Column(name = "name", nullable = false, unique = true)
    val name: String = "",

    @Column(name = "head_office", nullable = false)
    val headOffice: String = "",

    @Column(name = "foundation_year", nullable = false)
    val foundationYear: Int = 0,

    @Column(name = "website")
    val website: String? = null

)
