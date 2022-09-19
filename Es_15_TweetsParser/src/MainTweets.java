import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MainTweets {
    public static void main(String[] args) {
        Path twitterPath = Paths.get("C:\\Users\\aless\\Desktop\\Corso Java\\Es_15_TweetsParser\\src\\Files_twitter\\realdonaldtrump_3columns.csv");
        try {
            BufferedReader br = Files.newBufferedReader(twitterPath);
            ArrayList<String> content = new ArrayList<>();
            while (br.ready()) {
                String riga = br.readLine();
                String[] contenuto = riga.split(",");
                content.add(contenuto[2]);
            }
            ArrayList<String> content2 = new ArrayList<>();
            for (String stringa:content) {
                String line = stringa.replaceAll("[^a-zA-Z]|(http://*/\\S*)", " ");
                content2.add(line);
            }
            //System.out.println(content);
            ArrayList<String> parole = new ArrayList<>();
            for (String tweet : content2){
                String[] parola = tweet.split(" ");
                parole.addAll(Arrays.asList(parola));
            }
            HashMap<String , Integer> paroleFrequenti = new HashMap<>();
            for (String parola : parole) {
                if (parola.isEmpty() || parola.isBlank()) continue;
                if (!paroleFrequenti.containsKey(parola)){
                    paroleFrequenti.put(parola, 1);
                }
                else {
                    paroleFrequenti.put(parola, paroleFrequenti.get(parola) + 1);
                }
            }
            List<Map.Entry<String, Integer>> tempHashset = new ArrayList<>(paroleFrequenti.entrySet());

            tempHashset.sort(new Comparator<>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });
            System.out.println(tempHashset);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
