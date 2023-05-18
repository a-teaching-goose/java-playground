import java.util.*;

public class Main {
    public static void main(String[] args) {
        // get data from know mods
        KnownModsDB knownModsDB = new KnownModsDB();

        // specify the virtual cars to generate
        Map<EventType, Integer> specs = new HashMap<>() {{
            // event type, car amount to generate
            put(EventType.Rallycross, 20);
            put(EventType.StageRally, 20);
            put(EventType.TimeAttack, 20);
            put(EventType.TrackDay, 20);
            put(EventType.Autocross, 20);
        }};

        List<Car> virtualCars = generateVirtualCars(specs, knownModsDB);

        System.out.println(virtualCars.get(0).getLegend());
        for (Car car : virtualCars) {
            System.out.println(car);
        }
    }

    public static List<Car> generateVirtualCars(Map<EventType, Integer> specs,
                                                KnownModsDB knownModsDB) {

        RandomItemPicker<String> picker = new RandomItemPicker<>();

        List<Car> result = new ArrayList<>();

        int id = 0;
        for (Map.Entry<EventType, Integer> specEntry : specs.entrySet()) {
            EventType eventType = specEntry.getKey();
            int carCount = specEntry.getValue();
            if (carCount < 1) {
                continue;
            }

            for (int i = 0; i < carCount; i++) {

                Map<PartType, String> mods = new TreeMap<>();
                Map<PartType, List<String>> modsForType = knownModsDB.knownMods.get(eventType);
                for (Map.Entry<PartType, List<String>> modsEntry : modsForType.entrySet()) {
                    PartType partType = modsEntry.getKey();
                    List<String> modsOptions = modsEntry.getValue();
                    mods.put(partType, picker.pick(modsOptions));
                }

                result.add(new Car(
                        id++,
                        true,
                        picker.pick(knownModsDB.cars),
                        eventType,
                        mods)
                );
            }
        }
        return result;
    }
}