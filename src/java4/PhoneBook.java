package java4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public HashMap<String, String> pb = new HashMap<>();

    public PhoneBook(){
        pb=new HashMap<>();
    }
    public void add(String phone, String name){
        pb.put(phone,name);
    }
    public ArrayList<String> get(String name){
        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<String, String> phone : pb.entrySet()){
            if (phone.getValue().equals(name)){
                result.add(phone.getKey());
            }
        }
        return result;
    }
}
