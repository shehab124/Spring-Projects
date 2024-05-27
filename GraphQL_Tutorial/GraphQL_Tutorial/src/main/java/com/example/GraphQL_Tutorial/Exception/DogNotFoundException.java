package com.example.GraphQL_Tutorial.Exception;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.GraphQLException;
import graphql.language.SourceLocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DogNotFoundException extends RuntimeException implements GraphQLError {

    private Map<String, Object> extensions = new HashMap<>();

    public DogNotFoundException(String message, Long invalidLocationId)
    {
        super(message);
        extensions.put("invalidLocationId", invalidLocationId);
    }

    public DogNotFoundException(String message, String invalidBreed)
    {
        super(message);
        extensions.put("invalid breed", invalidBreed);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return null;
    }
}
