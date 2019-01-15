package com.github.mtf90;

import java.util.Arrays;
import java.util.List;

public class IntegerTest extends AbstractTest<Integer> {

    @Override
    protected List<Integer> getListWith5Elements() {
        return Arrays.asList(1, 2, 3, 4, 5);
    }
}
