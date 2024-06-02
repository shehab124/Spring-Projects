package com.example.Rest_API_Tutorial.config;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;

import java.util.Collections;


@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "This is a bad request, please follow the API doc."),
        @ApiResponse(responseCode = "401", description = "Due to security constraints, not authorized"),
        @ApiResponse(responseCode = "500", description = "The server is down")
})
public class SwaggerConfig {


}
