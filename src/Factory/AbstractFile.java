package Factory;

public abstract class AbstractFile {
    private String caption;
    public abstract void open();

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
