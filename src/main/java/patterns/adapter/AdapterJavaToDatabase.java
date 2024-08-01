package patterns.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void select() {
    loadObject();
    }

    @Override
    public void remove() {
    deleteObject();
    }

    @Override
    public void update() {
    updateObject();
    }
}
