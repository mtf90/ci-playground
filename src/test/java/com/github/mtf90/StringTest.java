package com.github.mtf90;

import java.util.Arrays;
import java.util.List;

public class StringTest extends AbstractTest<String> {

    @Override
    protected List<String> getListWith5Elements() {
        return Arrays.asList("1", "2", "3", "4", "5");
    }
}
