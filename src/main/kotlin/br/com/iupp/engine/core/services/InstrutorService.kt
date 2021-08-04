package br.com.iupp.engine.core.services

import br.com.iupp.engine.core.ports.InstrutorRepositoryPort
import br.com.iupp.engine.core.ports.InstrutorServicePort
import br.com.iupp.engine.entrypoint.response.InstrutorResponse
import br.com.iupp.engine.core.mapper.InstrutorMapper.Companion.instrutorToResponse
import java.util.*
import javax.inject.Singleton


@Singleton
open class InstrutorService(private val instrutorRepository: InstrutorRepositoryPort):InstrutorServicePort {

    override fun findAll()= instrutorRepository.findAll().map(::instrutorToResponse)

    override fun findById(id: UUID) = with(instrutorRepository.findById(id)){
        if (isPresent) Optional.of(instrutorToResponse(get()))
        else Optional.empty()
    }
}