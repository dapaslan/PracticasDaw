// TestRunner.java
import org.junit.*;
import org.junit.runner.*;
import org.junit.runner.notification.*;
public class TestRunner {
 public static void main(String[] args) {
 // run the tests
 Result result = JUnitCore.runClasses(LineTest.class);
 // print any errors we had
 for(Failure failure : result.getFailures( )) {
 System.out.println(failure.toString( ));
 }
 // print whether we suceeded
 System.out.printf("All test cases passed: %b\n", result.wasSuccessful(
));
 }
}