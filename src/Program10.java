import java.util.*;

class Program10 {
    public static void main(String[] args){
        HashMap<String, Integer> wCounts = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String in = sc.nextLine();
        for(String word : in.split(" ")){
            wCounts.merge(word, 1, Integer::sum);
        }

        System.out.println("Word\tOccurrences");
        for(Map.Entry<String, Integer> wCount : wCounts.entrySet()){
            System.out.println(wCount.getKey()+"\t"+wCount.getValue());
        }
    }
}