package com.example.foo;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FooTest {

    @Test
    public void fails() {
        assertThat(true).isEqualTo(false);
    }

    @Test
    public void passes() {
        assertThat(true).isEqualTo(true);
    }

}
