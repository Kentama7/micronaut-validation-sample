package micronaut.validation.sample

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("micronaut.validation.sample")
                .mainClass(Application.javaClass)
                .start()
    }
}