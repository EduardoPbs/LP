import java.math.BigDecimal;
import java.util.List;

public enum Weapon {
    SWORD("Sword"),
    CLAYMORE("Claymore"),
    BOW("Bow"),
    SPEAR("Spear"),
    CATALYST("Catalyst");

    final String weaponType;

    Weapon(String weaponType){
        this.weaponType = weaponType;
    }

    public String getWeaponType(){
        return this.weaponType;
    }
}
