package org.openapitools.server.api;

import org.openapitools.server.model.ModelWithReadOnlyPropertyTest;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.MicroGen")
public interface ModelsGroupApi {

    /**
     * Return all of the defined models. This operation returns an AllModels object, which contains
     * all of the defined models.
     *
     * @param clientId Unique string which defines the platform and version. Defined in schema-level
     *     parameters section. (required)
     * @param clientVersionId Human readable major.minor string which defines the version. Defined in
     *     schema-level parameters section. (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
            name = "GET_test/models/all",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
            displayName = "getAllModels",
            reusable = false,
            tags = {"action=ModelsGroupApi.getAllModels"},
            description = "Return all of the defined models.")
    @org.eclipse.microprofile.metrics.annotation.Counted(
            name = "GET_test/models/all",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
            displayName = "getAllModels",
            reusable = false,
            tags = {"action=ModelsGroupApi.getAllModels"},
            description = "Return all of the defined models.")
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/models/all")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getAllModels(
            @javax.ws.rs.BeanParam GetAllModelsParams params) throws javax.ws.rs.WebApplicationException;

    class GetAllModelsParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public GetAllModelsParams coreHttpHeaders(final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public GetAllModelsParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

        @javax.ws.rs.QueryParam("client_id")
        @javax.validation.constraints.NotNull
        public String clientId;

        public GetAllModelsParams clientId(final String clientId) {
            this.clientId = clientId;
            return this;
        }

        @javax.ws.rs.QueryParam("client_version_id")
        @javax.validation.constraints.NotNull
        public String clientVersionId;

        public GetAllModelsParams clientVersionId(final String clientVersionId) {
            this.clientVersionId = clientVersionId;
            return this;
        }
    }

    /**
     * This operation has a default response. This operation has a default response, and we test if
     * the default response is returned if an HTTP status code that is not specified is encountered.
     *
     * @param clientId Unique string which defines the platform and version. Defined in schema-level
     *     parameters section. (required)
     * @param clientVersionId Human readable major.minor string which defines the version. Defined in
     *     schema-level parameters section. (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
            name = "GET_test/operations/defaultResponse",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
            displayName = "getDefaultResponse",
            reusable = false,
            tags = {"action=ModelsGroupApi.getDefaultResponse"},
            description = "This operation has a default response.")
    @org.eclipse.microprofile.metrics.annotation.Counted(
            name = "GET_test/operations/defaultResponse",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
            displayName = "getDefaultResponse",
            reusable = false,
            tags = {"action=ModelsGroupApi.getDefaultResponse"},
            description = "This operation has a default response.")
    @javax.ws.rs.GET
    @javax.ws.rs.Path("test/operations/defaultResponse")
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> getDefaultResponse(
            @javax.ws.rs.BeanParam GetDefaultResponseParams params)
            throws javax.ws.rs.WebApplicationException;

    class GetDefaultResponseParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public GetDefaultResponseParams coreHttpHeaders(
                final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public GetDefaultResponseParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }

        @javax.ws.rs.QueryParam("client_id")
        @javax.validation.constraints.NotNull
        public String clientId;

        public GetDefaultResponseParams clientId(final String clientId) {
            this.clientId = clientId;
            return this;
        }

        @javax.ws.rs.QueryParam("client_version_id")
        @javax.validation.constraints.NotNull
        public String clientVersionId;

        public GetDefaultResponseParams clientVersionId(final String clientVersionId) {
            this.clientVersionId = clientVersionId;
            return this;
        }
    }

    /**
     * Summary: This is an endpoint which tests readOnly properties. Description: This is an endpoint
     * which tests posting and receiving a model object which has readOnly properties. The readOnly
     * properties should be included in the response but not the request.
     *
     * @param modelWithReadOnlyPropertyTest This is json-serialized property in the body. (required)
     * @return {@code java.util.concurrent.CompletionStage&lt;javax.ws.rs.core.Response&gt;}
     */
    @org.eclipse.microprofile.metrics.annotation.Timed(
            name = "PUT_test/models/readonly",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NANOSECONDS,
            displayName = "putModelsReadOnly",
            reusable = false,
            tags = {"action=ModelsGroupApi.putModelsReadOnly"},
            description = "Summary: This is an endpoint which tests readOnly properties.")
    @org.eclipse.microprofile.metrics.annotation.Counted(
            name = "PUT_test/models/readonly",
            absolute = true,
            unit = org.eclipse.microprofile.metrics.MetricUnits.NONE,
            displayName = "putModelsReadOnly",
            reusable = false,
            tags = {"action=ModelsGroupApi.putModelsReadOnly"},
            description = "Summary: This is an endpoint which tests readOnly properties.")
    @javax.ws.rs.PUT
    @javax.ws.rs.Path("test/models/readonly")
    @javax.ws.rs.Consumes({"application/json"})
    @javax.ws.rs.Produces({"application/json"})
    java.util.concurrent.CompletionStage<javax.ws.rs.core.Response> putModelsReadOnly(
            @javax.ws.rs.BeanParam PutModelsReadOnlyParams params,
            @javax.validation.constraints.NotNull @javax.validation.Valid
                    ModelWithReadOnlyPropertyTest modelWithReadOnlyPropertyTest)
            throws javax.ws.rs.WebApplicationException;

    class PutModelsReadOnlyParams {
        @javax.ws.rs.core.Context public javax.ws.rs.core.HttpHeaders coreHttpHeaders;

        public PutModelsReadOnlyParams coreHttpHeaders(
                final javax.ws.rs.core.HttpHeaders coreHttpHeaders) {
            this.coreHttpHeaders = coreHttpHeaders;
            return this;
        }

        @javax.ws.rs.core.Context public javax.ws.rs.core.UriInfo coreUriInfo;

        public PutModelsReadOnlyParams coreUriInfo(final javax.ws.rs.core.UriInfo coreUriInfo) {
            this.coreUriInfo = coreUriInfo;
            return this;
        }
    }
}
