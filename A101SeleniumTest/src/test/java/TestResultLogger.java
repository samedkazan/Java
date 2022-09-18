
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

public class TestResultLogger implements TestWatcher {
    Log log = new Log();
//Log kayıtları için

    @Override
    public void testSuccessful(ExtensionContext context) {
        String testName = context.getDisplayName();
        log.info(testName+":Testi Basariyla Tamamlandi.");
    }


    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName = context.getDisplayName();
        String testFailCause = cause.getMessage();
        log.error(testName= "Test Basarisiz Oldu. Sebebi: "+testFailCause);
    }
}
