package Factory;

public abstract class AbstractDirectory extends AbstractFile {
private String cap2;
public abstract void res2();
    public void open(){
        System.out.println("Je suis un AbstractDirectory: "+getCaption());
    }

    public String getCap2() {
        return cap2;
    }

    public void setCap2(String cap2) {
        this.cap2 = cap2;
    }
}
