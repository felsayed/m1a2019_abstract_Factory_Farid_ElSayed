package Factory;

public class LinuxFactory extends AbstractFileFactory {


    public AbstractFile createAbstractFile() {
        return new LinuxDirectory();
    }
}
