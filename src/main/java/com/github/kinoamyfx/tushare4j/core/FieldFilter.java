package com.github.kinoamyfx.tushare4j.core;

import lombok.Getter;

import java.util.Arrays;

public class FieldFilter {

    private FieldFilter() {
    }

    public static FieldIncluder[] include(String... s) {
        return Arrays.asList(s).parallelStream().map(FieldIncluder::new).toArray(FieldIncluder[]::new);
    }

    public static FieldExcluder[] exclude(String... s) {
        return Arrays.asList(s).parallelStream().map(FieldExcluder::new).toArray(FieldExcluder[]::new);
    }

    public static class FieldExcluder {
        @Getter
        private String name;

        public FieldExcluder(String name) {
            this.name = name;
        }
    }

    public static class FieldIncluder {
        @Getter
        private String name;

        public FieldIncluder(String name) {
            this.name = name;
        }
    }
}
