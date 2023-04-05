package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.xml.soap.Node;


/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList test;

//puts whatever is in before in every single test
    @Before
    public void before() {
        test = new SinglyLinkedList<String>();
    }

    @Test
    public void testAdd() {
        String expected = "5";
        test.add("5");
        Assert.assertTrue(test.contains(expected));
    }
    @Test
    public void testContains() {
        test.add("30");
        Assert.assertTrue(test.contains("30"));
    }

    @Test
    public void testRemove() {
        test.add("hi");
        test.remove("hi");

        Assert.assertFalse(test.contains("hi"));
    }

    @Test
    public void testFind1() {
        test.add("hello");
        test.add("whatever");
        int expected = 1;
        int actual = test.find("whatever");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFind2() {
        test.add("hello");
        test.add("");
        int expected = -1;
        int actual = test.find("whatever");

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSize() {
        test.add("");
        test.add("");
        int expected = 2;
        int actual = test.size();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGet() {
        String expected = "whatever";
        test.add("hi");
        test.add(expected);
        String actual = (String) test.get(1).getData();
        Assert.assertEquals(actual, expected);
    }

//    @Test
//    public void testCopy() {
//        test.add("");
//        test.add("whatever");
//        test.add("hello");
//
//        SinglyLinkedList<String> list = test.copy();
//        //deep copy so want diff addresses
//        Assert.assertEquals(list.toString(), test.toString());
//
//        for(int i = 0; i < list.size(); i++) {
//            Assert.assertEquals(list.get(i).getData(), test.get(i).getData());
//
//        }

//    }

    @Test
    public void testSort() {
        test.add("jaewwo");
        test.add("hello");
        test.add("zemmo");

        test.sort();

        Assert.assertEquals(test.get(0).getData(), "hello");

    }



}
