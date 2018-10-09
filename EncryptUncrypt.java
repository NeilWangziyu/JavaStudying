import javafx.scene.chart.ValueAxis;

public class EncryptUncrypt {
    public static String EAndU(String value, char secret){
        byte[] bt = value.getBytes();
        for (int i=0;i<bt.length;i++){
            bt[i] = (byte)(bt[i]^(int)secret);
        }
        return new String(bt,0,bt.length);
    }

    public static void main(String[] args){
        String Value = "I love Java";
        char secret = '其';
        System.out.println("former s:" + Value);
        String encrypt = EncryptUncrypt.EAndU(Value, secret);
        System.out.println("after incode:" + encrypt);
        String uncrypt = EncryptUncrypt.EAndU(encrypt, secret);
        System.out.println("after uncrypt:" + encrypt);
        
    }
}
