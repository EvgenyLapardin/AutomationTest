package in.reqres.users._support;

import org.apache.groovy.json.internal.Exceptions;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class ValidatorHelper {
    public void validate(Object object) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        Set<ConstraintViolation<Object>> constraintViolations = validator
                .validate(object);

        for (ConstraintViolation<Object> cv : constraintViolations) {
            System.out.printf(
                    "Внимание, ошибка! property: [%s], value: [%s], message: [%s]%n",
                    cv.getPropertyPath(), cv.getInvalidValue(), cv.getMessage()
            );
            throw new Exceptions.JsonInternalException("Validate error. Check the message");
        }

    }
}
