package com.example.demo;

import junit.framework.TestCase;
import junit.framework.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;



public class WordladderTest extends TestCase{
	static char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static Queue <String> infected = new LinkedList<String>();
	static HashSet<String> dict = new HashSet<String>();
	
	Wordladder test=new Wordladder();
	
	public void testTestSingleWord()
	{
		
		test.getDict("dictionary.txt");
		assertEquals(false,test.testSingleWord("123"));
		assertEquals(true,test.testSingleWord("dog"));
	}
	
	public void testTestBothWords()
	{
		assertEquals(false,test.testBothWords("code","code"));
		assertEquals(false,test.testBothWords("dog","code"));
		assertEquals(true,test.testBothWords("code","data"));
	}

	public void testBody()
	{	
		test.getDict("dictionary.txt");
		assertEquals("A ladder from data back to code:\ndata date cate cade code",test.body("code","data"));
		test.getDict("dictionary.txt");
		assertEquals("A ladder from code back to data:\ncode cote cate date data",test.body("data","code"));
		test.getDict("dictionary.txt");
		assertEquals("A ladder from dog back to cat:\ndog dot cot cat",test.body("cat","dog"));
	}
}
