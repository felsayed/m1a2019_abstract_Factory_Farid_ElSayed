package Factory;

public abstract class AbstractFileFactory {

    public static int readFromConfigFile(){
        return new java.util.Random().nextInt(5);
    }

    public static AbstractFileFactory getFactory()
    {
        int sys= readFromConfigFile();
        if(sys==0){
            return new WinFactory();
        }
        else {
            return new LinuxFactory();
        }

    }
    public abstract AbstractFile createAbstractFile();
}
