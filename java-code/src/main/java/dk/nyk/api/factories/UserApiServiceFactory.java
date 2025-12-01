package dk.nyk.api.factories;

import dk.nyk.api.UserApiService;
import dk.nyk.api.impl.UserApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2025-12-01T13:34:34.555418930Z[GMT]")
public class UserApiServiceFactory {
    private final static UserApiService service = new UserApiServiceImpl();

    public static UserApiService getUserApi() {
        return service;
    }
}
