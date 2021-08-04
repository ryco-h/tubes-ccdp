import java.util.HashMap;
import java.util.Map;

public class Penyimpanan {
    private static Map<String, Celana> penyimpanan = new HashMap<String, Celana>();

    static
    {
        penyimpanan.put("jeans", new Jeans());
        penyimpanan.put("boxer", new Boxer());
    }

    public static Celana getColor(String colorName)
    {
        return (Celana) penyimpanan.get(colorName).clone();
    }
}
