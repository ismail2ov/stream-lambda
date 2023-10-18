package com.github.javacodekata.lambda.stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ListTransformerTest {

    private static final String[] strings = {"a", "7", "4", "z", "T", "c", "10", "h", "2"};

    private ListTransformer listTransformer;

    @BeforeEach
    void setUp() {
        this.listTransformer = ListTransformer.of(Arrays.asList(strings));
    }

    @Test
    void testGetSortedStrings() {
        assertThat(listTransformer.getSortedStrings()).isEqualTo(
                Arrays.asList("10", "2", "4", "7", "T", "a", "c", "h", "z"));
    }

    @Test
    void testGetSortedIntegers() {
        assertThat(listTransformer.getSortedIntegers()).isEqualTo(Arrays.asList(2, 4, 7, 10));
    }

    @Test
    void testGetSortedDescendingIntegers() {
        assertThat(listTransformer.getSortedDescendingIntegers()).isEqualTo(Arrays.asList(10, 7, 4, 2));
    }

}
