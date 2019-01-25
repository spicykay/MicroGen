package io.swagger.server.model;

/**
 * This is an card object for a Person derived from BaseCard.
 */
@org.immutables.value.Value.Immutable
@org.immutables.value.Value.Style(defaultAsDefault = true,
        typeBuilder = "*InternalBuilder",
        implementationNestedInBuilder = true,
        overshadowImplementation = true,
        validationMethod = org.immutables.value.Value.Style.ValidationMethod.VALIDATION_API,
        jacksonIntegration = false,
        passAnnotations = {
                javax.json.bind.annotation.JsonbProperty.class},
        jdkOnly = true)
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.MicroGen")
public abstract class PersonCard extends BaseCard {

    /**
     * Get firstName
     *
     * @return firstName
     */
    @javax.json.bind.annotation.JsonbProperty("firstName")
    public abstract java.util.Optional<String> getFirstName();

    /**
     * Get lastName
     *
     * @return lastName
     */
    @javax.json.bind.annotation.JsonbProperty("lastName")
    public abstract java.util.Optional<String> getLastName();

    public static class Builder extends PersonCardInternalBuilder {
    }

    public static Builder builder() {
        return new Builder();
    }
}