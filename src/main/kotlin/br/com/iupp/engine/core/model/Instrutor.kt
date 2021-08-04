package br.com.iupp.engine.core.model

import java.util.*

data class Instrutor(
    var id: UUID? = null,
    var nome: String? = null,
    var cpf: String? = null,
    var descricao: String? = null,
    var numArmas: Int? = null,
)