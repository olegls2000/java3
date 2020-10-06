package model;

public  abstract class AbstractParent {
    public int publicInt = 9;
    protected int protectedInt = 10;
    int defInt = 11;
    private int privateInt = 12;

    public static final int T = 7;

    public void publicMthd(){}
    protected void protectedMthd(){}
              void defaultMthd(){}
    private void privateMthd(){}

    public Number returnInteger(){
        return null;
    }

     //private abstract void abstractMethod();
     abstract void abstractMethod();

    abstract void exceptionExample() throws Exception;


}
