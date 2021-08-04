package br.com.iupp.engine.entrypoint.response

import javax.validation.constraints.Size

data class InstrutorResponse(
    @field:Size(max = 50)
    val nome: String? = null,
    @field:Size(max = 14)
    val cpf: String? = null,
    @field:Size(max = 255)
    val descricao: String? = null,
    val numArmas: Int? = null,
)
