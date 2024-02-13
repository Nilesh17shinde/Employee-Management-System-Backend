package com.sn.employee.exception;

public class ResourceNotFoundException extends RuntimeException{
    String resourceName;
    String fieldName;
    Long fieldVlue;

    public ResourceNotFoundException(String resourceName, String fieldName, Long employeeId) {
        super(String.format("%s not found with %s : %s", resourceName,fieldName,employeeId));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldVlue = employeeId;
    }
}
