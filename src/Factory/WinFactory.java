package Factory;

public class WinFactory extends AbstractFileFactory {

    public AbstractFile createAbstractFile() {
        return new WinOrdinaryFile();
    }
}
