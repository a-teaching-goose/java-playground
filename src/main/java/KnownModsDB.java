import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KnownModsDB {
    protected List<String> cars;

    protected Map<EventType, Map<PartType, List<String>>> knownMods;

    public KnownModsDB() {
        cars = Arrays.asList(
                "Mazda Miata", "Chevrolet Corvette", "Toyota Supra", "Subaru WRX",
                "Focus ST", "Mitsubishi Evo", "BMW M3", "Subaru Outback", "Ford Focus",
                "Subaru Impreza", "Subaru STI", "Mazda RX7", "Subaru Legacy");

        Map<PartType, List<String>> rallycrossMods = new HashMap<>() {{
            put(PartType.Suspension, Arrays.asList("OEM", "RaceWorks", "Cusco Zero-3G Gravel", "KYB"));
            put(PartType.Tire, Arrays.asList("Tire Streets", "Falken Wildpeaks", "Hoosier Gravel", "Federal", "DMack"));
            put(PartType.Seat, Arrays.asList("OEM", "Sparco"));
            put(PartType.BrakePad, Arrays.asList("Motocraft", "Hawk", "Stop Tech"));
            put(PartType.Wheel, Arrays.asList("Sport Edition", "LP Adventures", "Speedline", "OEM", "Enkei", "Team Dynamics"));
            put(PartType.UnderBodyProtection, Arrays.asList("Primitive Skid Plate", "Custom"));
        }};

        Map<PartType, List<String>> autocrossMods = new HashMap<>() {{
            put(PartType.Suspension, Arrays.asList("Ohlins", "KW Clubsports", "KSport Street 2", "Cygnus Performance", "BC Racing"));
            put(PartType.Tire, Arrays.asList("Yokohama Advan A052", "Nitto NT-01", "Federal Rs Pro", "Falken Azenis RT660"));
            put(PartType.Seat, Arrays.asList("Momo", "Sparco", "OEM", "NRG"));
            put(PartType.BrakePad, Arrays.asList("PowerStop", "OEM", "CarboTech", "EBC"));
            put(PartType.Wheel, Arrays.asList("WedsSport", "Apex", "Rays", "Optionlabs", "BBS"));
            put(PartType.UnderBodyProtection, Arrays.asList("OEM"));
        }};

        Map<PartType, List<String>> trackDayMods = new HashMap<>() {{
            put(PartType.Suspension, Arrays.asList("Xidas", "Ohlins", "OEM", "KYB", "Chikara", "Ohlins Cygnus Performance"));
            put(PartType.Tire, Arrays.asList("Nankang", "OEM", "Yokohama", "Michelin", "Hankook", "Nankang CRS", "Falken Azenis RT660", "Kumho"));
            put(PartType.Seat, Arrays.asList("OMP", "Sabelt", "Sparco circuit", "Corbeau", "NRG", "Kirkey", "OEM"));
            put(PartType.BrakePad, Arrays.asList("Porterfields ", "PowerStop", "CarboTech", "OEM", "G-LOC", "CarboTech", "Hawk"));
            put(PartType.Wheel, Arrays.asList("Jongbloed", "WedsSport", "BBS", "OEM", "Advanti", "Flyin' miata", "Konig"));
            put(PartType.UnderBodyProtection, Arrays.asList("OEM"));
        }};

        Map<PartType, List<String>> timeAttackMods = new HashMap<>() {{
            put(PartType.Suspension, Arrays.asList("Bilstein", "Motion Control Suspension"));
            put(PartType.Tire, Arrays.asList("Toyo", "Hoosier A7"));
            put(PartType.Seat, Arrays.asList("OMP"));
            put(PartType.BrakePad, Arrays.asList("CarboTech", "Hawk"));
            put(PartType.Wheel, Arrays.asList("Enkei", "Team Dynamics", "Titan 7"));
            put(PartType.UnderBodyProtection, Arrays.asList("OEM"));
        }};

        Map<PartType, List<String>> stageRallyMods = new HashMap<>() {{
            put(PartType.Suspension, Arrays.asList("Hot Bits", "Reiger"));
            put(PartType.Tire, Arrays.asList("Hankook", "Hoosier Gravel"));
            put(PartType.Seat, Arrays.asList("Cobra", "Recaro"));
            put(PartType.BrakePad, Arrays.asList("Wilwood", "Hawk"));
            put(PartType.Wheel, Arrays.asList("Revolution", "Team Dynamic"));
            put(PartType.UnderBodyProtection, Arrays.asList("Primitive Skid Plate", "Custom"));
        }};

        knownMods = new HashMap<>() {{
            put(EventType.Rallycross, rallycrossMods);
            put(EventType.StageRally, stageRallyMods);
            put(EventType.Autocross, autocrossMods);
            put(EventType.TrackDay, trackDayMods);
            put(EventType.TimeAttack, timeAttackMods);
        }};
    }
}
