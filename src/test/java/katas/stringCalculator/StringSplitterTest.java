package katas.stringCalculator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import katas.stringCalculator.StringSplitter;

import org.junit.Test;

public class StringSplitterTest {
	/* is this class just testing that the split() method on String works? 
	 * the only addition to the split method is the SEPARATOR constant - if this changes, the class(es) that use this one may break
	 * but if this is the added bit of functionality in this class then it should be tested here - and tested in other classes when required */
	
	private StringSplitter splitter = new StringSplitter();

	@Test
	public void noSplitPerformedWhenInputIsEmpty() {
		String emptyString = "";
		String[] expectedResult = {emptyString};
		
		assertThat(splitter.split(emptyString), is(expectedResult));
	}
	
	@Test
	public void inputIsSplitWhenTheInputContainsCommas() {
		String commaSeparated = "hello,danya";
		String[] expectedResult = {"hello", "danya"};
		
		assertThat(splitter.split(commaSeparated), is(expectedResult));
	}
	
	@Test
	public void inputIsSplitWhenTheInputContainsSemiColon() {
		String semiColonSeparated = "hello;danya";
		String[] expectedResult = {"hello", "danya"};
		
		assertThat(splitter.split(semiColonSeparated), is(expectedResult));
	}
	
	@Test
	public void noSplitPerformedWhenInputContainsUnrecognisedSeparator() {
		String hyphenSeparated = "hello-danya";
		String[] expectedResult = {"hello-danya"};
		
		assertThat(splitter.split(hyphenSeparated), is(expectedResult));
	}
	

}
