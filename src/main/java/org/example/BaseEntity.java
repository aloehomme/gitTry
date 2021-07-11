package org.example;

import lombok.Data;

@Data
public class BaseEntity {
    private Long id;

    public boolean isNull() {
        return (id == null);
    }
}
