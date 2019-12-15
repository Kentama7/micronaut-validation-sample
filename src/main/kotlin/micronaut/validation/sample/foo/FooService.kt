package micronaut.validation.sample.foo

import micronaut.validation.sample.foo.Foo
import micronaut.validation.sample.foo.FooPattern
import javax.inject.Singleton
import javax.validation.Valid
import javax.validation.constraints.NotEmpty

@Singleton
open class FooService {

    open fun methodValidation(@NotEmpty str: String) = str

    open fun dataValidation(@Valid foo: Foo) = foo

    open fun originalValidator(@FooPattern str: String) = str
}