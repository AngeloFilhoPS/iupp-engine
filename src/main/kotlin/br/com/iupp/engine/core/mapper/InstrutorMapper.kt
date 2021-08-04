package br.com.iupp.engine.core.mapper

import br.com.iupp.engine.core.model.Instrutor
import br.com.iupp.engine.entrypoint.response.InstrutorResponse
import com.datastax.oss.driver.api.core.cql.Row

class InstrutorMapper {
    companion object {
        fun cqlRowToInstrutor(row: Row) = Instrutor(
            id = row.getUuid("id"),
            nome = row.getString("nome"),
            cpf = row.getString("cpf"),
            descricao = row.getString("descricao"),
            numArmas = row.getInt("numArmas")
        )

        fun instrutorToResponse(instrutor: Instrutor)= with(instrutor){
            InstrutorResponse(
                nome=nome,
                cpf=cpf,
                descricao=descricao,
                numArmas=numArmas
            )
        }
    }
}