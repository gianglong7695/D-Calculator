package dragon.app.calculator.models;

/**
 * Created by VCCORP on 11/23/2017.
 */

public class KeyEntity {
    private String keyName;
    private String keyValue;


    public KeyEntity(String keyName, String keyValue) {
        this.keyName = keyName;
        this.keyValue = keyValue;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    @Override
    public String toString() {
        return "KeyEntity{" +
                "keyName='" + keyName + '\'' +
                ", keyValue='" + keyValue + '\'' +
                '}';
    }
}
