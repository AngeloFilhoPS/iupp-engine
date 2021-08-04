package br.com.iupp.engine

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.iupp.engine")
		.start()
}

