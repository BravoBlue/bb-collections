package com.github.bravoblue.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.List;

import org.junit.Test;

public class ListsTest {

    @Test
    public void reverse() {
        List input = Lists.of(1,2,3,4,5,6,7,8,9,10);
        List expects = Lists.of(10,9,8,7,6,5,4,3,2,1);
        List output = Lists.reverse(input);

        assertEquals(expects, output);
        assertNotSame(expects, output);
        assertNotSame(input, output);
    }

}
