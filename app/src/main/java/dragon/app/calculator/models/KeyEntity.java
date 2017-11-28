package dragon.app.calculator.models;

/**
 * Created by VCCORP on 11/23/2017.
 */

public class KeyEntity {
    private String keyName;
    private String keyValue;
    private int resType;

    public KeyEntity(String keyName, String keyValue, int resType) {
        this.keyName = keyName;
        this.keyValue = keyValue;
        this.resType = resType;
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

    public int getResType() {
        return resType;
    }

    public void setResType(int resType) {
        this.resType = resType;
    }

    @Override
    public String toString() {
        return "KeyEntity{" +
                "keyName='" + keyName + '\'' +
                ", keyValue='" + keyValue + '\'' +
                ", resType=" + resType +
                '}';
    }
}
