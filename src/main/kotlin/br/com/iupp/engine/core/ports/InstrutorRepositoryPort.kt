package br.com.iupp.engine.core.ports

import br.com.iupp.engine.core.model.Instrutor
import java.util.*

interface InstrutorRepositoryPort {

    fun findAll():List<Instrutor>
    fun findById(id:UUID):Optional<Instrutor>

}