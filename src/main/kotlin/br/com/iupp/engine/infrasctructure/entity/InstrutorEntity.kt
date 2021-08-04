package br.com.iupp.engine.infrasctructure.entity

import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size
import kotlin.math.max

data class InstrutorEntity(
    @field: NotBlank @field:Size(max = 100)
    var nome: String,

    @field:NotBlank @field:Size(max = 14)
    var cpf: String,

    @field:NotBlank @field:Size(max = 255)
    var descricao: String,

    @field:NotBlank
    var numArmas: Int,


    var id: UUID? = null
)