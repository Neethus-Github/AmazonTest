package suiteDemo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({suiteDemo.JunitTest1.class,suiteDemo.JunitTest2.class,suiteDemo.JunitTest3.class})

public class SuiteDemo {

}
