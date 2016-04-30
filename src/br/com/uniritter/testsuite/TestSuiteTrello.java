package br.com.uniritter.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import br.com.uniritter.testcase.TestCase01Full;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestCase01Full.class,
})
public class TestSuiteTrello {
}
