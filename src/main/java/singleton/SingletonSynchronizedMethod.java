package singleton;

/** This singleton implementation version is very simple and can be used in applications
 * where performance of the singleton is not critical for the application.
 *
 */
public class SingletonSynchronizedMethod {
    private static SingletonSynchronizedMethod uniqueInstance;

    private SingletonSynchronizedMethod(){}

    public static synchronized SingletonSynchronizedMethod getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronizedMethod();
        }

        return uniqueInstance;
    }
}
