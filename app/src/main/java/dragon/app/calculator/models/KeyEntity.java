package dragon.app.calculator.models;

/**
 * Created by VCCORP on 11/23/2017.
 */

public class KeyEntity {
    private String keyName;
    private String keyValue;
    private String type;

    public KeyEntity(String keyName, String keyValue, String type) {
        this.keyName = keyName;
        this.keyValue = keyValue;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "KeyEntity{" +
                "keyName='" + keyName + '\'' +
                ", keyValue='" + keyValue + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
