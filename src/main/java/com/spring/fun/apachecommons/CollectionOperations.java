package com.spring.fun.apachecommons;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;

public class CollectionOperations {
    private CollectionOperations() {
    }

    public static void apacheIgnoreNull(Collection colection, Object o) {
        CollectionUtils.addIgnoreNull(colection, o);
    }
}
