package micronaut.validation.sample.foo

import javax.validation.Constraint

@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [])
annotation class FooPattern (
    val message: String = "invalid foo pattern ({validatedValue})"
)