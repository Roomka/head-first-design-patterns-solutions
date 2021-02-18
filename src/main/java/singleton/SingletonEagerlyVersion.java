package singleton;

/** This implementation of the singleton pattern is suitable for applications
 * where the singleton needs to create and always use the Singleton and the overhead of creating
 * the class at runtime is not oneorous.
 * Using this approach, we rely on the JVM to create a unique instance of the Singleton when the class is loaded.
 */
public class SingletonEagerlyVersion {
    private static SingletonEagerlyVersion uniqueInstance = new SingletonEagerlyVersion();

    private SingletonEagerlyVersion() {}

    public static SingletonEagerlyVersion getInstance() {
        return uniqueInstance;
    }
}
