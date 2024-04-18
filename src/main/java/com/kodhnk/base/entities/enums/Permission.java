package com.kodhnk.base.entities.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permission {

    ADMIN_READ("admin:read"),
    ADMIN_UPDATE("admin:update"),
    ADMIN_CREATE("admin:create"),
    ADMIN_DELETE("admin:delete"),

    MANAGER_READ("management:read"),
    MANAGER_UPDATE("management:update"),
    MANAGER_CREATE("management:create"),
    MANAGER_DELETE("management:delete"),

    PARENT_DELETE("parent:delete"),
    PARENT_CREATE("parent:create"),
    PARENT_READ("parent:read"),
    PARENT_UPDATE("parent:update"),

    CHILD_DELETE("child:delete"),
    CHILD_CREATE("child:create"),
    CHILD_READ("child:read"),
    CHILD_UPDATE("child:update"),

    INSTRUCTOR_DELETE("instructor:delete"),
    INSTRUCTOR_CREATE("instructor:create"),
    INSTRUCTOR_READ("instructor:read"),
    INSTRUCTOR_UPDATE("instructor:update");

    @Getter
    private final String permission;
}