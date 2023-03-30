package com.pwang.shopping.domain.member.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    ADMIN("ROLE_ADMIN", "손님"),
    USER("ROLE_USER", "사용자");

    private final String key;
    private final String value;
}
