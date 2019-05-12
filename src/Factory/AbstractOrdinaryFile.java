package Factory;

public abstract class AbstractOrdinaryFile extends AbstractFile{
    private String cap1;
    public abstract void res();
    public void open(){
        System.out.println("Je suis un AbstractOrdinaryFile: "+getCaption());
    }

    public String getCap1() {
        return cap1;
    }

    public void setCap1(String cap1) {
        this.cap1 = cap1;
    }
}
