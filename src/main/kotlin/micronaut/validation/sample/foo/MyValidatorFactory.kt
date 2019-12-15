package micronaut.validation.sample.foo

import io.micronaut.context.annotation.Factory
import io.micronaut.validation.validator.constraints.ConstraintValidator
import micronaut.validation.sample.foo.FooPattern
import javax.inject.Singleton

@Factory
class MyValidatorFactory {

    @Singleton
    fun fooPatternValidator(): ConstraintValidator<FooPattern, CharSequence> {
        return ConstraintValidator {value, annotationMetadata, context ->  false}
    }
}