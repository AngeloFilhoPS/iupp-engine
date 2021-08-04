package br.com.iupp.engine.infrasctructure

import br.com.iupp.engine.core.mapper.InstrutorMapper
import br.com.iupp.engine.core.model.Instrutor
import br.com.iupp.engine.core.ports.InstrutorRepositoryPort
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import java.util.*
import javax.inject.Singleton
import br.com.iupp.engine.core.mapper.InstrutorMapper.Companion.cqlRowToInstrutor
import java.util.stream.Collectors

@Singleton
class InstrutorDatabase(private val cqlSession: CqlSession) : InstrutorRepositoryPort {


    override fun findById(id: UUID): Optional<Instrutor> {
        return Optional.ofNullable(
            cqlSession.execute(SimpleStatement.newInstance("SELECT * FROM clube.instrutores WHERE id = ?", id)).one()
        ).map(InstrutorMapper::cqlRowToInstrutor)
    }
    override fun findAll(): List<Instrutor> {
        val result = cqlSession.execute(SimpleStatement.newInstance("SELECT * FROM clube.instrutores"))
        return result.all().stream().map(::cqlRowToInstrutor).collect(Collectors.toList())
    }

}