package com.mycompany.app.asserts;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 * Created by pepesan on 8/6/15.
 */
public class TestAssert {



    @Test
    public void testGetTheStringArray() {

        String[] expectedArray = {"one", "two", "three"};

        String[] resultArray =  {"one", "two", "three"};

            assertArrayEquals(expectedArray, resultArray);
        }
    @Test
    public void testConcatenate() {
        StringBuffer buffer= new StringBuffer();
        buffer.append("one");
        buffer.append("two");
        String result=buffer.toString();
        assertEquals("onetwo", result);
    }
    @Test
    public void testGetTheBoolean() {
        Boolean bool=true;

        assertTrue (bool);
        bool=false;
        assertFalse(bool);
    }
    @Test
    public void testGetTheObject() {
        String s=null;

        assertNull(s);
        s=new String();
        assertNotNull(s);
    }
    @Test
    public void testGetTheSameObject() {
        String s= new String();

        assertSame   (s,s);
        String s2=new String();
        assertNotSame(s,s2);
    }
    @Test
    public void testWithMatchers() {
        assertThat("this string", is("this string"));
        assertThat(123, is(123));
    }
}
