package com.drools.cartoons;

public enum Decision {
    YES("Yes"),
    NO("No");

    private String value;

    public String getValue() {
        return value;
    }

    Decision(String value) {
        this.value = value;
    }
}
