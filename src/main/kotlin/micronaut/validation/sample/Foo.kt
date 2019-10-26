package micronaut.validation.sample

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotEmpty

@Introspected
data class Foo(
    @field:NotEmpty
    @field:FooPattern
    val str:String
)