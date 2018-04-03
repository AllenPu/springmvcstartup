
public class Test02 {
	/*
	 * singleton pattern
	 * hungry
	 * thread safe
	 */
    public static class Singleton {  
        private final static Singleton INSTANCE = new Singleton();  
  
        private Singleton() {  
  
        }  
  
        public static Singleton getInstance() {  
            return INSTANCE;  
        }  
    }

    /*
     * lazy ,not thread safe
     */
    public static class Singleton2 {  
        private static Singleton2 instance = null;  
  
        private Singleton2() {  
  
        }  
  
        public static Singleton2 getInstance() {  
            if (instance == null) {  
                instance = new Singleton2();  
            }  
  
            return instance;  
        }  
    } 
    
    /*
     * 
     * singleton lazy , thread safe
     */
    public static class Singleton3 {  
        private static Singleton3 instance = null;  
  
        private Singleton3() {  
  
        }  
  
        public static synchronized Singleton3 getInstance() {  
            if (instance == null) {  
                instance = new Singleton3();  
            }  
  
            return instance;  
        }  
    } 
    
    /*
     * singleton pattern : thread safe
     */
    public static class Singleton5 {  
        private final static class SingletonHolder {  
            private static final Singleton5 INSTANCE = new Singleton5();  
        }  
  
        private Singleton5() {  
  
        }  
  
        public static Singleton5 getInstance() {  
            return SingletonHolder.INSTANCE;  
        }  
    }  
    
    /*
     * double lock:
     * 				synchronized and volatile
     * thread safe
     * 
     */
    public static class Singleton7 {  
        private volatile static Singleton7 instance = null;  
  
        private Singleton7() {  
  
        }  
  
        public static Singleton7 getInstance() {  
            if (instance == null) {  
                synchronized (Singleton7.class) {  
                    if (instance == null) {  
                        instance = new Singleton7();  
                    }  
                }  
            }  
  
            return instance;  
        }  
    } 
}
