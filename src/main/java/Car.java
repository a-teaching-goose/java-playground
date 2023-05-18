import java.util.Map;
import java.util.StringJoiner;

public class Car {
    protected Boolean isVirtual;

    protected String makeAndModel;

    protected EventType eventType;

    protected Map<PartType, String> mods;

    protected String name;

    public String getLegend() {
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("Name");
        joiner.add("IsVirtual");
        joiner.add("Make and Model");
        joiner.add("Event Type");

        for (PartType partType : mods.keySet()) {
            joiner.add(partType.toString());
        }
        return joiner.toString();
    }

    public Car(Integer id, Boolean isVirtual, String makeAndModel, EventType eventType, Map<PartType, String> mods) {
        this.name = "car" + id.toString();
        this.isVirtual = isVirtual;
        this.makeAndModel = makeAndModel;
        this.eventType = eventType;
        this.mods = mods;
    }

    public static String convertToString(Map<PartType, String> map) {
        StringJoiner joiner = new StringJoiner(",");

        for (String value : map.values()) {
            joiner.add(value);
        }

        return joiner.toString();
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(",");

        joiner.add(name);
        joiner.add(isVirtual.toString());
        joiner.add(makeAndModel);
        joiner.add(eventType.toString());
        joiner.add(convertToString(mods));


        return joiner.toString();
    }
}
