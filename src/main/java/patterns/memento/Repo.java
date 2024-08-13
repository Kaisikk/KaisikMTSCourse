package patterns.memento;

public class Repo {

    private Save save;

    public void setSave(Save save) {
        this.save = save;
    }

    public Save getSave() {
        return save;
    }
}
