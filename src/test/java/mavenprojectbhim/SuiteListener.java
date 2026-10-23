package mavenprojectbhim;

import java.util.List;

import org.testng.IAlterSuiteListener;
import org.testng.xml.XmlSuite;

public class SuiteListener implements IAlterSuiteListener {
	
	@Override
	public void alter(List<XmlSuite> suites) {
	int threadCount =Integer.parseInt(System.getProperty("threadCount", "1"));

    String parallelMode = System.getProperty("parallelMode", "tests");

for (XmlSuite suite : suites) {

        suite.setParallel(
        XmlSuite.ParallelMode.getValidParallel(parallelMode));

        suite.setThreadCount(threadCount);

System.out.println("Parallel Mode = " + parallelMode);
System.out.println("Thread Count = " + threadCount);

        }
    }

}
