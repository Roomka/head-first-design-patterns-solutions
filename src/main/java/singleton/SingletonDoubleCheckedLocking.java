package singleton;

/** This Singleton implementation ensures lazy loading and great performance as it use a synchronized portion of code,
 * only when the instance is not yet initialized.
 * Note -  in java there is also the Enum Singleton implementation, see as a refernce https://www.baeldung.com/java-singleton.
 * Unfortunately the enum implementation is very hard to unit tests as it cannot be mocked, so this version is the preferred one
 * if you are using TDD or test after developer.
 *
 */
public class SingletonDoubleCheckedLocking {

    // The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly
    // when it is being initialized in the singleton instance.
    private volatile static SingletonDoubleCheckedLocking uniqueInstance;

    private SingletonDoubleCheckedLocking() {}

    public static SingletonDoubleCheckedLocking getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }
}
