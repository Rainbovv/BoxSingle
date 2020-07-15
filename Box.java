public class Box {

    private Object value;


    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private static class SingletonHolder {
        private final static Box INSTANCE = new Box();
    }

    public static Box getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
