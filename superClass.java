public class superClass {
    public static void main(String[] args){
        SuperClass_a superObj = new SuperClass_a();
        SonClass sonObj = new SonClass();

        SonClass sonObj2 = (SonClass)superObj;
        superObj = sonObj;
        SonClass sonObj1 = (SonClass)superObj;
    }
}
class SuperClass_a{ }
class SonClass extends SuperClass_a{ }