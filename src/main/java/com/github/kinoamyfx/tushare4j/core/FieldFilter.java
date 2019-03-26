package com.github.kinoamyfx.tushare4j.core;

import lombok.Getter;

import java.util.Arrays;

public class FieldFilter {

    private FieldFilter() {
    }

    public static FieldInclude[] include(String... s) {
        return Arrays.asList(s).parallelStream().map(FieldInclude::new).toArray(FieldInclude[]::new);
    }

    public static FieldExclude[] exclude(String... s) {
        return Arrays.asList(s).parallelStream().map(FieldExclude::new).toArray(FieldExclude[]::new);
    }

    public static class FieldExclude {
        @Getter
        private String name;

        public FieldExclude(String name) {
            this.name = name;
        }
    }

    public static class FieldInclude {
        @Getter
        private String name;

        public FieldInclude(String name) {
            this.name = name;
        }
    }
}
