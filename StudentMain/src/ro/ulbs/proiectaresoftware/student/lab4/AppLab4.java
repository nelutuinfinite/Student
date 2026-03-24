package ro.ulbs.proiectaresoftware.student.lab4;

import java.util.*;

public class AppLab4 {
    public static void main(){
        HashMap<String, Tanar> tineri= new HashMap<>();
        HashMap<String,Integer> varste=  new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        varste.put("Vlad", 19);
        varste.put("Iulia", 19);
        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");

        Iterator iterator=   varste.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next().toString();
            Integer value= varste.get(key);
            String Adr= adrese.get(key);
            tineri.put(key,new Tanar(key,value,Adr));
        }
        for(Object key: tineri.keySet()){
            Tanar value = tineri.get(key);
            value.Afis();
        }

    }
}
