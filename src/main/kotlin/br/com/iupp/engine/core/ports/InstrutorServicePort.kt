package br.com.iupp.engine.core.ports

import br.com.iupp.engine.entrypoint.response.InstrutorResponse
import java.util.*

interface InstrutorServicePort {

    fun findAll():List<InstrutorResponse>
    fun findById(id:UUID):Optional<InstrutorResponse>

}