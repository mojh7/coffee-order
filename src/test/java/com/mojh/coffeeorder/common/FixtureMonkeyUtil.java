package com.mojh.coffeeorder.common;


import com.navercorp.fixturemonkey.FixtureMonkey;
import com.navercorp.fixturemonkey.api.introspector.FieldReflectionArbitraryIntrospector;
import com.navercorp.fixturemonkey.javax.validation.plugin.JavaxValidationPlugin;

public final class FixtureMonkeyUtil {

    public static FixtureMonkey baseFixtureMonkey() {
        return FixtureMonkey.builder()
                            .defaultNotNull(true)
                            .plugin(new JavaxValidationPlugin())
                            .objectIntrospector(FieldReflectionArbitraryIntrospector.INSTANCE)
                            .build();
    }

}

