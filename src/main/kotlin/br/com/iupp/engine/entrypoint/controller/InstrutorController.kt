package br.com.iupp.engine.entrypoint.controller

import br.com.iupp.engine.core.ports.InstrutorServicePort
import br.com.iupp.engine.entrypoint.response.InstrutorResponse
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import java.util.*

@Controller("/instrutores")
class InstrutorController(private val instrutorService:InstrutorServicePort) {

    @Get
    fun getAll():HttpResponse<List<InstrutorResponse>> = HttpResponse.ok(instrutorService.findAll())

    @Get("/{id}")
    fun getById(@PathVariable id:String):HttpResponse<InstrutorResponse> =
    with(instrutorService.findById(UUID.fromString(id))){
        if(isPresent) HttpResponse.ok(get())
        else HttpResponse.notFound()
    }

}