package com.github.mtf90;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public abstract class AbstractTest<T> {

    private List<T> listWith5Elements;

    @BeforeClass
    public void setUp() {
        this.listWith5Elements = getListWith5Elements();
    }

    @Test
    public void testEmptiness() {
        Assert.assertFalse(this.listWith5Elements.isEmpty());
    }

    @Test(dependsOnMethods = "testEmptiness")
    public void testSize() {
        Assert.assertEquals(this.listWith5Elements.size(), 5);
    }

    protected abstract List<T> getListWith5Elements();
}
