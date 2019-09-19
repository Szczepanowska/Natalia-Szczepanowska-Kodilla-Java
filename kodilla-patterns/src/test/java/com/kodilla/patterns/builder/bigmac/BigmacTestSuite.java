package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Salat")
                .ingredient("Pickles")
                .ingredient("Chilli")
                .bun("seasam")
                .sauce("bbq")
                .burgers(5)
                .build();

        int howManyIngredients = bigmac.getIngredients().size();
        Assert.assertEquals(3, howManyIngredients);
    }
}
